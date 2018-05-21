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
import java.util.Vector;

// ****************************************************************************
// Class: ExplodeAttributes
//
// Purpose:
//    This class contains attributes for the explode operator. 
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

public class ExplodeAttributes extends AttributeSubject implements Plugin
{
    private static int ExplodeAttributes_numAdditionalAtts = 15;

    // Enum values
    public final static int EXPLODETYPE_POINT = 0;
    public final static int EXPLODETYPE_PLANE = 1;
    public final static int EXPLODETYPE_CYLINDER = 2;

    public final static int EXPLOSIONPATTERN_IMPACT = 0;
    public final static int EXPLOSIONPATTERN_SCATTER = 1;


    public ExplodeAttributes()
    {
        super(ExplodeAttributes_numAdditionalAtts);

        explosionType = EXPLODETYPE_POINT;
        explosionPoint = new double[3];
        explosionPoint[0] = 0;
        explosionPoint[1] = 0;
        explosionPoint[2] = 0;
        planePoint = new double[3];
        planePoint[0] = 0;
        planePoint[1] = 0;
        planePoint[2] = 0;
        planeNorm = new double[3];
        planeNorm[0] = 0;
        planeNorm[1] = 0;
        planeNorm[2] = 0;
        cylinderPoint1 = new double[3];
        cylinderPoint1[0] = 0;
        cylinderPoint1[1] = 0;
        cylinderPoint1[2] = 0;
        cylinderPoint2 = new double[3];
        cylinderPoint2[0] = 0;
        cylinderPoint2[1] = 0;
        cylinderPoint2[2] = 0;
        materialExplosionFactor = 1;
        material = new String("");
        cylinderRadius = 0;
        explodeMaterialCells = false;
        cellExplosionFactor = 1;
        explosionPattern = EXPLOSIONPATTERN_IMPACT;
        explodeAllCells = false;
        boundaryNames = new Vector();
        explosions = new Vector();
    }

    public ExplodeAttributes(int nMoreFields)
    {
        super(ExplodeAttributes_numAdditionalAtts + nMoreFields);

        explosionType = EXPLODETYPE_POINT;
        explosionPoint = new double[3];
        explosionPoint[0] = 0;
        explosionPoint[1] = 0;
        explosionPoint[2] = 0;
        planePoint = new double[3];
        planePoint[0] = 0;
        planePoint[1] = 0;
        planePoint[2] = 0;
        planeNorm = new double[3];
        planeNorm[0] = 0;
        planeNorm[1] = 0;
        planeNorm[2] = 0;
        cylinderPoint1 = new double[3];
        cylinderPoint1[0] = 0;
        cylinderPoint1[1] = 0;
        cylinderPoint1[2] = 0;
        cylinderPoint2 = new double[3];
        cylinderPoint2[0] = 0;
        cylinderPoint2[1] = 0;
        cylinderPoint2[2] = 0;
        materialExplosionFactor = 1;
        material = new String("");
        cylinderRadius = 0;
        explodeMaterialCells = false;
        cellExplosionFactor = 1;
        explosionPattern = EXPLOSIONPATTERN_IMPACT;
        explodeAllCells = false;
        boundaryNames = new Vector();
        explosions = new Vector();
    }

