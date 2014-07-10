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

#ifndef TRANSFORMATTRIBUTES_H
#define TRANSFORMATTRIBUTES_H
#include <string>
#include <AttributeSubject.h>


// ****************************************************************************
// Class: TransformAttributes
//
// Purpose:
//    This class contains attributes for the transform operator.
//
// Notes:      Autogenerated by xml2atts.
//
// Programmer: xml2atts
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

class TransformAttributes : public AttributeSubject
{
public:
    enum AngleType
    {
        Deg,
        Rad
    };
    enum TransformType
    {
        Similarity,
        Coordinate,
        Linear
    };
    enum CoordinateSystem
    {
        Cartesian,
        Cylindrical,
        Spherical
    };
    enum VectorTransformMethod
    {
        None,
        AsPoint,
        AsDisplacement,
        AsDirection
    };

    // These constructors are for objects of this class
    TransformAttributes();
    TransformAttributes(const TransformAttributes &obj);
protected:
    // These constructors are for objects derived from this class
    TransformAttributes(private_tmfs_t tmfs);
    TransformAttributes(const TransformAttributes &obj, private_tmfs_t tmfs);
public:
    virtual ~TransformAttributes();

    virtual TransformAttributes& operator = (const TransformAttributes &obj);
    virtual bool operator == (const TransformAttributes &obj) const;
    virtual bool operator != (const TransformAttributes &obj) const;
private:
    void Init();
    void Copy(const TransformAttributes &obj);
public:

    virtual const std::string TypeName() const;
    virtual bool CopyAttributes(const AttributeGroup *);
    virtual AttributeSubject *CreateCompatible(const std::string &) const;
    virtual AttributeSubject *NewInstance(bool) const;

    // Property selection methods
    virtual void SelectAll();
    void SelectRotateOrigin();
    void SelectRotateAxis();
    void SelectScaleOrigin();

    // Property setting methods
    void SetDoRotate(bool doRotate_);
    void SetRotateOrigin(const double *rotateOrigin_);
    void SetRotateAxis(const double *rotateAxis_);
    void SetRotateAmount(double rotateAmount_);
    void SetRotateType(AngleType rotateType_);
    void SetDoScale(bool doScale_);
    void SetScaleOrigin(const double *scaleOrigin_);
    void SetScaleX(double scaleX_);
    void SetScaleY(double scaleY_);
    void SetScaleZ(double scaleZ_);
    void SetDoTranslate(bool doTranslate_);
    void SetTranslateX(double translateX_);
    void SetTranslateY(double translateY_);
    void SetTranslateZ(double translateZ_);
    void SetTransformType(TransformType transformType_);
    void SetInputCoordSys(CoordinateSystem inputCoordSys_);
    void SetOutputCoordSys(CoordinateSystem outputCoordSys_);
    void SetContinuousPhi(bool continuousPhi_);
    void SetM00(double m00_);
    void SetM01(double m01_);
    void SetM02(double m02_);
    void SetM03(double m03_);
    void SetM10(double m10_);
    void SetM11(double m11_);
    void SetM12(double m12_);
    void SetM13(double m13_);
    void SetM20(double m20_);
    void SetM21(double m21_);
    void SetM22(double m22_);
    void SetM23(double m23_);
    void SetM30(double m30_);
    void SetM31(double m31_);
    void SetM32(double m32_);
    void SetM33(double m33_);
    void SetInvertLinearTransform(bool invertLinearTransform_);
    void SetVectorTransformMethod(VectorTransformMethod vectorTransformMethod_);
    void SetTransformVectors(bool transformVectors_);

