// ***************************************************************************
//
// Copyright (c) 2000 - 2011, Lawrence Livermore National Security, LLC
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


// ****************************************************************************
// Class: SaveSubWindowAttributes
//
// Purpose:
//    The attributes for saving a sub window
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

public class SaveSubWindowAttributes extends AttributeSubject
{
    private static int SaveSubWindowAttributes_numAdditionalAtts = 5;

    public SaveSubWindowAttributes()
    {
        super(SaveSubWindowAttributes_numAdditionalAtts);

        position = new int[2];
        position[0] = 0;
        position[1] = 0;
        size = new int[2];
        size[0] = 128;
        size[1] = 128;
        layer = 0;
        transparency = 0;
        omitWindow = false;
    }

    public SaveSubWindowAttributes(int nMoreFields)
    {
        super(SaveSubWindowAttributes_numAdditionalAtts + nMoreFields);

        position = new int[2];
        position[0] = 0;
        position[1] = 0;
        size = new int[2];
        size[0] = 128;
        size[1] = 128;
        layer = 0;
        transparency = 0;
        omitWindow = false;
    }

    public SaveSubWindowAttributes(SaveSubWindowAttributes obj)
    {
        super(SaveSubWindowAttributes_numAdditionalAtts);

        int i;

        position = new int[2];
        position[0] = obj.position[0];
        position[1] = obj.position[1];

        size = new int[2];
        size[0] = obj.size[0];
        size[1] = obj.size[1];

        layer = obj.layer;
        transparency = obj.transparency;
        omitWindow = obj.omitWindow;

        SelectAll();
    }

    public int Offset()
    {
        return super.Offset() + super.GetNumAdditionalAttributes();
    }

    public int GetNumAdditionalAttributes()
    {
        return SaveSubWindowAttributes_numAdditionalAtts;
    }

    public boolean equals(SaveSubWindowAttributes obj)
    {
        int i;

        // Compare the position arrays.
        boolean position_equal = true;
        for(i = 0; i < 2 && position_equal; ++i)
            position_equal = (position[i] == obj.position[i]);

        // Compare the size arrays.
        boolean size_equal = true;
        for(i = 0; i < 2 && size_equal; ++i)
            size_equal = (size[i] == obj.size[i]);

        // Create the return value
        return (position_equal &&
                size_equal &&
                (layer == obj.layer) &&
                (transparency == obj.transparency) &&
                (omitWindow == obj.omitWindow));
    }

    // Property setting methods
    public void SetPosition(int[] position_)
    {
        position[0] = position_[0];
        position[1] = position_[1];
        Select(0);
    }

    public void SetPosition(int e0, int e1)
    {
        position[0] = e0;
        position[1] = e1;
        Select(0);
    }

    public void SetSize(int[] size_)
    {
        size[0] = size_[0];
        size[1] = size_[1];
        Select(1);
    }

    public void SetSize(int e0, int e1)
    {
        size[0] = e0;
        size[1] = e1;
        Select(1);
    }

    public void SetLayer(int layer_)
    {
        layer = layer_;
        Select(2);
    }

    public void SetTransparency(double transparency_)
    {
        transparency = transparency_;
        Select(3);
    }

    public void SetOmitWindow(boolean omitWindow_)
    {
        omitWindow = omitWindow_;
        Select(4);
    }

    // Property getting methods
    public int[]   GetPosition() { return position; }
    public int[]   GetSize() { return size; }
    public int     GetLayer() { return layer; }
    public double  GetTransparency() { return transparency; }
    public boolean GetOmitWindow() { return omitWindow; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteIntArray(position);
        if(WriteSelect(1, buf))
            buf.WriteIntArray(size);
        if(WriteSelect(2, buf))
            buf.WriteInt(layer);
        if(WriteSelect(3, buf))
            buf.WriteDouble(transparency);
        if(WriteSelect(4, buf))
            buf.WriteBool(omitWindow);
    }

    public void ReadAtts(int index, CommunicationBuffer buf)
    {
        switch(index)
        {
        case 0:
            SetPosition(buf.ReadIntArray());
            break;
        case 1:
            SetSize(buf.ReadIntArray());
            break;
        case 2:
            SetLayer(buf.ReadInt());
            break;
        case 3:
            SetTransparency(buf.ReadDouble());
            break;
        case 4:
            SetOmitWindow(buf.ReadBool());
            break;
        }
    }

    public String toString(String indent)
    {
        String str = new String();
        str = str + intArrayToString("position", position, indent) + "\n";
        str = str + intArrayToString("size", size, indent) + "\n";
        str = str + intToString("layer", layer, indent) + "\n";
        str = str + doubleToString("transparency", transparency, indent) + "\n";
        str = str + boolToString("omitWindow", omitWindow, indent) + "\n";
        return str;
    }


    // Attributes
    private int[]   position;
    private int[]   size;
    private int     layer;
    private double  transparency;
    private boolean omitWindow;
}

