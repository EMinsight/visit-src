/*****************************************************************************
*
* Copyright (c) 2000 - 2017, Lawrence Livermore National Security, LLC
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
//                            avtWellLogsFileFormat.h                           //
// ************************************************************************* //

#ifndef AVT_WellLogs_FILE_FORMAT_H
#define AVT_WellLogs_FILE_FORMAT_H

#include <avtSTSDFileFormat.h>


// ****************************************************************************
//  Class: avtWellLogsFileFormat
//
//  Purpose:
//      Reads in WellLogs files as a plugin to VisIt.
//
//  Programmer: hari -- generated by xml2avt
//  Creation:   Fri Apr 11 23:22:06 PST 2014
//
// ****************************************************************************

class avtWellLogsFileFormat : public avtSTSDFileFormat
{
  public:
                       avtWellLogsFileFormat(const char *filename);
    virtual           ~avtWellLogsFileFormat() {;};

    virtual void      *GetAuxiliaryData(const char *var, const char *type,
                                        void *args, DestructorFunction &);

    //
    // These are used to declare what the current time and cycle are for the
    // file.  These should only be defined if the file format knows what the
    // time and/or cycle is.
    //
    // virtual int       GetCycle(void);
    // virtual double    GetTime(void);
    //

    virtual const char    *GetType(void)   { return "WellLogs"; };
    virtual void           FreeUpResources(void); 

    virtual vtkDataSet    *GetMesh(const char *);
    virtual vtkDataArray  *GetVar(const char *);
    virtual vtkDataArray  *GetVectorVar(const char *);

  protected:
    std::string               wlFilename;
    bool                      haveReadFile;
    std::vector<std::string>  wellNames;
    std::vector<int>          wellIds;
    std::vector<double>       X;
    std::vector<double>       Y;
    std::vector<double>       Z1;
    std::vector<double>       Z2;
    int                       filetype; //type of file being read in..

    void                   ReadFile();
    virtual void           PopulateDatabaseMetaData(avtDatabaseMetaData *);
};


#endif
