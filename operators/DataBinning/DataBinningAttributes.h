/*****************************************************************************
*
* Copyright (c) 2000 - 2010, Lawrence Livermore National Security, LLC
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

#ifndef DATABINNINGATTRIBUTES_H
#define DATABINNINGATTRIBUTES_H
#include <string>
#include <AttributeSubject.h>

#include <ConstructDataBinningAttributes.h>
#include <Expression.h>

// ****************************************************************************
// Class: DataBinningAttributes
//
// Purpose:
//    The attributes for the DataBinning operator
//
// Notes:      Autogenerated by xml2atts.
//
// Programmer: xml2atts
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

class DataBinningAttributes : public AttributeSubject
{
public:
    enum ReductionOperator
    {
        Average,
        Minimum,
        Maximum,
        StandardDeviation,
        Variance,
        Sum,
        Count,
        RMS,
        PDF
    };
    enum NumDimensions
    {
        One,
        Two,
        Three
    };
    enum OutOfBoundsBehavior
    {
        Clamp,
        Discard
    };

    // These constructors are for objects of this class
    DataBinningAttributes();
    DataBinningAttributes(const DataBinningAttributes &obj);
protected:
    // These constructors are for objects derived from this class
    DataBinningAttributes(private_tmfs_t tmfs);
    DataBinningAttributes(const DataBinningAttributes &obj, private_tmfs_t tmfs);
public:
    virtual ~DataBinningAttributes();

    virtual DataBinningAttributes& operator = (const DataBinningAttributes &obj);
    virtual bool operator == (const DataBinningAttributes &obj) const;
    virtual bool operator != (const DataBinningAttributes &obj) const;
private:
    void Init();
    void Copy(const DataBinningAttributes &obj);
public:

    virtual const std::string TypeName() const;
    virtual bool CopyAttributes(const AttributeGroup *);
    virtual AttributeSubject *CreateCompatible(const std::string &) const;
    virtual AttributeSubject *NewInstance(bool) const;

    // Property selection methods
    virtual void SelectAll();
    void SelectDim1Var();
    void SelectDim2Var();
    void SelectDim3Var();
    void SelectVarForReduction();

    // Property setting methods
    void SetNumDimensions(NumDimensions numDimensions_);
    void SetDim1Var(const std::string &dim1Var_);
    void SetDim1SpecifyRange(bool dim1SpecifyRange_);
    void SetDim1MinRange(double dim1MinRange_);
    void SetDim1MaxRange(double dim1MaxRange_);
    void SetDim1NumBins(int dim1NumBins_);
    void SetDim2Var(const std::string &dim2Var_);
    void SetDim2SpecifyRange(bool dim2SpecifyRange_);
    void SetDim2MinRange(double dim2MinRange_);
    void SetDim2MaxRange(double dim2MaxRange_);
    void SetDim2NumBins(int dim2NumBins_);
    void SetDim3Var(const std::string &dim3Var_);
    void SetDim3SpecifyRange(bool dim3SpecifyRange_);
    void SetDim3MinRange(double dim3MinRange_);
    void SetDim3MaxRange(double dim3MaxRange_);
    void SetDim3NumBins(int dim3NumBins_);
    void SetOutOfBoundsBehavior(OutOfBoundsBehavior outOfBoundsBehavior_);
    void SetReductionOperator(ReductionOperator reductionOperator_);
    void SetVarForReduction(const std::string &varForReduction_);
    void SetEmptyVal(double emptyVal_);

    // Property getting methods
    NumDimensions     GetNumDimensions() const;
    const std::string &GetDim1Var() const;
          std::string &GetDim1Var();
    bool              GetDim1SpecifyRange() const;
    double            GetDim1MinRange() const;
    double            GetDim1MaxRange() const;
    int               GetDim1NumBins() const;
    const std::string &GetDim2Var() const;
          std::string &GetDim2Var();
    bool              GetDim2SpecifyRange() const;
    double            GetDim2MinRange() const;
    double            GetDim2MaxRange() const;
    int               GetDim2NumBins() const;
    const std::string &GetDim3Var() const;
          std::string &GetDim3Var();
    bool              GetDim3SpecifyRange() const;
    double            GetDim3MinRange() const;
    double            GetDim3MaxRange() const;
    int               GetDim3NumBins() const;
    OutOfBoundsBehavior GetOutOfBoundsBehavior() const;
    ReductionOperator GetReductionOperator() const;
    const std::string &GetVarForReduction() const;
          std::string &GetVarForReduction();
    double            GetEmptyVal() const;

    // Enum conversion functions
    static std::string ReductionOperator_ToString(ReductionOperator);
    static bool ReductionOperator_FromString(const std::string &, ReductionOperator &);
protected:
    static std::string ReductionOperator_ToString(int);
public:
    static std::string NumDimensions_ToString(NumDimensions);
    static bool NumDimensions_FromString(const std::string &, NumDimensions &);
protected:
    static std::string NumDimensions_ToString(int);
public:
    static std::string OutOfBoundsBehavior_ToString(OutOfBoundsBehavior);
    static bool OutOfBoundsBehavior_FromString(const std::string &, OutOfBoundsBehavior &);
protected:
    static std::string OutOfBoundsBehavior_ToString(int);
public:

    // Keyframing methods
    virtual std::string               GetFieldName(int index) const;
    virtual AttributeGroup::FieldType GetFieldType(int index) const;
    virtual std::string               GetFieldTypeName(int index) const;
    virtual bool                      FieldsEqual(int index, const AttributeGroup *rhs) const;

    // User-defined methods
    ConstructDataBinningAttributes CreateConstructionAtts(void);

    // IDs that can be used to identify fields in case statements
    enum {
        ID_numDimensions = 0,
        ID_dim1Var,
        ID_dim1SpecifyRange,
        ID_dim1MinRange,
        ID_dim1MaxRange,
        ID_dim1NumBins,
        ID_dim2Var,
        ID_dim2SpecifyRange,
        ID_dim2MinRange,
        ID_dim2MaxRange,
        ID_dim2NumBins,
        ID_dim3Var,
        ID_dim3SpecifyRange,
        ID_dim3MinRange,
        ID_dim3MaxRange,
        ID_dim3NumBins,
        ID_outOfBoundsBehavior,
        ID_reductionOperator,
        ID_varForReduction,
        ID_emptyVal,
        ID__LAST
    };

private:
    int         numDimensions;
    std::string dim1Var;
    bool        dim1SpecifyRange;
    double      dim1MinRange;
    double      dim1MaxRange;
    int         dim1NumBins;
    std::string dim2Var;
    bool        dim2SpecifyRange;
    double      dim2MinRange;
    double      dim2MaxRange;
    int         dim2NumBins;
    std::string dim3Var;
    bool        dim3SpecifyRange;
    double      dim3MinRange;
    double      dim3MaxRange;
    int         dim3NumBins;
    int         outOfBoundsBehavior;
    int         reductionOperator;
    std::string varForReduction;
    double      emptyVal;

    // Static class format string for type map.
    static const char *TypeMapFormatString;
    static const private_tmfs_t TmfsStruct;
};
#define DATABINNINGATTRIBUTES_TMFS "isbddisbddisbddiiisd"

#endif
