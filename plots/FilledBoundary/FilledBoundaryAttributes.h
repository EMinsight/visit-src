#ifndef FILLEDBOUNDARYATTRIBUTES_H
#define FILLEDBOUNDARYATTRIBUTES_H
#include <string>
#include <AttributeSubject.h>
#include <ColorAttribute.h>
#include <ColorAttributeList.h>

// ****************************************************************************
// Class: FilledBoundaryAttributes
//
// Purpose:
//    This class contains the plot attributes for the filled boundary plot.
//
// Notes:      Autogenerated by xml2atts.
//
// Programmer: xml2atts
// Creation:   Thu Oct 9 13:30:47 PST 2003
//
// Modifications:
//   
// ****************************************************************************

class FilledBoundaryAttributes : public AttributeSubject
{
public:
    enum Boundary_Type
    {
        Domain,
        Group,
        Material,
        Unknown
    };
    enum ColoringMethod
    {
        ColorBySingleColor,
        ColorByMultipleColors,
        ColorByColorTable
    };

    FilledBoundaryAttributes();
    FilledBoundaryAttributes(const FilledBoundaryAttributes &obj);
    virtual ~FilledBoundaryAttributes();

    virtual void operator = (const FilledBoundaryAttributes &obj);
    virtual bool operator == (const FilledBoundaryAttributes &obj) const;
    virtual bool operator != (const FilledBoundaryAttributes &obj) const;

    virtual const std::string TypeName() const;
    virtual bool CopyAttributes(const AttributeGroup *);
    virtual AttributeSubject *CreateCompatible(const std::string &) const;
    virtual AttributeSubject *NewInstance(bool) const;

    // Property selection methods
    virtual void SelectAll();
    void SelectColorTableName();
    void SelectSingleColor();
    void SelectMultiColor();
    void SelectBoundaryNames();

    // Property setting methods
    void SetColorType(ColoringMethod colorType_);
    void SetColorTableName(const std::string &colorTableName_);
    void SetFilledFlag(bool filledFlag_);
    void SetLegendFlag(bool legendFlag_);
    void SetLineStyle(int lineStyle_);
    void SetLineWidth(int lineWidth_);
    void SetSingleColor(const ColorAttribute &singleColor_);
    void SetMultiColor(const ColorAttributeList &multiColor_);
    void SetBoundaryNames(const stringVector &boundaryNames_);
    void SetBoundaryType(Boundary_Type boundaryType_);
    void SetOpacity(double opacity_);
    void SetWireframe(bool wireframe_);
    void SetDrawInternal(bool drawInternal_);
    void SetSmoothingLevel(int smoothingLevel_);
    void SetCleanZonesOnly(bool cleanZonesOnly_);

    // Property getting methods
    ColoringMethod           GetColorType() const;
    const std::string        &GetColorTableName() const;
          std::string        &GetColorTableName();
    bool                     GetFilledFlag() const;
    bool                     GetLegendFlag() const;
    int                      GetLineStyle() const;
    int                      GetLineWidth() const;
    const ColorAttribute     &GetSingleColor() const;
          ColorAttribute     &GetSingleColor();
    const ColorAttributeList &GetMultiColor() const;
          ColorAttributeList &GetMultiColor();
    const stringVector       &GetBoundaryNames() const;
          stringVector       &GetBoundaryNames();
    Boundary_Type            GetBoundaryType() const;
    double                   GetOpacity() const;
    bool                     GetWireframe() const;
    bool                     GetDrawInternal() const;
    int                      GetSmoothingLevel() const;
    bool                     GetCleanZonesOnly() const;

    // Persistence methods
    virtual bool CreateNode(DataNode *node, bool forceAdd);
    virtual void SetFromNode(DataNode *node);

    // Enum conversion functions
    static std::string Boundary_Type_ToString(Boundary_Type);
    static bool Boundary_Type_FromString(const std::string &, Boundary_Type &);
protected:
    static std::string Boundary_Type_ToString(int);
public:
    static std::string ColoringMethod_ToString(ColoringMethod);
    static bool ColoringMethod_FromString(const std::string &, ColoringMethod &);
protected:
    static std::string ColoringMethod_ToString(int);
public:

    // Keyframing methods
    virtual std::string               GetFieldName(int index) const;
    virtual AttributeGroup::FieldType GetFieldType(int index) const;
    virtual std::string               GetFieldTypeName(int index) const;
    virtual bool                      FieldsEqual(int index, const AttributeGroup *rhs) const;

    // User-defined methods
    bool ChangesRequireRecalculation(const FilledBoundaryAttributes &obj);
    virtual bool VarChangeRequiresReset(void);
private:
    int                colorType;
    std::string        colorTableName;
    bool               filledFlag;
    bool               legendFlag;
    int                lineStyle;
    int                lineWidth;
    ColorAttribute     singleColor;
    ColorAttributeList multiColor;
    stringVector       boundaryNames;
    int                boundaryType;
    double             opacity;
    bool               wireframe;
    bool               drawInternal;
    int                smoothingLevel;
    bool               cleanZonesOnly;
};

#endif
