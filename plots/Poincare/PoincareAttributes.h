/*****************************************************************************
*
* Copyright (c) 2000 - 2010, Lawrence Livermore National Security, LLC
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

#ifndef POINCAREATTRIBUTES_H
#define POINCAREATTRIBUTES_H
#include <string>
#include <AttributeSubject.h>

#include <ColorAttribute.h>

// ****************************************************************************
// Class: PoincareAttributes
//
// Purpose:
//    Attributes for the Poincare plot
//
// Notes:      Autogenerated by xml2atts.
//
// Programmer: xml2atts
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

class PoincareAttributes : public AttributeSubject
{
public:
    enum SourceType
    {
        SpecifiedPoint,
        SpecifiedLine
    };
    enum IntegrationType
    {
        DormandPrince,
        AdamsBashforth,
        M3DC1Integrator
    };
    enum OverlapType
    {
        Raw,
        Remove,
        Merge,
        Smooth
    };
    enum ShowMeshType
    {
        Curves,
        Surfaces
    };
    enum ColoringMethod
    {
        ColorBySingleColor,
        ColorByColorTable
    };
    enum DataValue
    {
        OriginalValue,
        InputOrder,
        PointIndex,
        Plane,
        WindingOrder,
        WindingPointOrder,
        WindingPointOrderModulo,
        ToroidalWindings,
        PoloidalWindings,
        SafetyFactor,
        Confidence,
        RidgelineVariance
    };

    // These constructors are for objects of this class
    PoincareAttributes();
    PoincareAttributes(const PoincareAttributes &obj);
protected:
    // These constructors are for objects derived from this class
    PoincareAttributes(private_tmfs_t tmfs);
    PoincareAttributes(const PoincareAttributes &obj, private_tmfs_t tmfs);
public:
    virtual ~PoincareAttributes();

    virtual PoincareAttributes& operator = (const PoincareAttributes &obj);
    virtual bool operator == (const PoincareAttributes &obj) const;
    virtual bool operator != (const PoincareAttributes &obj) const;
private:
    void Init();
    void Copy(const PoincareAttributes &obj);
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
    void SelectSingleColor();
    void SelectColorTableName();

    // Property setting methods
    void SetMinPunctures(double minPunctures_);
    void SetMaxPunctures(double maxPunctures_);
    void SetSourceType(SourceType sourceType_);
    void SetPointSource(const double *pointSource_);
    void SetLineStart(const double *lineStart_);
    void SetLineEnd(const double *lineEnd_);
    void SetPointDensity(int pointDensity_);
    void SetIntegrationType(IntegrationType integrationType_);
    void SetMaxStepLength(double maxStepLength_);
    void SetRelTol(double relTol_);
    void SetAbsTol(double absTol_);
    void SetMaxToroidalWinding(int maxToroidalWinding_);
    void SetOverrideToroidalWinding(int overrideToroidalWinding_);
    void SetHitRate(double hitRate_);
    void SetAdjustPlane(int adjustPlane_);
    void SetOverlaps(OverlapType overlaps_);
    void SetMeshType(ShowMeshType meshType_);
    void SetNumberPlanes(int numberPlanes_);
    void SetMin(double min_);
    void SetMax(double max_);
    void SetMinFlag(bool minFlag_);
    void SetMaxFlag(bool maxFlag_);
    void SetColorType(ColoringMethod colorType_);
    void SetSingleColor(const ColorAttribute &singleColor_);
    void SetColorTableName(const std::string &colorTableName_);
    void SetDataValue(DataValue dataValue_);
    void SetShowOPoints(bool showOPoints_);
    void SetShowIslands(bool showIslands_);
    void SetShowLines(bool showLines_);
    void SetShowPoints(bool showPoints_);
    void SetVerboseFlag(bool verboseFlag_);
    void SetLegendFlag(bool legendFlag_);
    void SetLightingFlag(bool lightingFlag_);

    // Property getting methods
    double               GetMinPunctures() const;
    double               GetMaxPunctures() const;
    SourceType           GetSourceType() const;
    const double         *GetPointSource() const;
          double         *GetPointSource();
    const double         *GetLineStart() const;
          double         *GetLineStart();
    const double         *GetLineEnd() const;
          double         *GetLineEnd();
    int                  GetPointDensity() const;
    IntegrationType      GetIntegrationType() const;
    double               GetMaxStepLength() const;
    double               GetRelTol() const;
    double               GetAbsTol() const;
    int                  GetMaxToroidalWinding() const;
    int                  GetOverrideToroidalWinding() const;
    double               GetHitRate() const;
    int                  GetAdjustPlane() const;
    OverlapType          GetOverlaps() const;
    ShowMeshType         GetMeshType() const;
    int                  GetNumberPlanes() const;
    double               GetMin() const;
    double               GetMax() const;
    bool                 GetMinFlag() const;
    bool                 GetMaxFlag() const;
    ColoringMethod       GetColorType() const;
    const ColorAttribute &GetSingleColor() const;
          ColorAttribute &GetSingleColor();
    const std::string    &GetColorTableName() const;
          std::string    &GetColorTableName();
    DataValue            GetDataValue() const;
    bool                 GetShowOPoints() const;
    bool                 GetShowIslands() const;
    bool                 GetShowLines() const;
    bool                 GetShowPoints() const;
    bool                 GetVerboseFlag() const;
    bool                 GetLegendFlag() const;
    bool                 GetLightingFlag() const;

    // Persistence methods
    virtual bool CreateNode(DataNode *node, bool completeSave, bool forceAdd);
    virtual void SetFromNode(DataNode *node);

    // Enum conversion functions
    static std::string SourceType_ToString(SourceType);
    static bool SourceType_FromString(const std::string &, SourceType &);
protected:
    static std::string SourceType_ToString(int);
public:
    static std::string IntegrationType_ToString(IntegrationType);
    static bool IntegrationType_FromString(const std::string &, IntegrationType &);
protected:
    static std::string IntegrationType_ToString(int);
public:
    static std::string OverlapType_ToString(OverlapType);
    static bool OverlapType_FromString(const std::string &, OverlapType &);
protected:
    static std::string OverlapType_ToString(int);
public:
    static std::string ShowMeshType_ToString(ShowMeshType);
    static bool ShowMeshType_FromString(const std::string &, ShowMeshType &);
protected:
    static std::string ShowMeshType_ToString(int);
public:
    static std::string ColoringMethod_ToString(ColoringMethod);
    static bool ColoringMethod_FromString(const std::string &, ColoringMethod &);
protected:
    static std::string ColoringMethod_ToString(int);
public:
    static std::string DataValue_ToString(DataValue);
    static bool DataValue_FromString(const std::string &, DataValue &);
protected:
    static std::string DataValue_ToString(int);
public:

    // Keyframing methods
    virtual std::string               GetFieldName(int index) const;
    virtual AttributeGroup::FieldType GetFieldType(int index) const;
    virtual std::string               GetFieldTypeName(int index) const;
    virtual bool                      FieldsEqual(int index, const AttributeGroup *rhs) const;

    // User-defined methods
    bool ChangesRequireRecalculation(const PoincareAttributes &obj) const;
    bool StreamlineAttsRequireRecalculation(const PoincareAttributes &obj) const;
    bool PoincareAttsRequireRecalculation(const PoincareAttributes &obj) const;

    // IDs that can be used to identify fields in case statements
    enum {
        ID_minPunctures = 0,
        ID_maxPunctures,
        ID_sourceType,
        ID_pointSource,
        ID_lineStart,
        ID_lineEnd,
        ID_pointDensity,
        ID_integrationType,
        ID_maxStepLength,
        ID_relTol,
        ID_absTol,
        ID_maxToroidalWinding,
        ID_overrideToroidalWinding,
        ID_hitRate,
        ID_adjustPlane,
        ID_overlaps,
        ID_meshType,
        ID_numberPlanes,
        ID_min,
        ID_max,
        ID_minFlag,
        ID_maxFlag,
        ID_colorType,
        ID_singleColor,
        ID_colorTableName,
        ID_dataValue,
        ID_showOPoints,
        ID_showIslands,
        ID_showLines,
        ID_showPoints,
        ID_verboseFlag,
        ID_legendFlag,
        ID_lightingFlag,
        ID__LAST
    };

private:
    double         minPunctures;
    double         maxPunctures;
    int            sourceType;
    double         pointSource[3];
    double         lineStart[3];
    double         lineEnd[3];
    int            pointDensity;
    int            integrationType;
    double         maxStepLength;
    double         relTol;
    double         absTol;
    int            maxToroidalWinding;
    int            overrideToroidalWinding;
    double         hitRate;
    int            adjustPlane;
    int            overlaps;
    int            meshType;
    int            numberPlanes;
    double         min;
    double         max;
    bool           minFlag;
    bool           maxFlag;
    int            colorType;
    ColorAttribute singleColor;
    std::string    colorTableName;
    int            dataValue;
    bool           showOPoints;
    bool           showIslands;
    bool           showLines;
    bool           showPoints;
    bool           verboseFlag;
    bool           legendFlag;
    bool           lightingFlag;

    // Static class format string for type map.
    static const char *TypeMapFormatString;
    static const private_tmfs_t TmfsStruct;
};
#define POINCAREATTRIBUTES_TMFS "ddiDDDiidddiidiiiiddbbiasibbbbbbb"

#endif
