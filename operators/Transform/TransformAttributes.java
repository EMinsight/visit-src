// ****************************************************************************
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
// ****************************************************************************

package llnl.visit.operators;

import llnl.visit.AttributeSubject;
import llnl.visit.CommunicationBuffer;
import llnl.visit.Plugin;

// ****************************************************************************
// Class: TransformAttributes
//
// Purpose:
//    This class contains attributes for the transform operator.
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   Fri Feb 4 15:40:18 PST 2005
//
// Modifications:
//   
// ****************************************************************************

public class TransformAttributes extends AttributeSubject implements Plugin
{
    // Enum values
    public final static int ANGLETYPE_DEG = 0;
    public final static int ANGLETYPE_RAD = 1;

    public final static int TRANSFORMTYPE_SIMILARITY = 0;
    public final static int TRANSFORMTYPE_COORDINATE = 1;

    public final static int COORDINATESYSTEM_CARTESIAN = 0;
    public final static int COORDINATESYSTEM_CYLINDRICAL = 1;
    public final static int COORDINATESYSTEM_SPHERICAL = 2;


    public TransformAttributes()
    {
        super(17);

        doRotate = false;
        rotateOrigin = new float[3];
        rotateOrigin[0] = 0f;
        rotateOrigin[1] = 0f;
        rotateOrigin[2] = 0f;
        rotateAxis = new float[3];
        rotateAxis[0] = 0f;
        rotateAxis[1] = 0f;
        rotateAxis[2] = 1f;
        rotateAmount = 0f;
        rotateType = ANGLETYPE_DEG;
        doScale = false;
        scaleOrigin = new float[3];
        scaleOrigin[0] = 0f;
        scaleOrigin[1] = 0f;
        scaleOrigin[2] = 0f;
        scaleX = 1f;
        scaleY = 1f;
        scaleZ = 1f;
        doTranslate = false;
        translateX = 0f;
        translateY = 0f;
        translateZ = 0f;
        transformType = TRANSFORMTYPE_SIMILARITY;
        inputCoordSys = COORDINATESYSTEM_CARTESIAN;
        outputCoordSys = COORDINATESYSTEM_SPHERICAL;
    }

    public TransformAttributes(TransformAttributes obj)
    {
        super(17);

        int i;

        doRotate = obj.doRotate;
        rotateOrigin = new float[3];
        rotateOrigin[0] = obj.rotateOrigin[0];
        rotateOrigin[1] = obj.rotateOrigin[1];
        rotateOrigin[2] = obj.rotateOrigin[2];

        rotateAxis = new float[3];
        rotateAxis[0] = obj.rotateAxis[0];
        rotateAxis[1] = obj.rotateAxis[1];
        rotateAxis[2] = obj.rotateAxis[2];

        rotateAmount = obj.rotateAmount;
        rotateType = obj.rotateType;
        doScale = obj.doScale;
        scaleOrigin = new float[3];
        scaleOrigin[0] = obj.scaleOrigin[0];
        scaleOrigin[1] = obj.scaleOrigin[1];
        scaleOrigin[2] = obj.scaleOrigin[2];

        scaleX = obj.scaleX;
        scaleY = obj.scaleY;
        scaleZ = obj.scaleZ;
        doTranslate = obj.doTranslate;
        translateX = obj.translateX;
        translateY = obj.translateY;
        translateZ = obj.translateZ;
        transformType = obj.transformType;
        inputCoordSys = obj.inputCoordSys;
        outputCoordSys = obj.outputCoordSys;

        SelectAll();
    }

