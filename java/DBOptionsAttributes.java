// ***************************************************************************
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
// ***************************************************************************

package llnl.visit;

import java.lang.Integer;
import java.util.Vector;
import java.lang.Double;

// ****************************************************************************
// Class: DBOptionsAttributes
//
// Purpose:
//    Attributes of database options
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   Wed Mar 14 17:54:48 PST 2007
//
// Modifications:
//   
// ****************************************************************************

public class DBOptionsAttributes extends AttributeSubject
{
    // Enum values
    public final static int OPTIONTYPE_BOOL = 0;
    public final static int OPTIONTYPE_INT = 1;
    public final static int OPTIONTYPE_FLOAT = 2;
    public final static int OPTIONTYPE_DOUBLE = 3;
    public final static int OPTIONTYPE_STRING = 4;
    public final static int OPTIONTYPE_ENUM = 5;


    public DBOptionsAttributes()
    {
        super(10);

        types = new Vector();
        names = new Vector();
        optBools = new Vector();
        optFloats = new Vector();
        optDoubles = new Vector();
        optInts = new Vector();
        optStrings = new Vector();
        optEnums = new Vector();
        enumStrings = new Vector();
        enumStringsSizes = new Vector();
    }

    public DBOptionsAttributes(DBOptionsAttributes obj)
    {
        super(10);

        int i;

        types = new Vector();
        for(i = 0; i < obj.types.size(); ++i)
        {
            Integer iv = (Integer)obj.types.elementAt(i);
            types.addElement(new Integer(iv.intValue()));
        }
        names = new Vector(obj.names.size());
        for(i = 0; i < obj.names.size(); ++i)
            names.addElement(new String((String)obj.names.elementAt(i)));

        optBools = new Vector();
        for(i = 0; i < obj.optBools.size(); ++i)
        {
            Integer iv = (Integer)obj.optBools.elementAt(i);
            optBools.addElement(new Integer(iv.intValue()));
        }
        optFloats = new Vector(obj.optFloats.size());
        for(i = 0; i < obj.optFloats.size(); ++i)
        {
            Double dv = (Double)obj.optFloats.elementAt(i);
            optFloats.addElement(new Double(dv.doubleValue()));
        }

        optDoubles = new Vector(obj.optDoubles.size());
        for(i = 0; i < obj.optDoubles.size(); ++i)
        {
            Double dv = (Double)obj.optDoubles.elementAt(i);
            optDoubles.addElement(new Double(dv.doubleValue()));
        }

        optInts = new Vector();
        for(i = 0; i < obj.optInts.size(); ++i)
        {
            Integer iv = (Integer)obj.optInts.elementAt(i);
            optInts.addElement(new Integer(iv.intValue()));
        }
        optStrings = new Vector(obj.optStrings.size());
        for(i = 0; i < obj.optStrings.size(); ++i)
            optStrings.addElement(new String((String)obj.optStrings.elementAt(i)));

        optEnums = new Vector();
        for(i = 0; i < obj.optEnums.size(); ++i)
        {
            Integer iv = (Integer)obj.optEnums.elementAt(i);
            optEnums.addElement(new Integer(iv.intValue()));
        }
        enumStrings = new Vector(obj.enumStrings.size());
        for(i = 0; i < obj.enumStrings.size(); ++i)
            enumStrings.addElement(new String((String)obj.enumStrings.elementAt(i)));

        enumStringsSizes = new Vector();
        for(i = 0; i < obj.enumStringsSizes.size(); ++i)
        {
            Integer iv = (Integer)obj.enumStringsSizes.elementAt(i);
            enumStringsSizes.addElement(new Integer(iv.intValue()));
        }

        SelectAll();
    }

    public boolean equals(DBOptionsAttributes obj)
    {
        int i;

        // Create the return value
        return ((types == obj.types) &&
                (names == obj.names) &&
                (optBools == obj.optBools) &&
                (optFloats == obj.optFloats) &&
                (optDoubles == obj.optDoubles) &&
                (optInts == obj.optInts) &&
                (optStrings == obj.optStrings) &&
                (optEnums == obj.optEnums) &&
                (enumStrings == obj.enumStrings) &&
                (enumStringsSizes == obj.enumStringsSizes));
    }

