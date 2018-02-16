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


// ************************************************************************* //
//                            avtparaDIS_tecplotFileFormat.h                           //
// ************************************************************************* //

#ifndef AVT_paraDIS_tecplot_FILE_FORMAT_H
#define AVT_paraDIS_tecplot_FILE_FORMAT_H

#define PARADIS_TECPLOT_VERSION_NUMBER "$Revision: 1.3 $"
#define PARADIS_TECPLOT_VERSION_DATE "$Date: 2008/10/08 00:32:37 $"

#include <avtSTSDFileFormat.h>
#include <vtkUnstructuredGrid.h>
#include <vtkFloatArray.h>
#include "Point.h"
#include <vector>

// ****************************************************************************
//  Class: avtparaDIS_tecplotFileFormat
//
//  Purpose:
//      Reads in paraDIS_tecplot files as a plugin to VisIt.
//
//  Programmer: rcook -- generated by xml2avt
//  Creation:   Fri Sep 26 12:04:51 PDT 2008
//
// ****************************************************************************

class avtparaDIS_tecplotFileFormat : public avtSTSDFileFormat
{
  public:
                       avtparaDIS_tecplotFileFormat(const char *filename);
    virtual           ~avtparaDIS_tecplotFileFormat() {;};

    //
    // This is used to return unconvention data -- ranging from material
    // information to information about block connectivity.
    //
    // virtual void      *GetAuxiliaryData(const char *var, const char *type,
    //                                  void *args, DestructorFunction &);
    //

    //
    // These are used to declare what the current time and cycle are for the
    // file.  These should only be defined if the file format knows what the
    // time and/or cycle is.
    //
    // virtual int       GetCycle(void);
    // virtual double    GetTime(void);
    //

    virtual const char    *GetType(void)   { return "paraDIS_tecplot"; };
    virtual void           FreeUpResources(void); 
    
    void AddCellToMesh(vtkUnstructuredGrid *linemesh, vector<int> &cell);
    vtkDataSet    * GetTecplotMesh(const char *meshname); 
    virtual vtkDataSet    *GetMesh(const char *);
    
    bool  GetTecplotVar(const char *varname, vtkFloatArray *scalars); 
    virtual vtkDataArray  *GetVar(const char *);
    virtual vtkDataArray  *GetVectorVar(const char *);
    
 protected:
    bool ParseTecplotHeader(ifstream &tecplotfile, bool setnumvars=false);
    bool PopulateTecplotMetaData(avtDatabaseMetaData *md); 
    
    // DATA MEMBERS
    std::string mFilename; 
    int mVerbosity; 
    int mProcNum, mNumProcs;
    
    string mFileType; 
    vector<string> mVariableNames; 
    unsigned int mNumElems, mNumPoints, mNumVars; 
    bool mRotateTecplotPoints; 
    rclib::Point<float> mOldOrientation, mNewOrientation; 
    
    virtual void           PopulateDatabaseMetaData(avtDatabaseMetaData *);
};


#endif