    public ExplodeAttributes(ExplodeAttributes obj)
    {
        super(obj);

        int i;

        explosionType = obj.explosionType;
        explosionPoint = new double[3];
        explosionPoint[0] = obj.explosionPoint[0];
        explosionPoint[1] = obj.explosionPoint[1];
        explosionPoint[2] = obj.explosionPoint[2];

        planePoint = new double[3];
        planePoint[0] = obj.planePoint[0];
        planePoint[1] = obj.planePoint[1];
        planePoint[2] = obj.planePoint[2];

        planeNorm = new double[3];
        planeNorm[0] = obj.planeNorm[0];
        planeNorm[1] = obj.planeNorm[1];
        planeNorm[2] = obj.planeNorm[2];

        cylinderPoint1 = new double[3];
        cylinderPoint1[0] = obj.cylinderPoint1[0];
        cylinderPoint1[1] = obj.cylinderPoint1[1];
        cylinderPoint1[2] = obj.cylinderPoint1[2];

        cylinderPoint2 = new double[3];
        cylinderPoint2[0] = obj.cylinderPoint2[0];
        cylinderPoint2[1] = obj.cylinderPoint2[1];
        cylinderPoint2[2] = obj.cylinderPoint2[2];

        materialExplosionFactor = obj.materialExplosionFactor;
        material = new String(obj.material);
        cylinderRadius = obj.cylinderRadius;
        explodeMaterialCells = obj.explodeMaterialCells;
        cellExplosionFactor = obj.cellExplosionFactor;
        explosionPattern = obj.explosionPattern;
        explodeAllCells = obj.explodeAllCells;
        boundaryNames = new Vector(obj.boundaryNames.size());
        for(i = 0; i < obj.boundaryNames.size(); ++i)
            boundaryNames.addElement(new String((String)obj.boundaryNames.elementAt(i)));

        // *** Copy the explosions field ***
        explosions = new Vector(obj.explosions.size());
        for(i = 0; i < obj.explosions.size(); ++i)
        {
            ExplodeAttributes oldObj = (ExplodeAttributes)obj.explosions.elementAt(i);
            explosions.addElement(new ExplodeAttributes(oldObj));
        }


        SelectAll();
    }

    public int Offset()
    {
        return super.Offset() + super.GetNumAdditionalAttributes();
    }

    public int GetNumAdditionalAttributes()
    {
        return ExplodeAttributes_numAdditionalAtts;
    }

    public boolean equals(ExplodeAttributes obj)
    {
        int i;

        // Compare the explosionPoint arrays.
        boolean explosionPoint_equal = true;
        for(i = 0; i < 3 && explosionPoint_equal; ++i)
            explosionPoint_equal = (explosionPoint[i] == obj.explosionPoint[i]);

        // Compare the planePoint arrays.
        boolean planePoint_equal = true;
        for(i = 0; i < 3 && planePoint_equal; ++i)
            planePoint_equal = (planePoint[i] == obj.planePoint[i]);

        // Compare the planeNorm arrays.
        boolean planeNorm_equal = true;
        for(i = 0; i < 3 && planeNorm_equal; ++i)
            planeNorm_equal = (planeNorm[i] == obj.planeNorm[i]);

        // Compare the cylinderPoint1 arrays.
        boolean cylinderPoint1_equal = true;
        for(i = 0; i < 3 && cylinderPoint1_equal; ++i)
            cylinderPoint1_equal = (cylinderPoint1[i] == obj.cylinderPoint1[i]);

        // Compare the cylinderPoint2 arrays.
        boolean cylinderPoint2_equal = true;
        for(i = 0; i < 3 && cylinderPoint2_equal; ++i)
            cylinderPoint2_equal = (cylinderPoint2[i] == obj.cylinderPoint2[i]);

        // Compare the elements in the boundaryNames vector.
        boolean boundaryNames_equal = (obj.boundaryNames.size() == boundaryNames.size());
        for(i = 0; (i < boundaryNames.size()) && boundaryNames_equal; ++i)
        {
            // Make references to String from Object.
            String boundaryNames1 = (String)boundaryNames.elementAt(i);
            String boundaryNames2 = (String)obj.boundaryNames.elementAt(i);
            boundaryNames_equal = boundaryNames1.equals(boundaryNames2);
        }
        // Compare the elements in the explosions vector.
        boolean explosions_equal = (obj.explosions.size() == explosions.size());
        for(i = 0; (i < explosions.size()) && explosions_equal; ++i)
        {
            // Make references to ExplodeAttributes from Object.
            ExplodeAttributes explosions1 = (ExplodeAttributes)explosions.elementAt(i);
            ExplodeAttributes explosions2 = (ExplodeAttributes)obj.explosions.elementAt(i);
            explosions_equal = explosions1.equals(explosions2);
        }
        // Create the return value
        return ((explosionType == obj.explosionType) &&
                explosionPoint_equal &&
                planePoint_equal &&
                planeNorm_equal &&
                cylinderPoint1_equal &&
                cylinderPoint2_equal &&
                (materialExplosionFactor == obj.materialExplosionFactor) &&
                (material.equals(obj.material)) &&
                (cylinderRadius == obj.cylinderRadius) &&
                (explodeMaterialCells == obj.explodeMaterialCells) &&
                (cellExplosionFactor == obj.cellExplosionFactor) &&
                (explosionPattern == obj.explosionPattern) &&
                (explodeAllCells == obj.explodeAllCells) &&
                boundaryNames_equal &&
                explosions_equal);
    }

