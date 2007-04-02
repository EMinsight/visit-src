// ***************************************************************************
//
// Copyright (c) 2000 - 2007, The Regents of the University of California
// Produced at the Lawrence Livermore National Laboratory
// All rights reserved.
//
// This file is part of VisIt. For details, see http://www.llnl.gov/visit/. The
// full copyright notice is contained in the file COPYRIGHT located at the root
// of the VisIt distribution or at http://www.llnl.gov/visit/copyright.html.
//
// Redistribution  and  use  in  source  and  binary  forms,  with  or  without
// modification, are permitted provided that the following conditions are met:
//
//  - Redistributions of  source code must  retain the above  copyright notice,
//    this list of conditions and the disclaimer below.
//  - Redistributions in binary form must reproduce the above copyright notice,
//    this  list of  conditions  and  the  disclaimer (as noted below)  in  the
//    documentation and/or materials provided with the distribution.
//  - Neither the name of the UC/LLNL nor  the names of its contributors may be
//    used to  endorse or  promote products derived from  this software without
//    specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT  HOLDERS AND CONTRIBUTORS "AS IS"
// AND ANY EXPRESS OR  IMPLIED WARRANTIES, INCLUDING,  BUT NOT  LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY AND  FITNESS FOR A PARTICULAR  PURPOSE
// ARE  DISCLAIMED.  IN  NO  EVENT  SHALL  THE  REGENTS  OF  THE  UNIVERSITY OF
// CALIFORNIA, THE U.S.  DEPARTMENT  OF  ENERGY OR CONTRIBUTORS BE  LIABLE  FOR
// ANY  DIRECT,  INDIRECT,  INCIDENTAL,  SPECIAL,  EXEMPLARY,  OR CONSEQUENTIAL
// DAMAGES (INCLUDING, BUT NOT  LIMITED TO, PROCUREMENT OF  SUBSTITUTE GOODS OR
// SERVICES; LOSS OF  USE, DATA, OR PROFITS; OR  BUSINESS INTERRUPTION) HOWEVER
// CAUSED  AND  ON  ANY  THEORY  OF  LIABILITY,  WHETHER  IN  CONTRACT,  STRICT
// LIABILITY, OR TORT  (INCLUDING NEGLIGENCE OR OTHERWISE)  ARISING IN ANY  WAY
// OUT OF THE  USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
// DAMAGE.
//
// ***************************************************************************

package llnl.visit;


// ****************************************************************************
// Class: GlobalLineoutAttributes
//
// Purpose:
//    This file contains global attributes controlling Lineouts.
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   Thu Nov 2 14:13:14 PST 2006
//
// Modifications:
//   
// ****************************************************************************

public class GlobalLineoutAttributes extends AttributeSubject
{
    // Enum values
    public final static int CURVEOPTIONS_UPDATECURVE = 0;
    public final static int CURVEOPTIONS_CREATECURVE = 1;

    public final static int COLOROPTIONS_REPEATCOLOR = 0;
    public final static int COLOROPTIONS_CREATECOLOR = 1;


    public GlobalLineoutAttributes()
    {
        super(9);

        Dynamic = false;
        createWindow = true;
        windowId = 2;
        samplingOn = false;
        numSamples = 50;
        createReflineLabels = false;
        curveOption = CURVEOPTIONS_UPDATECURVE;
        colorOption = COLOROPTIONS_REPEATCOLOR;
        freezeInTime = false;
    }

    public GlobalLineoutAttributes(GlobalLineoutAttributes obj)
    {
        super(9);

        Dynamic = obj.Dynamic;
        createWindow = obj.createWindow;
        windowId = obj.windowId;
        samplingOn = obj.samplingOn;
        numSamples = obj.numSamples;
        createReflineLabels = obj.createReflineLabels;
        curveOption = obj.curveOption;
        colorOption = obj.colorOption;
        freezeInTime = obj.freezeInTime;

        SelectAll();
    }

