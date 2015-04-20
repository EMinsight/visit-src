/*****************************************************************************
*
* Copyright (c) 2000 - 2015, Lawrence Livermore National Security, LLC
* Produced at the Lawrence Livermore National Laboratory
* LLNL-CODE-442911
* All rights reserved.
*
* This file is  part of VisIt. For  details, see https://visit.llnl.gov/.  The
* full copyright notice is contained in the file COPYRIGHT located at the root
* of the VisIt distribution or at http://www.llnl.gov/visit/copyright.html.
*
* Redistribution  and  use  in  source  and  binary  forms,  with  or  without
* modification, are permitted provided that the following conditions are met:
*
*  - Redistributions of  source code must  retain the above  copyright notice,
*    this list of conditions and the disclaimer below.
*  - Redistributions in binary form must reproduce the above copyright notice,
*    this  list of  conditions  and  the  disclaimer (as noted below)  in  the
*    documentation and/or other materials provided with the distribution.
*  - Neither the name of  the LLNS/LLNL nor the names of  its contributors may
*    be used to endorse or promote products derived from this software without
*    specific prior written permission.
*
* THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT  HOLDERS AND CONTRIBUTORS "AS IS"
* AND ANY EXPRESS OR  IMPLIED WARRANTIES, INCLUDING,  BUT NOT  LIMITED TO, THE
* IMPLIED WARRANTIES OF MERCHANTABILITY AND  FITNESS FOR A PARTICULAR  PURPOSE
* ARE  DISCLAIMED. IN  NO EVENT  SHALL LAWRENCE  LIVERMORE NATIONAL  SECURITY,
* LLC, THE  U.S.  DEPARTMENT OF  ENERGY  OR  CONTRIBUTORS BE  LIABLE  FOR  ANY
* DIRECT,  INDIRECT,   INCIDENTAL,   SPECIAL,   EXEMPLARY,  OR   CONSEQUENTIAL
* DAMAGES (INCLUDING, BUT NOT  LIMITED TO, PROCUREMENT OF  SUBSTITUTE GOODS OR
* SERVICES; LOSS OF  USE, DATA, OR PROFITS; OR  BUSINESS INTERRUPTION) HOWEVER
* CAUSED  AND  ON  ANY  THEORY  OF  LIABILITY,  WHETHER  IN  CONTRACT,  STRICT
* LIABILITY, OR TORT  (INCLUDING NEGLIGENCE OR OTHERWISE)  ARISING IN ANY  WAY
* OUT OF THE  USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
* DAMAGE.
*
*****************************************************************************/

#ifndef STREAMLINEATTRIBUTES_H
#define STREAMLINEATTRIBUTES_H
#include <string>
#include <AttributeSubject.h>

#include <ColorAttribute.h>

// ****************************************************************************
// Class: StreamlineAttributes
//
// Purpose:
//    Attributes for the Streamline plot
//
// Notes:      Autogenerated by xml2atts.
//
// Programmer: xml2atts
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

class StreamlineAttributes : public AttributeSubject
{
public:
    enum SourceType
    {
        SpecifiedPoint,
        SpecifiedPointList,
        SpecifiedLine,
        SpecifiedCircle,
        SpecifiedPlane,
        SpecifiedSphere,
        SpecifiedBox,
        Selection
    };
    enum ColoringMethod
    {
        Solid,
        ColorBySpeed,
        ColorByVorticity,
        ColorByLength,
        ColorByTime,
        ColorBySeedPointID,
        ColorByVariable,
        ColorByCorrelationDistance,
        ColorByNumberDomainsVisited
    };
    enum CoordinateSystem
    {
        AsIs,
        CylindricalToCartesian,
        CartesianToCylindrical
    };
    enum DisplayMethod
    {
        Lines,
        Tubes,
        Ribbons
    };
    enum IntegrationDirection
    {
        Forward,
        Backward,
        Both
    };
    enum ReferenceType
    {
        Distance,
        Time,
        Step
    };
    enum ParallelizationAlgorithmType
    {
        LoadOnDemand,
        ParallelStaticDomains,
        MasterSlave,
        VisItSelects
    };
    enum FieldType
    {
        Default,
        FlashField,
        M3DC12DField,
        M3DC13DField,
        Nek5000Field,
        NIMRODField
    };
    enum IntegrationType
    {
        Euler,
        Leapfrog,
        DormandPrince,
        AdamsBashforth,
        RK4,
        M3DC12DIntegrator
    };
    enum OpacityType
    {
        FullyOpaque,
        Constant,
        Ramp,
        VariableRange
    };
    enum DisplayQuality
    {
        Low,
        Medium,
        High,
        Super
    };
    enum GeomDisplayType
    {
        Sphere,
        Cone
    };
    enum SizeType
    {
        Absolute,
        FractionOfBBox
    };
    enum PathlinesCMFE
    {
        CONN_CMFE,
        POS_CMFE
    };
    enum VaryTubeRadiusType
    {
        None,
        Scalar
    };