    public String GetName() { return "Explode"; }
    public String GetVersion() { return "1.0"; }

    // Property setting methods
    public void SetExplosionType(int explosionType_)
    {
        explosionType = explosionType_;
        Select(0);
    }

    public void SetExplosionPoint(double[] explosionPoint_)
    {
        explosionPoint[0] = explosionPoint_[0];
        explosionPoint[1] = explosionPoint_[1];
        explosionPoint[2] = explosionPoint_[2];
        Select(1);
    }

    public void SetExplosionPoint(double e0, double e1, double e2)
    {
        explosionPoint[0] = e0;
        explosionPoint[1] = e1;
        explosionPoint[2] = e2;
        Select(1);
    }

    public void SetPlanePoint(double[] planePoint_)
    {
        planePoint[0] = planePoint_[0];
        planePoint[1] = planePoint_[1];
        planePoint[2] = planePoint_[2];
        Select(2);
    }

    public void SetPlanePoint(double e0, double e1, double e2)
    {
        planePoint[0] = e0;
        planePoint[1] = e1;
        planePoint[2] = e2;
        Select(2);
    }

    public void SetPlaneNorm(double[] planeNorm_)
    {
        planeNorm[0] = planeNorm_[0];
        planeNorm[1] = planeNorm_[1];
        planeNorm[2] = planeNorm_[2];
        Select(3);
    }

    public void SetPlaneNorm(double e0, double e1, double e2)
    {
        planeNorm[0] = e0;
        planeNorm[1] = e1;
        planeNorm[2] = e2;
        Select(3);
    }

    public void SetCylinderPoint1(double[] cylinderPoint1_)
    {
        cylinderPoint1[0] = cylinderPoint1_[0];
        cylinderPoint1[1] = cylinderPoint1_[1];
        cylinderPoint1[2] = cylinderPoint1_[2];
        Select(4);
    }

    public void SetCylinderPoint1(double e0, double e1, double e2)
    {
        cylinderPoint1[0] = e0;
        cylinderPoint1[1] = e1;
        cylinderPoint1[2] = e2;
        Select(4);
    }

    public void SetCylinderPoint2(double[] cylinderPoint2_)
    {
        cylinderPoint2[0] = cylinderPoint2_[0];
        cylinderPoint2[1] = cylinderPoint2_[1];
        cylinderPoint2[2] = cylinderPoint2_[2];
        Select(5);
    }

    public void SetCylinderPoint2(double e0, double e1, double e2)
    {
        cylinderPoint2[0] = e0;
        cylinderPoint2[1] = e1;
        cylinderPoint2[2] = e2;
        Select(5);
    }

    public void SetMaterialExplosionFactor(double materialExplosionFactor_)
    {
        materialExplosionFactor = materialExplosionFactor_;
        Select(6);
    }

    public void SetMaterial(String material_)
    {
        material = material_;
        Select(7);
    }

    public void SetCylinderRadius(double cylinderRadius_)
    {
        cylinderRadius = cylinderRadius_;
        Select(8);
    }

    public void SetExplodeMaterialCells(boolean explodeMaterialCells_)
    {
        explodeMaterialCells = explodeMaterialCells_;
        Select(9);
    }

    public void SetCellExplosionFactor(double cellExplosionFactor_)
    {
        cellExplosionFactor = cellExplosionFactor_;
        Select(10);
    }

