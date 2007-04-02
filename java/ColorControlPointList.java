// ****************************************************************************
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
// ****************************************************************************

package llnl.visit;

import java.util.Vector;

// ****************************************************************************
// Class: ColorControlPointList
//
// Purpose:
//    This class contains a list of ColorControlPoint objects.
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   Thu Jul 31 16:19:12 PST 2003
//
// Modifications:
//   
// ****************************************************************************

public class ColorControlPointList extends AttributeSubject
{
    public ColorControlPointList()
    {
        super(5);

        controlPoints = new Vector();
        smoothingFlag = true;
        equalSpacingFlag = false;
        discreteFlag = false;
        externalFlag = false;
    }

    public ColorControlPointList(ColorControlPointList obj)
    {
        super(5);

        int i;

        // *** Copy the controlPoints field ***
        controlPoints = new Vector(obj.controlPoints.size());
        for(i = 0; i < obj.controlPoints.size(); ++i)
        {
            ColorControlPoint newObj = (ColorControlPoint)controlPoints.elementAt(i);
            controlPoints.addElement(new ColorControlPoint(newObj));
        }

        smoothingFlag = obj.smoothingFlag;
        equalSpacingFlag = obj.equalSpacingFlag;
        discreteFlag = obj.discreteFlag;
        externalFlag = obj.externalFlag;

        SelectAll();
    }

    public boolean equals(ColorControlPointList obj)
    {
        int i;

        boolean controlPoints_equal = (obj.controlPoints.size() == controlPoints.size());
        for(i = 0; (i < controlPoints.size()) && controlPoints_equal; ++i)
        {
            // Make references to ColorControlPoint from Object.
            ColorControlPoint controlPoints1 = (ColorControlPoint)controlPoints.elementAt(i);
            ColorControlPoint controlPoints2 = (ColorControlPoint)obj.controlPoints.elementAt(i);
            controlPoints_equal = controlPoints1.equals(controlPoints2);
        }

        // Create the return value
        return (controlPoints_equal &&
                (smoothingFlag == obj.smoothingFlag) &&
                (equalSpacingFlag == obj.equalSpacingFlag) &&
                (discreteFlag == obj.discreteFlag) &&
                (externalFlag == obj.externalFlag));
    }

    // Property setting methods
    public void SetSmoothingFlag(boolean smoothingFlag_)
    {
        smoothingFlag = smoothingFlag_;
        Select(1);
    }

    public void SetEqualSpacingFlag(boolean equalSpacingFlag_)
    {
        equalSpacingFlag = equalSpacingFlag_;
        Select(2);
    }

    public void SetDiscreteFlag(boolean discreteFlag_)
    {
        discreteFlag = discreteFlag_;
        Select(3);
    }

    public void SetExternalFlag(boolean externalFlag_)
    {
        externalFlag = externalFlag_;
        Select(4);
    }

    // Property getting methods
    public Vector  GetControlPoints() { return controlPoints; }
    public boolean GetSmoothingFlag() { return smoothingFlag; }
    public boolean GetEqualSpacingFlag() { return equalSpacingFlag; }
    public boolean GetDiscreteFlag() { return discreteFlag; }
    public boolean GetExternalFlag() { return externalFlag; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
        {
            buf.WriteInt(controlPoints.size());
            for(int i = 0; i < controlPoints.size(); ++i)
            {
                ColorControlPoint tmp = (ColorControlPoint)controlPoints.elementAt(i);
                tmp.Write(buf);
            }
        }
        if(WriteSelect(1, buf))
            buf.WriteBool(smoothingFlag);
        if(WriteSelect(2, buf))
            buf.WriteBool(equalSpacingFlag);
        if(WriteSelect(3, buf))
            buf.WriteBool(discreteFlag);
        if(WriteSelect(4, buf))
            buf.WriteBool(externalFlag);
    }

    public void ReadAtts(int n, CommunicationBuffer buf)
    {
        for(int i = 0; i < n; ++i)
        {
            int index = (int)buf.ReadByte();
            switch(index)
            {
            case 0:
                {
                    int len = buf.ReadInt();
                    controlPoints.clear();
                    for(int j = 0; j < len; ++j)
                    {
                        ColorControlPoint tmp = new ColorControlPoint();
                        tmp.Read(buf);
                        controlPoints.addElement(tmp);
                    }
                }
                Select(0);
                break;
            case 1:
                SetSmoothingFlag(buf.ReadBool());
                break;
            case 2:
                SetEqualSpacingFlag(buf.ReadBool());
                break;
            case 3:
                SetDiscreteFlag(buf.ReadBool());
                break;
            case 4:
                SetExternalFlag(buf.ReadBool());
                break;
            }
        }
    }

    // Attributegroup convenience methods
    public void AddColorControlPoint(ColorControlPoint obj)
    {
        controlPoints.addElement(new ColorControlPoint(obj));
        Select(0);
    }

    public void ClearColorControlPoints()
    {
        controlPoints.clear();
        Select(0);
    }

    public void RemoveColorControlPoint(int index)
    {
        if(index >= 0 && index < controlPoints.size())
        {
            controlPoints.remove(index);
            Select(0);
        }
    }

    public int GetNumColorControlPoints()
    {
        return controlPoints.size();
    }

    public ColorControlPoint GetColorControlPoint(int i)
    {
        ColorControlPoint tmp = (ColorControlPoint)controlPoints.elementAt(i);
        return tmp;
    }


    // Attributes
    private Vector  controlPoints; // vector of ColorControlPoint objects
    private boolean smoothingFlag;
    private boolean equalSpacingFlag;
    private boolean discreteFlag;
    private boolean externalFlag;
}