    // These constructors are for objects of this class
    StreamlineAttributes();
    StreamlineAttributes(const StreamlineAttributes &obj);
protected:
    // These constructors are for objects derived from this class
    StreamlineAttributes(private_tmfs_t tmfs);
    StreamlineAttributes(const StreamlineAttributes &obj, private_tmfs_t tmfs);
public:
    virtual ~StreamlineAttributes();

    virtual StreamlineAttributes& operator = (const StreamlineAttributes &obj);
    virtual bool operator == (const StreamlineAttributes &obj) const;
    virtual bool operator != (const StreamlineAttributes &obj) const;
private:
    void Init();
    void Copy(const StreamlineAttributes &obj);
public:

    virtual const std::string TypeName() const;
    virtual bool CopyAttributes(const AttributeGroup *);
    virtual AttributeSubject *CreateCompatible(const std::string &) const;
    virtual AttributeSubject *NewInstance(bool) const;

    // Property selection methods
    virtual void SelectAll();
    void SelectPointSource();
    void SelectLineStart();
    void SelectLineEnd();
    void SelectPlaneOrigin();
    void SelectPlaneNormal();
    void SelectPlaneUpAxis();
    void SelectSphereOrigin();
    void SelectBoxExtents();
    void SelectPointList();
    void SelectColorTableName();
    void SelectSingleColor();
    void SelectVelocitySource();
    void SelectColoringVariable();
    void SelectOpacityVariable();
    void SelectVaryTubeRadiusVariable();
    void SelectSelection();

