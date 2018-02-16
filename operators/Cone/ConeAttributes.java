// ***************************************************************************
//
// Copyright (c) 2000 - 2018, Lawrence Livermore National Security, LLC
// Produced at the Lawrence Livermore National Laboratory
// LLNL-CODE-442911
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
// Class: ConeAttributes
//
// Purpose:
//    This class contains attributes for the cone operator.
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

public class ConeAttributes extends AttributeSubject implements Plugin
{
    private static int ConeAttributes_numAdditionalAtts = 7;

    // Enum values
    public final static int REPRESENTATION_THREED = 0;
    public final static int REPRESENTATION_FLATTENED = 1;
    public final static int REPRESENTATION_R_THETA = 2;


    public ConeAttributes()
    {
        super(ConeAttributes_numAdditionalAtts);

        angle = 45;
        origin = new double[3];
        origin[0] = 0;
        origin[1] = 0;
        origin[2] = 0;
        normal = new double[3];
        normal[0] = 0;
        normal[1] = 0;
        normal[2] = 1;
        representation = REPRESENTATION_FLATTENED;
        upAxis = new double[3];
        upAxis[0] = 0;
        upAxis[1] = 1;
        upAxis[2] = 0;
        cutByLength = false;
        length = 1;
    }

    public ConeAttributes(int nMoreFields)
    {
        super(ConeAttributes_numAdditionalAtts + nMoreFields);

        angle = 45;
        origin = new double[3];
        origin[0] = 0;
        origin[1] = 0;
        origin[2] = 0;
        normal = new double[3];
        normal[0] = 0;
        normal[1] = 0;
        normal[2] = 1;
        representation = REPRESENTATION_FLATTENED;
        upAxis = new double[3];
        upAxis[0] = 0;
        upAxis[1] = 1;
        upAxis[2] = 0;
        cutByLength = false;
        length = 1;
    }

    public ConeAttributes(ConeAttributes obj)
    {
        super(obj);

        int i;

        angle = obj.angle;
        origin = new double[3];
        origin[0] = obj.origin[0];
        origin[1] = obj.origin[1];
        origin[2] = obj.origin[2];

        normal = new double[3];
        normal[0] = obj.normal[0];
        normal[1] = obj.normal[1];
        normal[2] = obj.normal[2];

        representation = obj.representation;
        upAxis = new double[3];
        upAxis[0] = obj.upAxis[0];
        upAxis[1] = obj.upAxis[1];
        upAxis[2] = obj.upAxis[2];

        cutByLength = obj.cutByLength;
        length = obj.length;

        SelectAll();
    }

    public int Offset()
    {
        return super.Offset() + super.GetNumAdditionalAttributes();
    }

    public int GetNumAdditionalAttributes()
    {
        return ConeAttributes_numAdditionalAtts;
    }

    public boolean equals(ConeAttributes obj)
    {
        int i;

        // Compare the origin arrays.
        boolean origin_equal = true;
        for(i = 0; i < 3 && origin_equal; ++i)
            origin_equal = (origin[i] == obj.origin[i]);

        // Compare the normal arrays.
        boolean normal_equal = true;
        for(i = 0; i < 3 && normal_equal; ++i)
            normal_equal = (normal[i] == obj.normal[i]);

        // Compare the upAxis arrays.
        boolean upAxis_equal = true;
        for(i = 0; i < 3 && upAxis_equal; ++i)
            upAxis_equal = (upAxis[i] == obj.upAxis[i]);

        // Create the return value
        return ((angle == obj.angle) &&
                origin_equal &&
                normal_equal &&
                (representation == obj.representation) &&
                upAxis_equal &&
                (cutByLength == obj.cutByLength) &&
                (length == obj.length));
    }

    public String GetName() { return "Cone"; }
    public String GetVersion() { return "1.0"; }

    // Property setting methods
    public void SetAngle(double angle_)
    {
        angle = angle_;
        Select(0);
    }

