/*****************************************************************************
*
* Copyright (c) 2000 - 2013, Lawrence Livermore National Security, LLC
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

#ifndef AVTSCALARMETADATA_H
#define AVTSCALARMETADATA_H
#include <dbatts_exports.h>
#include <string>
#include <avtVarMetaData.h>

#include <float.h>
#include <vector>
#include <list>

// ****************************************************************************
// Class: avtScalarMetaData
//
// Purpose:
//    Contains scalar metadata attributes
//
// Notes:      Autogenerated by xml2atts.
//
// Programmer: xml2atts
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

class DBATTS_API avtScalarMetaData : public avtVarMetaData
{
public:
    enum PartialCellModes
    {
        Include,
        Exclude,
        Dissect
    };
    enum EnumTypes
    {
        None,
        ByValue,
        ByRange,
        ByBitMask,
        ByNChooseR
    };
    enum MissingData
    {
        MissingData_None,
        MissingData_Value,
        MissingData_Valid_Min,
        MissingData_Valid_Max,
        MissingData_Valid_Range
    };

    // These constructors are for objects of this class
    avtScalarMetaData();
    avtScalarMetaData(const avtScalarMetaData &obj);
protected:
    // These constructors are for objects derived from this class
    avtScalarMetaData(private_tmfs_t tmfs);
    avtScalarMetaData(const avtScalarMetaData &obj, private_tmfs_t tmfs);
public:
    virtual ~avtScalarMetaData();

    virtual avtScalarMetaData& operator = (const avtScalarMetaData &obj);
    virtual bool operator == (const avtScalarMetaData &obj) const;
    virtual bool operator != (const avtScalarMetaData &obj) const;
private:
    void Init();
    void Copy(const avtScalarMetaData &obj);
public:

    virtual const std::string TypeName() const;
    virtual bool CopyAttributes(const AttributeGroup *);
    virtual AttributeSubject *CreateCompatible(const std::string &) const;
    virtual AttributeSubject *NewInstance(bool) const;

    // Property selection methods
    virtual void SelectAll();
    void SelectMissingData();

    // Property setting methods
    void SetEnumerationType(EnumTypes enumerationType_);
    void SetEnumPartialCellMode(PartialCellModes enumPartialCellMode_);
    void SetEnumNChooseRN(int enumNChooseRN_);
    void SetEnumNChooseRMaxR(int enumNChooseRMaxR_);
    void SetMissingDataType(MissingData missingDataType_);
    void SetMissingData(const double *missingData_);

    // Property getting methods
    EnumTypes          GetEnumerationType() const;
    PartialCellModes   GetEnumPartialCellMode() const;
    int                GetEnumNChooseRN() const;
    int                GetEnumNChooseRMaxR() const;
    MissingData        GetMissingDataType() const;
    const double       *GetMissingData() const;
          double       *GetMissingData();

    // Enum conversion functions
    static std::string PartialCellModes_ToString(PartialCellModes);
    static bool PartialCellModes_FromString(const std::string &, PartialCellModes &);
protected:
    static std::string PartialCellModes_ToString(int);
public:
    static std::string EnumTypes_ToString(EnumTypes);
    static bool EnumTypes_FromString(const std::string &, EnumTypes &);
protected:
    static std::string EnumTypes_ToString(int);
public:
    static std::string MissingData_ToString(MissingData);
    static bool MissingData_FromString(const std::string &, MissingData &);
protected:
    static std::string MissingData_ToString(int);
public:

    // Keyframing methods
    virtual std::string               GetFieldName(int index) const;
    virtual AttributeGroup::FieldType GetFieldType(int index) const;
    virtual std::string               GetFieldTypeName(int index) const;
    virtual bool                      FieldsEqual(int index, const AttributeGroup *rhs) const;

    // User-defined methods
    avtScalarMetaData(std::string, std::string, avtCentering);
    avtScalarMetaData(std::string, std::string, avtCentering, double, double);
    void Print(ostream &, int = 0) const;
    void AddEnumGraphEdge(int head, int tail);
    int AddEnumNameValue(std::string name, double val);
    int AddEnumNameRange(std::string name, double min, double max);
    void SetEnumAlwaysExcludeValue(double val);
    void SetEnumAlwaysExcludeRange(double min, double max);
    void SetEnumAlwaysIncludeValue(double val);
    void SetEnumAlwaysIncludeRange(double min, double max);
    static void BuildEnumNChooseRMap(int n, int maxr, std::vector<std::vector<int> > &ptMap);
    static double NChooseR(int n, int r);
    static void ComboValFromDigits(const std::vector<std::vector<int> > &ptMap, const std::list<int> &digits, double *id);
    static void ComboDigitsFromVal(double id, int n, int maxr, const std::vector<std::vector<int> > &ptMap, std::list<int> &digits);
    static void UpdateValByInsertingDigit(double *id, int n, int maxr, const std::vector<std::vector<int> > &ptMap, int newDigit);

    // IDs that can be used to identify fields in case statements
    enum {
        ID_treatAsASCII = avtVarMetaData::ID__LAST,
        ID_enumerationType,
        ID_enumNames,
        ID_enumRanges,
        ID_enumAlwaysExclude,
        ID_enumAlwaysInclude,
        ID_enumPartialCellMode,
        ID_enumGraphEdges,
        ID_enumNChooseRN,
        ID_enumNChooseRMaxR,
        ID_missingDataType,
        ID_missingData,
        ID__LAST
    };

public:
    bool         treatAsASCII;
    stringVector enumNames;
    doubleVector enumRanges;
    double       enumAlwaysExclude[2];
    double       enumAlwaysInclude[2];
    intVector    enumGraphEdges;
private:
    int          enumerationType;
    int          enumPartialCellMode;
    int          enumNChooseRN;
    int          enumNChooseRMaxR;
    int          missingDataType;
    double       missingData[2];

    // Static class format string for type map.
    static const char *TypeMapFormatString;
    static const private_tmfs_t TmfsStruct;
};
#define AVTSCALARMETADATA_TMFS AVTVARMETADATA_TMFS "bis*d*DDii*iiiD"

#endif
