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

#ifndef ZONEDUMPATTRIBUTES_H
#define ZONEDUMPATTRIBUTES_H
#include <string>
#include <AttributeSubject.h>


// ****************************************************************************
// Class: ZoneDumpAttributes
//
// Purpose:
//    Zone Dump Control
//
// Notes:      Autogenerated by xml2atts.
//
// Programmer: xml2atts
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

class ZoneDumpAttributes : public AttributeSubject
{
public:
    // These constructors are for objects of this class
    ZoneDumpAttributes();
    ZoneDumpAttributes(const ZoneDumpAttributes &obj);
protected:
    // These constructors are for objects derived from this class
    ZoneDumpAttributes(private_tmfs_t tmfs);
    ZoneDumpAttributes(const ZoneDumpAttributes &obj, private_tmfs_t tmfs);
public:
    virtual ~ZoneDumpAttributes();

    virtual ZoneDumpAttributes& operator = (const ZoneDumpAttributes &obj);
    virtual bool operator == (const ZoneDumpAttributes &obj) const;
    virtual bool operator != (const ZoneDumpAttributes &obj) const;
private:
    void Init();
    void Copy(const ZoneDumpAttributes &obj);
public:

    virtual const std::string TypeName() const;
    virtual bool CopyAttributes(const AttributeGroup *);
    virtual AttributeSubject *CreateCompatible(const std::string &) const;
    virtual AttributeSubject *NewInstance(bool) const;

    // Property selection methods
    virtual void SelectAll();
    void SelectVariable();
    void SelectOutputFile();

    // Property setting methods
    void SetVariable(const std::string &variable_);
    void SetLowerBound(double lowerBound_);
    void SetUpperBound(double upperBound_);
    void SetOutputFile(const std::string &outputFile_);
    void SetEnabled(bool enabled_);

    // Property getting methods
    const std::string &GetVariable() const;
          std::string &GetVariable();
    double            GetLowerBound() const;
    double            GetUpperBound() const;
    const std::string &GetOutputFile() const;
          std::string &GetOutputFile();
    bool              GetEnabled() const;

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
        ID_variable = 0,
        ID_lowerBound,
        ID_upperBound,
        ID_outputFile,
        ID_enabled,
        ID__LAST
    };

private:
    std::string variable;
    double      lowerBound;
    double      upperBound;
    std::string outputFile;
    bool        enabled;

    // Static class format string for type map.
    static const char *TypeMapFormatString;
    static const private_tmfs_t TmfsStruct;
};
#define ZONEDUMPATTRIBUTES_TMFS "sddsb"

#endif