    // Property getting methods
    bool         GetDoRotate() const;
    const double *GetRotateOrigin() const;
          double *GetRotateOrigin();
    const double *GetRotateAxis() const;
          double *GetRotateAxis();
    double       GetRotateAmount() const;
    AngleType    GetRotateType() const;
    bool         GetDoScale() const;
    const double *GetScaleOrigin() const;
          double *GetScaleOrigin();
    double       GetScaleX() const;
    double       GetScaleY() const;
    double       GetScaleZ() const;
    bool         GetDoTranslate() const;
    double       GetTranslateX() const;
    double       GetTranslateY() const;
    double       GetTranslateZ() const;
    TransformType GetTransformType() const;
    CoordinateSystem GetInputCoordSys() const;
    CoordinateSystem GetOutputCoordSys() const;
    bool         GetContinuousPhi() const;
    double       GetM00() const;
    double       GetM01() const;
    double       GetM02() const;
    double       GetM03() const;
    double       GetM10() const;
    double       GetM11() const;
    double       GetM12() const;
    double       GetM13() const;
    double       GetM20() const;
    double       GetM21() const;
    double       GetM22() const;
    double       GetM23() const;
    double       GetM30() const;
    double       GetM31() const;
    double       GetM32() const;
    double       GetM33() const;
    bool         GetInvertLinearTransform() const;
    VectorTransformMethod GetVectorTransformMethod() const;
    bool         GetTransformVectors() const;

    // Persistence methods
    virtual bool CreateNode(DataNode *node, bool completeSave, bool forceAdd);
    virtual void SetFromNode(DataNode *node);

    // Enum conversion functions
    static std::string AngleType_ToString(AngleType);
    static bool AngleType_FromString(const std::string &, AngleType &);
protected:
    static std::string AngleType_ToString(int);
public:
    static std::string TransformType_ToString(TransformType);
    static bool TransformType_FromString(const std::string &, TransformType &);
protected:
    static std::string TransformType_ToString(int);
public:
    static std::string CoordinateSystem_ToString(CoordinateSystem);
    static bool CoordinateSystem_FromString(const std::string &, CoordinateSystem &);
protected:
    static std::string CoordinateSystem_ToString(int);
public:
    static std::string VectorTransformMethod_ToString(VectorTransformMethod);
    static bool VectorTransformMethod_FromString(const std::string &, VectorTransformMethod &);
protected:
    static std::string VectorTransformMethod_ToString(int);
public:

    // Keyframing methods
    virtual std::string               GetFieldName(int index) const;
    virtual AttributeGroup::FieldType GetFieldType(int index) const;
    virtual std::string               GetFieldTypeName(int index) const;
    virtual bool                      FieldsEqual(int index, const AttributeGroup *rhs) const;


    // IDs that can be used to identify fields in case statements
    enum {
        ID_doRotate = 0,
        ID_rotateOrigin,
        ID_rotateAxis,
        ID_rotateAmount,
        ID_rotateType,
        ID_doScale,
        ID_scaleOrigin,
        ID_scaleX,
        ID_scaleY,
        ID_scaleZ,
        ID_doTranslate,
        ID_translateX,
        ID_translateY,
        ID_translateZ,
        ID_transformType,
        ID_inputCoordSys,
        ID_outputCoordSys,
        ID_continuousPhi,
        ID_m00,
        ID_m01,
        ID_m02,
        ID_m03,
        ID_m10,
        ID_m11,
        ID_m12,
        ID_m13,
        ID_m20,
        ID_m21,
        ID_m22,
        ID_m23,
        ID_m30,
        ID_m31,
        ID_m32,
        ID_m33,
        ID_invertLinearTransform,
        ID_vectorTransformMethod,
        ID_transformVectors,
        ID__LAST
    };

private:
    bool   doRotate;
    double rotateOrigin[3];
    double rotateAxis[3];
    double rotateAmount;
    int    rotateType;
    bool   doScale;
    double scaleOrigin[3];
    double scaleX;
    double scaleY;
    double scaleZ;
    bool   doTranslate;
    double translateX;
    double translateY;
    double translateZ;
    int    transformType;
    int    inputCoordSys;
    int    outputCoordSys;
    bool   continuousPhi;
    double m00;
    double m01;
    double m02;
    double m03;
    double m10;
    double m11;
    double m12;
    double m13;
    double m20;
    double m21;
    double m22;
    double m23;
    double m30;
    double m31;
    double m32;
    double m33;
    bool   invertLinearTransform;
    int    vectorTransformMethod;
    bool   transformVectors;

    // Static class format string for type map.
    static const char *TypeMapFormatString;
    static const private_tmfs_t TmfsStruct;
};
#define TRANSFORMATTRIBUTES_TMFS "bDDdibDdddbdddiiibddddddddddddddddbib"

#endif