    public boolean equals(GlobalLineoutAttributes obj)
    {
        // Create the return value
        return ((Dynamic == obj.Dynamic) &&
                (createWindow == obj.createWindow) &&
                (windowId == obj.windowId) &&
                (samplingOn == obj.samplingOn) &&
                (numSamples == obj.numSamples) &&
                (createReflineLabels == obj.createReflineLabels) &&
                (curveOption == obj.curveOption) &&
                (colorOption == obj.colorOption) &&
                (freezeInTime == obj.freezeInTime));
    }

    // Property setting methods
    public void SetDynamic(boolean Dynamic_)
    {
        Dynamic = Dynamic_;
        Select(0);
    }

    public void SetCreateWindow(boolean createWindow_)
    {
        createWindow = createWindow_;
        Select(1);
    }

    public void SetWindowId(int windowId_)
    {
        windowId = windowId_;
        Select(2);
    }

    public void SetSamplingOn(boolean samplingOn_)
    {
        samplingOn = samplingOn_;
        Select(3);
    }

    public void SetNumSamples(int numSamples_)
    {
        numSamples = numSamples_;
        Select(4);
    }

    public void SetCreateReflineLabels(boolean createReflineLabels_)
    {
        createReflineLabels = createReflineLabels_;
        Select(5);
    }

    public void SetCurveOption(int curveOption_)
    {
        curveOption = curveOption_;
        Select(6);
    }

    public void SetColorOption(int colorOption_)
    {
        colorOption = colorOption_;
        Select(7);
    }

    public void SetFreezeInTime(boolean freezeInTime_)
    {
        freezeInTime = freezeInTime_;
        Select(8);
    }

    // Property getting methods
    public boolean GetDynamic() { return Dynamic; }
    public boolean GetCreateWindow() { return createWindow; }
    public int     GetWindowId() { return windowId; }
    public boolean GetSamplingOn() { return samplingOn; }
    public int     GetNumSamples() { return numSamples; }
    public boolean GetCreateReflineLabels() { return createReflineLabels; }
    public int     GetCurveOption() { return curveOption; }
    public int     GetColorOption() { return colorOption; }
    public boolean GetFreezeInTime() { return freezeInTime; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteBool(Dynamic);
        if(WriteSelect(1, buf))
            buf.WriteBool(createWindow);
        if(WriteSelect(2, buf))
            buf.WriteInt(windowId);
        if(WriteSelect(3, buf))
            buf.WriteBool(samplingOn);
        if(WriteSelect(4, buf))
            buf.WriteInt(numSamples);
        if(WriteSelect(5, buf))
            buf.WriteBool(createReflineLabels);
        if(WriteSelect(6, buf))
            buf.WriteInt(curveOption);
        if(WriteSelect(7, buf))
            buf.WriteInt(colorOption);
        if(WriteSelect(8, buf))
            buf.WriteBool(freezeInTime);
    }

    public void ReadAtts(int n, CommunicationBuffer buf)
    {
        for(int i = 0; i < n; ++i)
        {
            int index = (int)buf.ReadByte();
            switch(index)
            {
            case 0:
                SetDynamic(buf.ReadBool());
                break;
            case 1:
                SetCreateWindow(buf.ReadBool());
                break;
            case 2:
                SetWindowId(buf.ReadInt());
                break;
            case 3:
                SetSamplingOn(buf.ReadBool());
                break;
            case 4:
                SetNumSamples(buf.ReadInt());
                break;
            case 5:
                SetCreateReflineLabels(buf.ReadBool());
                break;
            case 6:
                SetCurveOption(buf.ReadInt());
                break;
            case 7:
                SetColorOption(buf.ReadInt());
                break;
            case 8:
                SetFreezeInTime(buf.ReadBool());
                break;
            }
        }
    }


    // Attributes
    private boolean Dynamic;
    private boolean createWindow;
    private int     windowId;
    private boolean samplingOn;
    private int     numSamples;
    private boolean createReflineLabels;
    private int     curveOption;
    private int     colorOption;
    private boolean freezeInTime;
}

