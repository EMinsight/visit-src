// ***************************************************************************
//
// Copyright (c) 2000 - 2008, Lawrence Livermore National Security, LLC
// Produced at the Lawrence Livermore National Laboratory
// LLNL-CODE-400142
// All rights reserved.
//
// This file is  part of VisIt. For  details, see https://visit.llnl.gov/.  The
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
//    documentation and/or other materials provided with the distribution.
//  - Neither the name of  the LLNS/LLNL nor the names of  its contributors may
//    be used to endorse or promote products derived from this software without
//    specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT  HOLDERS AND CONTRIBUTORS "AS IS"
// AND ANY EXPRESS OR  IMPLIED WARRANTIES, INCLUDING,  BUT NOT  LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY AND  FITNESS FOR A PARTICULAR  PURPOSE
// ARE  DISCLAIMED. IN  NO EVENT  SHALL LAWRENCE  LIVERMORE NATIONAL  SECURITY,
// LLC, THE  U.S.  DEPARTMENT OF  ENERGY  OR  CONTRIBUTORS BE  LIABLE  FOR  ANY
// DIRECT,  INDIRECT,   INCIDENTAL,   SPECIAL,   EXEMPLARY,  OR   CONSEQUENTIAL
// DAMAGES (INCLUDING, BUT NOT  LIMITED TO, PROCUREMENT OF  SUBSTITUTE GOODS OR
// SERVICES; LOSS OF  USE, DATA, OR PROFITS; OR  BUSINESS INTERRUPTION) HOWEVER
// CAUSED  AND  ON  ANY  THEORY  OF  LIABILITY,  WHETHER  IN  CONTRACT,  STRICT
// LIABILITY, OR TORT  (INCLUDING NEGLIGENCE OR OTHERWISE)  ARISING IN ANY  WAY
// OUT OF THE  USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
// DAMAGE.
//
// ***************************************************************************

package llnl.visit.operators;

import llnl.visit.AttributeSubject;
import llnl.visit.CommunicationBuffer;
import llnl.visit.Plugin;

// ****************************************************************************
// Class: PDFAttributes
//
// Purpose:
//    Attributes for the PDF operator
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

public class PDFAttributes extends AttributeSubject implements Plugin
{
    // Enum values
    public final static int SCALING_LINEAR = 0;
    public final static int SCALING_LOG = 1;
    public final static int SCALING_SKEW = 2;

    public final static int NUMAXES_TWO = 0;
    public final static int NUMAXES_THREE = 1;

    public final static int DENSITYTYPE_PROBABILITY = 0;
    public final static int DENSITYTYPE_ZONECOUNT = 1;


    public PDFAttributes()
    {
        super(27);

        var1 = new String("default");
        var1MinFlag = false;
        var1MaxFlag = false;
        var1Min = 0;
        var1Max = 1;
        var1Scaling = SCALING_LINEAR;
        var1SkewFactor = 1;
        var1NumSamples = 100;
        var2 = new String("default");
        var2MinFlag = false;
        var2MaxFlag = false;
        var2Min = 0;
        var2Max = 1;
        var2Scaling = SCALING_LINEAR;
        var2SkewFactor = 1;
        var2NumSamples = 100;
        numAxes = NUMAXES_TWO;
        var3 = new String("default");
        var3MinFlag = false;
        var3MaxFlag = false;
        var3Min = 0;
        var3Max = 1;
        var3Scaling = SCALING_LINEAR;
        var3SkewFactor = 1;
        var3NumSamples = 100;
        scaleCube = true;
        densityType = DENSITYTYPE_PROBABILITY;
    }