    // Property setting methods
    public void SetTypes(Vector types_)
    {
        types = types_;
        Select(0);
    }

    public void SetNames(Vector names_)
    {
        names = names_;
        Select(1);
    }

    public void SetOptBools(Vector optBools_)
    {
        optBools = optBools_;
        Select(2);
    }

    public void SetOptFloats(Vector optFloats_)
    {
        optFloats = optFloats_;
        Select(3);
    }

    public void SetOptDoubles(Vector optDoubles_)
    {
        optDoubles = optDoubles_;
        Select(4);
    }

    public void SetOptInts(Vector optInts_)
    {
        optInts = optInts_;
        Select(5);
    }

    public void SetOptStrings(Vector optStrings_)
    {
        optStrings = optStrings_;
        Select(6);
    }

    public void SetOptEnums(Vector optEnums_)
    {
        optEnums = optEnums_;
        Select(7);
    }

    public void SetEnumStrings(Vector enumStrings_)
    {
        enumStrings = enumStrings_;
        Select(8);
    }

    public void SetEnumStringsSizes(Vector enumStringsSizes_)
    {
        enumStringsSizes = enumStringsSizes_;
        Select(9);
    }

    // Property getting methods
    public Vector GetTypes() { return types; }
    public Vector GetNames() { return names; }
    public Vector GetOptBools() { return optBools; }
    public Vector GetOptFloats() { return optFloats; }
    public Vector GetOptDoubles() { return optDoubles; }
    public Vector GetOptInts() { return optInts; }
    public Vector GetOptStrings() { return optStrings; }
    public Vector GetOptEnums() { return optEnums; }
    public Vector GetEnumStrings() { return enumStrings; }
    public Vector GetEnumStringsSizes() { return enumStringsSizes; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteIntVector(types);
        if(WriteSelect(1, buf))
            buf.WriteStringVector(names);
        if(WriteSelect(2, buf))
            buf.WriteIntVector(optBools);
        if(WriteSelect(3, buf))
            buf.WriteDoubleVector(optFloats);
        if(WriteSelect(4, buf))
            buf.WriteDoubleVector(optDoubles);
        if(WriteSelect(5, buf))
            buf.WriteIntVector(optInts);
        if(WriteSelect(6, buf))
            buf.WriteStringVector(optStrings);
        if(WriteSelect(7, buf))
            buf.WriteIntVector(optEnums);
        if(WriteSelect(8, buf))
            buf.WriteStringVector(enumStrings);
        if(WriteSelect(9, buf))
            buf.WriteIntVector(enumStringsSizes);
    }

    public void ReadAtts(int n, CommunicationBuffer buf)
    {
        for(int i = 0; i < n; ++i)
        {
            int index = (int)buf.ReadByte();
            switch(index)
            {
            case 0:
                SetTypes(buf.ReadIntVector());
                break;
            case 1:
                SetNames(buf.ReadStringVector());
                break;
            case 2:
                SetOptBools(buf.ReadIntVector());
                break;
            case 3:
                SetOptFloats(buf.ReadDoubleVector());
                break;
            case 4:
                SetOptDoubles(buf.ReadDoubleVector());
                break;
            case 5:
                SetOptInts(buf.ReadIntVector());
                break;
            case 6:
                SetOptStrings(buf.ReadStringVector());
                break;
            case 7:
                SetOptEnums(buf.ReadIntVector());
                break;
            case 8:
                SetEnumStrings(buf.ReadStringVector());
                break;
            case 9:
                SetEnumStringsSizes(buf.ReadIntVector());
                break;
            }
        }
    }


    // Attributes
    private Vector types; // vector of Integer objects
    private Vector names; // vector of String objects
    private Vector optBools; // vector of Integer objects
    private Vector optFloats; // vector of Double objects
    private Vector optDoubles; // vector of Double objects
    private Vector optInts; // vector of Integer objects
    private Vector optStrings; // vector of String objects
    private Vector optEnums; // vector of Integer objects
    private Vector enumStrings; // vector of String objects
    private Vector enumStringsSizes; // vector of Integer objects
}