    // Property setting methods
    void SetSourceType(SourceType sourceType_);
    void SetPointSource(const double *pointSource_);
    void SetLineStart(const double *lineStart_);
    void SetLineEnd(const double *lineEnd_);
    void SetPlaneOrigin(const double *planeOrigin_);
    void SetPlaneNormal(const double *planeNormal_);
    void SetPlaneUpAxis(const double *planeUpAxis_);
    void SetRadius(double radius_);
    void SetSphereOrigin(const double *sphereOrigin_);
    void SetBoxExtents(const double *boxExtents_);
    void SetUseWholeBox(bool useWholeBox_);
    void SetPointList(const doubleVector &pointList_);
    void SetSampleDensity0(int sampleDensity0_);
    void SetSampleDensity1(int sampleDensity1_);
    void SetSampleDensity2(int sampleDensity2_);
    void SetColoringMethod(ColoringMethod coloringMethod_);
    void SetColorTableName(const std::string &colorTableName_);
    void SetSingleColor(const ColorAttribute &singleColor_);
    void SetLegendFlag(bool legendFlag_);
    void SetLightingFlag(bool lightingFlag_);
    void SetIntegrationDirection(IntegrationDirection integrationDirection_);
    void SetMaxSteps(int maxSteps_);
    void SetTerminateByDistance(bool terminateByDistance_);
    void SetTermDistance(double termDistance_);
    void SetTerminateByTime(bool terminateByTime_);
    void SetTermTime(double termTime_);
    void SetMaxStepLength(double maxStepLength_);
    void SetLimitMaximumTimestep(bool limitMaximumTimestep_);
    void SetMaxTimeStep(double maxTimeStep_);
    void SetRelTol(double relTol_);
    void SetAbsTolSizeType(SizeType absTolSizeType_);
    void SetAbsTolAbsolute(double absTolAbsolute_);
    void SetAbsTolBBox(double absTolBBox_);
    void SetFieldType(FieldType fieldType_);
    void SetFieldConstant(double fieldConstant_);
    void SetVelocitySource(const double *velocitySource_);
    void SetIntegrationType(IntegrationType integrationType_);
    void SetParallelizationAlgorithmType(ParallelizationAlgorithmType parallelizationAlgorithmType_);
    void SetMaxProcessCount(int maxProcessCount_);
    void SetMaxDomainCacheSize(int maxDomainCacheSize_);
    void SetWorkGroupSize(int workGroupSize_);
    void SetPathlines(bool pathlines_);
    void SetPathlinesOverrideStartingTimeFlag(bool pathlinesOverrideStartingTimeFlag_);
    void SetPathlinesOverrideStartingTime(double pathlinesOverrideStartingTime_);
    void SetPathlinesPeriod(double pathlinesPeriod_);
    void SetPathlinesCMFE(PathlinesCMFE pathlinesCMFE_);
    void SetCoordinateSystem(CoordinateSystem coordinateSystem_);
    void SetPhiScalingFlag(bool phiScalingFlag_);
    void SetPhiScaling(double phiScaling_);
    void SetColoringVariable(const std::string &coloringVariable_);
    void SetLegendMinFlag(bool legendMinFlag_);
    void SetLegendMaxFlag(bool legendMaxFlag_);
    void SetLegendMin(double legendMin_);
    void SetLegendMax(double legendMax_);
    void SetDisplayBegin(double displayBegin_);
    void SetDisplayEnd(double displayEnd_);
    void SetDisplayBeginFlag(bool displayBeginFlag_);
    void SetDisplayEndFlag(bool displayEndFlag_);
    void SetReferenceTypeForDisplay(ReferenceType referenceTypeForDisplay_);
    void SetDisplayMethod(DisplayMethod displayMethod_);
    void SetTubeSizeType(SizeType tubeSizeType_);
    void SetTubeRadiusAbsolute(double tubeRadiusAbsolute_);
    void SetTubeRadiusBBox(double tubeRadiusBBox_);
    void SetRibbonWidthSizeType(SizeType ribbonWidthSizeType_);
    void SetRibbonWidthAbsolute(double ribbonWidthAbsolute_);
    void SetRibbonWidthBBox(double ribbonWidthBBox_);
    void SetLineWidth(int lineWidth_);
    void SetShowSeeds(bool showSeeds_);
    void SetSeedRadiusSizeType(SizeType seedRadiusSizeType_);
    void SetSeedRadiusAbsolute(double seedRadiusAbsolute_);
    void SetSeedRadiusBBox(double seedRadiusBBox_);
    void SetShowHeads(bool showHeads_);
    void SetHeadDisplayType(GeomDisplayType headDisplayType_);
    void SetHeadRadiusSizeType(SizeType headRadiusSizeType_);
    void SetHeadRadiusAbsolute(double headRadiusAbsolute_);
    void SetHeadRadiusBBox(double headRadiusBBox_);
    void SetHeadHeightRatio(double headHeightRatio_);
    void SetOpacityType(OpacityType opacityType_);
    void SetOpacityVariable(const std::string &opacityVariable_);
    void SetOpacity(double opacity_);
    void SetOpacityVarMin(double opacityVarMin_);
    void SetOpacityVarMax(double opacityVarMax_);
    void SetOpacityVarMinFlag(bool opacityVarMinFlag_);
    void SetOpacityVarMaxFlag(bool opacityVarMaxFlag_);
    void SetTubeDisplayDensity(int tubeDisplayDensity_);
    void SetGeomDisplayQuality(DisplayQuality geomDisplayQuality_);
    void SetSampleDistance0(double sampleDistance0_);
    void SetSampleDistance1(double sampleDistance1_);
    void SetSampleDistance2(double sampleDistance2_);
    void SetFillInterior(bool fillInterior_);
    void SetRandomSamples(bool randomSamples_);
    void SetRandomSeed(int randomSeed_);
    void SetNumberOfRandomSamples(int numberOfRandomSamples_);
    void SetForceNodeCenteredData(bool forceNodeCenteredData_);
    void SetIssueTerminationWarnings(bool issueTerminationWarnings_);
    void SetIssueStiffnessWarnings(bool issueStiffnessWarnings_);
    void SetIssueCriticalPointsWarnings(bool issueCriticalPointsWarnings_);
    void SetCriticalPointThreshold(double criticalPointThreshold_);
    void SetVaryTubeRadius(VaryTubeRadiusType varyTubeRadius_);
    void SetVaryTubeRadiusFactor(double varyTubeRadiusFactor_);
    void SetVaryTubeRadiusVariable(const std::string &varyTubeRadiusVariable_);
    void SetCorrelationDistanceAngTol(double correlationDistanceAngTol_);
    void SetCorrelationDistanceMinDistAbsolute(double correlationDistanceMinDistAbsolute_);
    void SetCorrelationDistanceMinDistBBox(double correlationDistanceMinDistBBox_);
    void SetCorrelationDistanceMinDistType(SizeType correlationDistanceMinDistType_);
    void SetSelection(const std::string &selection_);

