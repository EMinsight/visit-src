/*****************************************************************************
*
* Copyright (c) 2000 - 2009, Lawrence Livermore National Security, LLC
* Produced at the Lawrence Livermore National Laboratory
* LLNL-CODE-400124
* All rights reserved.
*
* This file is  part of VisIt. For  details, see https://visit.llnl.gov/.  The
* full copyright notice is contained in the file COPYRIGHT located at the root
* of the VisIt distribution or at http://www.llnl.gov/visit/copyright.html.
*
* Redistribution  and  use  in  source  and  binary  forms,  with  or  without
* modification, are permitted provided that the following conditions are met:
*
*  - Redistributions of  source code must  retain the above  copyright notice,
*    this list of conditions and the disclaimer below.
*  - Redistributions in binary form must reproduce the above copyright notice,
*    this  list of  conditions  and  the  disclaimer (as noted below)  in  the
*    documentation and/or other materials provided with the distribution.
*  - Neither the name of  the LLNS/LLNL nor the names of  its contributors may
*    be used to endorse or promote products derived from this software without
*    specific prior written permission.
*
* THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT  HOLDERS AND CONTRIBUTORS "AS IS"
* AND ANY EXPRESS OR  IMPLIED WARRANTIES, INCLUDING,  BUT NOT  LIMITED TO, THE
* IMPLIED WARRANTIES OF MERCHANTABILITY AND  FITNESS FOR A PARTICULAR  PURPOSE
* ARE  DISCLAIMED. IN  NO EVENT  SHALL LAWRENCE  LIVERMORE NATIONAL  SECURITY,
* LLC, THE  U.S.  DEPARTMENT OF  ENERGY  OR  CONTRIBUTORS BE  LIABLE  FOR  ANY
* DIRECT,  INDIRECT,   INCIDENTAL,   SPECIAL,   EXEMPLARY,  OR   CONSEQUENTIAL
* DAMAGES (INCLUDING, BUT NOT  LIMITED TO, PROCUREMENT OF  SUBSTITUTE GOODS OR
* SERVICES; LOSS OF  USE, DATA, OR PROFITS; OR  BUSINESS INTERRUPTION) HOWEVER
* CAUSED  AND  ON  ANY  THEORY  OF  LIABILITY,  WHETHER  IN  CONTRACT,  STRICT
* LIABILITY, OR TORT  (INCLUDING NEGLIGENCE OR OTHERWISE)  ARISING IN ANY  WAY
* OUT OF THE  USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
* DAMAGE.
*
*****************************************************************************/
#include <SpreadsheetCurveViewer.h>
#include <qapplication.h>
#include <qclipboard.h>
#include <qfile.h>
#include <qfiledialog.h>
#include <qlayout.h>
#include <qmenubar.h>
#include <qpopupmenu.h>
#include <qpushbutton.h>
#include <qtextedit.h>

#include <snprintf.h>

#include <ViewerPlot.h>

#define PLOT_ENABLED
#ifdef PLOT_ENABLED
#include <PlotPluginManager.h>
#include <ViewerWindowManager.h>
#include <ViewerWindow.h>
#include <ViewerMethods.h>
#endif

int SpreadsheetCurveViewer::counter = -1;

// ****************************************************************************
// Method: SpreadsheetCurveViewer::SpreadsheetCurveViewer
//
// Purpose: 
//   constructor
//
// Arguments:
//   plot : The plot that gives us access to the viewer.
//   parent : The window's parent.
//
// Programmer: Brad Whitlock
// Creation:   Fri May  8 16:48:45 PDT 2009
//
// Modifications:
//   
// ****************************************************************************

SpreadsheetCurveViewer::SpreadsheetCurveViewer(ViewerPlot *p, QWidget *parent) : 
    QMainWindow(parent)
{
    counter++;
    plot = p;

    // Create widgets.
    setCaption(tr("Spreadsheet Curve Data"));

    QWidget *top = new QWidget(this);
    setCentralWidget(top);
    QVBoxLayout *topLayout = new QVBoxLayout(top);
    topLayout->setSpacing(5);
    topLayout->setMargin(10);
#ifdef Q_WS_MAC
    QWidget *menuContainer = new QWidget(top);
    QHBoxLayout *menuLayout = new QHBoxLayout(menuContainer);
    topLayout->addWidget(menuContainer);
#endif

    curveText = new QTextEdit(top);
    curveText->setMinimumWidth(fontMetrics().width("X") * 45);
    curveText->setMinimumHeight(fontMetrics().height() * 20);
    topLayout->addWidget(curveText);

    QHBoxLayout *layout = new QHBoxLayout(topLayout);
    layout->setSpacing(5);
    layout->addStretch(5);

    QPushButton *dismiss = new QPushButton(tr("Dismiss"),top);
    connect(dismiss, SIGNAL(clicked()),
            this, SLOT(deleteLater()));
    layout->addWidget(dismiss);

    //
    // Do the main menu.
    //
    filePopup = new QPopupMenu(this);
#ifdef Q_WS_MAC
    QPushButton *fileButton = new QPushButton(tr("&File"), menuContainer);
    fileButton->setPopup(filePopup);
    menuLayout->addWidget(fileButton);
#else
    menuBar()->insertItem(tr("&File"), filePopup);
#endif
    filePopup->insertItem(tr("Save curve . . ."), this, SLOT(saveCurve()), CTRL+Key_S);

    editPopup = new QPopupMenu(this);
#ifdef Q_WS_MAC
    QPushButton *editButton = new QPushButton(tr("&Edit"), menuContainer);
    editButton->setPopup(editPopup);
    menuLayout->addWidget(editButton);
#else
    menuBar()->insertItem(tr("&Edit"), editPopup);
#endif
    editPopup->insertItem(tr("&Copy"), this, SLOT(copyCurve()), CTRL+Key_C);

#ifdef PLOT_ENABLED
    operationsPopup = new QPopupMenu(this);
#ifdef Q_WS_MAC
    QPushButton *opButton = new QPushButton(tr("&Operations"), menuContainer);
    opButton->setPopup(operationsPopup);
    menuLayout->addWidget(opButton);
#else
    menuBar()->insertItem(tr("&Operations"), operationsPopup);
#endif
    operationsPopup->insertItem(tr("Plot curve"), this, SLOT(operationPlot()));
#endif
}