    public PDFAttributes(PDFAttributes obj)
    {
        super(27);

        var1 = new String(obj.var1);
        var1MinFlag = obj.var1MinFlag;
        var1MaxFlag = obj.var1MaxFlag;
        var1Min = obj.var1Min;
        var1Max = obj.var1Max;
        var1Scaling = obj.var1Scaling;
        var1SkewFactor = obj.var1SkewFactor;
        var1NumSamples = obj.var1NumSamples;
        var2 = new String(obj.var2);
        var2MinFlag = obj.var2MinFlag;
        var2MaxFlag = obj.var2MaxFlag;
        var2Min = obj.var2Min;
        var2Max = obj.var2Max;
        var2Scaling = obj.var2Scaling;
        var2SkewFactor = obj.var2SkewFactor;
        var2NumSamples = obj.var2NumSamples;
        numAxes = obj.numAxes;
        var3 = new String(obj.var3);
        var3MinFlag = obj.var3MinFlag;
        var3MaxFlag = obj.var3MaxFlag;
        var3Min = obj.var3Min;
        var3Max = obj.var3Max;
        var3Scaling = obj.var3Scaling;
        var3SkewFactor = obj.var3SkewFactor;
        var3NumSamples = obj.var3NumSamples;
        scaleCube = obj.scaleCube;
        densityType = obj.densityType;

        SelectAll();
    }

    public boolean equals(PDFAttributes obj)
    {
        // Create the return value
        return ((var1.equals(obj.var1)) &&
                (var1MinFlag == obj.var1MinFlag) &&
                (var1MaxFlag == obj.var1MaxFlag) &&
                (var1Min == obj.var1Min) &&
                (var1Max == obj.var1Max) &&
                (var1Scaling == obj.var1Scaling) &&
                (var1SkewFactor == obj.var1SkewFactor) &&
                (var1NumSamples == obj.var1NumSamples) &&
                (var2.equals(obj.var2)) &&
                (var2MinFlag == obj.var2MinFlag) &&
                (var2MaxFlag == obj.var2MaxFlag) &&
                (var2Min == obj.var2Min) &&
                (var2Max == obj.var2Max) &&
                (var2Scaling == obj.var2Scaling) &&
                (var2SkewFactor == obj.var2SkewFactor) &&
                (var2NumSamples == obj.var2NumSamples) &&
                (numAxes == obj.numAxes) &&
                (var3.equals(obj.var3)) &&
                (var3MinFlag == obj.var3MinFlag) &&
                (var3MaxFlag == obj.var3MaxFlag) &&
                (var3Min == obj.var3Min) &&
                (var3Max == obj.var3Max) &&
                (var3Scaling == obj.var3Scaling) &&
                (var3SkewFactor == obj.var3SkewFactor) &&
                (var3NumSamples == obj.var3NumSamples) &&
                (scaleCube == obj.scaleCube) &&
                (densityType == obj.densityType));
    }

    public String GetName() { return "PDF"; }
    public String GetVersion() { return "1.0"; }

    // Property setting methods
    public void SetVar1(String var1_)
    {
        var1 = var1_;
        Select(0);
    }

    public void SetVar1MinFlag(boolean var1MinFlag_)
    {
        var1MinFlag = var1MinFlag_;
        Select(1);
    }

    public void SetVar1MaxFlag(boolean var1MaxFlag_)
    {
        var1MaxFlag = var1MaxFlag_;
        Select(2);
    }

    public void SetVar1Min(double var1Min_)
    {
        var1Min = var1Min_;
        Select(3);
    }

    public void SetVar1Max(double var1Max_)
    {
        var1Max = var1Max_;
        Select(4);
    }

    public void SetVar1Scaling(int var1Scaling_)
    {
        var1Scaling = var1Scaling_;
        Select(5);
    }

    public void SetVar1SkewFactor(double var1SkewFactor_)
    {
        var1SkewFactor = var1SkewFactor_;
        Select(6);
    }

    public void SetVar1NumSamples(int var1NumSamples_)
    {
        var1NumSamples = var1NumSamples_;
        Select(7);
    }

    public void SetVar2(String var2_)
    {
        var2 = var2_;
        Select(8);
    }

    public void SetVar2MinFlag(boolean var2MinFlag_)
    {
        var2MinFlag = var2MinFlag_;
        Select(9);
    }

    public void SetVar2MaxFlag(boolean var2MaxFlag_)
    {
        var2MaxFlag = var2MaxFlag_;
        Select(10);
    }

    public void SetVar2Min(double var2Min_)
    {
        var2Min = var2Min_;
        Select(11);
    }

    public void SetVar2Max(double var2Max_)
    {
        var2Max = var2Max_;
        Select(12);
    }

