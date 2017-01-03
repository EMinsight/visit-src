// ***************************************************************************
//
// Copyright (c) 2000 - 2017, Lawrence Livermore National Security, LLC
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

package llnl.visit;

import java.util.Vector;

// ****************************************************************************
// Class: ClientInformation
//
// Purpose:
//    This class contains the attributes that describe the client
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

public class ClientInformation extends AttributeSubject
{
    private static int ClientInformation_numAdditionalAtts = 3;

    public ClientInformation()
    {
        super(ClientInformation_numAdditionalAtts);

        clientName = new String("");
        methodNames = new Vector();
        methodPrototypes = new Vector();
    }

    public ClientInformation(int nMoreFields)
    {
        super(ClientInformation_numAdditionalAtts + nMoreFields);

        clientName = new String("");
        methodNames = new Vector();
        methodPrototypes = new Vector();
    }

    public ClientInformation(ClientInformation obj)
    {
        super(ClientInformation_numAdditionalAtts);

        int i;

        clientName = new String(obj.clientName);
        methodNames = new Vector(obj.methodNames.size());
        for(i = 0; i < obj.methodNames.size(); ++i)
            methodNames.addElement(new String((String)obj.methodNames.elementAt(i)));

        methodPrototypes = new Vector(obj.methodPrototypes.size());
        for(i = 0; i < obj.methodPrototypes.size(); ++i)
            methodPrototypes.addElement(new String((String)obj.methodPrototypes.elementAt(i)));


        SelectAll();
    }

    public int Offset()
    {
        return super.Offset() + super.GetNumAdditionalAttributes();
    }

    public int GetNumAdditionalAttributes()
    {
        return ClientInformation_numAdditionalAtts;
    }

    public boolean equals(ClientInformation obj)
    {
        int i;

        // Compare the elements in the methodNames vector.
        boolean methodNames_equal = (obj.methodNames.size() == methodNames.size());
        for(i = 0; (i < methodNames.size()) && methodNames_equal; ++i)
        {
            // Make references to String from Object.
            String methodNames1 = (String)methodNames.elementAt(i);
            String methodNames2 = (String)obj.methodNames.elementAt(i);
            methodNames_equal = methodNames1.equals(methodNames2);
        }
        // Compare the elements in the methodPrototypes vector.
        boolean methodPrototypes_equal = (obj.methodPrototypes.size() == methodPrototypes.size());
        for(i = 0; (i < methodPrototypes.size()) && methodPrototypes_equal; ++i)
        {
            // Make references to String from Object.
            String methodPrototypes1 = (String)methodPrototypes.elementAt(i);
            String methodPrototypes2 = (String)obj.methodPrototypes.elementAt(i);
            methodPrototypes_equal = methodPrototypes1.equals(methodPrototypes2);
        }
        // Create the return value
        return ((clientName.equals(obj.clientName)) &&
                methodNames_equal &&
                methodPrototypes_equal);
    }

    // Property setting methods
    public void SetClientName(String clientName_)
    {
        clientName = clientName_;
        Select(0);
    }

    public void SetMethodNames(Vector methodNames_)
    {
        methodNames = methodNames_;
        Select(1);
    }

    public void SetMethodPrototypes(Vector methodPrototypes_)
    {
        methodPrototypes = methodPrototypes_;
        Select(2);
    }

    // Property getting methods
    public String GetClientName() { return clientName; }
    public Vector GetMethodNames() { return methodNames; }
    public Vector GetMethodPrototypes() { return methodPrototypes; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteString(clientName);
        if(WriteSelect(1, buf))
            buf.WriteStringVector(methodNames);
        if(WriteSelect(2, buf))
            buf.WriteStringVector(methodPrototypes);
    }

    public void ReadAtts(int index, CommunicationBuffer buf)
    {
        switch(index)
        {
        case 0:
            SetClientName(buf.ReadString());
            break;
        case 1:
            SetMethodNames(buf.ReadStringVector());
            break;
        case 2:
            SetMethodPrototypes(buf.ReadStringVector());
            break;
        }
    }

    public String toString(String indent)
    {
        String str = new String();
        str = str + stringToString("clientName", clientName, indent) + "\n";
        str = str + stringVectorToString("methodNames", methodNames, indent) + "\n";
        str = str + stringVectorToString("methodPrototypes", methodPrototypes, indent) + "\n";
        return str;
    }


    // Attributes
    private String clientName;
    private Vector methodNames; // vector of String objects
    private Vector methodPrototypes; // vector of String objects
}

