// ***************************************************************************
//
// Copyright (c) 2000 - 2014, Lawrence Livermore National Security, LLC
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
// Class: RectilinearProject2DAttributes
//
// Purpose:
//    Attributes for RectilinearProject2D
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

public class RectilinearProject2DAttributes extends AttributeSubject implements Plugin
{
    private static int RectilinearProject2DAttributes_numAdditionalAtts = 2;

    // Enum values
    public final static int REDUCTIONOPERATOR_SUM = 0;
    public final static int REDUCTIONOPERATOR_AVERAGE = 1;


    public RectilinearProject2DAttributes()
    {
        super(RectilinearProject2DAttributes_numAdditionalAtts);

        reductionOperator = REDUCTIONOPERATOR_SUM;
        mapGrid = true;
    }

    public RectilinearProject2DAttributes(int nMoreFields)
    {
        super(RectilinearProject2DAttributes_numAdditionalAtts + nMoreFields);

        reductionOperator = REDUCTIONOPERATOR_SUM;
        mapGrid = true;
    }

    public RectilinearProject2DAttributes(RectilinearProject2DAttributes obj)
    {
        super(RectilinearProject2DAttributes_numAdditionalAtts);

        reductionOperator = obj.reductionOperator;
        mapGrid = obj.mapGrid;

        SelectAll();
    }

    public int Offset()
    {
        return super.Offset() + super.GetNumAdditionalAttributes();
    }

    public int GetNumAdditionalAttributes()
    {
        return RectilinearProject2DAttributes_numAdditionalAtts;
    }

    public boolean equals(RectilinearProject2DAttributes obj)
    {
        // Create the return value
        return ((reductionOperator == obj.reductionOperator) &&
                (mapGrid == obj.mapGrid));
    }

    public String GetName() { return "RectilinearProject2D"; }
    public String GetVersion() { return "1.0"; }

    // Property setting methods
    public void SetReductionOperator(int reductionOperator_)
    {
        reductionOperator = reductionOperator_;
        Select(0);
    }

    public void SetMapGrid(boolean mapGrid_)
    {
        mapGrid = mapGrid_;
        Select(1);
    }

    // Property getting methods
    public int     GetReductionOperator() { return reductionOperator; }
    public boolean GetMapGrid() { return mapGrid; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteInt(reductionOperator);
        if(WriteSelect(1, buf))
            buf.WriteBool(mapGrid);
    }

    public void ReadAtts(int index, CommunicationBuffer buf)
    {
        switch(index)
        {
        case 0:
            SetReductionOperator(buf.ReadInt());
            break;
        case 1:
            SetMapGrid(buf.ReadBool());
            break;
        }
    }

    public String toString(String indent)
    {
        String str = new String();
        str = str + indent + "reductionOperator = ";
        if(reductionOperator == REDUCTIONOPERATOR_SUM)
            str = str + "REDUCTIONOPERATOR_SUM";
        if(reductionOperator == REDUCTIONOPERATOR_AVERAGE)
            str = str + "REDUCTIONOPERATOR_AVERAGE";
        str = str + "\n";
        str = str + boolToString("mapGrid", mapGrid, indent) + "\n";
        return str;
    }


    // Attributes
    private int     reductionOperator;
    private boolean mapGrid;
}

