#ifndef PICKATTRIBUTES_H
#define PICKATTRIBUTES_H
#include <state_exports.h>
#include <string>
#include <AttributeSubject.h>
class PickVarInfo;
#include <iostream.h>

// ****************************************************************************
// Class: PickAttributes
//
// Purpose:
//    This class contains attributes used for pick.
//
// Notes:      Autogenerated by xml2atts.
//
// Programmer: xml2atts
// Creation:   Thu Dec 18 11:29:50 PDT 2003
//
// Modifications:
//   
// ****************************************************************************

class STATE_API PickAttributes : public AttributeSubject
{
public:
    enum PickType
    {
        Zone,
        Node,
        CurveZone,
        CurveNode
    };

    PickAttributes();
    PickAttributes(const PickAttributes &obj);
    virtual ~PickAttributes();

    virtual void operator = (const PickAttributes &obj);
    virtual bool operator == (const PickAttributes &obj) const;
    virtual bool operator != (const PickAttributes &obj) const;

    virtual const std::string TypeName() const;
    virtual bool CopyAttributes(const AttributeGroup *);
    virtual AttributeSubject *CreateCompatible(const std::string &) const;
    virtual AttributeSubject *NewInstance(bool) const;

    // Property selection methods
    virtual void SelectAll();
    void SelectVariables();
    void SelectPickLetter();
    void SelectIncidentElements();
    void SelectDatabaseName();
    void SelectActiveVariable();
    void SelectPickPoint();
    void SelectCellPoint();
    void SelectNodePoint();
    void SelectPlotBounds();
    void SelectRayPoint1();
    void SelectRayPoint2();
    void SelectMeshInfo();
    void SelectRealIncidentElements();
    void SelectPnodeCoords();
    void SelectDnodeCoords();
    void SelectBnodeCoords();
    void SelectDzoneCoords();
    void SelectBzoneCoords();
    void SelectVarInfo();

    // Property setting methods
    void SetVariables(const stringVector &variables_);
    void SetDisplayIncidentElements(bool displayIncidentElements_);
    void SetShowNodeId(bool showNodeId_);
    void SetShowNodeDomainLogicalCoords(bool showNodeDomainLogicalCoords_);
    void SetShowNodeBlockLogicalCoords(bool showNodeBlockLogicalCoords_);
    void SetShowNodePhysicalCoords(bool showNodePhysicalCoords_);
    void SetShowZoneId(bool showZoneId_);
    void SetShowZoneDomainLogicalCoords(bool showZoneDomainLogicalCoords_);
    void SetShowZoneBlockLogicalCoords(bool showZoneBlockLogicalCoords_);
    void SetClearWindow(bool clearWindow_);
    void SetPickLetter(const std::string &pickLetter_);
    void SetFulfilled(bool fulfilled_);
    void SetPickType(PickType pickType_);
    void SetDomain(int domain_);
    void SetElementNumber(int elementNumber_);
    void SetIncidentElements(const intVector &incidentElements_);
    void SetTimeStep(int timeStep_);
    void SetDimension(int dimension_);
    void SetDatabaseName(const std::string &databaseName_);
    void SetActiveVariable(const std::string &activeVariable_);
    void SetPickPoint(const float *pickPoint_);
    void SetCellPoint(const float *cellPoint_);
    void SetNodePoint(const float *nodePoint_);
    void SetPlotBounds(const float *plotBounds_);
    void SetRayPoint1(const float *rayPoint1_);
    void SetRayPoint2(const float *rayPoint2_);
    void SetMeshInfo(const std::string &meshInfo_);
    void SetRealElementNumber(int realElementNumber_);
    void SetRealIncidentElements(const intVector &realIncidentElements_);
    void SetPnodeCoords(const stringVector &pnodeCoords_);
    void SetDnodeCoords(const stringVector &dnodeCoords_);
    void SetBnodeCoords(const stringVector &bnodeCoords_);
    void SetDzoneCoords(const stringVector &dzoneCoords_);
    void SetBzoneCoords(const stringVector &bzoneCoords_);
    void SetNeedTransformMessage(bool needTransformMessage_);
    void SetVarInfo(const AttributeGroupVector &varInfo_);

