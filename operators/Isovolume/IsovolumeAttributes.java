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

package llnl.visit.operators;

import llnl.visit.AttributeSubject;
import llnl.visit.CommunicationBuffer;
import llnl.visit.Plugin;

// ****************************************************************************
// Class: IsovolumeAttributes
//
// Purpose:
//    This class contains attributes for the isovolume operator.
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   Fri Jan 30 14:50:27 PST 2004
//
// Modifications:
//   
// ****************************************************************************

public class IsovolumeAttributes extends AttributeSubject implements Plugin
{
    public IsovolumeAttributes()
    {
        super(3);

        lbound = -1e+37;
        ubound = 1e+37;
        variable = new String("default");
    }

    public IsovolumeAttributes(IsovolumeAttributes obj)
    {
        super(3);

        lbound = obj.lbound;
        ubound = obj.ubound;
        variable = new String(obj.variable);

        SelectAll();
    }

    public boolean equals(IsovolumeAttributes obj)
    {
        // Create the return value
        return ((lbound == obj.lbound) &&
                (ubound == obj.ubound) &&
                (variable == obj.variable));
    }

    public String GetName() { return "Isovolume"; }
    public String GetVersion() { return "1.0"; }

    // Property setting methods
    public void SetLbound(double lbound_)
    {
        lbound = lbound_;
        Select(0);
    }

    public void SetUbound(double ubound_)
    {
        ubound = ubound_;
        Select(1);
    }

    public void SetVariable(String variable_)
    {
        variable = variable_;
        Select(2);
    }

    // Property getting methods
    public double GetLbound() { return lbound; }
    public double GetUbound() { return ubound; }
    public String GetVariable() { return variable; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteDouble(lbound);
        if(WriteSelect(1, buf))
            buf.WriteDouble(ubound);
        if(WriteSelect(2, buf))
            buf.WriteString(variable);
    }

    public void ReadAtts(int n, CommunicationBuffer buf)
    {
        for(int i = 0; i < n; ++i)
        {
            int index = (int)buf.ReadByte();
            switch(index)
            {
            case 0:
                SetLbound(buf.ReadDouble());
                break;
            case 1:
                SetUbound(buf.ReadDouble());
                break;
            case 2:
                SetVariable(buf.ReadString());
                break;
            }
        }
    }


    // Attributes
    private double lbound;
    private double ubound;
    private String variable;
}