    // Property getting methods
    SourceType           GetSourceType() const;
    const double         *GetPointSource() const;
          double         *GetPointSource();
    const double         *GetLineStart() const;
          double         *GetLineStart();
    const double         *GetLineEnd() const;
          double         *GetLineEnd();
    const double         *GetPlaneOrigin() const;
          double         *GetPlaneOrigin();
    const double         *GetPlaneNormal() const;
          double         *GetPlaneNormal();
    const double         *GetPlaneUpAxis() const;
          double         *GetPlaneUpAxis();
    double               GetRadius() const;
    const double         *GetSphereOrigin() const;
          double         *GetSphereOrigin();
    const double         *GetBoxExtents() const;
          double         *GetBoxExtents();
    bool                 GetUseWholeBox() const;
    const doubleVector   &GetPointList() const;
          doubleVector   &GetPointList();
    int                  GetSampleDensity0() const;
    int                  GetSampleDensity1() const;
    int                  GetSampleDensity2() const;
    ColoringMethod       GetColoringMethod() const;
    const std::string    &GetColorTableName() const;
          std::string    &GetColorTableName();
    const ColorAttribute &GetSingleColor() const;
          ColorAttribute &GetSingleColor();
    bool                 GetLegendFlag() const;
    bool                 GetLightingFlag() const;
    IntegrationDirection GetIntegrationDirection() const;
    int                  GetMaxSteps() const;
    bool                 GetTerminateByDistance() const;
    double               GetTermDistance() const;
    bool                 GetTerminateByTime() const;
    double               GetTermTime() const;
    double               GetMaxStepLength() const;
    bool                 GetLimitMaximumTimestep() const;
    double               GetMaxTimeStep() const;
    double               GetRelTol() const;
    SizeType             GetAbsTolSizeType() const;
    double               GetAbsTolAbsolute() const;
    double               GetAbsTolBBox() const;
    FieldType            GetFieldType() const;
    double               GetFieldConstant() const;
    const double         *GetVelocitySource() const;
          double         *GetVelocitySource();
    IntegrationType      GetIntegrationType() const;
    ParallelizationAlgorithmType GetParallelizationAlgorithmType() const;
    int                  GetMaxProcessCount() const;
    int                  GetMaxDomainCacheSize() const;
    int                  GetWorkGroupSize() const;
    bool                 GetPathlines() const;
    bool                 GetPathlinesOverrideStartingTimeFlag() const;
    double               GetPathlinesOverrideStartingTime() const;
    double               GetPathlinesPeriod() const;
    PathlinesCMFE        GetPathlinesCMFE() const;
    CoordinateSystem     GetCoordinateSystem() const;
    bool                 GetPhiScalingFlag() const;
    double               GetPhiScaling() const;
    const std::string    &GetColoringVariable() const;
          std::string    &GetColoringVariable();
    bool                 GetLegendMinFlag() const;
    bool                 GetLegendMaxFlag() const;
    double               GetLegendMin() const;
    double               GetLegendMax() const;
    double               GetDisplayBegin() const;
    double               GetDisplayEnd() const;
    bool                 GetDisplayBeginFlag() const;
    bool                 GetDisplayEndFlag() const;
    ReferenceType        GetReferenceTypeForDisplay() const;
    DisplayMethod        GetDisplayMethod() const;
    SizeType             GetTubeSizeType() const;
    double               GetTubeRadiusAbsolute() const;
    double               GetTubeRadiusBBox() const;
    SizeType             GetRibbonWidthSizeType() const;
    double               GetRibbonWidthAbsolute() const;
    double               GetRibbonWidthBBox() const;
    int                  GetLineWidth() const;
    bool                 GetShowSeeds() const;
    SizeType             GetSeedRadiusSizeType() const;
    double               GetSeedRadiusAbsolute() const;
    double               GetSeedRadiusBBox() const;
    bool                 GetShowHeads() const;
    GeomDisplayType      GetHeadDisplayType() const;
    SizeType             GetHeadRadiusSizeType() const;
    double               GetHeadRadiusAbsolute() const;
    double               GetHeadRadiusBBox() const;
    double               GetHeadHeightRatio() const;
    OpacityType          GetOpacityType() const;
    const std::string    &GetOpacityVariable() const;
          std::string    &GetOpacityVariable();
    double               GetOpacity() const;
    double               GetOpacityVarMin() const;
    double               GetOpacityVarMax() const;
    bool                 GetOpacityVarMinFlag() const;
    bool                 GetOpacityVarMaxFlag() const;
    int                  GetTubeDisplayDensity() const;
    DisplayQuality       GetGeomDisplayQuality() const;
    double               GetSampleDistance0() const;
    double               GetSampleDistance1() const;
    double               GetSampleDistance2() const;
    bool                 GetFillInterior() const;
    bool                 GetRandomSamples() const;
    int                  GetRandomSeed() const;
    int                  GetNumberOfRandomSamples() const;
    bool                 GetForceNodeCenteredData() const;
    bool                 GetIssueTerminationWarnings() const;
    bool                 GetIssueStiffnessWarnings() const;
    bool                 GetIssueCriticalPointsWarnings() const;
    double               GetCriticalPointThreshold() const;
    VaryTubeRadiusType   GetVaryTubeRadius() const;
    double               GetVaryTubeRadiusFactor() const;
    const std::string    &GetVaryTubeRadiusVariable() const;
          std::string    &GetVaryTubeRadiusVariable();
    double               GetCorrelationDistanceAngTol() const;
    double               GetCorrelationDistanceMinDistAbsolute() const;
    double               GetCorrelationDistanceMinDistBBox() const;
    SizeType             GetCorrelationDistanceMinDistType() const;
    const std::string    &GetSelection() const;
          std::string    &GetSelection();