    public void SetVar2Scaling(int var2Scaling_)
    {
        var2Scaling = var2Scaling_;
        Select(13);
    }

    public void SetVar2SkewFactor(double var2SkewFactor_)
    {
        var2SkewFactor = var2SkewFactor_;
        Select(14);
    }

    public void SetVar2NumSamples(int var2NumSamples_)
    {
        var2NumSamples = var2NumSamples_;
        Select(15);
    }

    public void SetNumAxes(int numAxes_)
    {
        numAxes = numAxes_;
        Select(16);
    }

    public void SetVar3(String var3_)
    {
        var3 = var3_;
        Select(17);
    }

    public void SetVar3MinFlag(boolean var3MinFlag_)
    {
        var3MinFlag = var3MinFlag_;
        Select(18);
    }

    public void SetVar3MaxFlag(boolean var3MaxFlag_)
    {
        var3MaxFlag = var3MaxFlag_;
        Select(19);
    }

    public void SetVar3Min(double var3Min_)
    {
        var3Min = var3Min_;
        Select(20);
    }

    public void SetVar3Max(double var3Max_)
    {
        var3Max = var3Max_;
        Select(21);
    }

    public void SetVar3Scaling(int var3Scaling_)
    {
        var3Scaling = var3Scaling_;
        Select(22);
    }

    public void SetVar3SkewFactor(double var3SkewFactor_)
    {
        var3SkewFactor = var3SkewFactor_;
        Select(23);
    }

    public void SetVar3NumSamples(int var3NumSamples_)
    {
        var3NumSamples = var3NumSamples_;
        Select(24);
    }

    public void SetScaleCube(boolean scaleCube_)
    {
        scaleCube = scaleCube_;
        Select(25);
    }

    public void SetDensityType(int densityType_)
    {
        densityType = densityType_;
        Select(26);
    }

    // Property getting methods
    public String  GetVar1() { return var1; }
    public boolean GetVar1MinFlag() { return var1MinFlag; }
    public boolean GetVar1MaxFlag() { return var1MaxFlag; }
    public double  GetVar1Min() { return var1Min; }
    public double  GetVar1Max() { return var1Max; }
    public int     GetVar1Scaling() { return var1Scaling; }
    public double  GetVar1SkewFactor() { return var1SkewFactor; }
    public int     GetVar1NumSamples() { return var1NumSamples; }
    public String  GetVar2() { return var2; }
    public boolean GetVar2MinFlag() { return var2MinFlag; }
    public boolean GetVar2MaxFlag() { return var2MaxFlag; }
    public double  GetVar2Min() { return var2Min; }
    public double  GetVar2Max() { return var2Max; }
    public int     GetVar2Scaling() { return var2Scaling; }
    public double  GetVar2SkewFactor() { return var2SkewFactor; }
    public int     GetVar2NumSamples() { return var2NumSamples; }
    public int     GetNumAxes() { return numAxes; }
    public String  GetVar3() { return var3; }
    public boolean GetVar3MinFlag() { return var3MinFlag; }
    public boolean GetVar3MaxFlag() { return var3MaxFlag; }
    public double  GetVar3Min() { return var3Min; }
    public double  GetVar3Max() { return var3Max; }
    public int     GetVar3Scaling() { return var3Scaling; }
    public double  GetVar3SkewFactor() { return var3SkewFactor; }
    public int     GetVar3NumSamples() { return var3NumSamples; }
    public boolean GetScaleCube() { return scaleCube; }
    public int     GetDensityType() { return densityType; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteString(var1);
        if(WriteSelect(1, buf))
            buf.WriteBool(var1MinFlag);
        if(WriteSelect(2, buf))
            buf.WriteBool(var1MaxFlag);
        if(WriteSelect(3, buf))
            buf.WriteDouble(var1Min);
        if(WriteSelect(4, buf))
            buf.WriteDouble(var1Max);
        if(WriteSelect(5, buf))
            buf.WriteInt(var1Scaling);
        if(WriteSelect(6, buf))
            buf.WriteDouble(var1SkewFactor);
        if(WriteSelect(7, buf))
            buf.WriteInt(var1NumSamples);
        if(WriteSelect(8, buf))
            buf.WriteString(var2);
        if(WriteSelect(9, buf))
            buf.WriteBool(var2MinFlag);
        if(WriteSelect(10, buf))
            buf.WriteBool(var2MaxFlag);
        if(WriteSelect(11, buf))
            buf.WriteDouble(var2Min);
        if(WriteSelect(12, buf))
            buf.WriteDouble(var2Max);
        if(WriteSelect(13, buf))
            buf.WriteInt(var2Scaling);
        if(WriteSelect(14, buf))
            buf.WriteDouble(var2SkewFactor);
        if(WriteSelect(15, buf))
            buf.WriteInt(var2NumSamples);
        if(WriteSelect(16, buf))
            buf.WriteInt(numAxes);
        if(WriteSelect(17, buf))
            buf.WriteString(var3);
        if(WriteSelect(18, buf))
            buf.WriteBool(var3MinFlag);
        if(WriteSelect(19, buf))
            buf.WriteBool(var3MaxFlag);
        if(WriteSelect(20, buf))
            buf.WriteDouble(var3Min);
        if(WriteSelect(21, buf))
            buf.WriteDouble(var3Max);
        if(WriteSelect(22, buf))
            buf.WriteInt(var3Scaling);
        if(WriteSelect(23, buf))
            buf.WriteDouble(var3SkewFactor);
        if(WriteSelect(24, buf))
            buf.WriteInt(var3NumSamples);
        if(WriteSelect(25, buf))
            buf.WriteBool(scaleCube);
        if(WriteSelect(26, buf))
            buf.WriteInt(densityType);
    }

