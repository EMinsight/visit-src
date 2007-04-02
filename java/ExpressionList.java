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

import java.util.Vector;

// ****************************************************************************
// Class: ExpressionList
//
// Purpose:
//    This class contains a list of expressions and some functions to manipulate them.
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   Wed Mar 14 17:54:52 PST 2007
//
// Modifications:
//   
// ****************************************************************************

public class ExpressionList extends AttributeSubject
{
    public ExpressionList()
    {
        super(1);

        expressions = new Vector();
    }

    public ExpressionList(ExpressionList obj)
    {
        super(1);

        int i;

        // *** Copy the expressions field ***
        expressions = new Vector(obj.expressions.size());
        for(i = 0; i < obj.expressions.size(); ++i)
        {
            Expression newObj = (Expression)expressions.elementAt(i);
            expressions.addElement(new Expression(newObj));
        }


        SelectAll();
    }

    public boolean equals(ExpressionList obj)
    {
        int i;

        boolean expressions_equal = (obj.expressions.size() == expressions.size());
        for(i = 0; (i < expressions.size()) && expressions_equal; ++i)
        {
            // Make references to Expression from Object.
            Expression expressions1 = (Expression)expressions.elementAt(i);
            Expression expressions2 = (Expression)obj.expressions.elementAt(i);
            expressions_equal = expressions1.equals(expressions2);
        }

        // Create the return value
        return (expressions_equal);
    }

    // Property setting methods
    // Property getting methods
    public Vector GetExpressions() { return expressions; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
        {
            buf.WriteInt(expressions.size());
            for(int i = 0; i < expressions.size(); ++i)
            {
                Expression tmp = (Expression)expressions.elementAt(i);
                tmp.Write(buf);
            }
        }
    }

    public void ReadAtts(int n, CommunicationBuffer buf)
    {
        buf.ReadByte();
        {
            int len = buf.ReadInt();
            expressions.clear();
            for(int j = 0; j < len; ++j)
            {
                Expression tmp = new Expression();
                tmp.Read(buf);
                expressions.addElement(tmp);
            }
        }
        Select(0);
    }

    // Attributegroup convenience methods
    public void AddExpressions(Expression obj)
    {
        expressions.addElement(new Expression(obj));
        Select(0);
    }

    public void ClearExpressions()
    {
        expressions.clear();
        Select(0);
    }

    public void RemoveExpressions(int index)
    {
        if(index >= 0 && index < expressions.size())
        {
            expressions.remove(index);
            Select(0);
        }
    }

    public int GetNumExpressions()
    {
        return expressions.size();
    }

    public Expression GetExpressions(int i)
    {
        Expression tmp = (Expression)expressions.elementAt(i);
        return tmp;
    }


    // Attributes
    private Vector expressions; // vector of Expression objects
}

