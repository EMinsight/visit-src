/*****************************************************************************
*
* Copyright (c) 2000 - 2006, The Regents of the University of California
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

// ************************************************************************* //
//                            avtLineScanFilter.h                            //
// ************************************************************************* //

#ifndef AVT_LINE_SCAN_FILTER_H
#define AVT_LINE_SCAN_FILTER_H


#include <avtStreamer.h>
#include <filters_exports.h>
#include <string>


// ****************************************************************************
//  Class: avtLineScanFilter
//
//  Purpose:
//      This should really be a query, not a filter.  It sums all of the values
//      for a variable.
//
//  Programmer: Hank Childs
//  Creation:   July 6, 2006
//
//  Modifications:
//
//    Hank Childs, Fri Jul 28 09:44:24 PDT 2006
//    Added CylindricalExecute.
//
// ****************************************************************************

class AVTFILTERS_API avtLineScanFilter : public avtStreamer
{
  public:
                                    avtLineScanFilter();
    virtual                        ~avtLineScanFilter();

    void                            SetNumberOfLines(int);

    virtual const char             *GetType(void)
                                             { return "avtLineScanFilter"; };
    virtual const char             *GetDescription(void)
                                             { return "Scanning lines"; };
    virtual void                    RefashionDataObjectInfo(void);
    virtual void                    SetRandomSeed(int s) { seed = s; };

  protected:
    int                             nLines;
    int                             seed;
    double                         *lines;

    virtual void                    PreExecute(void);
    virtual void                    PostExecute(void);

    virtual vtkDataSet             *ExecuteData(vtkDataSet *, int,std::string);
    virtual vtkDataSet             *CartesianExecute(vtkDataSet *);
    virtual vtkDataSet             *CylindricalExecute(vtkDataSet *);
};


#endif