    public boolean equals(TransformAttributes obj)
    {
        int i;

        // Compare the rotateOrigin arrays.
        boolean rotateOrigin_equal = true;
        for(i = 0; i < 3 && rotateOrigin_equal; ++i)
            rotateOrigin_equal = (rotateOrigin[i] == obj.rotateOrigin[i]);

        // Compare the rotateAxis arrays.
        boolean rotateAxis_equal = true;
        for(i = 0; i < 3 && rotateAxis_equal; ++i)
            rotateAxis_equal = (rotateAxis[i] == obj.rotateAxis[i]);

        // Compare the scaleOrigin arrays.
        boolean scaleOrigin_equal = true;
        for(i = 0; i < 3 && scaleOrigin_equal; ++i)
            scaleOrigin_equal = (scaleOrigin[i] == obj.scaleOrigin[i]);

        // Create the return value
        return ((doRotate == obj.doRotate) &&
                rotateOrigin_equal &&
                rotateAxis_equal &&
                (rotateAmount == obj.rotateAmount) &&
                (rotateType == obj.rotateType) &&
                (doScale == obj.doScale) &&
                scaleOrigin_equal &&
                (scaleX == obj.scaleX) &&
                (scaleY == obj.scaleY) &&
                (scaleZ == obj.scaleZ) &&
                (doTranslate == obj.doTranslate) &&
                (translateX == obj.translateX) &&
                (translateY == obj.translateY) &&
                (translateZ == obj.translateZ) &&
                (transformType == obj.transformType) &&
                (inputCoordSys == obj.inputCoordSys) &&
                (outputCoordSys == obj.outputCoordSys));
    }

    public String GetName() { return "Transform"; }
    public String GetVersion() { return "1.0"; }

    // Property setting methods
    public void SetDoRotate(boolean doRotate_)
    {
        doRotate = doRotate_;
        Select(0);
    }

    public void SetRotateOrigin(float[] rotateOrigin_)
    {
        rotateOrigin[0] = rotateOrigin_[0];
        rotateOrigin[1] = rotateOrigin_[1];
        rotateOrigin[2] = rotateOrigin_[2];
        Select(1);
    }

    public void SetRotateOrigin(float e0, float e1, float e2)
    {
        rotateOrigin[0] = e0;
        rotateOrigin[1] = e1;
        rotateOrigin[2] = e2;
        Select(1);
    }

    public void SetRotateAxis(float[] rotateAxis_)
    {
        rotateAxis[0] = rotateAxis_[0];
        rotateAxis[1] = rotateAxis_[1];
        rotateAxis[2] = rotateAxis_[2];
        Select(2);
    }

    public void SetRotateAxis(float e0, float e1, float e2)
    {
        rotateAxis[0] = e0;
        rotateAxis[1] = e1;
        rotateAxis[2] = e2;
        Select(2);
    }

    public void SetRotateAmount(float rotateAmount_)
    {
        rotateAmount = rotateAmount_;
        Select(3);
    }

    public void SetRotateType(int rotateType_)
    {
        rotateType = rotateType_;
        Select(4);
    }

    public void SetDoScale(boolean doScale_)
    {
        doScale = doScale_;
        Select(5);
    }

    public void SetScaleOrigin(float[] scaleOrigin_)
    {
        scaleOrigin[0] = scaleOrigin_[0];
        scaleOrigin[1] = scaleOrigin_[1];
        scaleOrigin[2] = scaleOrigin_[2];
        Select(6);
    }

    public void SetScaleOrigin(float e0, float e1, float e2)
    {
        scaleOrigin[0] = e0;
        scaleOrigin[1] = e1;
        scaleOrigin[2] = e2;
        Select(6);
    }

    public void SetScaleX(float scaleX_)
    {
        scaleX = scaleX_;
        Select(7);
    }

    public void SetScaleY(float scaleY_)
    {
        scaleY = scaleY_;
        Select(8);
    }

    public void SetScaleZ(float scaleZ_)
    {
        scaleZ = scaleZ_;
        Select(9);
    }

    public void SetDoTranslate(boolean doTranslate_)
    {
        doTranslate = doTranslate_;
        Select(10);
    }

    public void SetTranslateX(float translateX_)
    {
        translateX = translateX_;
        Select(11);
    }

    public void SetTranslateY(float translateY_)
    {
        translateY = translateY_;
        Select(12);
    }

    public void SetTranslateZ(float translateZ_)
    {
        translateZ = translateZ_;
        Select(13);
    }

    public void SetTransformType(int transformType_)
    {
        transformType = transformType_;
        Select(14);
    }

    public void SetInputCoordSys(int inputCoordSys_)
    {
        inputCoordSys = inputCoordSys_;
        Select(15);
    }

    public void SetOutputCoordSys(int outputCoordSys_)
    {
        outputCoordSys = outputCoordSys_;
        Select(16);
    }