    public void ReadAtts(int n, CommunicationBuffer buf)
    {
        for(int i = 0; i < n; ++i)
        {
            int index = (int)buf.ReadByte();
            switch(index)
            {
            case 0:
                SetVar1(buf.ReadString());
                break;
            case 1:
                SetVar1MinFlag(buf.ReadBool());
                break;
            case 2:
                SetVar1MaxFlag(buf.ReadBool());
                break;
            case 3:
                SetVar1Min(buf.ReadDouble());
                break;
            case 4:
                SetVar1Max(buf.ReadDouble());
                break;
            case 5:
                SetVar1Scaling(buf.ReadInt());
                break;
            case 6:
                SetVar1SkewFactor(buf.ReadDouble());
                break;
            case 7:
                SetVar1NumSamples(buf.ReadInt());
                break;
            case 8:
                SetVar2(buf.ReadString());
                break;
            case 9:
                SetVar2MinFlag(buf.ReadBool());
                break;
            case 10:
                SetVar2MaxFlag(buf.ReadBool());
                break;
            case 11:
                SetVar2Min(buf.ReadDouble());
                break;
            case 12:
                SetVar2Max(buf.ReadDouble());
                break;
            case 13:
                SetVar2Scaling(buf.ReadInt());
                break;
            case 14:
                SetVar2SkewFactor(buf.ReadDouble());
                break;
            case 15:
                SetVar2NumSamples(buf.ReadInt());
                break;
            case 16:
                SetNumAxes(buf.ReadInt());
                break;
            case 17:
                SetVar3(buf.ReadString());
                break;
            case 18:
                SetVar3MinFlag(buf.ReadBool());
                break;
            case 19:
                SetVar3MaxFlag(buf.ReadBool());
                break;
            case 20:
                SetVar3Min(buf.ReadDouble());
                break;
            case 21:
                SetVar3Max(buf.ReadDouble());
                break;
            case 22:
                SetVar3Scaling(buf.ReadInt());
                break;
            case 23:
                SetVar3SkewFactor(buf.ReadDouble());
                break;
            case 24:
                SetVar3NumSamples(buf.ReadInt());
                break;
            case 25:
                SetScaleCube(buf.ReadBool());
                break;
            case 26:
                SetDensityType(buf.ReadInt());
                break;
            }
        }
    }

