/*****************************************************************************
*
* Copyright (c) 2000 - 2016, Lawrence Livermore National Security, LLC
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

#ifndef PY_FIVEFOLDTETSUBDIVISIONATTRIBUTES_H
#define PY_FIVEFOLDTETSUBDIVISIONATTRIBUTES_H
#include <Python.h>
#include <FiveFoldTetSubdivisionAttributes.h>

//
// Functions exposed to the VisIt module.
//
#define FIVEFOLDTETSUBDIVISIONATTRIBUTES_NMETH 18
void           PyFiveFoldTetSubdivisionAttributes_StartUp(FiveFoldTetSubdivisionAttributes *subj, void *data);
void           PyFiveFoldTetSubdivisionAttributes_CloseDown();
PyMethodDef *  PyFiveFoldTetSubdivisionAttributes_GetMethodTable(int *nMethods);
bool           PyFiveFoldTetSubdivisionAttributes_Check(PyObject *obj);
FiveFoldTetSubdivisionAttributes *  PyFiveFoldTetSubdivisionAttributes_FromPyObject(PyObject *obj);
PyObject *     PyFiveFoldTetSubdivisionAttributes_New();
PyObject *     PyFiveFoldTetSubdivisionAttributes_Wrap(const FiveFoldTetSubdivisionAttributes *attr);
void           PyFiveFoldTetSubdivisionAttributes_SetParent(PyObject *obj, PyObject *parent);
void           PyFiveFoldTetSubdivisionAttributes_SetDefaults(const FiveFoldTetSubdivisionAttributes *atts);
std::string    PyFiveFoldTetSubdivisionAttributes_GetLogString();
std::string    PyFiveFoldTetSubdivisionAttributes_ToString(const FiveFoldTetSubdivisionAttributes *, const char *);
PyObject *     PyFiveFoldTetSubdivisionAttributes_getattr(PyObject *self, char *name);
int            PyFiveFoldTetSubdivisionAttributes_setattr(PyObject *self, char *name, PyObject *args);
extern PyMethodDef PyFiveFoldTetSubdivisionAttributes_methods[FIVEFOLDTETSUBDIVISIONATTRIBUTES_NMETH];

#endif

