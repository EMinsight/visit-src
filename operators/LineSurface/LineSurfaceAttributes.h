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

#ifndef LINESURFACEATTRIBUTES_H
#define LINESURFACEATTRIBUTES_H
#include <AttributeSubject.h>


// ****************************************************************************
// Class: LineSurfaceAttributes
//
// Purpose:
//    Attributes for the LineSurface operator
//
// Notes:      Autogenerated by xml2atts.
//
// Programmer: xml2atts
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

class LineSurfaceAttributes : public AttributeSubject
{
public:
    // These constructors are for objects of this class
    LineSurfaceAttributes();
    LineSurfaceAttributes(const LineSurfaceAttributes &obj);
protected:
    // These constructors are for objects derived from this class
    LineSurfaceAttributes(private_tmfs_t tmfs);
    LineSurfaceAttributes(const LineSurfaceAttributes &obj, private_tmfs_t tmfs);
public:
    virtual ~LineSurfaceAttributes();

    virtual LineSurfaceAttributes& operator = (const LineSurfaceAttributes &obj);
    virtual bool operator == (const LineSurfaceAttributes &obj) const;
    virtual bool operator != (const LineSurfaceAttributes &obj) const;
private:
    void Init();
    void Copy(const LineSurfaceAttributes &obj);
public:

    virtual const std::string TypeName() const;
    virtual bool CopyAttributes(const AttributeGroup *);
    virtual AttributeSubject *CreateCompatible(const std::string &) const;
    virtual AttributeSubject *NewInstance(bool) const;

    // Property selection methods
    virtual void SelectAll();
    void SelectPoint1();
    void SelectPoint2();

    // Property setting methods
    void SetStartTime(int startTime_);
    void SetEndTime(int endTime_);
    void SetStride(int stride_);
    void SetPoint1(const double *point1_);
    void SetPoint2(const double *point2_);

    // Property getting methods
    int          GetStartTime() const;
    int          GetEndTime() const;
    int          GetStride() const;
    const double *GetPoint1() const;
          double *GetPoint1();
    const double *GetPoint2() const;
          double *GetPoint2();

    // Persistence methods
    virtual bool CreateNode(DataNode *node, bool completeSave, bool forceAdd);
    virtual void SetFromNode(DataNode *node);


    // Keyframing methods
    virtual std::string               GetFieldName(int index) const;
    virtual AttributeGroup::FieldType GetFieldType(int index) const;
    virtual std::string               GetFieldTypeName(int index) const;
    virtual bool                      FieldsEqual(int index, const AttributeGroup *rhs) const;


    // IDs that can be used to identify fields in case statements
    enum {
        ID_startTime = 0,
        ID_endTime,
        ID_stride,
        ID_point1,
        ID_point2,
        ID__LAST
    };

private:
    int    startTime;
    int    endTime;
    int    stride;
    double point1[3];
    double point2[3];

    // Static class format string for type map.
    static const char *TypeMapFormatString;
    static const private_tmfs_t TmfsStruct;
};
#define LINESURFACEATTRIBUTES_TMFS "iiiDD"

#endif
