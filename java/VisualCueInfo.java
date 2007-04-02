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

import java.lang.Double;
import java.util.Vector;

// ****************************************************************************
// Class: VisualCueInfo
//
// Purpose:
//    attributes necessary to describe a visual cue in a VisWindow (e.g. pick point or refline)
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   Wed Mar 14 17:55:19 PST 2007
//
// Modifications:
//   
// ****************************************************************************

public class VisualCueInfo extends AttributeSubject
{
    // Enum values
    public final static int CUETYPE_PICKPOINT = 0;
    public final static int CUETYPE_REFLINE = 1;
    public final static int CUETYPE_UNKNOWN = 2;


    public VisualCueInfo()
    {
        super(9);

        points = new Vector();
        cueType = CUETYPE_UNKNOWN;
        color = new ColorAttribute(0, 0, 0);
        glyphType = new String("");
        label = new String("");
        showLabel = false;
        lineStyle = 0;
        lineWidth = 0;
        opacity = 1;
    }

    public VisualCueInfo(VisualCueInfo obj)
    {
        super(9);

        int i;

        points = new Vector(obj.points.size());
        for(i = 0; i < obj.points.size(); ++i)
        {
            Double dv = (Double)obj.points.elementAt(i);
            points.addElement(new Double(dv.doubleValue()));
        }

        cueType = obj.cueType;
        color = new ColorAttribute(obj.color);
        glyphType = new String(obj.glyphType);
        label = new String(obj.label);
        showLabel = obj.showLabel;
        lineStyle = obj.lineStyle;
        lineWidth = obj.lineWidth;
        opacity = obj.opacity;

        SelectAll();
    }

    public boolean equals(VisualCueInfo obj)
    {
        int i;

        // Create the return value
        return ((points == obj.points) &&
                (cueType == obj.cueType) &&
                (color == obj.color) &&
                (glyphType == obj.glyphType) &&
                (label == obj.label) &&
                (showLabel == obj.showLabel) &&
                (lineStyle == obj.lineStyle) &&
                (lineWidth == obj.lineWidth) &&
                (opacity == obj.opacity));
    }

    // Property setting methods
    public void SetPoints(Vector points_)
    {
        points = points_;
        Select(0);
    }

    public void SetCueType(int cueType_)
    {
        cueType = cueType_;
        Select(1);
    }

    public void SetColor(ColorAttribute color_)
    {
        color = color_;
        Select(2);
    }

    public void SetGlyphType(String glyphType_)
    {
        glyphType = glyphType_;
        Select(3);
    }

    public void SetLabel(String label_)
    {
        label = label_;
        Select(4);
    }

    public void SetShowLabel(boolean showLabel_)
    {
        showLabel = showLabel_;
        Select(5);
    }

    public void SetLineStyle(int lineStyle_)
    {
        lineStyle = lineStyle_;
        Select(6);
    }

    public void SetLineWidth(int lineWidth_)
    {
        lineWidth = lineWidth_;
        Select(7);
    }

    public void SetOpacity(double opacity_)
    {
        opacity = opacity_;
        Select(8);
    }

    // Property getting methods
    public Vector         GetPoints() { return points; }
    public int            GetCueType() { return cueType; }
    public ColorAttribute GetColor() { return color; }
    public String         GetGlyphType() { return glyphType; }
    public String         GetLabel() { return label; }
    public boolean        GetShowLabel() { return showLabel; }
    public int            GetLineStyle() { return lineStyle; }
    public int            GetLineWidth() { return lineWidth; }
    public double         GetOpacity() { return opacity; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteDoubleVector(points);
        if(WriteSelect(1, buf))
            buf.WriteInt(cueType);
        if(WriteSelect(2, buf))
            color.Write(buf);
        if(WriteSelect(3, buf))
            buf.WriteString(glyphType);
        if(WriteSelect(4, buf))
            buf.WriteString(label);
        if(WriteSelect(5, buf))
            buf.WriteBool(showLabel);
        if(WriteSelect(6, buf))
            buf.WriteInt(lineStyle);
        if(WriteSelect(7, buf))
            buf.WriteInt(lineWidth);
        if(WriteSelect(8, buf))
            buf.WriteDouble(opacity);
    }

    public void ReadAtts(int n, CommunicationBuffer buf)
    {
        for(int i = 0; i < n; ++i)
        {
            int index = (int)buf.ReadByte();
            switch(index)
            {
            case 0:
                SetPoints(buf.ReadDoubleVector());
                break;
            case 1:
                SetCueType(buf.ReadInt());
                break;
            case 2:
                color.Read(buf);
                Select(2);
                break;
            case 3:
                SetGlyphType(buf.ReadString());
                break;
            case 4:
                SetLabel(buf.ReadString());
                break;
            case 5:
                SetShowLabel(buf.ReadBool());
                break;
            case 6:
                SetLineStyle(buf.ReadInt());
                break;
            case 7:
                SetLineWidth(buf.ReadInt());
                break;
            case 8:
                SetOpacity(buf.ReadDouble());
                break;
            }
        }
    }


    // Attributes
    private Vector         points; // vector of Double objects
    private int            cueType;
    private ColorAttribute color;
    private String         glyphType;
    private String         label;
    private boolean        showLabel;
    private int            lineStyle;
    private int            lineWidth;
    private double         opacity;
}

