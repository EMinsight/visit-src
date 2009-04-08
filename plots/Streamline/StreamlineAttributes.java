// ***************************************************************************
//
// Copyright (c) 2000 - 2008, Lawrence Livermore National Security, LLC
// Produced at the Lawrence Livermore National Laboratory
// LLNL-CODE-400142
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

package llnl.visit.plots;

import llnl.visit.AttributeSubject;
import llnl.visit.CommunicationBuffer;
import llnl.visit.Plugin;
import llnl.visit.ColorAttribute;

// ****************************************************************************
// Class: StreamlineAttributes
//
// Purpose:
//    Attributes for the Streamline plot
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

public class StreamlineAttributes extends AttributeSubject implements Plugin
{
    // Enum values
    public final static int SOURCETYPE_SPECIFIEDPOINT = 0;
    public final static int SOURCETYPE_SPECIFIEDLINE = 1;
    public final static int SOURCETYPE_SPECIFIEDPLANE = 2;
    public final static int SOURCETYPE_SPECIFIEDSPHERE = 3;
    public final static int SOURCETYPE_SPECIFIEDBOX = 4;

    public final static int COLORINGMETHOD_SOLID = 0;
    public final static int COLORINGMETHOD_COLORBYSPEED = 1;
    public final static int COLORINGMETHOD_COLORBYVORTICITY = 2;
    public final static int COLORINGMETHOD_COLORBYLENGTH = 3;
    public final static int COLORINGMETHOD_COLORBYTIME = 4;
    public final static int COLORINGMETHOD_COLORBYSEEDPOINTID = 5;

    public final static int DISPLAYMETHOD_LINES = 0;
    public final static int DISPLAYMETHOD_TUBES = 1;
    public final static int DISPLAYMETHOD_RIBBONS = 2;

    public final static int INTEGRATIONDIRECTION_FORWARD = 0;
    public final static int INTEGRATIONDIRECTION_BACKWARD = 1;
    public final static int INTEGRATIONDIRECTION_BOTH = 2;

    public final static int TERMINATIONTYPE_DISTANCE = 0;
    public final static int TERMINATIONTYPE_TIME = 1;
    public final static int TERMINATIONTYPE_STEP = 2;

    public final static int STREAMLINEALGORITHMTYPE_LOADONDEMAND = 0;
    public final static int STREAMLINEALGORITHMTYPE_PARALLELSTATICDOMAINS = 1;
    public final static int STREAMLINEALGORITHMTYPE_MASTERSLAVE = 2;

    public final static int INTEGRATIONTYPE_DORMANDPRINCE = 0;
    public final static int INTEGRATIONTYPE_ADAMSBASHFORTH = 1;


    public StreamlineAttributes()
    {
        super(34);

        sourceType = SOURCETYPE_SPECIFIEDPOINT;
        maxStepLength = 0.1;
        termination = 10;
        pointSource = new double[3];
        pointSource[0] = 0;
        pointSource[1] = 0;
        pointSource[2] = 0;
        lineSourceStart = new double[3];
        lineSourceStart[0] = 0;
        lineSourceStart[1] = 0;
        lineSourceStart[2] = 0;
        lineSourceEnd = new double[3];
        lineSourceEnd[0] = 1;
        lineSourceEnd[1] = 0;
        lineSourceEnd[2] = 0;
        planeSourceOrigin = new double[3];
        planeSourceOrigin[0] = 0;
        planeSourceOrigin[1] = 0;
        planeSourceOrigin[2] = 0;
        planeSourceNormal = new double[3];
        planeSourceNormal[0] = 0;
        planeSourceNormal[1] = 0;
        planeSourceNormal[2] = 1;
        planeSourceUpAxis = new double[3];
        planeSourceUpAxis[0] = 0;
        planeSourceUpAxis[1] = 1;
        planeSourceUpAxis[2] = 0;
        planeSourceRadius = 1;
        sphereSourceOrigin = new double[3];
        sphereSourceOrigin[0] = 0;
        sphereSourceOrigin[1] = 0;
        sphereSourceOrigin[2] = 0;
        sphereSourceRadius = 1;
        boxSourceExtents = new double[6];
        boxSourceExtents[0] = 0;
        boxSourceExtents[1] = 1;
        boxSourceExtents[2] = 0;
        boxSourceExtents[3] = 1;
        boxSourceExtents[4] = 0;
        boxSourceExtents[5] = 1;
        useWholeBox = true;
        pointDensity = 2;
        displayMethod = DISPLAYMETHOD_LINES;
        showStart = false;
        radius = 0.125;
        lineWidth = 2;
        coloringMethod = COLORINGMETHOD_COLORBYSPEED;
        colorTableName = new String("Default");
        singleColor = new ColorAttribute(0, 0, 0);
        legendFlag = true;
        lightingFlag = true;
        StreamlineDirection = INTEGRATIONDIRECTION_FORWARD;
        relTol = 0.0001;
        absTol = 1e-05;
        terminationType = TERMINATIONTYPE_DISTANCE;
        integrationType = INTEGRATIONTYPE_DORMANDPRINCE;
        streamlineAlgorithmType = STREAMLINEALGORITHMTYPE_PARALLELSTATICDOMAINS;
        maxStreamlineProcessCount = 10;
        maxDomainCacheSize = 3;
        workGroupSize = 32;
        pathlines = false;
    }