    public void SetExplosionPattern(int explosionPattern_)
    {
        explosionPattern = explosionPattern_;
        Select(11);
    }

    public void SetExplodeAllCells(boolean explodeAllCells_)
    {
        explodeAllCells = explodeAllCells_;
        Select(12);
    }

    public void SetBoundaryNames(Vector boundaryNames_)
    {
        boundaryNames = boundaryNames_;
        Select(13);
    }

    // Property getting methods
    public int      GetExplosionType() { return explosionType; }
    public double[] GetExplosionPoint() { return explosionPoint; }
    public double[] GetPlanePoint() { return planePoint; }
    public double[] GetPlaneNorm() { return planeNorm; }
    public double[] GetCylinderPoint1() { return cylinderPoint1; }
    public double[] GetCylinderPoint2() { return cylinderPoint2; }
    public double   GetMaterialExplosionFactor() { return materialExplosionFactor; }
    public String   GetMaterial() { return material; }
    public double   GetCylinderRadius() { return cylinderRadius; }
    public boolean  GetExplodeMaterialCells() { return explodeMaterialCells; }
    public double   GetCellExplosionFactor() { return cellExplosionFactor; }
    public int      GetExplosionPattern() { return explosionPattern; }
    public boolean  GetExplodeAllCells() { return explodeAllCells; }
    public Vector   GetBoundaryNames() { return boundaryNames; }
    public Vector   GetExplosions() { return explosions; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteInt(explosionType);
        if(WriteSelect(1, buf))
            buf.WriteDoubleArray(explosionPoint);
        if(WriteSelect(2, buf))
            buf.WriteDoubleArray(planePoint);
        if(WriteSelect(3, buf))
            buf.WriteDoubleArray(planeNorm);
        if(WriteSelect(4, buf))
            buf.WriteDoubleArray(cylinderPoint1);
        if(WriteSelect(5, buf))
            buf.WriteDoubleArray(cylinderPoint2);
        if(WriteSelect(6, buf))
            buf.WriteDouble(materialExplosionFactor);
        if(WriteSelect(7, buf))
            buf.WriteString(material);
        if(WriteSelect(8, buf))
            buf.WriteDouble(cylinderRadius);
        if(WriteSelect(9, buf))
            buf.WriteBool(explodeMaterialCells);
        if(WriteSelect(10, buf))
            buf.WriteDouble(cellExplosionFactor);
        if(WriteSelect(11, buf))
            buf.WriteInt(explosionPattern);
        if(WriteSelect(12, buf))
            buf.WriteBool(explodeAllCells);
        if(WriteSelect(13, buf))
            buf.WriteStringVector(boundaryNames);
        if(WriteSelect(14, buf))
        {
            buf.WriteInt(explosions.size());
            for(int i = 0; i < explosions.size(); ++i)
            {
                ExplodeAttributes tmp = (ExplodeAttributes)explosions.elementAt(i);
                tmp.Write(buf);
            }
        }
    }

    public void ReadAtts(int index, CommunicationBuffer buf)
    {
        switch(index)
        {
        case 0:
            SetExplosionType(buf.ReadInt());
            break;
        case 1:
            SetExplosionPoint(buf.ReadDoubleArray());
            break;
        case 2:
            SetPlanePoint(buf.ReadDoubleArray());
            break;
        case 3:
            SetPlaneNorm(buf.ReadDoubleArray());
            break;
        case 4:
            SetCylinderPoint1(buf.ReadDoubleArray());
            break;
        case 5:
            SetCylinderPoint2(buf.ReadDoubleArray());
            break;
        case 6:
            SetMaterialExplosionFactor(buf.ReadDouble());
            break;
        case 7:
            SetMaterial(buf.ReadString());
            break;
        case 8:
            SetCylinderRadius(buf.ReadDouble());
            break;
        case 9:
            SetExplodeMaterialCells(buf.ReadBool());
            break;
        case 10:
            SetCellExplosionFactor(buf.ReadDouble());
            break;
        case 11:
            SetExplosionPattern(buf.ReadInt());
            break;
        case 12:
            SetExplodeAllCells(buf.ReadBool());
            break;
        case 13:
            SetBoundaryNames(buf.ReadStringVector());
            break;
        case 14:
            {
                int len = buf.ReadInt();
                explosions.clear();
                for(int j = 0; j < len; ++j)
                {
                    ExplodeAttributes tmp = new ExplodeAttributes();
                    tmp.Read(buf);
                    explosions.addElement(tmp);
                }
            }
            Select(14);
            break;
        }
    }

