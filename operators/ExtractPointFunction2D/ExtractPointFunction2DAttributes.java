// ***************************************************************************
//
// Copyright (c) 2000 - 2015, Lawrence Livermore National Security, LLC
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
// Class: ExtractPointFunction2DAttributes
//
// Purpose:
//    Attributes for ExtractPointFunction2D
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

public class ExtractPointFunction2DAttributes extends AttributeSubject implements Plugin
{
    private static int ExtractPointFunction2DAttributes_numAdditionalAtts = 2;

    public ExtractPointFunction2DAttributes()
    {
        super(ExtractPointFunction2DAttributes_numAdditionalAtts);

        I = 0;
        J = 0;
    }

    public ExtractPointFunction2DAttributes(int nMoreFields)
    {
        super(ExtractPointFunction2DAttributes_numAdditionalAtts + nMoreFields);

        I = 0;
        J = 0;
    }

    public ExtractPointFunction2DAttributes(ExtractPointFunction2DAttributes obj)
    {
        super(ExtractPointFunction2DAttributes_numAdditionalAtts);

        I = obj.I;
        J = obj.J;

        SelectAll();
    }

    public int Offset()
    {
        return super.Offset() + super.GetNumAdditionalAttributes();
    }

    public int GetNumAdditionalAttributes()
    {
        return ExtractPointFunction2DAttributes_numAdditionalAtts;
    }

    public boolean equals(ExtractPointFunction2DAttributes obj)
    {
        // Create the return value
        return ((I == obj.I) &&
                (J == obj.J));
    }

    public String GetName() { return "ExtractPointFunction2D"; }
    public String GetVersion() { return "1.0"; }

    // Property setting methods
    public void SetI(int I_)
    {
        I = I_;
        Select(0);
    }

    public void SetJ(int J_)
    {
        J = J_;
        Select(1);
    }

    // Property getting methods
    public int GetI() { return I; }
    public int GetJ() { return J; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteInt(I);
        if(WriteSelect(1, buf))
            buf.WriteInt(J);
    }

    public void ReadAtts(int index, CommunicationBuffer buf)
    {
        switch(index)
        {
        case 0:
            SetI(buf.ReadInt());
            break;
        case 1:
            SetJ(buf.ReadInt());
            break;
        }
    }

    public String toString(String indent)
    {
        String str = new String();
        str = str + intToString("I", I, indent) + "\n";
        str = str + intToString("J", J, indent) + "\n";
        return str;
    }


    // Attributes
    private int I;
    private int J;
}