    public StreamlineAttributes(StreamlineAttributes obj)
    {
        super(34);

        int i;

        sourceType = obj.sourceType;
        maxStepLength = obj.maxStepLength;
        termination = obj.termination;
        pointSource = new double[3];
        pointSource[0] = obj.pointSource[0];
        pointSource[1] = obj.pointSource[1];
        pointSource[2] = obj.pointSource[2];

        lineSourceStart = new double[3];
        lineSourceStart[0] = obj.lineSourceStart[0];
        lineSourceStart[1] = obj.lineSourceStart[1];
        lineSourceStart[2] = obj.lineSourceStart[2];

        lineSourceEnd = new double[3];
        lineSourceEnd[0] = obj.lineSourceEnd[0];
        lineSourceEnd[1] = obj.lineSourceEnd[1];
        lineSourceEnd[2] = obj.lineSourceEnd[2];

        planeSourceOrigin = new double[3];
        planeSourceOrigin[0] = obj.planeSourceOrigin[0];
        planeSourceOrigin[1] = obj.planeSourceOrigin[1];
        planeSourceOrigin[2] = obj.planeSourceOrigin[2];

        planeSourceNormal = new double[3];
        planeSourceNormal[0] = obj.planeSourceNormal[0];
        planeSourceNormal[1] = obj.planeSourceNormal[1];
        planeSourceNormal[2] = obj.planeSourceNormal[2];

        planeSourceUpAxis = new double[3];
        planeSourceUpAxis[0] = obj.planeSourceUpAxis[0];
        planeSourceUpAxis[1] = obj.planeSourceUpAxis[1];
        planeSourceUpAxis[2] = obj.planeSourceUpAxis[2];

        planeSourceRadius = obj.planeSourceRadius;
        sphereSourceOrigin = new double[3];
        sphereSourceOrigin[0] = obj.sphereSourceOrigin[0];
        sphereSourceOrigin[1] = obj.sphereSourceOrigin[1];
        sphereSourceOrigin[2] = obj.sphereSourceOrigin[2];

        sphereSourceRadius = obj.sphereSourceRadius;
        boxSourceExtents = new double[6];
        for(i = 0; i < obj.boxSourceExtents.length; ++i)
            boxSourceExtents[i] = obj.boxSourceExtents[i];

        useWholeBox = obj.useWholeBox;
        pointDensity = obj.pointDensity;
        displayMethod = obj.displayMethod;
        showStart = obj.showStart;
        radius = obj.radius;
        lineWidth = obj.lineWidth;
        coloringMethod = obj.coloringMethod;
        colorTableName = new String(obj.colorTableName);
        singleColor = new ColorAttribute(obj.singleColor);
        legendFlag = obj.legendFlag;
        lightingFlag = obj.lightingFlag;
        StreamlineDirection = obj.StreamlineDirection;
        relTol = obj.relTol;
        absTol = obj.absTol;
        terminationType = obj.terminationType;
        integrationType = obj.integrationType;
        streamlineAlgorithmType = obj.streamlineAlgorithmType;
        maxStreamlineProcessCount = obj.maxStreamlineProcessCount;
        maxDomainCacheSize = obj.maxDomainCacheSize;
        workGroupSize = obj.workGroupSize;
        pathlines = obj.pathlines;

        SelectAll();
    }

