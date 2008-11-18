/*****************************************************************************
*
* Copyright (c) 2000 - 2008, Lawrence Livermore National Security, LLC
* Produced at the Lawrence Livermore National Laboratory
* LLNL-CODE-400142
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

#ifndef QVISCONTEXTWINDOW_H
#define QVISCONTEXTWINDOW_H

#include <QvisOperatorWindow.h>
#include <AttributeSubject.h>

class ContextAttributes;
class QLabel;
class QCheckBox;
class QLineEdit;
class QSpinBox;
class QVBox;
class QButtonGroup;
class QvisColorTableButton;
class QvisOpacitySlider;
class QvisColorButton;
class QvisLineStyleWidget;
class QvisLineWidthWidget;

// ****************************************************************************
// Class: QvisContextWindow
//
// Purpose: 
//   Defines QvisContextWindow class.
//
// Notes:      This class was automatically generated!

// Programmer: xml2window
// Creation:   Fri Apr 12 14:40:17 PST 2002
//
// Modifications:
//   
// ****************************************************************************

class QvisContextWindow : public QvisOperatorWindow
{
    Q_OBJECT
  public:
    QvisContextWindow(const int type,
                         ContextAttributes *subj,
                         const QString &caption = QString::null,
                         const QString &shortName = QString::null,
                         QvisNotepadArea *notepad = 0);
    virtual ~QvisContextWindow();
    virtual void CreateWindowContents();
  protected:
    void UpdateWindow(bool doAll);
    virtual void GetCurrentValues(int which_widget);
  private slots:
    void offsetProcessText();
    void lowProcessText();
    void hiProcessText();
    void contextProcessText();
    void cutoffProcessText();
    void belowProcessText();
    void aboveProcessText();
  private:
    QLineEdit *offset;
    QLineEdit *low;
    QLineEdit *hi;
    QLineEdit *context;
    QLineEdit *cutoff;
    QLineEdit *below;
    QLineEdit *above;

    ContextAttributes *atts;
};



#endif
