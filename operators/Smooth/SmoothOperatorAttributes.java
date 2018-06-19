// ***************************************************************************
//
// Copyright (c) 2000 - 2010, Lawrence Livermore National Security, LLC
// Produced at the Lawrence Livermore National Laboratory
// LLNL-CODE-400124
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
// Class: SmoothOperatorAttributes
//
// Purpose:
//    Attributes for the Smooth Operator
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

public class SmoothOperatorAttributes extends AttributeSubject implements Plugin
{
    private static int numAdditionalAttributes = 7;

    public SmoothOperatorAttributes()
    {
        super(numAdditionalAttributes);

        numIterations = 20;
        relaxationFactor = 0.01;
        convergence = 0;
        maintainFeatures = true;
        featureAngle = 45;
        edgeAngle = 15;
        smoothBoundaries = false;
    }

    public SmoothOperatorAttributes(int nMoreFields)
    {
        super(numAdditionalAttributes + nMoreFields);

        numIterations = 20;
        relaxationFactor = 0.01;
        convergence = 0;
        maintainFeatures = true;
        featureAngle = 45;
        edgeAngle = 15;
        smoothBoundaries = false;
    }

    public SmoothOperatorAttributes(SmoothOperatorAttributes obj)
    {
        super(numAdditionalAttributes);

        numIterations = obj.numIterations;
        relaxationFactor = obj.relaxationFactor;
        convergence = obj.convergence;
        maintainFeatures = obj.maintainFeatures;
        featureAngle = obj.featureAngle;
        edgeAngle = obj.edgeAngle;
        smoothBoundaries = obj.smoothBoundaries;

        SelectAll();
    }

    public int Offset()
    {
        return super.Offset() + super.GetNumAdditionalAttributes();
    }

    public int GetNumAdditionalAttributes()
    {
        return numAdditionalAttributes;
    }

    public boolean equals(SmoothOperatorAttributes obj)
    {
        // Create the return value
        return ((numIterations == obj.numIterations) &&
                (relaxationFactor == obj.relaxationFactor) &&
                (convergence == obj.convergence) &&
                (maintainFeatures == obj.maintainFeatures) &&
                (featureAngle == obj.featureAngle) &&
                (edgeAngle == obj.edgeAngle) &&
                (smoothBoundaries == obj.smoothBoundaries));
    }

    public String GetName() { return "Smooth"; }
    public String GetVersion() { return "1.0"; }

    // Property setting methods
    public void SetNumIterations(int numIterations_)
    {
        numIterations = numIterations_;
        Select(0);
    }

    public void SetRelaxationFactor(double relaxationFactor_)
    {
        relaxationFactor = relaxationFactor_;
        Select(1);
    }

    public void SetConvergence(double convergence_)
    {
        convergence = convergence_;
        Select(2);
    }

    public void SetMaintainFeatures(boolean maintainFeatures_)
    {
        maintainFeatures = maintainFeatures_;
        Select(3);
    }

    public void SetFeatureAngle(double featureAngle_)
    {
        featureAngle = featureAngle_;
        Select(4);
    }

    public void SetEdgeAngle(double edgeAngle_)
    {
        edgeAngle = edgeAngle_;
        Select(5);
    }

    public void SetSmoothBoundaries(boolean smoothBoundaries_)
    {
        smoothBoundaries = smoothBoundaries_;
        Select(6);
    }

    // Property getting methods
    public int     GetNumIterations() { return numIterations; }
    public double  GetRelaxationFactor() { return relaxationFactor; }
    public double  GetConvergence() { return convergence; }
    public boolean GetMaintainFeatures() { return maintainFeatures; }
    public double  GetFeatureAngle() { return featureAngle; }
    public double  GetEdgeAngle() { return edgeAngle; }
    public boolean GetSmoothBoundaries() { return smoothBoundaries; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteInt(numIterations);
        if(WriteSelect(1, buf))
            buf.WriteDouble(relaxationFactor);
        if(WriteSelect(2, buf))
            buf.WriteDouble(convergence);
        if(WriteSelect(3, buf))
            buf.WriteBool(maintainFeatures);
        if(WriteSelect(4, buf))
            buf.WriteDouble(featureAngle);
        if(WriteSelect(5, buf))
            buf.WriteDouble(edgeAngle);
        if(WriteSelect(6, buf))
            buf.WriteBool(smoothBoundaries);
    }

    public void ReadAtts(int index, CommunicationBuffer buf)
    {
        switch(index)
        {
        case 0:
            SetNumIterations(buf.ReadInt());
            break;
        case 1:
            SetRelaxationFactor(buf.ReadDouble());
            break;
        case 2:
            SetConvergence(buf.ReadDouble());
            break;
        case 3:
            SetMaintainFeatures(buf.ReadBool());
            break;
        case 4:
            SetFeatureAngle(buf.ReadDouble());
            break;
        case 5:
            SetEdgeAngle(buf.ReadDouble());
            break;
        case 6:
            SetSmoothBoundaries(buf.ReadBool());
            break;
        }
    }

    public String toString(String indent)
    {
        String str = new String();
        str = str + intToString("numIterations", numIterations, indent) + "\n";
        str = str + doubleToString("relaxationFactor", relaxationFactor, indent) + "\n";
        str = str + doubleToString("convergence", convergence, indent) + "\n";
        str = str + boolToString("maintainFeatures", maintainFeatures, indent) + "\n";
        str = str + doubleToString("featureAngle", featureAngle, indent) + "\n";
        str = str + doubleToString("edgeAngle", edgeAngle, indent) + "\n";
        str = str + boolToString("smoothBoundaries", smoothBoundaries, indent) + "\n";
        return str;
    }


    // Attributes
    private int     numIterations;
    private double  relaxationFactor;
    private double  convergence;
    private boolean maintainFeatures;
    private double  featureAngle;
    private double  edgeAngle;
    private boolean smoothBoundaries;
}

