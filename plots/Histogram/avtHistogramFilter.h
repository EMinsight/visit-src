/*****************************************************************************
*
* Copyright (c) 2000 - 2014, Lawrence Livermore National Security, LLC
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
//                           avtHistogramFilter.h                            //
// ************************************************************************* //

#ifndef AVT_Histogram_FILTER_H
#define AVT_Histogram_FILTER_H

#include <avtDataTreeIterator.h>

#include <HistogramAttributes.h>


// ****************************************************************************
//  Class: avtHistogramFilter
//
//  Purpose:
//      This operator is the implied operator associated with an Histogram plot.
//
//  Programmer: childs -- generated by xml2info
//  Creation:   Thu Jun 26 09:04:54 PDT 2003
//
//  Modifications:
//
//    Hank Childs, Sat Oct 18 12:14:32 PDT 2003
//    Added ModifyContract to disable ghost zone generation.
//
//    Hank Childs, Wed May 24 10:00:12 PDT 2006
//    Added support for array variables.
//
//    Cyrus Harrison, Fri Mar  9 09:11:34 PST 2007
//    Added support for point histograms and true "Frequency" histograms
//
//    Dave Pugmire, Thu Nov 01 12:39:07 EDT 2007
//    Support for log, sqrt scaling.        
//
//    Hank Childs, Tue Dec 11 20:25:22 PST 2007
//    Added support for weighting by a variable.
//
//    Eric Brugger, Mon Aug  2 13:00:36 PDT 2010
//    I changed the data type of workingRange from double to float to avoid
//    a problem where the raw data to be processed may be outside of the
//    working range.
//
//    Kevin Bensema, Mon Nov 11 12:42 2013
//    Modified ScaleBins to compute CDFs and normalization.
//
//    Eric Brugger, Tue Aug 19 10:28:00 PDT 2014
//    Modified the class to work with avtDataRepresentation.
//
// ****************************************************************************

class avtHistogramFilter : public avtDataTreeIterator
{
  public:
                              avtHistogramFilter();
    virtual                  ~avtHistogramFilter();

    virtual const char       *GetType(void)   { return "avtHistogramFilter"; };
    virtual const char       *GetDescription(void)
                                  { return "Performing Histogram"; };

    void                      SetAttributes(const HistogramAttributes &);
   
  protected:
    HistogramAttributes       atts;
    float                    *bins;
    float                     binStep, logBinStep, sqrtBinStep;
    double                    dataValueRange[2];
    float                     workingRange[2];
    double                    logWorkingRange[2], sqrtWorkingRange[2];
    int                       workingNumBins;

    virtual avtDataRepresentation *ExecuteData(avtDataRepresentation *);
    virtual void              UpdateDataObjectInfo(void);
    virtual void              PreExecute();
    virtual void              PostExecute();
    virtual avtContract_p     ModifyContract(avtContract_p);
    virtual bool              ThreadSafe(void);

    virtual void              FreqzExecute(vtkDataSet *);
    virtual void              WeightedExecute(vtkDataSet *);
    virtual void              VariableExecute(vtkDataSet *);
    virtual void              ArrayVarExecute(vtkDataSet *, int);

    virtual int               ComputeBinIndex( const float &value ) const;
    virtual void              ScaleBins();
    virtual void              SetWorkingMin( double dataMin );
    virtual double            GetWorkingMin() const;
    virtual void              SetWorkingMax( double dataMax );
    virtual double            GetWorkingMax() const;
    virtual void              SetWorkingNumBins( int n );
};


#endif