    public String toString(String indent)
    {
        String str = new String();
        str = str + indent + "explosionType = ";
        if(explosionType == EXPLODETYPE_POINT)
            str = str + "EXPLODETYPE_POINT";
        if(explosionType == EXPLODETYPE_PLANE)
            str = str + "EXPLODETYPE_PLANE";
        if(explosionType == EXPLODETYPE_CYLINDER)
            str = str + "EXPLODETYPE_CYLINDER";
        str = str + "\n";
        str = str + doubleArrayToString("explosionPoint", explosionPoint, indent) + "\n";
        str = str + doubleArrayToString("planePoint", planePoint, indent) + "\n";
        str = str + doubleArrayToString("planeNorm", planeNorm, indent) + "\n";
        str = str + doubleArrayToString("cylinderPoint1", cylinderPoint1, indent) + "\n";
        str = str + doubleArrayToString("cylinderPoint2", cylinderPoint2, indent) + "\n";
        str = str + doubleToString("materialExplosionFactor", materialExplosionFactor, indent) + "\n";
        str = str + stringToString("material", material, indent) + "\n";
        str = str + doubleToString("cylinderRadius", cylinderRadius, indent) + "\n";
        str = str + boolToString("explodeMaterialCells", explodeMaterialCells, indent) + "\n";
        str = str + doubleToString("cellExplosionFactor", cellExplosionFactor, indent) + "\n";
        str = str + indent + "explosionPattern = ";
        if(explosionPattern == EXPLOSIONPATTERN_IMPACT)
            str = str + "EXPLOSIONPATTERN_IMPACT";
        if(explosionPattern == EXPLOSIONPATTERN_SCATTER)
            str = str + "EXPLOSIONPATTERN_SCATTER";
        str = str + "\n";
        str = str + boolToString("explodeAllCells", explodeAllCells, indent) + "\n";
        str = str + stringVectorToString("boundaryNames", boundaryNames, indent) + "\n";
        str = str + indent + "explosions = {\n";
        for(int i = 0; i < explosions.size(); ++i)
        {
            AttributeSubject s = (AttributeSubject)explosions.elementAt(i);
            str = str + s.toString(indent + "    ");
            if(i < explosions.size()-1)
                str = str + ", ";
            str = str + "\n";
        }
        str = str + "}\n";
        return str;
    }

    // Attributegroup convenience methods
    public void AddExplosions(ExplodeAttributes obj)
    {
        explosions.addElement(new ExplodeAttributes(obj));
        Select(14);
    }

    public void ClearExplosions()
    {
        explosions.clear();
        Select(14);
    }

    public void RemoveExplosions(int index)
    {
        if(index >= 0 && index < explosions.size())
        {
            explosions.remove(index);
            Select(14);
        }
    }

    public int GetNumExplosions()
    {
        return explosions.size();
    }

    public ExplodeAttributes GetExplosions(int i)
    {
        ExplodeAttributes tmp = (ExplodeAttributes)explosions.elementAt(i);
        return tmp;
    }


    // Attributes
    private int      explosionType;
    private double[] explosionPoint;
    private double[] planePoint;
    private double[] planeNorm;
    private double[] cylinderPoint1;
    private double[] cylinderPoint2;
    private double   materialExplosionFactor;
    private String   material;
    private double   cylinderRadius;
    private boolean  explodeMaterialCells;
    private double   cellExplosionFactor;
    private int      explosionPattern;
    private boolean  explodeAllCells;
    private Vector   boundaryNames; // vector of String objects
    private Vector   explosions; // vector of ExplodeAttributes objects
}

