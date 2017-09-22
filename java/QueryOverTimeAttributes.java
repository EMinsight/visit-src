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


// ****************************************************************************
// Class: QueryOverTimeAttributes
//
// Purpose:
//    Attributes for queries over time.
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

public class QueryOverTimeAttributes extends AttributeSubject
{
    private static int QueryOverTimeAttributes_numAdditionalAtts = 11;

    // Enum values
    public final static int TIMETYPE_CYCLE = 0;
    public final static int TIMETYPE_DTIME = 1;
    public final static int TIMETYPE_TIMESTEP = 2;


    public QueryOverTimeAttributes()
    {
        super(QueryOverTimeAttributes_numAdditionalAtts);

        timeType = TIMETYPE_CYCLE;
        startTimeFlag = false;
        startTime = 0;
        endTimeFlag = false;
        endTime = 1;
        strideFlag = false;
        stride = 1;
        createWindow = true;
        windowId = 2;
        queryAtts = new QueryAttributes();
        pickAtts = new PickAttributes();
    }

    public QueryOverTimeAttributes(int nMoreFields)
    {
        super(QueryOverTimeAttributes_numAdditionalAtts + nMoreFields);

        timeType = TIMETYPE_CYCLE;
        startTimeFlag = false;
        startTime = 0;
        endTimeFlag = false;
        endTime = 1;
        strideFlag = false;
        stride = 1;
        createWindow = true;
        windowId = 2;
        queryAtts = new QueryAttributes();
        pickAtts = new PickAttributes();
    }

    public QueryOverTimeAttributes(QueryOverTimeAttributes obj)
    {
        super(obj);

        timeType = obj.timeType;
        startTimeFlag = obj.startTimeFlag;
        startTime = obj.startTime;
        endTimeFlag = obj.endTimeFlag;
        endTime = obj.endTime;
        strideFlag = obj.strideFlag;
        stride = obj.stride;
        createWindow = obj.createWindow;
        windowId = obj.windowId;
        queryAtts = new QueryAttributes(obj.queryAtts);
        pickAtts = new PickAttributes(obj.pickAtts);

        SelectAll();
    }

    public int Offset()
    {
        return super.Offset() + super.GetNumAdditionalAttributes();
    }

    public int GetNumAdditionalAttributes()
    {
        return QueryOverTimeAttributes_numAdditionalAtts;
    }

    public boolean equals(QueryOverTimeAttributes obj)
    {
        // Create the return value
        return ((timeType == obj.timeType) &&
                (startTimeFlag == obj.startTimeFlag) &&
                (startTime == obj.startTime) &&
                (endTimeFlag == obj.endTimeFlag) &&
                (endTime == obj.endTime) &&
                (strideFlag == obj.strideFlag) &&
                (stride == obj.stride) &&
                (createWindow == obj.createWindow) &&
                (windowId == obj.windowId) &&
                (queryAtts.equals(obj.queryAtts)) &&
                (pickAtts.equals(obj.pickAtts)));
    }

    // Property setting methods
    public void SetTimeType(int timeType_)
    {
        timeType = timeType_;
        Select(0);
    }

    public void SetStartTimeFlag(boolean startTimeFlag_)
    {
        startTimeFlag = startTimeFlag_;
        Select(1);
    }

    public void SetStartTime(int startTime_)
    {
        startTime = startTime_;
        Select(2);
    }

    public void SetEndTimeFlag(boolean endTimeFlag_)
    {
        endTimeFlag = endTimeFlag_;
        Select(3);
    }

    public void SetEndTime(int endTime_)
    {
        endTime = endTime_;
        Select(4);
    }

    public void SetStrideFlag(boolean strideFlag_)
    {
        strideFlag = strideFlag_;
        Select(5);
    }

    public void SetStride(int stride_)
    {
        stride = stride_;
        Select(6);
    }

    public void SetCreateWindow(boolean createWindow_)
    {
        createWindow = createWindow_;
        Select(7);
    }

    public void SetWindowId(int windowId_)
    {
        windowId = windowId_;
        Select(8);
    }

    public void SetQueryAtts(QueryAttributes queryAtts_)
    {
        queryAtts = queryAtts_;
        Select(9);
    }