// ****************************************************************************
// Method: SpreadsheetCurveViewer::~SpreadsheetCurveViewer
//
// Purpose: 
//   dtor
//
// Programmer: Brad Whitlock
// Creation:   Fri May  8 16:51:01 PDT 2009
//
// Modifications:
//   
// ****************************************************************************

SpreadsheetCurveViewer::~SpreadsheetCurveViewer()
{
}

// ****************************************************************************
// Method: SpreadsheetCurveViewer::setData
//
// Purpose: 
//   Store the curve data as text in the window.
//
// Arguments:
//   vals : The values.
//   nvals : The number of values.
//
// Programmer: Brad Whitlock
// Creation:   Fri May  8 16:50:25 PDT 2009
//
// Modifications:
//   
// ****************************************************************************

void
SpreadsheetCurveViewer::setData(const double *vals, int nvals)
{
    char tmp[200];
    curveText->clear();
    for(int i = 0; i < nvals; ++i)
    {
        SNPRINTF(tmp, 200, "%1.16e %1.16e\n", vals[i*2], vals[i*2+1]);
        curveText->append(tmp);
    }
}

//
// Qt slots
//

// ****************************************************************************
// Method: SpreadsheetCurveViewer::saveCurve
//
// Purpose: 
//   Save the curve data to a file.
//
// Programmer: Brad Whitlock
// Creation:   Fri May  8 16:50:02 PDT 2009
//
// Modifications:
//   
// ****************************************************************************

void
SpreadsheetCurveViewer::saveCurve()
{
    filename = QFileDialog::getSaveFileName(tr("spreadsheet%1.curve").arg(counter),
            tr("Curve (*.curve)"));

    if(!filename.isEmpty())
        saveCurveFile(filename);
}

// ****************************************************************************
// Method: SpreadsheetCurveViewer::saveCurveFile
//
// Purpose: 
//   Save the curve data as a file.
//
// Arguments:
//   name : The name of the file to save.
//
// Programmer: Brad Whitlock
// Creation:   Fri May  8 16:49:42 PDT 2009
//
// Modifications:
//   
// ****************************************************************************

void
SpreadsheetCurveViewer::saveCurveFile(const QString &name)
{
    // Save the text to a file.
    QFile file(name);
    if(file.open(IO_WriteOnly))
    {
        QTextStream stream( &file );
        stream << "# curve\n" << curveText->text();
        file.close();
    }
    else
    {
        QString err(tr("Could not write file %1.").arg(name));
        plot->Error(err.latin1());
        filename = "";
    }
}


// ****************************************************************************
// Method: SpreadsheetCurveViewer::copyToClipboard
//
// Purpose: 
//   This slot saves the selected cells to the clipboard so they can be
//   pasted into other applications.
//
// Programmer: Brad Whitlock
// Creation:   Fri May  8 15:40:06 PDT 2009
//
// Modifications:
//   
// ****************************************************************************

void
SpreadsheetCurveViewer::copyToClipboard()
{
    // Copy the text to the clipbard.
    QClipboard *cb = QApplication::clipboard();
    cb->setText(curveText->text());
}

// ****************************************************************************
// Method: SpreadsheetCurveViewer::operationPlot
//
// Purpose: 
//   Save the curve data and plot it in another VisIt window.
//
// Programmer: Brad Whitlock
// Creation:   Fri May  8 16:49:16 PDT 2009
//
// Modifications:
//   
// ****************************************************************************

void
SpreadsheetCurveViewer::operationPlot()
{
#ifdef PLOT_ENABLED
    // Save the curve file
    saveCurve();
    if(!filename.isEmpty())
    {
        // Get a lineout window.
        ViewerWindow *win = ViewerWindowManager::Instance()->GetLineoutWindow();

        // Make the window active
        plot->GetViewerMethods()->SetActiveWindow(win->GetWindowId()+1);

        // Open the curve file and do a plot of it.
        PlotPluginManager *mgr = plot->GetPlotPluginManager();
        std::string plotName("Curve_1.0");
        if(mgr->PluginExists(plotName))
        {
            int idx = mgr->GetEnabledIndex(plotName);
            plot->GetViewerMethods()->OpenDatabase(filename.latin1());
            plot->GetViewerMethods()->AddPlot(idx, "curve");
            plot->GetViewerMethods()->DrawPlots();
        }
    }
#endif
}