    public boolean equals(StreamlineAttributes obj)
    {
        int i;

        // Compare the pointSource arrays.
        boolean pointSource_equal = true;
        for(i = 0; i < 3 && pointSource_equal; ++i)
            pointSource_equal = (pointSource[i] == obj.pointSource[i]);

        // Compare the lineSourceStart arrays.
        boolean lineSourceStart_equal = true;
        for(i = 0; i < 3 && lineSourceStart_equal; ++i)
            lineSourceStart_equal = (lineSourceStart[i] == obj.lineSourceStart[i]);

        // Compare the lineSourceEnd arrays.
        boolean lineSourceEnd_equal = true;
        for(i = 0; i < 3 && lineSourceEnd_equal; ++i)
            lineSourceEnd_equal = (lineSourceEnd[i] == obj.lineSourceEnd[i]);

        // Compare the planeSourceOrigin arrays.
        boolean planeSourceOrigin_equal = true;
        for(i = 0; i < 3 && planeSourceOrigin_equal; ++i)
            planeSourceOrigin_equal = (planeSourceOrigin[i] == obj.planeSourceOrigin[i]);

        // Compare the planeSourceNormal arrays.
        boolean planeSourceNormal_equal = true;
        for(i = 0; i < 3 && planeSourceNormal_equal; ++i)
            planeSourceNormal_equal = (planeSourceNormal[i] == obj.planeSourceNormal[i]);

        // Compare the planeSourceUpAxis arrays.
        boolean planeSourceUpAxis_equal = true;
        for(i = 0; i < 3 && planeSourceUpAxis_equal; ++i)
            planeSourceUpAxis_equal = (planeSourceUpAxis[i] == obj.planeSourceUpAxis[i]);

        // Compare the sphereSourceOrigin arrays.
        boolean sphereSourceOrigin_equal = true;
        for(i = 0; i < 3 && sphereSourceOrigin_equal; ++i)
            sphereSourceOrigin_equal = (sphereSourceOrigin[i] == obj.sphereSourceOrigin[i]);

        // Compare the boxSourceExtents arrays.
        boolean boxSourceExtents_equal = true;
        for(i = 0; i < 6 && boxSourceExtents_equal; ++i)
            boxSourceExtents_equal = (boxSourceExtents[i] == obj.boxSourceExtents[i]);

        // Create the return value
        return ((sourceType == obj.sourceType) &&
                (maxStepLength == obj.maxStepLength) &&
                (termination == obj.termination) &&
                pointSource_equal &&
                lineSourceStart_equal &&
                lineSourceEnd_equal &&
                planeSourceOrigin_equal &&
                planeSourceNormal_equal &&
                planeSourceUpAxis_equal &&
                (planeSourceRadius == obj.planeSourceRadius) &&
                sphereSourceOrigin_equal &&
                (sphereSourceRadius == obj.sphereSourceRadius) &&
                boxSourceExtents_equal &&
                (useWholeBox == obj.useWholeBox) &&
                (pointDensity == obj.pointDensity) &&
                (displayMethod == obj.displayMethod) &&
                (showStart == obj.showStart) &&
                (radius == obj.radius) &&
                (lineWidth == obj.lineWidth) &&
                (coloringMethod == obj.coloringMethod) &&
                (colorTableName.equals(obj.colorTableName)) &&
                (singleColor == obj.singleColor) &&
                (legendFlag == obj.legendFlag) &&
                (lightingFlag == obj.lightingFlag) &&
                (StreamlineDirection == obj.StreamlineDirection) &&
                (relTol == obj.relTol) &&
                (absTol == obj.absTol) &&
                (terminationType == obj.terminationType) &&
                (integrationType == obj.integrationType) &&
                (streamlineAlgorithmType == obj.streamlineAlgorithmType) &&
                (maxStreamlineProcessCount == obj.maxStreamlineProcessCount) &&
                (maxDomainCacheSize == obj.maxDomainCacheSize) &&
                (workGroupSize == obj.workGroupSize) &&
                (pathlines == obj.pathlines));
    }

    public String GetName() { return "Streamline"; }
    public String GetVersion() { return "1.0"; }

    // Property setting methods
    public void SetSourceType(int sourceType_)
    {
        sourceType = sourceType_;
        Select(0);
    }

    public void SetMaxStepLength(double maxStepLength_)
    {
        maxStepLength = maxStepLength_;
        Select(1);
    }

    public void SetTermination(double termination_)
    {
        termination = termination_;
        Select(2);
    }

    public void SetPointSource(double[] pointSource_)
    {
        pointSource[0] = pointSource_[0];
        pointSource[1] = pointSource_[1];
        pointSource[2] = pointSource_[2];
        Select(3);
    }

    public void SetPointSource(double e0, double e1, double e2)
    {
        pointSource[0] = e0;
        pointSource[1] = e1;
        pointSource[2] = e2;
        Select(3);
    }