    public String toString(String indent)
    {
        String str = new String();
        str = str + stringToString("var1", var1, indent) + "\n";
        str = str + boolToString("var1MinFlag", var1MinFlag, indent) + "\n";
        str = str + boolToString("var1MaxFlag", var1MaxFlag, indent) + "\n";
        str = str + doubleToString("var1Min", var1Min, indent) + "\n";
        str = str + doubleToString("var1Max", var1Max, indent) + "\n";
        str = str + indent + "var1Scaling = ";
        if(var1Scaling == SCALING_LINEAR)
            str = str + "SCALING_LINEAR";
        if(var1Scaling == SCALING_LOG)
            str = str + "SCALING_LOG";
        if(var1Scaling == SCALING_SKEW)
            str = str + "SCALING_SKEW";
        str = str + "\n";
        str = str + doubleToString("var1SkewFactor", var1SkewFactor, indent) + "\n";
        str = str + intToString("var1NumSamples", var1NumSamples, indent) + "\n";
        str = str + stringToString("var2", var2, indent) + "\n";
        str = str + boolToString("var2MinFlag", var2MinFlag, indent) + "\n";
        str = str + boolToString("var2MaxFlag", var2MaxFlag, indent) + "\n";
        str = str + doubleToString("var2Min", var2Min, indent) + "\n";
        str = str + doubleToString("var2Max", var2Max, indent) + "\n";
        str = str + indent + "var2Scaling = ";
        if(var2Scaling == SCALING_LINEAR)
            str = str + "SCALING_LINEAR";
        if(var2Scaling == SCALING_LOG)
            str = str + "SCALING_LOG";
        if(var2Scaling == SCALING_SKEW)
            str = str + "SCALING_SKEW";
        str = str + "\n";
        str = str + doubleToString("var2SkewFactor", var2SkewFactor, indent) + "\n";
        str = str + intToString("var2NumSamples", var2NumSamples, indent) + "\n";
        str = str + indent + "numAxes = ";
        if(numAxes == NUMAXES_TWO)
            str = str + "NUMAXES_TWO";
        if(numAxes == NUMAXES_THREE)
            str = str + "NUMAXES_THREE";
        str = str + "\n";
        str = str + stringToString("var3", var3, indent) + "\n";
        str = str + boolToString("var3MinFlag", var3MinFlag, indent) + "\n";
        str = str + boolToString("var3MaxFlag", var3MaxFlag, indent) + "\n";
        str = str + doubleToString("var3Min", var3Min, indent) + "\n";
        str = str + doubleToString("var3Max", var3Max, indent) + "\n";
        str = str + indent + "var3Scaling = ";
        if(var3Scaling == SCALING_LINEAR)
            str = str + "SCALING_LINEAR";
        if(var3Scaling == SCALING_LOG)
            str = str + "SCALING_LOG";
        if(var3Scaling == SCALING_SKEW)
            str = str + "SCALING_SKEW";
        str = str + "\n";
        str = str + doubleToString("var3SkewFactor", var3SkewFactor, indent) + "\n";
        str = str + intToString("var3NumSamples", var3NumSamples, indent) + "\n";
        str = str + boolToString("scaleCube", scaleCube, indent) + "\n";
        str = str + indent + "densityType = ";
        if(densityType == DENSITYTYPE_PROBABILITY)
            str = str + "DENSITYTYPE_PROBABILITY";
        if(densityType == DENSITYTYPE_ZONECOUNT)
            str = str + "DENSITYTYPE_ZONECOUNT";
        str = str + "\n";
        return str;
    }


    // Attributes
    private String  var1;
    private boolean var1MinFlag;
    private boolean var1MaxFlag;
    private double  var1Min;
    private double  var1Max;
    private int     var1Scaling;
    private double  var1SkewFactor;
    private int     var1NumSamples;
    private String  var2;
    private boolean var2MinFlag;
    private boolean var2MaxFlag;
    private double  var2Min;
    private double  var2Max;
    private int     var2Scaling;
    private double  var2SkewFactor;
    private int     var2NumSamples;
    private int     numAxes;
    private String  var3;
    private boolean var3MinFlag;
    private boolean var3MaxFlag;
    private double  var3Min;
    private double  var3Max;
    private int     var3Scaling;
    private double  var3SkewFactor;
    private int     var3NumSamples;
    private boolean scaleCube;
    private int     densityType;
}

