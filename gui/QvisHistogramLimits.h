/*****************************************************************************
*
* Copyright (c) 2000 - 2017, Lawrence Livermore National Security, LLC
* Produced at the Lawrence Livermore National Laboratory
* LLNL-CODE-442911
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

#ifndef QVIS_HISTOGRAM_LIMITS_H
#define QVIS_HISTOGRAM_LIMITS_H
#include <gui_exports.h>
#include <QGroupBox>

class QLabel;
class QLineEdit;
class QvisHistogram;

// ****************************************************************************
// Class: QvisHistogramLimits
//
// Purpose:
//   This widget includes min/max text boxes coupled with a histogram widget
//   and you can use any of them to set the min/max limits.
//
// Notes:      
//
// Programmer: Brad Whitlock
// Creation:   Tue Dec 28 16:00:40 PST 2010
//
// Modifications:
//   Brad Whitlock, Thu Oct 27 14:10:23 PDT 2011
//   Added GetRangeText.
//
// ****************************************************************************

class GUI_API QvisHistogramLimits : public QGroupBox
{
    Q_OBJECT
public:
    QvisHistogramLimits(QWidget *parent);
    virtual ~QvisHistogramLimits();

    void setHistogram(const float *hist, int nhist);

    void getTotalRange(bool &valid, float &r0, float &r1) const;
    void setTotalRange(float r0, float r1);
    void invalidateTotalRange();

    void getSelectedRange(float &r0, float &r1);
    void setSelectedRange(float r0, float r1);

    void setVariable(const QString &);
    QString getVariable() const;

    void setCloseEnabled(bool);
    bool getCloseEnabled() const;

signals:
    void selectedRangeChanged(float, float);
    void selectedRangeChanged(QString, float, float);
    void closeClicked();

protected:
    virtual void paintEvent(QPaintEvent *);
    virtual void mousePressEvent(QMouseEvent *);
    void GetRangeText(float r0, float r1, QString &r0Text, QString &r1Text) const;

private slots:
    void minChanged();
    void maxChanged();
    void rangeChanged(float, float);
    void updateSelectedText();
private:
    bool           closeEnabled;
    QRect          hitRect;
    QLineEdit     *selectedRange[2];
    QvisHistogram *histogram;
    QLabel        *totalRange[2];
};

#endif