    public void SetLineSourceStart(double[] lineSourceStart_)
    {
        lineSourceStart[0] = lineSourceStart_[0];
        lineSourceStart[1] = lineSourceStart_[1];
        lineSourceStart[2] = lineSourceStart_[2];
        Select(4);
    }

    public void SetLineSourceStart(double e0, double e1, double e2)
    {
        lineSourceStart[0] = e0;
        lineSourceStart[1] = e1;
        lineSourceStart[2] = e2;
        Select(4);
    }

    public void SetLineSourceEnd(double[] lineSourceEnd_)
    {
        lineSourceEnd[0] = lineSourceEnd_[0];
        lineSourceEnd[1] = lineSourceEnd_[1];
        lineSourceEnd[2] = lineSourceEnd_[2];
        Select(5);
    }

    public void SetLineSourceEnd(double e0, double e1, double e2)
    {
        lineSourceEnd[0] = e0;
        lineSourceEnd[1] = e1;
        lineSourceEnd[2] = e2;
        Select(5);
    }

    public void SetPlaneSourceOrigin(double[] planeSourceOrigin_)
    {
        planeSourceOrigin[0] = planeSourceOrigin_[0];
        planeSourceOrigin[1] = planeSourceOrigin_[1];
        planeSourceOrigin[2] = planeSourceOrigin_[2];
        Select(6);
    }

    public void SetPlaneSourceOrigin(double e0, double e1, double e2)
    {
        planeSourceOrigin[0] = e0;
        planeSourceOrigin[1] = e1;
        planeSourceOrigin[2] = e2;
        Select(6);
    }

    public void SetPlaneSourceNormal(double[] planeSourceNormal_)
    {
        planeSourceNormal[0] = planeSourceNormal_[0];
        planeSourceNormal[1] = planeSourceNormal_[1];
        planeSourceNormal[2] = planeSourceNormal_[2];
        Select(7);
    }

    public void SetPlaneSourceNormal(double e0, double e1, double e2)
    {
        planeSourceNormal[0] = e0;
        planeSourceNormal[1] = e1;
        planeSourceNormal[2] = e2;
        Select(7);
    }

    public void SetPlaneSourceUpAxis(double[] planeSourceUpAxis_)
    {
        planeSourceUpAxis[0] = planeSourceUpAxis_[0];
        planeSourceUpAxis[1] = planeSourceUpAxis_[1];
        planeSourceUpAxis[2] = planeSourceUpAxis_[2];
        Select(8);
    }

    public void SetPlaneSourceUpAxis(double e0, double e1, double e2)
    {
        planeSourceUpAxis[0] = e0;
        planeSourceUpAxis[1] = e1;
        planeSourceUpAxis[2] = e2;
        Select(8);
    }

    public void SetPlaneSourceRadius(double planeSourceRadius_)
    {
        planeSourceRadius = planeSourceRadius_;
        Select(9);
    }

    public void SetSphereSourceOrigin(double[] sphereSourceOrigin_)
    {
        sphereSourceOrigin[0] = sphereSourceOrigin_[0];
        sphereSourceOrigin[1] = sphereSourceOrigin_[1];
        sphereSourceOrigin[2] = sphereSourceOrigin_[2];
        Select(10);
    }

    public void SetSphereSourceOrigin(double e0, double e1, double e2)
    {
        sphereSourceOrigin[0] = e0;
        sphereSourceOrigin[1] = e1;
        sphereSourceOrigin[2] = e2;
        Select(10);
    }

    public void SetSphereSourceRadius(double sphereSourceRadius_)
    {
        sphereSourceRadius = sphereSourceRadius_;
        Select(11);
    }

    public void SetBoxSourceExtents(double[] boxSourceExtents_)
    {
        for(int i = 0; i < 6; ++i)
             boxSourceExtents[i] = boxSourceExtents_[i];
        Select(12);
    }

    public void SetUseWholeBox(boolean useWholeBox_)
    {
        useWholeBox = useWholeBox_;
        Select(13);
    }

    public void SetPointDensity(int pointDensity_)
    {
        pointDensity = pointDensity_;
        Select(14);
    }

    public void SetDisplayMethod(int displayMethod_)
    {
        displayMethod = displayMethod_;
        Select(15);
    }

    public void SetShowStart(boolean showStart_)
    {
        showStart = showStart_;
        Select(16);
    }

    public void SetRadius(double radius_)
    {
        radius = radius_;
        Select(17);
    }

    public void SetLineWidth(int lineWidth_)
    {
        lineWidth = lineWidth_;
        Select(18);
    }

    public void SetColoringMethod(int coloringMethod_)
    {
        coloringMethod = coloringMethod_;
        Select(19);
    }