    // Property getting methods
    public boolean GetDoRotate() { return doRotate; }
    public float[] GetRotateOrigin() { return rotateOrigin; }
    public float[] GetRotateAxis() { return rotateAxis; }
    public float   GetRotateAmount() { return rotateAmount; }
    public int     GetRotateType() { return rotateType; }
    public boolean GetDoScale() { return doScale; }
    public float[] GetScaleOrigin() { return scaleOrigin; }
    public float   GetScaleX() { return scaleX; }
    public float   GetScaleY() { return scaleY; }
    public float   GetScaleZ() { return scaleZ; }
    public boolean GetDoTranslate() { return doTranslate; }
    public float   GetTranslateX() { return translateX; }
    public float   GetTranslateY() { return translateY; }
    public float   GetTranslateZ() { return translateZ; }
    public int     GetTransformType() { return transformType; }
    public int     GetInputCoordSys() { return inputCoordSys; }
    public int     GetOutputCoordSys() { return outputCoordSys; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteBool(doRotate);
        if(WriteSelect(1, buf))
            buf.WriteFloatArray(rotateOrigin);
        if(WriteSelect(2, buf))
            buf.WriteFloatArray(rotateAxis);
        if(WriteSelect(3, buf))
            buf.WriteFloat(rotateAmount);
        if(WriteSelect(4, buf))
            buf.WriteInt(rotateType);
        if(WriteSelect(5, buf))
            buf.WriteBool(doScale);
        if(WriteSelect(6, buf))
            buf.WriteFloatArray(scaleOrigin);
        if(WriteSelect(7, buf))
            buf.WriteFloat(scaleX);
        if(WriteSelect(8, buf))
            buf.WriteFloat(scaleY);
        if(WriteSelect(9, buf))
            buf.WriteFloat(scaleZ);
        if(WriteSelect(10, buf))
            buf.WriteBool(doTranslate);
        if(WriteSelect(11, buf))
            buf.WriteFloat(translateX);
        if(WriteSelect(12, buf))
            buf.WriteFloat(translateY);
        if(WriteSelect(13, buf))
            buf.WriteFloat(translateZ);
        if(WriteSelect(14, buf))
            buf.WriteInt(transformType);
        if(WriteSelect(15, buf))
            buf.WriteInt(inputCoordSys);
        if(WriteSelect(16, buf))
            buf.WriteInt(outputCoordSys);
    }

    public void ReadAtts(int n, CommunicationBuffer buf)
    {
        for(int i = 0; i < n; ++i)
        {
            int index = (int)buf.ReadByte();
            switch(index)
            {
            case 0:
                SetDoRotate(buf.ReadBool());
                break;
            case 1:
                SetRotateOrigin(buf.ReadFloatArray());
                break;
            case 2:
                SetRotateAxis(buf.ReadFloatArray());
                break;
            case 3:
                SetRotateAmount(buf.ReadFloat());
                break;
            case 4:
                SetRotateType(buf.ReadInt());
                break;
            case 5:
                SetDoScale(buf.ReadBool());
                break;
            case 6:
                SetScaleOrigin(buf.ReadFloatArray());
                break;
            case 7:
                SetScaleX(buf.ReadFloat());
                break;
            case 8:
                SetScaleY(buf.ReadFloat());
                break;
            case 9:
                SetScaleZ(buf.ReadFloat());
                break;
            case 10:
                SetDoTranslate(buf.ReadBool());
                break;
            case 11:
                SetTranslateX(buf.ReadFloat());
                break;
            case 12:
                SetTranslateY(buf.ReadFloat());
                break;
            case 13:
                SetTranslateZ(buf.ReadFloat());
                break;
            case 14:
                SetTransformType(buf.ReadInt());
                break;
            case 15:
                SetInputCoordSys(buf.ReadInt());
                break;
            case 16:
                SetOutputCoordSys(buf.ReadInt());
                break;
            }
        }
    }


    // Attributes
    private boolean doRotate;
    private float[] rotateOrigin;
    private float[] rotateAxis;
    private float   rotateAmount;
    private int     rotateType;
    private boolean doScale;
    private float[] scaleOrigin;
    private float   scaleX;
    private float   scaleY;
    private float   scaleZ;
    private boolean doTranslate;
    private float   translateX;
    private float   translateY;
    private float   translateZ;
    private int     transformType;
    private int     inputCoordSys;
    private int     outputCoordSys;
}