    public void SetOrigin(double[] origin_)
    {
        origin[0] = origin_[0];
        origin[1] = origin_[1];
        origin[2] = origin_[2];
        Select(1);
    }

    public void SetOrigin(double e0, double e1, double e2)
    {
        origin[0] = e0;
        origin[1] = e1;
        origin[2] = e2;
        Select(1);
    }

    public void SetNormal(double[] normal_)
    {
        normal[0] = normal_[0];
        normal[1] = normal_[1];
        normal[2] = normal_[2];
        Select(2);
    }

    public void SetNormal(double e0, double e1, double e2)
    {
        normal[0] = e0;
        normal[1] = e1;
        normal[2] = e2;
        Select(2);
    }

    public void SetRepresentation(int representation_)
    {
        representation = representation_;
        Select(3);
    }

    public void SetUpAxis(double[] upAxis_)
    {
        upAxis[0] = upAxis_[0];
        upAxis[1] = upAxis_[1];
        upAxis[2] = upAxis_[2];
        Select(4);
    }

    public void SetUpAxis(double e0, double e1, double e2)
    {
        upAxis[0] = e0;
        upAxis[1] = e1;
        upAxis[2] = e2;
        Select(4);
    }

    public void SetCutByLength(boolean cutByLength_)
    {
        cutByLength = cutByLength_;
        Select(5);
    }

    public void SetLength(double length_)
    {
        length = length_;
        Select(6);
    }

    // Property getting methods
    public double   GetAngle() { return angle; }
    public double[] GetOrigin() { return origin; }
    public double[] GetNormal() { return normal; }
    public int      GetRepresentation() { return representation; }
    public double[] GetUpAxis() { return upAxis; }
    public boolean  GetCutByLength() { return cutByLength; }
    public double   GetLength() { return length; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteDouble(angle);
        if(WriteSelect(1, buf))
            buf.WriteDoubleArray(origin);
        if(WriteSelect(2, buf))
            buf.WriteDoubleArray(normal);
        if(WriteSelect(3, buf))
            buf.WriteInt(representation);
        if(WriteSelect(4, buf))
            buf.WriteDoubleArray(upAxis);
        if(WriteSelect(5, buf))
            buf.WriteBool(cutByLength);
        if(WriteSelect(6, buf))
            buf.WriteDouble(length);
    }

    public void ReadAtts(int index, CommunicationBuffer buf)
    {
        switch(index)
        {
        case 0:
            SetAngle(buf.ReadDouble());
            break;
        case 1:
            SetOrigin(buf.ReadDoubleArray());
            break;
        case 2:
            SetNormal(buf.ReadDoubleArray());
            break;
        case 3:
            SetRepresentation(buf.ReadInt());
            break;
        case 4:
            SetUpAxis(buf.ReadDoubleArray());
            break;
        case 5:
            SetCutByLength(buf.ReadBool());
            break;
        case 6:
            SetLength(buf.ReadDouble());
            break;
        }
    }

    public String toString(String indent)
    {
        String str = new String();
        str = str + doubleToString("angle", angle, indent) + "\n";
        str = str + doubleArrayToString("origin", origin, indent) + "\n";
        str = str + doubleArrayToString("normal", normal, indent) + "\n";
        str = str + indent + "representation = ";
        if(representation == REPRESENTATION_THREED)
            str = str + "REPRESENTATION_THREED";
        if(representation == REPRESENTATION_FLATTENED)
            str = str + "REPRESENTATION_FLATTENED";
        if(representation == REPRESENTATION_R_THETA)
            str = str + "REPRESENTATION_R_THETA";
        str = str + "\n";
        str = str + doubleArrayToString("upAxis", upAxis, indent) + "\n";
        str = str + boolToString("cutByLength", cutByLength, indent) + "\n";
        str = str + doubleToString("length", length, indent) + "\n";
        return str;
    }


    // Attributes
    private double   angle;
    private double[] origin;
    private double[] normal;
    private int      representation;
    private double[] upAxis;
    private boolean  cutByLength;
    private double   length;
}