    public void SetColorTableName(String colorTableName_)
    {
        colorTableName = colorTableName_;
        Select(20);
    }

    public void SetSingleColor(ColorAttribute singleColor_)
    {
        singleColor = singleColor_;
        Select(21);
    }

    public void SetLegendFlag(boolean legendFlag_)
    {
        legendFlag = legendFlag_;
        Select(22);
    }

    public void SetLightingFlag(boolean lightingFlag_)
    {
        lightingFlag = lightingFlag_;
        Select(23);
    }

    public void SetStreamlineDirection(int StreamlineDirection_)
    {
        StreamlineDirection = StreamlineDirection_;
        Select(24);
    }

    public void SetRelTol(double relTol_)
    {
        relTol = relTol_;
        Select(25);
    }

    public void SetAbsTol(double absTol_)
    {
        absTol = absTol_;
        Select(26);
    }

    public void SetTerminationType(int terminationType_)
    {
        terminationType = terminationType_;
        Select(27);
    }

    public void SetIntegrationType(int integrationType_)
    {
        integrationType = integrationType_;
        Select(28);
    }

    public void SetStreamlineAlgorithmType(int streamlineAlgorithmType_)
    {
        streamlineAlgorithmType = streamlineAlgorithmType_;
        Select(29);
    }

    public void SetMaxStreamlineProcessCount(int maxStreamlineProcessCount_)
    {
        maxStreamlineProcessCount = maxStreamlineProcessCount_;
        Select(30);
    }

    public void SetMaxDomainCacheSize(int maxDomainCacheSize_)
    {
        maxDomainCacheSize = maxDomainCacheSize_;
        Select(31);
    }

    public void SetWorkGroupSize(int workGroupSize_)
    {
        workGroupSize = workGroupSize_;
        Select(32);
    }

    public void SetPathlines(boolean pathlines_)
    {
        pathlines = pathlines_;
        Select(33);
    }

