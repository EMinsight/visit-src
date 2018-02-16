/*****************************************************************************
*
* Copyright (c) 2000 - 2018, Lawrence Livermore National Security, LLC
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

#ifndef AXES3D_H
#define AXES3D_H
#include <state_exports.h>
#include <string>
#include <AttributeSubject.h>

#include <AxisAttributes.h>

// ****************************************************************************
// Class: Axes3D
//
// Purpose:
//    Contains the properties for the 3D axes.
//
// Notes:      Autogenerated by xml2atts.
//
// Programmer: xml2atts
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

class STATE_API Axes3D : public AttributeSubject
{
public:
    enum Axes
    {
        ClosestTriad,
        FurthestTriad,
        OutsideEdges,
        StaticTriad,
        StaticEdges
    };
    enum Location
    {
        Inside,
        Outside,
        Both
    };

    // These constructors are for objects of this class
    Axes3D();
    Axes3D(const Axes3D &obj);
protected:
    // These constructors are for objects derived from this class
    Axes3D(private_tmfs_t tmfs);
    Axes3D(const Axes3D &obj, private_tmfs_t tmfs);
public:
    virtual ~Axes3D();

    virtual Axes3D& operator = (const Axes3D &obj);
    virtual bool operator == (const Axes3D &obj) const;
    virtual bool operator != (const Axes3D &obj) const;
private:
    void Init();
    void Copy(const Axes3D &obj);
public:

    virtual const std::string TypeName() const;
    virtual bool CopyAttributes(const AttributeGroup *);
    virtual AttributeSubject *CreateCompatible(const std::string &) const;
    virtual AttributeSubject *NewInstance(bool) const;

    // Property selection methods
    virtual void SelectAll();
    void SelectXAxis();
    void SelectYAxis();
    void SelectZAxis();
    void SelectBboxLocation();

    // Property setting methods
    void SetVisible(bool visible_);
    void SetAutoSetTicks(bool autoSetTicks_);
    void SetAutoSetScaling(bool autoSetScaling_);
    void SetLineWidth(int lineWidth_);
    void SetTickLocation(Location tickLocation_);
    void SetAxesType(Axes axesType_);
    void SetTriadFlag(bool triadFlag_);
    void SetBboxFlag(bool bboxFlag_);
    void SetXAxis(const AxisAttributes &xAxis_);
    void SetYAxis(const AxisAttributes &yAxis_);
    void SetZAxis(const AxisAttributes &zAxis_);
    void SetSetBBoxLocation(bool setBBoxLocation_);
    void SetBboxLocation(const double *bboxLocation_);

    // Property getting methods
    bool                 GetVisible() const;
    bool                 GetAutoSetTicks() const;
    bool                 GetAutoSetScaling() const;
    int                  GetLineWidth() const;
    Location             GetTickLocation() const;
    Axes                 GetAxesType() const;
    bool                 GetTriadFlag() const;
    bool                 GetBboxFlag() const;
    const AxisAttributes &GetXAxis() const;
          AxisAttributes &GetXAxis();
    const AxisAttributes &GetYAxis() const;
          AxisAttributes &GetYAxis();
    const AxisAttributes &GetZAxis() const;
          AxisAttributes &GetZAxis();
    bool                 GetSetBBoxLocation() const;
    const double         *GetBboxLocation() const;
          double         *GetBboxLocation();

    // Persistence methods
    virtual bool CreateNode(DataNode *node, bool completeSave, bool forceAdd);
    virtual void SetFromNode(DataNode *node);

    // Enum conversion functions
    static std::string Axes_ToString(Axes);
    static bool Axes_FromString(const std::string &, Axes &);
protected:
    static std::string Axes_ToString(int);
public:
    static std::string Location_ToString(Location);
    static bool Location_FromString(const std::string &, Location &);
protected:
    static std::string Location_ToString(int);
public:

    // Keyframing methods
    virtual std::string               GetFieldName(int index) const;
    virtual AttributeGroup::FieldType GetFieldType(int index) const;
    virtual std::string               GetFieldTypeName(int index) const;
    virtual bool                      FieldsEqual(int index, const AttributeGroup *rhs) const;


    // IDs that can be used to identify fields in case statements
    enum {
        ID_visible = 0,
        ID_autoSetTicks,
        ID_autoSetScaling,
        ID_lineWidth,
        ID_tickLocation,
        ID_axesType,
        ID_triadFlag,
        ID_bboxFlag,
        ID_xAxis,
        ID_yAxis,
        ID_zAxis,
        ID_setBBoxLocation,
        ID_bboxLocation,
        ID__LAST
    };

private:
    bool           visible;
    bool           autoSetTicks;
    bool           autoSetScaling;
    int            lineWidth;
    int            tickLocation;
    int            axesType;
    bool           triadFlag;
    bool           bboxFlag;
    AxisAttributes xAxis;
    AxisAttributes yAxis;
    AxisAttributes zAxis;
    bool           setBBoxLocation;
    double         bboxLocation[6];

    // Static class format string for type map.
    static const char *TypeMapFormatString;
    static const private_tmfs_t TmfsStruct;
};
#define AXES3D_TMFS "bbbiiibbaaabD"

#endif
