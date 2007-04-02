#ifndef LIGHTATTRIBUTES_H
#define LIGHTATTRIBUTES_H
#include <state_exports.h>
#include <string>
#include <AttributeSubject.h>
#include <ColorAttribute.h>

// ****************************************************************************
// Class: LightAttributes
//
// Purpose:
//    This class is a light in a light list.
//
// Notes:      Autogenerated by xml2atts.
//
// Programmer: xml2atts
// Creation:   Wed May 17 09:05:48 PDT 2006
//
// Modifications:
//   
// ****************************************************************************

class STATE_API LightAttributes : public AttributeSubject
{
public:
    enum LightType
    {
        Ambient,
        Object,
        Camera
    };

    LightAttributes();
    LightAttributes(const LightAttributes &obj);
    virtual ~LightAttributes();

    virtual LightAttributes& operator = (const LightAttributes &obj);
    virtual bool operator == (const LightAttributes &obj) const;
    virtual bool operator != (const LightAttributes &obj) const;

    virtual const std::string TypeName() const;
    virtual bool CopyAttributes(const AttributeGroup *);
    virtual AttributeSubject *CreateCompatible(const std::string &) const;
    virtual AttributeSubject *NewInstance(bool) const;

    // Property selection methods
    virtual void SelectAll();
    void SelectDirection();
    void SelectColor();

    // Property setting methods
    void SetEnabledFlagCanBeToggled(bool enabledFlagCanBeToggled_);
    void SetEnabledFlag(bool enabledFlag_);
    void SetType(LightType type_);
    void SetDirection(const double *direction_);
    void SetColor(const ColorAttribute &color_);
    void SetBrightness(double brightness_);

    // Property getting methods
    bool                 GetEnabledFlagCanBeToggled() const;
    bool                 GetEnabledFlag() const;
    LightType            GetType() const;
    const double         *GetDirection() const;
          double         *GetDirection();
    const ColorAttribute &GetColor() const;
          ColorAttribute &GetColor();
    double               GetBrightness() const;

    // Persistence methods
    virtual bool CreateNode(DataNode *node, bool completeSave, bool forceAdd);
    virtual void SetFromNode(DataNode *node);

    // Enum conversion functions
    static std::string LightType_ToString(LightType);
    static bool LightType_FromString(const std::string &, LightType &);
protected:
    static std::string LightType_ToString(int);
public:

    // Keyframing methods
    virtual std::string               GetFieldName(int index) const;
    virtual AttributeGroup::FieldType GetFieldType(int index) const;
    virtual std::string               GetFieldTypeName(int index) const;
    virtual bool                      FieldsEqual(int index, const AttributeGroup *rhs) const;

private:
    bool           enabledFlagCanBeToggled;
    bool           enabledFlag;
    int            type;
    double         direction[3];
    ColorAttribute color;
    double         brightness;
};

#endif