    // Property getting methods
    public int            GetSourceType() { return sourceType; }
    public double         GetMaxStepLength() { return maxStepLength; }
    public double         GetTermination() { return termination; }
    public double[]       GetPointSource() { return pointSource; }
    public double[]       GetLineSourceStart() { return lineSourceStart; }
    public double[]       GetLineSourceEnd() { return lineSourceEnd; }
    public double[]       GetPlaneSourceOrigin() { return planeSourceOrigin; }
    public double[]       GetPlaneSourceNormal() { return planeSourceNormal; }
    public double[]       GetPlaneSourceUpAxis() { return planeSourceUpAxis; }
    public double         GetPlaneSourceRadius() { return planeSourceRadius; }
    public double[]       GetSphereSourceOrigin() { return sphereSourceOrigin; }
    public double         GetSphereSourceRadius() { return sphereSourceRadius; }
    public double[]       GetBoxSourceExtents() { return boxSourceExtents; }
    public boolean        GetUseWholeBox() { return useWholeBox; }
    public int            GetPointDensity() { return pointDensity; }
    public int            GetDisplayMethod() { return displayMethod; }
    public boolean        GetShowStart() { return showStart; }
    public double         GetRadius() { return radius; }
    public int            GetLineWidth() { return lineWidth; }
    public int            GetColoringMethod() { return coloringMethod; }
    public String         GetColorTableName() { return colorTableName; }
    public ColorAttribute GetSingleColor() { return singleColor; }
    public boolean        GetLegendFlag() { return legendFlag; }
    public boolean        GetLightingFlag() { return lightingFlag; }
    public int            GetStreamlineDirection() { return StreamlineDirection; }
    public double         GetRelTol() { return relTol; }
    public double         GetAbsTol() { return absTol; }
    public int            GetTerminationType() { return terminationType; }
    public int            GetIntegrationType() { return integrationType; }
    public int            GetStreamlineAlgorithmType() { return streamlineAlgorithmType; }
    public int            GetMaxStreamlineProcessCount() { return maxStreamlineProcessCount; }
    public int            GetMaxDomainCacheSize() { return maxDomainCacheSize; }
    public int            GetWorkGroupSize() { return workGroupSize; }
    public boolean        GetPathlines() { return pathlines; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteInt(sourceType);
        if(WriteSelect(1, buf))
            buf.WriteDouble(maxStepLength);
        if(WriteSelect(2, buf))
            buf.WriteDouble(termination);
        if(WriteSelect(3, buf))
            buf.WriteDoubleArray(pointSource);
        if(WriteSelect(4, buf))
            buf.WriteDoubleArray(lineSourceStart);
        if(WriteSelect(5, buf))
            buf.WriteDoubleArray(lineSourceEnd);
        if(WriteSelect(6, buf))
            buf.WriteDoubleArray(planeSourceOrigin);
        if(WriteSelect(7, buf))
            buf.WriteDoubleArray(planeSourceNormal);
        if(WriteSelect(8, buf))
            buf.WriteDoubleArray(planeSourceUpAxis);
        if(WriteSelect(9, buf))
            buf.WriteDouble(planeSourceRadius);
        if(WriteSelect(10, buf))
            buf.WriteDoubleArray(sphereSourceOrigin);
        if(WriteSelect(11, buf))
            buf.WriteDouble(sphereSourceRadius);
        if(WriteSelect(12, buf))
            buf.WriteDoubleArray(boxSourceExtents);
        if(WriteSelect(13, buf))
            buf.WriteBool(useWholeBox);
        if(WriteSelect(14, buf))
            buf.WriteInt(pointDensity);
        if(WriteSelect(15, buf))
            buf.WriteInt(displayMethod);
        if(WriteSelect(16, buf))
            buf.WriteBool(showStart);
        if(WriteSelect(17, buf))
            buf.WriteDouble(radius);
        if(WriteSelect(18, buf))
            buf.WriteInt(lineWidth);
        if(WriteSelect(19, buf))
            buf.WriteInt(coloringMethod);
        if(WriteSelect(20, buf))
            buf.WriteString(colorTableName);
        if(WriteSelect(21, buf))
            singleColor.Write(buf);
        if(WriteSelect(22, buf))
            buf.WriteBool(legendFlag);
        if(WriteSelect(23, buf))
            buf.WriteBool(lightingFlag);
        if(WriteSelect(24, buf))
            buf.WriteInt(StreamlineDirection);
        if(WriteSelect(25, buf))
            buf.WriteDouble(relTol);
        if(WriteSelect(26, buf))
            buf.WriteDouble(absTol);
        if(WriteSelect(27, buf))
            buf.WriteInt(terminationType);
        if(WriteSelect(28, buf))
            buf.WriteInt(integrationType);
        if(WriteSelect(29, buf))
            buf.WriteInt(streamlineAlgorithmType);
        if(WriteSelect(30, buf))
            buf.WriteInt(maxStreamlineProcessCount);
        if(WriteSelect(31, buf))
            buf.WriteInt(maxDomainCacheSize);
        if(WriteSelect(32, buf))
            buf.WriteInt(workGroupSize);
        if(WriteSelect(33, buf))
            buf.WriteBool(pathlines);
    }

    public void ReadAtts(int n, CommunicationBuffer buf)
    {
        for(int i = 0; i < n; ++i)
        {
            int index = (int)buf.ReadByte();
            switch(index)
            {
            case 0:
                SetSourceType(buf.ReadInt());
                break;
            case 1:
                SetMaxStepLength(buf.ReadDouble());
                break;
            case 2:
                SetTermination(buf.ReadDouble());
                break;
            case 3:
                SetPointSource(buf.ReadDoubleArray());
                break;
            case 4:
                SetLineSourceStart(buf.ReadDoubleArray());
                break;
            case 5:
                SetLineSourceEnd(buf.ReadDoubleArray());
                break;
            case 6:
                SetPlaneSourceOrigin(buf.ReadDoubleArray());
                break;
            case 7:
                SetPlaneSourceNormal(buf.ReadDoubleArray());
                break;
            case 8:
                SetPlaneSourceUpAxis(buf.ReadDoubleArray());
                break;
            case 9:
                SetPlaneSourceRadius(buf.ReadDouble());
                break;
            case 10:
                SetSphereSourceOrigin(buf.ReadDoubleArray());
                break;
            case 11:
                SetSphereSourceRadius(buf.ReadDouble());
                break;
            case 12:
                SetBoxSourceExtents(buf.ReadDoubleArray());
                break;
            case 13:
                SetUseWholeBox(buf.ReadBool());
                break;
            case 14:
                SetPointDensity(buf.ReadInt());
                break;
            case 15:
                SetDisplayMethod(buf.ReadInt());
                break;
            case 16:
                SetShowStart(buf.ReadBool());
                break;
            case 17:
                SetRadius(buf.ReadDouble());
                break;
            case 18:
                SetLineWidth(buf.ReadInt());
                break;
            case 19:
                SetColoringMethod(buf.ReadInt());
                break;
            case 20:
                SetColorTableName(buf.ReadString());
                break;
            case 21:
                singleColor.Read(buf);
                Select(21);
                break;
            case 22:
                SetLegendFlag(buf.ReadBool());
                break;
            case 23:
                SetLightingFlag(buf.ReadBool());
                break;
            case 24:
                SetStreamlineDirection(buf.ReadInt());
                break;
            case 25:
                SetRelTol(buf.ReadDouble());
                break;
            case 26:
                SetAbsTol(buf.ReadDouble());
                break;
            case 27:
                SetTerminationType(buf.ReadInt());
                break;
            case 28:
                SetIntegrationType(buf.ReadInt());
                break;
            case 29:
                SetStreamlineAlgorithmType(buf.ReadInt());
                break;
            case 30:
                SetMaxStreamlineProcessCount(buf.ReadInt());
                break;
            case 31:
                SetMaxDomainCacheSize(buf.ReadInt());
                break;
            case 32:
                SetWorkGroupSize(buf.ReadInt());
                break;
            case 33:
                SetPathlines(buf.ReadBool());
                break;
            }
        }
    }

