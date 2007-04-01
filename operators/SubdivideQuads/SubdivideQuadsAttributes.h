#ifndef SUBDIVIDEQUADSATTRIBUTES_H
#define SUBDIVIDEQUADSATTRIBUTES_H
#include <string>
#include <AttributeSubject.h>

// ****************************************************************************
// Class: SubdivideQuadsAttributes
//
// Purpose:
//    Attributes for SubdivideQuads operator
//
// Notes:      Autogenerated by xml2atts.
//
// Programmer: xml2atts
// Creation:   Tue Nov 2 06:28:41 PDT 2004
//
// Modifications:
//   
// ****************************************************************************

class SubdivideQuadsAttributes : public AttributeSubject
{
public:
    SubdivideQuadsAttributes();
    SubdivideQuadsAttributes(const SubdivideQuadsAttributes &obj);
    virtual ~SubdivideQuadsAttributes();

    virtual void operator = (const SubdivideQuadsAttributes &obj);
    virtual bool operator == (const SubdivideQuadsAttributes &obj) const;
    virtual bool operator != (const SubdivideQuadsAttributes &obj) const;

    virtual const std::string TypeName() const;
    virtual bool CopyAttributes(const AttributeGroup *);
    virtual AttributeSubject *CreateCompatible(const std::string &) const;
    virtual AttributeSubject *NewInstance(bool) const;

    // Property selection methods
    virtual void SelectAll();
    void SelectVariable();

    // Property setting methods
    void SetThreshold(double threshold_);
    void SetMaxSubdivs(int maxSubdivs_);
    void SetFanOutPoints(bool fanOutPoints_);
    void SetDoTriangles(bool doTriangles_);
    void SetVariable(const std::string &variable_);

    // Property getting methods
    double            GetThreshold() const;
    int               GetMaxSubdivs() const;
    bool              GetFanOutPoints() const;
    bool              GetDoTriangles() const;
    const std::string &GetVariable() const;
          std::string &GetVariable();


    // Keyframing methods
    virtual std::string               GetFieldName(int index) const;
    virtual AttributeGroup::FieldType GetFieldType(int index) const;
    virtual std::string               GetFieldTypeName(int index) const;
    virtual bool                      FieldsEqual(int index, const AttributeGroup *rhs) const;

private:
    double      threshold;
    int         maxSubdivs;
    bool        fanOutPoints;
    bool        doTriangles;
    std::string variable;
};

#endif
