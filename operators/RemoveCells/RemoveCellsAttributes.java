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
import java.lang.Integer;
import java.util.Vector;

// ****************************************************************************
// Class: RemoveCellsAttributes
//
// Purpose:
//    This class contains attributes for the RemoveCells operator.
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

public class RemoveCellsAttributes extends AttributeSubject implements Plugin
{
    private static int RemoveCellsAttributes_numAdditionalAtts = 2;

    public RemoveCellsAttributes()
    {
        super(RemoveCellsAttributes_numAdditionalAtts);

        cellList = new Vector();
        domainList = new Vector();
    }

    public RemoveCellsAttributes(int nMoreFields)
    {
        super(RemoveCellsAttributes_numAdditionalAtts + nMoreFields);

        cellList = new Vector();
        domainList = new Vector();
    }

    public RemoveCellsAttributes(RemoveCellsAttributes obj)
    {
        super(obj);

        int i;

        cellList = new Vector();
        for(i = 0; i < obj.cellList.size(); ++i)
        {
            Integer iv = (Integer)obj.cellList.elementAt(i);
            cellList.addElement(new Integer(iv.intValue()));
        }
        domainList = new Vector();
        for(i = 0; i < obj.domainList.size(); ++i)
        {
            Integer iv = (Integer)obj.domainList.elementAt(i);
            domainList.addElement(new Integer(iv.intValue()));
        }

        SelectAll();
    }

    public int Offset()
    {
        return super.Offset() + super.GetNumAdditionalAttributes();
    }

    public int GetNumAdditionalAttributes()
    {
        return RemoveCellsAttributes_numAdditionalAtts;
    }

    public boolean equals(RemoveCellsAttributes obj)
    {
        int i;

        // Compare the elements in the cellList vector.
        boolean cellList_equal = (obj.cellList.size() == cellList.size());
        for(i = 0; (i < cellList.size()) && cellList_equal; ++i)
        {
            // Make references to Integer from Object.
            Integer cellList1 = (Integer)cellList.elementAt(i);
            Integer cellList2 = (Integer)obj.cellList.elementAt(i);
            cellList_equal = cellList1.equals(cellList2);
        }
        // Compare the elements in the domainList vector.
        boolean domainList_equal = (obj.domainList.size() == domainList.size());
        for(i = 0; (i < domainList.size()) && domainList_equal; ++i)
        {
            // Make references to Integer from Object.
            Integer domainList1 = (Integer)domainList.elementAt(i);
            Integer domainList2 = (Integer)obj.domainList.elementAt(i);
            domainList_equal = domainList1.equals(domainList2);
        }
        // Create the return value
        return (cellList_equal &&
                domainList_equal);
    }

    public String GetName() { return "RemoveCells"; }
    public String GetVersion() { return "1.0"; }

    // Property setting methods
    public void SetCellList(Vector cellList_)
    {
        cellList = cellList_;
        Select(0);
    }

    public void SetDomainList(Vector domainList_)
    {
        domainList = domainList_;
        Select(1);
    }

    // Property getting methods
    public Vector GetCellList() { return cellList; }
    public Vector GetDomainList() { return domainList; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteIntVector(cellList);
        if(WriteSelect(1, buf))
            buf.WriteIntVector(domainList);
    }

    public void ReadAtts(int index, CommunicationBuffer buf)
    {
        switch(index)
        {
        case 0:
            SetCellList(buf.ReadIntVector());
            break;
        case 1:
            SetDomainList(buf.ReadIntVector());
            break;
        }
    }

    public String toString(String indent)
    {
        String str = new String();
        str = str + intVectorToString("cellList", cellList, indent) + "\n";
        str = str + intVectorToString("domainList", domainList, indent) + "\n";
        return str;
    }


    // Attributes
    private Vector cellList; // vector of Integer objects
    private Vector domainList; // vector of Integer objects
}