    // Persistence methods
    virtual bool CreateNode(DataNode *node, bool completeSave, bool forceAdd);
    virtual void SetFromNode(DataNode *node);

    // Enum conversion functions
    static std::string SourceType_ToString(SourceType);
    static bool SourceType_FromString(const std::string &, SourceType &);
protected:
    static std::string SourceType_ToString(int);
public:
    static std::string ColoringMethod_ToString(ColoringMethod);
    static bool ColoringMethod_FromString(const std::string &, ColoringMethod &);
protected:
    static std::string ColoringMethod_ToString(int);
public:
    static std::string CoordinateSystem_ToString(CoordinateSystem);
    static bool CoordinateSystem_FromString(const std::string &, CoordinateSystem &);
protected:
    static std::string CoordinateSystem_ToString(int);
public:
    static std::string DisplayMethod_ToString(DisplayMethod);
    static bool DisplayMethod_FromString(const std::string &, DisplayMethod &);
protected:
    static std::string DisplayMethod_ToString(int);
public:
    static std::string IntegrationDirection_ToString(IntegrationDirection);
    static bool IntegrationDirection_FromString(const std::string &, IntegrationDirection &);
protected:
    static std::string IntegrationDirection_ToString(int);
public:
    static std::string ReferenceType_ToString(ReferenceType);
    static bool ReferenceType_FromString(const std::string &, ReferenceType &);
protected:
    static std::string ReferenceType_ToString(int);
public:
    static std::string ParallelizationAlgorithmType_ToString(ParallelizationAlgorithmType);
    static bool ParallelizationAlgorithmType_FromString(const std::string &, ParallelizationAlgorithmType &);
protected:
    static std::string ParallelizationAlgorithmType_ToString(int);
public:
    static std::string FieldType_ToString(FieldType);
    static bool FieldType_FromString(const std::string &, FieldType &);
protected:
    static std::string FieldType_ToString(int);
public:
    static std::string IntegrationType_ToString(IntegrationType);
    static bool IntegrationType_FromString(const std::string &, IntegrationType &);
protected:
    static std::string IntegrationType_ToString(int);
public:
    static std::string OpacityType_ToString(OpacityType);
    static bool OpacityType_FromString(const std::string &, OpacityType &);
protected:
    static std::string OpacityType_ToString(int);
public:
    static std::string DisplayQuality_ToString(DisplayQuality);
    static bool DisplayQuality_FromString(const std::string &, DisplayQuality &);
protected:
    static std::string DisplayQuality_ToString(int);
public:
    static std::string GeomDisplayType_ToString(GeomDisplayType);
    static bool GeomDisplayType_FromString(const std::string &, GeomDisplayType &);
protected:
    static std::string GeomDisplayType_ToString(int);
public:
    static std::string SizeType_ToString(SizeType);
    static bool SizeType_FromString(const std::string &, SizeType &);
protected:
    static std::string SizeType_ToString(int);
public:
    static std::string PathlinesCMFE_ToString(PathlinesCMFE);
    static bool PathlinesCMFE_FromString(const std::string &, PathlinesCMFE &);
protected:
    static std::string PathlinesCMFE_ToString(int);
public:
    static std::string VaryTubeRadiusType_ToString(VaryTubeRadiusType);
    static bool VaryTubeRadiusType_FromString(const std::string &, VaryTubeRadiusType &);
protected:
    static std::string VaryTubeRadiusType_ToString(int);
public:

