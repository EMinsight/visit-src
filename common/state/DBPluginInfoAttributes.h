/*****************************************************************************
*
* Copyright (c) 2000 - 2007, The Regents of the University of California
* Produced at the Lawrence Livermore National Laboratory
* All rights reserved.
*
* This file is part of VisIt. For details, see http://www.llnl.gov/visit/. The
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
*    documentation and/or materials provided with the distribution.
*  - Neither the name of the UC/LLNL nor  the names of its contributors may be
*    used to  endorse or  promote products derived from  this software without
*    specific prior written permission.
*
* THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT  HOLDERS AND CONTRIBUTORS "AS IS"
* AND ANY EXPRESS OR  IMPLIED WARRANTIES, INCLUDING,  BUT NOT  LIMITED TO, THE
* IMPLIED WARRANTIES OF MERCHANTABILITY AND  FITNESS FOR A PARTICULAR  PURPOSE
* ARE  DISCLAIMED.  IN  NO  EVENT  SHALL  THE  REGENTS  OF  THE  UNIVERSITY OF
* CALIFORNIA, THE U.S.  DEPARTMENT  OF  ENERGY OR CONTRIBUTORS BE  LIABLE  FOR
* ANY  DIRECT,  INDIRECT,  INCIDENTAL,  SPECIAL,  EXEMPLARY,  OR CONSEQUENTIAL
* DAMAGES (INCLUDING, BUT NOT  LIMITED TO, PROCUREMENT OF  SUBSTITUTE GOODS OR
* SERVICES; LOSS OF  USE, DATA, OR PROFITS; OR  BUSINESS INTERRUPTION) HOWEVER
* CAUSED  AND  ON  ANY  THEORY  OF  LIABILITY,  WHETHER  IN  CONTRACT,  STRICT
* LIABILITY, OR TORT  (INCLUDING NEGLIGENCE OR OTHERWISE)  ARISING IN ANY  WAY
* OUT OF THE  USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
* DAMAGE.
*
*****************************************************************************/

#ifndef DBPLUGININFOATTRIBUTES_H
#define DBPLUGININFOATTRIBUTES_H
#include <state_exports.h>
#include <string>
#include <AttributeSubject.h>
class DBOptionsAttributes;
class DBOptionsAttributes;

// ****************************************************************************
// Class: DBPluginInfoAttributes
//
// Purpose:
//    This class contains the attributes for all the database plugins.
//
// Notes:      Autogenerated by xml2atts.
//
// Programmer: xml2atts
// Creation:   Thu Dec 20 09:40:35 PDT 2007
//
// Modifications:
//   
// ****************************************************************************

class STATE_API DBPluginInfoAttributes : public AttributeSubject
{
public:
    DBPluginInfoAttributes();
    DBPluginInfoAttributes(const DBPluginInfoAttributes &obj);
    virtual ~DBPluginInfoAttributes();

    virtual DBPluginInfoAttributes& operator = (const DBPluginInfoAttributes &obj);
    virtual bool operator == (const DBPluginInfoAttributes &obj) const;
    virtual bool operator != (const DBPluginInfoAttributes &obj) const;

    virtual const std::string TypeName() const;
    virtual bool CopyAttributes(const AttributeGroup *);
    virtual AttributeSubject *CreateCompatible(const std::string &) const;
    virtual AttributeSubject *NewInstance(bool) const;

    // Property selection methods
    virtual void SelectAll();
    void SelectTypes();
    void SelectHasWriter();
    void SelectDbReadOptions();
    void SelectDbWriteOptions();
    void SelectTypesFullNames();
    void SelectHost();

    // Property setting methods
    void SetTypes(const stringVector &types_);
    void SetHasWriter(const intVector &hasWriter_);
    void SetTypesFullNames(const stringVector &typesFullNames_);
    void SetHost(const std::string &host_);

    // Property getting methods
    const stringVector &GetTypes() const;
          stringVector &GetTypes();
    const intVector    &GetHasWriter() const;
          intVector    &GetHasWriter();
    const AttributeGroupVector &GetDbReadOptions() const;
          AttributeGroupVector &GetDbReadOptions();
    const AttributeGroupVector &GetDbWriteOptions() const;
          AttributeGroupVector &GetDbWriteOptions();
    const stringVector &GetTypesFullNames() const;
          stringVector &GetTypesFullNames();
    const std::string  &GetHost() const;
          std::string  &GetHost();

    // Persistence methods
    virtual bool CreateNode(DataNode *node, bool completeSave, bool forceAdd);
    virtual void SetFromNode(DataNode *node);


    // Attributegroup convenience methods
    void AddDbReadOptions(const DBOptionsAttributes &);
    void ClearDbReadOptions();
    void RemoveDbReadOptions(int i);
    int  GetNumDbReadOptions() const;
    DBOptionsAttributes &GetDbReadOptions(int i);
    const DBOptionsAttributes &GetDbReadOptions(int i) const;

    void AddDbWriteOptions(const DBOptionsAttributes &);
    void ClearDbWriteOptions();
    void RemoveDbWriteOptions(int i);
    int  GetNumDbWriteOptions() const;
    DBOptionsAttributes &GetDbWriteOptions(int i);
    const DBOptionsAttributes &GetDbWriteOptions(int i) const;


    // Keyframing methods
    virtual std::string               GetFieldName(int index) const;
    virtual AttributeGroup::FieldType GetFieldType(int index) const;
    virtual std::string               GetFieldTypeName(int index) const;
    virtual bool                      FieldsEqual(int index, const AttributeGroup *rhs) const;


    // IDs that can be used to identify fields in case statements
    enum {
        ID_types = 0,
        ID_hasWriter,
        ID_dbReadOptions,
        ID_dbWriteOptions,
        ID_typesFullNames,
        ID_host
    };

protected:
    AttributeGroup *CreateSubAttributeGroup(int index);
private:
    stringVector         types;
    intVector            hasWriter;
    AttributeGroupVector dbReadOptions;
    AttributeGroupVector dbWriteOptions;
    stringVector         typesFullNames;
    std::string          host;

    // Static class format string for type map.
    static const char *TypeMapFormatString;
};

#endif
