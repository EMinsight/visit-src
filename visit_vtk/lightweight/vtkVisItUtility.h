// ************************************************************************* //
//                             vtkVisItUtility.h                             //
// ************************************************************************* //

#ifndef VTK_VISIT_UTILITY_H
#define VTK_VISIT_UTILITY_H

#include <visit_vtk_light_exports.h>

class vtkDataSet;
class vtkPoints;
class vtkRectilinearGrid;

namespace vtkVisItUtility
{
    VISIT_VTK_LIGHT_API vtkPoints  *GetPoints(vtkDataSet *);
    VISIT_VTK_LIGHT_API void        GetLogicalIndices(vtkDataSet *, const bool, 
                                                const int, int [3], 
                                                const bool = false);
    VISIT_VTK_LIGHT_API int         CalculateRealID(const int, const bool, 
                                              vtkDataSet *ds);
    VISIT_VTK_LIGHT_API int         ComputeStructuredCoordinates(
                                  vtkRectilinearGrid *, 
                                  float x[3], int ijk[3]);
    VISIT_VTK_LIGHT_API int         FindCell(vtkDataSet *, float pt[3]);
}

#endif