    // Keyframing methods
    virtual std::string               GetFieldName(int index) const;
    virtual AttributeGroup::FieldType GetFieldType(int index) const;
    virtual std::string               GetFieldTypeName(int index) const;
    virtual bool                      FieldsEqual(int index, const AttributeGroup *rhs) const;

    // User-defined methods
    bool ChangesRequireRecalculation(const StreamlineAttributes &) const;
    virtual void  ProcessOldVersions(DataNode *parentNode, const char *configVersion);

    // IDs that can be used to identify fields in case statements
    enum {
        ID_sourceType = 0,
        ID_pointSource,
        ID_lineStart,
        ID_lineEnd,
        ID_planeOrigin,
        ID_planeNormal,
        ID_planeUpAxis,
        ID_radius,
        ID_sphereOrigin,
        ID_boxExtents,
        ID_useWholeBox,
        ID_pointList,
        ID_sampleDensity0,
        ID_sampleDensity1,
        ID_sampleDensity2,
        ID_coloringMethod,
        ID_colorTableName,
        ID_singleColor,
        ID_legendFlag,
        ID_lightingFlag,
        ID_integrationDirection,
        ID_maxSteps,
        ID_terminateByDistance,
        ID_termDistance,
        ID_terminateByTime,
        ID_termTime,
        ID_maxStepLength,
        ID_limitMaximumTimestep,
        ID_maxTimeStep,
        ID_relTol,
        ID_absTolSizeType,
        ID_absTolAbsolute,
        ID_absTolBBox,
        ID_fieldType,
        ID_fieldConstant,
        ID_velocitySource,
        ID_integrationType,
        ID_parallelizationAlgorithmType,
        ID_maxProcessCount,
        ID_maxDomainCacheSize,
        ID_workGroupSize,
        ID_pathlines,
        ID_pathlinesOverrideStartingTimeFlag,
        ID_pathlinesOverrideStartingTime,
        ID_pathlinesPeriod,
        ID_pathlinesCMFE,
        ID_coordinateSystem,
        ID_phiScalingFlag,
        ID_phiScaling,
        ID_coloringVariable,
        ID_legendMinFlag,
        ID_legendMaxFlag,
        ID_legendMin,
        ID_legendMax,
        ID_displayBegin,
        ID_displayEnd,
        ID_displayBeginFlag,
        ID_displayEndFlag,
        ID_referenceTypeForDisplay,
        ID_displayMethod,
        ID_tubeSizeType,
        ID_tubeRadiusAbsolute,
        ID_tubeRadiusBBox,
        ID_ribbonWidthSizeType,
        ID_ribbonWidthAbsolute,
        ID_ribbonWidthBBox,
        ID_lineWidth,
        ID_showSeeds,
        ID_seedRadiusSizeType,
        ID_seedRadiusAbsolute,
        ID_seedRadiusBBox,
        ID_showHeads,
        ID_headDisplayType,
        ID_headRadiusSizeType,
        ID_headRadiusAbsolute,
        ID_headRadiusBBox,
        ID_headHeightRatio,
        ID_opacityType,
        ID_opacityVariable,
        ID_opacity,
        ID_opacityVarMin,
        ID_opacityVarMax,
        ID_opacityVarMinFlag,
        ID_opacityVarMaxFlag,
        ID_tubeDisplayDensity,
        ID_geomDisplayQuality,
        ID_sampleDistance0,
        ID_sampleDistance1,
        ID_sampleDistance2,
        ID_fillInterior,
        ID_randomSamples,
        ID_randomSeed,
        ID_numberOfRandomSamples,
        ID_forceNodeCenteredData,
        ID_issueTerminationWarnings,
        ID_issueStiffnessWarnings,
        ID_issueCriticalPointsWarnings,
        ID_criticalPointThreshold,
        ID_varyTubeRadius,
        ID_varyTubeRadiusFactor,
        ID_varyTubeRadiusVariable,
        ID_correlationDistanceAngTol,
        ID_correlationDistanceMinDistAbsolute,
        ID_correlationDistanceMinDistBBox,
        ID_correlationDistanceMinDistType,
        ID_selection,
        ID__LAST
    };

private:
    int            sourceType;
    double         pointSource[3];
    double         lineStart[3];
    double         lineEnd[3];
    double         planeOrigin[3];
    double         planeNormal[3];
    double         planeUpAxis[3];
    double         radius;
    double         sphereOrigin[3];
    double         boxExtents[6];
    bool           useWholeBox;
    doubleVector   pointList;
    int            sampleDensity0;
    int            sampleDensity1;
    int            sampleDensity2;
    int            coloringMethod;
    std::string    colorTableName;
    ColorAttribute singleColor;
    bool           legendFlag;
    bool           lightingFlag;
    int            integrationDirection;
    int            maxSteps;
    bool           terminateByDistance;
    double         termDistance;
    bool           terminateByTime;
    double         termTime;
    double         maxStepLength;
    bool           limitMaximumTimestep;
    double         maxTimeStep;
    double         relTol;
    int            absTolSizeType;
    double         absTolAbsolute;
    double         absTolBBox;
    int            fieldType;
    double         fieldConstant;
    double         velocitySource[3];
    int            integrationType;
    int            parallelizationAlgorithmType;
    int            maxProcessCount;
    int            maxDomainCacheSize;
    int            workGroupSize;
    bool           pathlines;
    bool           pathlinesOverrideStartingTimeFlag;
    double         pathlinesOverrideStartingTime;
    double         pathlinesPeriod;
    int            pathlinesCMFE;
    int            coordinateSystem;
    bool           phiScalingFlag;
    double         phiScaling;
    std::string    coloringVariable;
    bool           legendMinFlag;
    bool           legendMaxFlag;
    double         legendMin;
    double         legendMax;
    double         displayBegin;
    double         displayEnd;
    bool           displayBeginFlag;
    bool           displayEndFlag;
    int            referenceTypeForDisplay;
    int            displayMethod;
    int            tubeSizeType;
    double         tubeRadiusAbsolute;
    double         tubeRadiusBBox;
    int            ribbonWidthSizeType;
    double         ribbonWidthAbsolute;
    double         ribbonWidthBBox;
    int            lineWidth;
    bool           showSeeds;
    int            seedRadiusSizeType;
    double         seedRadiusAbsolute;
    double         seedRadiusBBox;
    bool           showHeads;
    int            headDisplayType;
    int            headRadiusSizeType;
    double         headRadiusAbsolute;
    double         headRadiusBBox;
    double         headHeightRatio;
    int            opacityType;
    std::string    opacityVariable;
    double         opacity;
    double         opacityVarMin;
    double         opacityVarMax;
    bool           opacityVarMinFlag;
    bool           opacityVarMaxFlag;
    int            tubeDisplayDensity;
    int            geomDisplayQuality;
    double         sampleDistance0;
    double         sampleDistance1;
    double         sampleDistance2;
    bool           fillInterior;
    bool           randomSamples;
    int            randomSeed;
    int            numberOfRandomSamples;
    bool           forceNodeCenteredData;
    bool           issueTerminationWarnings;
    bool           issueStiffnessWarnings;
    bool           issueCriticalPointsWarnings;
    double         criticalPointThreshold;
    int            varyTubeRadius;
    double         varyTubeRadiusFactor;
    std::string    varyTubeRadiusVariable;
    double         correlationDistanceAngTol;
    double         correlationDistanceMinDistAbsolute;
    double         correlationDistanceMinDistBBox;
    int            correlationDistanceMinDistType;
    std::string    selection;

    // Static class format string for type map.
    static const char *TypeMapFormatString;
    static const private_tmfs_t TmfsStruct;
};
#define STREAMLINEATTRIBUTES_TMFS "iDDDDDDdDDbd*iiiisabbiibdbddbddiddidDiiiiibbddiibdsbbddddbbiiiddiddibiddbiidddisdddbbiidddbbiibbbbdidsdddis"

#endif
