// ***************************************************************************
//
// Copyright (c) 2000 - 2010, Lawrence Livermore National Security, LLC
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
import java.lang.Integer;

// ****************************************************************************
// Class: EngineList
//
// Purpose:
//    This class contains a list of host names on which engines are running.
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

public class EngineList extends AttributeSubject
{
    private static int EngineList_numAdditionalAtts = 5;

    public EngineList()
    {
        super(EngineList_numAdditionalAtts);

        engines = new Vector();
        numProcessors = new Vector();
        numNodes = new Vector();
        loadBalancing = new Vector();
        simulationName = new Vector();
    }

    public EngineList(int nMoreFields)
    {
        super(EngineList_numAdditionalAtts + nMoreFields);

        engines = new Vector();
        numProcessors = new Vector();
        numNodes = new Vector();
        loadBalancing = new Vector();
        simulationName = new Vector();
    }

    public EngineList(EngineList obj)
    {
        super(EngineList_numAdditionalAtts);

        int i;

        engines = new Vector(obj.engines.size());
        for(i = 0; i < obj.engines.size(); ++i)
            engines.addElement(new String((String)obj.engines.elementAt(i)));

        numProcessors = new Vector();
        for(i = 0; i < obj.numProcessors.size(); ++i)
        {
            Integer iv = (Integer)obj.numProcessors.elementAt(i);
            numProcessors.addElement(new Integer(iv.intValue()));
        }
        numNodes = new Vector();
        for(i = 0; i < obj.numNodes.size(); ++i)
        {
            Integer iv = (Integer)obj.numNodes.elementAt(i);
            numNodes.addElement(new Integer(iv.intValue()));
        }
        loadBalancing = new Vector();
        for(i = 0; i < obj.loadBalancing.size(); ++i)
        {
            Integer iv = (Integer)obj.loadBalancing.elementAt(i);
            loadBalancing.addElement(new Integer(iv.intValue()));
        }
        simulationName = new Vector(obj.simulationName.size());
        for(i = 0; i < obj.simulationName.size(); ++i)
            simulationName.addElement(new String((String)obj.simulationName.elementAt(i)));


        SelectAll();
    }

    public int Offset()
    {
        return super.Offset() + super.GetNumAdditionalAttributes();
    }

    public int GetNumAdditionalAttributes()
    {
        return EngineList_numAdditionalAtts;
    }

    public boolean equals(EngineList obj)
    {
        int i;

        // Compare the elements in the engines vector.
        boolean engines_equal = (obj.engines.size() == engines.size());
        for(i = 0; (i < engines.size()) && engines_equal; ++i)
        {
            // Make references to String from Object.
            String engines1 = (String)engines.elementAt(i);
            String engines2 = (String)obj.engines.elementAt(i);
            engines_equal = engines1.equals(engines2);
        }
        // Compare the elements in the numProcessors vector.
        boolean numProcessors_equal = (obj.numProcessors.size() == numProcessors.size());
        for(i = 0; (i < numProcessors.size()) && numProcessors_equal; ++i)
        {
            // Make references to Integer from Object.
            Integer numProcessors1 = (Integer)numProcessors.elementAt(i);
            Integer numProcessors2 = (Integer)obj.numProcessors.elementAt(i);
            numProcessors_equal = numProcessors1.equals(numProcessors2);
        }
        // Compare the elements in the numNodes vector.
        boolean numNodes_equal = (obj.numNodes.size() == numNodes.size());
        for(i = 0; (i < numNodes.size()) && numNodes_equal; ++i)
        {
            // Make references to Integer from Object.
            Integer numNodes1 = (Integer)numNodes.elementAt(i);
            Integer numNodes2 = (Integer)obj.numNodes.elementAt(i);
            numNodes_equal = numNodes1.equals(numNodes2);
        }
        // Compare the elements in the loadBalancing vector.
        boolean loadBalancing_equal = (obj.loadBalancing.size() == loadBalancing.size());
        for(i = 0; (i < loadBalancing.size()) && loadBalancing_equal; ++i)
        {
            // Make references to Integer from Object.
            Integer loadBalancing1 = (Integer)loadBalancing.elementAt(i);
            Integer loadBalancing2 = (Integer)obj.loadBalancing.elementAt(i);
            loadBalancing_equal = loadBalancing1.equals(loadBalancing2);
        }
        // Compare the elements in the simulationName vector.
        boolean simulationName_equal = (obj.simulationName.size() == simulationName.size());
        for(i = 0; (i < simulationName.size()) && simulationName_equal; ++i)
        {
            // Make references to String from Object.
            String simulationName1 = (String)simulationName.elementAt(i);
            String simulationName2 = (String)obj.simulationName.elementAt(i);
            simulationName_equal = simulationName1.equals(simulationName2);
        }
        // Create the return value
        return (engines_equal &&
                numProcessors_equal &&
                numNodes_equal &&
                loadBalancing_equal &&
                simulationName_equal);
    }

    // Property setting methods
    public void SetEngines(Vector engines_)
    {
        engines = engines_;
        Select(0);
    }

    public void SetNumProcessors(Vector numProcessors_)
    {
        numProcessors = numProcessors_;
        Select(1);
    }

    public void SetNumNodes(Vector numNodes_)
    {
        numNodes = numNodes_;
        Select(2);
    }

    public void SetLoadBalancing(Vector loadBalancing_)
    {
        loadBalancing = loadBalancing_;
        Select(3);
    }

    public void SetSimulationName(Vector simulationName_)
    {
        simulationName = simulationName_;
        Select(4);
    }

    // Property getting methods
    public Vector GetEngines() { return engines; }
    public Vector GetNumProcessors() { return numProcessors; }
    public Vector GetNumNodes() { return numNodes; }
    public Vector GetLoadBalancing() { return loadBalancing; }
    public Vector GetSimulationName() { return simulationName; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteStringVector(engines);
        if(WriteSelect(1, buf))
            buf.WriteIntVector(numProcessors);
        if(WriteSelect(2, buf))
            buf.WriteIntVector(numNodes);
        if(WriteSelect(3, buf))
            buf.WriteIntVector(loadBalancing);
        if(WriteSelect(4, buf))
            buf.WriteStringVector(simulationName);
    }

    public void ReadAtts(int index, CommunicationBuffer buf)
    {
        switch(index)
        {
        case 0:
            SetEngines(buf.ReadStringVector());
            break;
        case 1:
            SetNumProcessors(buf.ReadIntVector());
            break;
        case 2:
            SetNumNodes(buf.ReadIntVector());
            break;
        case 3:
            SetLoadBalancing(buf.ReadIntVector());
            break;
        case 4:
            SetSimulationName(buf.ReadStringVector());
            break;
        }
    }

    public String toString(String indent)
    {
        String str = new String();
        str = str + stringVectorToString("engines", engines, indent) + "\n";
        str = str + intVectorToString("numProcessors", numProcessors, indent) + "\n";
        str = str + intVectorToString("numNodes", numNodes, indent) + "\n";
        str = str + intVectorToString("loadBalancing", loadBalancing, indent) + "\n";
        str = str + stringVectorToString("simulationName", simulationName, indent) + "\n";
        return str;
    }


    // Attributes
    private Vector engines; // vector of String objects
    private Vector numProcessors; // vector of Integer objects
    private Vector numNodes; // vector of Integer objects
    private Vector loadBalancing; // vector of Integer objects
    private Vector simulationName; // vector of String objects
}