    public void SetPickAtts(PickAttributes pickAtts_)
    {
        pickAtts = pickAtts_;
        Select(10);
    }

    // Property getting methods
    public int             GetTimeType() { return timeType; }
    public boolean         GetStartTimeFlag() { return startTimeFlag; }
    public int             GetStartTime() { return startTime; }
    public boolean         GetEndTimeFlag() { return endTimeFlag; }
    public int             GetEndTime() { return endTime; }
    public boolean         GetStrideFlag() { return strideFlag; }
    public int             GetStride() { return stride; }
    public boolean         GetCreateWindow() { return createWindow; }
    public int             GetWindowId() { return windowId; }
    public QueryAttributes GetQueryAtts() { return queryAtts; }
    public PickAttributes  GetPickAtts() { return pickAtts; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteInt(timeType);
        if(WriteSelect(1, buf))
            buf.WriteBool(startTimeFlag);
        if(WriteSelect(2, buf))
            buf.WriteInt(startTime);
        if(WriteSelect(3, buf))
            buf.WriteBool(endTimeFlag);
        if(WriteSelect(4, buf))
            buf.WriteInt(endTime);
        if(WriteSelect(5, buf))
            buf.WriteBool(strideFlag);
        if(WriteSelect(6, buf))
            buf.WriteInt(stride);
        if(WriteSelect(7, buf))
            buf.WriteBool(createWindow);
        if(WriteSelect(8, buf))
            buf.WriteInt(windowId);
        if(WriteSelect(9, buf))
            queryAtts.Write(buf);
        if(WriteSelect(10, buf))
            pickAtts.Write(buf);
    }

    public void ReadAtts(int index, CommunicationBuffer buf)
    {
        switch(index)
        {
        case 0:
            SetTimeType(buf.ReadInt());
            break;
        case 1:
            SetStartTimeFlag(buf.ReadBool());
            break;
        case 2:
            SetStartTime(buf.ReadInt());
            break;
        case 3:
            SetEndTimeFlag(buf.ReadBool());
            break;
        case 4:
            SetEndTime(buf.ReadInt());
            break;
        case 5:
            SetStrideFlag(buf.ReadBool());
            break;
        case 6:
            SetStride(buf.ReadInt());
            break;
        case 7:
            SetCreateWindow(buf.ReadBool());
            break;
        case 8:
            SetWindowId(buf.ReadInt());
            break;
        case 9:
            queryAtts.Read(buf);
            Select(9);
            break;
        case 10:
            pickAtts.Read(buf);
            Select(10);
            break;
        }
    }

    public String toString(String indent)
    {
        String str = new String();
        str = str + indent + "timeType = ";
        if(timeType == TIMETYPE_CYCLE)
            str = str + "TIMETYPE_CYCLE";
        if(timeType == TIMETYPE_DTIME)
            str = str + "TIMETYPE_DTIME";
        if(timeType == TIMETYPE_TIMESTEP)
            str = str + "TIMETYPE_TIMESTEP";
        str = str + "\n";
        str = str + boolToString("startTimeFlag", startTimeFlag, indent) + "\n";
        str = str + intToString("startTime", startTime, indent) + "\n";
        str = str + boolToString("endTimeFlag", endTimeFlag, indent) + "\n";
        str = str + intToString("endTime", endTime, indent) + "\n";
        str = str + boolToString("strideFlag", strideFlag, indent) + "\n";
        str = str + intToString("stride", stride, indent) + "\n";
        str = str + boolToString("createWindow", createWindow, indent) + "\n";
        str = str + intToString("windowId", windowId, indent) + "\n";
        str = str + indent + "queryAtts = {\n" + queryAtts.toString(indent + "    ") + indent + "}\n";
        str = str + indent + "pickAtts = {\n" + pickAtts.toString(indent + "    ") + indent + "}\n";
        return str;
    }


    // Attributes
    private int             timeType;
    private boolean         startTimeFlag;
    private int             startTime;
    private boolean         endTimeFlag;
    private int             endTime;
    private boolean         strideFlag;
    private int             stride;
    private boolean         createWindow;
    private int             windowId;
    private QueryAttributes queryAtts;
    private PickAttributes  pickAtts;
}

