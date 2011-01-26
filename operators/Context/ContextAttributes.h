/*****************************************************************************
*
* Copyright (c) 2000 - 2011, Lawrence Livermore National Security, LLC
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

#ifndef CONTEXTATTRIBUTES_H
#define CONTEXTATTRIBUTES_H
#include <string>
#include <AttributeSubject.h>


// ****************************************************************************
// Class: ContextAttributes
//
// Purpose:
//    This class contains attributes for the context operator.
//
// Notes:      Autogenerated by xml2atts.
//
// Programmer: xml2atts
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

class ContextAttributes : public AttributeSubject
{
public:
    enum Amount
    {
        Some,
        All
    };

    // These constructors are for objects of this class
    ContextAttributes();
    ContextAttributes(const ContextAttributes &obj);
protected:
    // These constructors are for objects derived from this class
    ContextAttributes(private_tmfs_t tmfs);
    ContextAttributes(const ContextAttributes &obj, private_tmfs_t tmfs);
public:
    virtual ~ContextAttributes();

    virtual ContextAttributes& operator = (const ContextAttributes &obj);
    virtual bool operator == (const ContextAttributes &obj) const;
    virtual bool operator != (const ContextAttributes &obj) const;
private:
    void Init();
    void Copy(const ContextAttributes &obj);
public:

    virtual const std::string TypeName() const;
    virtual bool CopyAttributes(const AttributeGroup *);
    virtual AttributeSubject *CreateCompatible(const std::string &) const;
    virtual AttributeSubject *NewInstance(bool) const;

    // Property selection methods
    virtual void SelectAll();
    void SelectContext();

    // Property setting methods
    void SetOffset(double offset_);
    void SetLow(double low_);
    void SetHi(double hi_);
    void SetContext(const std::string &context_);
    void SetCutoff(double cutoff_);
    void SetBelow(double below_);
    void SetAbove(double above_);

    // Property getting methods
    double            GetOffset() const;
    double            GetLow() const;
    double            GetHi() const;
    const std::string &GetContext() const;
          std::string &GetContext();
    double            GetCutoff() const;
    double            GetBelow() const;
    double            GetAbove() const;

    // Persistence methods
    virtual bool CreateNode(DataNode *node, bool completeSave, bool forceAdd);
    virtual void SetFromNode(DataNode *node);

    // Enum conversion functions
    static std::string Amount_ToString(Amount);
    static bool Amount_FromString(const std::string &, Amount &);
protected:
    static std::string Amount_ToString(int);
public:

    // Keyframing methods
    virtual std::string               GetFieldName(int index) const;
    virtual AttributeGroup::FieldType GetFieldType(int index) const;
    virtual std::string               GetFieldTypeName(int index) const;
    virtual bool                      FieldsEqual(int index, const AttributeGroup *rhs) const;


    // IDs that can be used to identify fields in case statements
    enum {
        ID_offset = 0,
        ID_low,
        ID_hi,
        ID_context,
        ID_cutoff,
        ID_below,
        ID_above,
        ID__LAST
    };

private:
    double      offset;
    double      low;
    double      hi;
    std::string context;
    double      cutoff;
    double      below;
    double      above;

    // Static class format string for type map.
    static const char *TypeMapFormatString;
    static const private_tmfs_t TmfsStruct;
};
#define CONTEXTATTRIBUTES_TMFS "dddsddd"

#endif
