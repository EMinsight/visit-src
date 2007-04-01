// ************************************************************************* //
//  File: avtReflectFilter.h
// ************************************************************************* //

#ifndef AVT_Reflect_FILTER_H
#define AVT_Reflect_FILTER_H


#include <avtDataTreeStreamer.h>
#include <avtPluginFilter.h>
#include <ReflectAttributes.h>


class vtkDataArray;
class vtkDataSet;
class vtkPointSet;
class vtkRectilinearGrid;


// ****************************************************************************
//  Class: avtReflectFilter
//
//  Purpose:
//      A plugin operator for Reflect.
//
//  Programmer: childs -- generated by xml2info
//  Creation:   Thu Mar 7 10:35:24 PDT 2002
//
// ****************************************************************************

class avtReflectFilter : public virtual avtDataTreeStreamer,
                         public virtual avtPluginFilter
{
  public:
                         avtReflectFilter();
    virtual             ~avtReflectFilter();

    static avtFilter    *Create();

    virtual const char  *GetType(void)  { return "avtReflectFilter"; };
    virtual const char  *GetDescription(void)
                             { return "Reflecting the data"; };

    virtual void         SetAtts(const AttributeGroup*);
    virtual bool         Equivalent(const AttributeGroup*);

  protected:
    ReflectAttributes     atts;
    double                xReflect;
    double                yReflect;
    double                zReflect;

    virtual void          PreExecute(void);
    virtual void          PostExecute(void);
    virtual avtDataTree_p ExecuteDataTree(vtkDataSet *, int, std::string);
    virtual avtPipelineSpecification_p
                          PerformRestriction(avtPipelineSpecification_p);
    virtual void          RefashionDataObjectInfo(void);

    vtkDataSet           *Reflect(vtkDataSet *, int);
    vtkDataSet           *ReflectRectilinear(vtkRectilinearGrid *, int);
    vtkDataSet           *ReflectPointSet(vtkPointSet *, int);
    vtkDataArray         *ReflectDataArray(vtkDataArray *, double);
    void                  HasNeighbor(int, bool &, bool &, bool &);
};


#endif