    public String toString(String indent)
    {
        String str = new String();
        str = str + indent + "sourceType = ";
        if(sourceType == SOURCETYPE_SPECIFIEDPOINT)
            str = str + "SOURCETYPE_SPECIFIEDPOINT";
        if(sourceType == SOURCETYPE_SPECIFIEDLINE)
            str = str + "SOURCETYPE_SPECIFIEDLINE";
        if(sourceType == SOURCETYPE_SPECIFIEDPLANE)
            str = str + "SOURCETYPE_SPECIFIEDPLANE";
        if(sourceType == SOURCETYPE_SPECIFIEDSPHERE)
            str = str + "SOURCETYPE_SPECIFIEDSPHERE";
        if(sourceType == SOURCETYPE_SPECIFIEDBOX)
            str = str + "SOURCETYPE_SPECIFIEDBOX";
        str = str + "\n";
        str = str + doubleToString("maxStepLength", maxStepLength, indent) + "\n";
        str = str + doubleToString("termination", termination, indent) + "\n";
        str = str + doubleArrayToString("pointSource", pointSource, indent) + "\n";
        str = str + doubleArrayToString("lineSourceStart", lineSourceStart, indent) + "\n";
        str = str + doubleArrayToString("lineSourceEnd", lineSourceEnd, indent) + "\n";
        str = str + doubleArrayToString("planeSourceOrigin", planeSourceOrigin, indent) + "\n";
        str = str + doubleArrayToString("planeSourceNormal", planeSourceNormal, indent) + "\n";
        str = str + doubleArrayToString("planeSourceUpAxis", planeSourceUpAxis, indent) + "\n";
        str = str + doubleToString("planeSourceRadius", planeSourceRadius, indent) + "\n";
        str = str + doubleArrayToString("sphereSourceOrigin", sphereSourceOrigin, indent) + "\n";
        str = str + doubleToString("sphereSourceRadius", sphereSourceRadius, indent) + "\n";
        str = str + doubleArrayToString("boxSourceExtents", boxSourceExtents, indent) + "\n";
        str = str + boolToString("useWholeBox", useWholeBox, indent) + "\n";
        str = str + intToString("pointDensity", pointDensity, indent) + "\n";
        str = str + indent + "displayMethod = ";
        if(displayMethod == DISPLAYMETHOD_LINES)
            str = str + "DISPLAYMETHOD_LINES";
        if(displayMethod == DISPLAYMETHOD_TUBES)
            str = str + "DISPLAYMETHOD_TUBES";
        if(displayMethod == DISPLAYMETHOD_RIBBONS)
            str = str + "DISPLAYMETHOD_RIBBONS";
        str = str + "\n";
        str = str + boolToString("showStart", showStart, indent) + "\n";
        str = str + doubleToString("radius", radius, indent) + "\n";
        str = str + intToString("lineWidth", lineWidth, indent) + "\n";
        str = str + indent + "coloringMethod = ";
        if(coloringMethod == COLORINGMETHOD_SOLID)
            str = str + "COLORINGMETHOD_SOLID";
        if(coloringMethod == COLORINGMETHOD_COLORBYSPEED)
            str = str + "COLORINGMETHOD_COLORBYSPEED";
        if(coloringMethod == COLORINGMETHOD_COLORBYVORTICITY)
            str = str + "COLORINGMETHOD_COLORBYVORTICITY";
        if(coloringMethod == COLORINGMETHOD_COLORBYLENGTH)
            str = str + "COLORINGMETHOD_COLORBYLENGTH";
        if(coloringMethod == COLORINGMETHOD_COLORBYTIME)
            str = str + "COLORINGMETHOD_COLORBYTIME";
        if(coloringMethod == COLORINGMETHOD_COLORBYSEEDPOINTID)
            str = str + "COLORINGMETHOD_COLORBYSEEDPOINTID";
        str = str + "\n";
        str = str + stringToString("colorTableName", colorTableName, indent) + "\n";
        str = str + indent + "singleColor = {" + singleColor.Red() + ", " + singleColor.Green() + ", " + singleColor.Blue() + ", " + singleColor.Alpha() + "}\n";
        str = str + boolToString("legendFlag", legendFlag, indent) + "\n";
        str = str + boolToString("lightingFlag", lightingFlag, indent) + "\n";
        str = str + indent + "StreamlineDirection = ";
        if(StreamlineDirection == INTEGRATIONDIRECTION_FORWARD)
            str = str + "INTEGRATIONDIRECTION_FORWARD";
        if(StreamlineDirection == INTEGRATIONDIRECTION_BACKWARD)
            str = str + "INTEGRATIONDIRECTION_BACKWARD";
        if(StreamlineDirection == INTEGRATIONDIRECTION_BOTH)
            str = str + "INTEGRATIONDIRECTION_BOTH";
        str = str + "\n";
        str = str + doubleToString("relTol", relTol, indent) + "\n";
        str = str + doubleToString("absTol", absTol, indent) + "\n";
        str = str + indent + "terminationType = ";
        if(terminationType == TERMINATIONTYPE_DISTANCE)
            str = str + "TERMINATIONTYPE_DISTANCE";
        if(terminationType == TERMINATIONTYPE_TIME)
            str = str + "TERMINATIONTYPE_TIME";
        if(terminationType == TERMINATIONTYPE_STEP)
            str = str + "TERMINATIONTYPE_STEP";
        str = str + "\n";
        str = str + indent + "integrationType = ";
        if(integrationType == INTEGRATIONTYPE_DORMANDPRINCE)
            str = str + "INTEGRATIONTYPE_DORMANDPRINCE";
        if(integrationType == INTEGRATIONTYPE_ADAMSBASHFORTH)
            str = str + "INTEGRATIONTYPE_ADAMSBASHFORTH";
        str = str + "\n";
        str = str + indent + "streamlineAlgorithmType = ";
        if(streamlineAlgorithmType == STREAMLINEALGORITHMTYPE_LOADONDEMAND)
            str = str + "STREAMLINEALGORITHMTYPE_LOADONDEMAND";
        if(streamlineAlgorithmType == STREAMLINEALGORITHMTYPE_PARALLELSTATICDOMAINS)
            str = str + "STREAMLINEALGORITHMTYPE_PARALLELSTATICDOMAINS";
        if(streamlineAlgorithmType == STREAMLINEALGORITHMTYPE_MASTERSLAVE)
            str = str + "STREAMLINEALGORITHMTYPE_MASTERSLAVE";
        str = str + "\n";
        str = str + intToString("maxStreamlineProcessCount", maxStreamlineProcessCount, indent) + "\n";
        str = str + intToString("maxDomainCacheSize", maxDomainCacheSize, indent) + "\n";
        str = str + intToString("workGroupSize", workGroupSize, indent) + "\n";
        str = str + boolToString("pathlines", pathlines, indent) + "\n";
        return str;
    }


    // Attributes
    private int            sourceType;
    private double         maxStepLength;
    private double         termination;
    private double[]       pointSource;
    private double[]       lineSourceStart;
    private double[]       lineSourceEnd;
    private double[]       planeSourceOrigin;
    private double[]       planeSourceNormal;
    private double[]       planeSourceUpAxis;
    private double         planeSourceRadius;
    private double[]       sphereSourceOrigin;
    private double         sphereSourceRadius;
    private double[]       boxSourceExtents;
    private boolean        useWholeBox;
    private int            pointDensity;
    private int            displayMethod;
    private boolean        showStart;
    private double         radius;
    private int            lineWidth;
    private int            coloringMethod;
    private String         colorTableName;
    private ColorAttribute singleColor;
    private boolean        legendFlag;
    private boolean        lightingFlag;
    private int            StreamlineDirection;
    private double         relTol;
    private double         absTol;
    private int            terminationType;
    private int            integrationType;
    private int            streamlineAlgorithmType;
    private int            maxStreamlineProcessCount;
    private int            maxDomainCacheSize;
    private int            workGroupSize;
    private boolean        pathlines;
}