    // Property getting methods
    const stringVector &GetVariables() const;
          stringVector &GetVariables();
    bool               GetDisplayIncidentElements() const;
    bool               GetShowNodeId() const;
    bool               GetShowNodeDomainLogicalCoords() const;
    bool               GetShowNodeBlockLogicalCoords() const;
    bool               GetShowNodePhysicalCoords() const;
    bool               GetShowZoneId() const;
    bool               GetShowZoneDomainLogicalCoords() const;
    bool               GetShowZoneBlockLogicalCoords() const;
    bool               GetClearWindow() const;
    const std::string  &GetPickLetter() const;
          std::string  &GetPickLetter();
    bool               GetFulfilled() const;
    PickType           GetPickType() const;
    int                GetDomain() const;
    int                GetElementNumber() const;
    const intVector    &GetIncidentElements() const;
          intVector    &GetIncidentElements();
    int                GetTimeStep() const;
    int                GetDimension() const;
    const std::string  &GetDatabaseName() const;
          std::string  &GetDatabaseName();
    const std::string  &GetActiveVariable() const;
          std::string  &GetActiveVariable();
    const float        *GetPickPoint() const;
          float        *GetPickPoint();
    const float        *GetCellPoint() const;
          float        *GetCellPoint();
    const float        *GetNodePoint() const;
          float        *GetNodePoint();
    const float        *GetPlotBounds() const;
          float        *GetPlotBounds();
    const float        *GetRayPoint1() const;
          float        *GetRayPoint1();
    const float        *GetRayPoint2() const;
          float        *GetRayPoint2();
    const std::string  &GetMeshInfo() const;
          std::string  &GetMeshInfo();
    int                GetRealElementNumber() const;
    const intVector    &GetRealIncidentElements() const;
          intVector    &GetRealIncidentElements();
    const stringVector &GetPnodeCoords() const;
          stringVector &GetPnodeCoords();
    const stringVector &GetDnodeCoords() const;
          stringVector &GetDnodeCoords();
    const stringVector &GetBnodeCoords() const;
          stringVector &GetBnodeCoords();
    const stringVector &GetDzoneCoords() const;
          stringVector &GetDzoneCoords();
    const stringVector &GetBzoneCoords() const;
          stringVector &GetBzoneCoords();
    bool               GetNeedTransformMessage() const;
    const AttributeGroupVector &GetVarInfo() const;
          AttributeGroupVector &GetVarInfo();

    // Persistence methods
    virtual bool CreateNode(DataNode *node, bool completeSave, bool forceAdd);
    virtual void SetFromNode(DataNode *node);


    // Attributegroup convenience methods
    void AddPickVarInfo(const PickVarInfo &);
    void ClearPickVarInfos();
    void RemovePickVarInfo(int i);
    int  GetNumPickVarInfos() const;
    PickVarInfo &GetPickVarInfo(int i);
    const PickVarInfo &GetPickVarInfo(int i) const;

    PickVarInfo &operator [] (int i);
    const PickVarInfo &operator [] (int i) const;

    // Enum conversion functions
    static std::string PickType_ToString(PickType);
    static bool PickType_FromString(const std::string &, PickType &);
protected:
    static std::string PickType_ToString(int);
public:

    // Keyframing methods
    virtual std::string               GetFieldName(int index) const;
    virtual AttributeGroup::FieldType GetFieldType(int index) const;
    virtual std::string               GetFieldTypeName(int index) const;
    virtual bool                      FieldsEqual(int index, const AttributeGroup *rhs) const;

    // User-defined methods
    void PrintSelf(ostream &os);
    void CreateOutputString(std::string &os, bool withLetter = true);
    void PrepareForNewPick();
protected:
    AttributeGroup *CreateSubAttributeGroup(int index);
private:
    stringVector         variables;
    bool                 displayIncidentElements;
    bool                 showNodeId;
    bool                 showNodeDomainLogicalCoords;
    bool                 showNodeBlockLogicalCoords;
    bool                 showNodePhysicalCoords;
    bool                 showZoneId;
    bool                 showZoneDomainLogicalCoords;
    bool                 showZoneBlockLogicalCoords;
    bool                 clearWindow;
    std::string          pickLetter;
    bool                 fulfilled;
    int                  pickType;
    int                  domain;
    int                  elementNumber;
    intVector            incidentElements;
    int                  timeStep;
    int                  dimension;
    std::string          databaseName;
    std::string          activeVariable;
    float                pickPoint[3];
    float                cellPoint[3];
    float                nodePoint[3];
    float                plotBounds[6];
    float                rayPoint1[3];
    float                rayPoint2[3];
    std::string          meshInfo;
    int                  realElementNumber;
    intVector            realIncidentElements;
    stringVector         pnodeCoords;
    stringVector         dnodeCoords;
    stringVector         bnodeCoords;
    stringVector         dzoneCoords;
    stringVector         bzoneCoords;
    bool                 needTransformMessage;
    AttributeGroupVector varInfo;
};

#endif
