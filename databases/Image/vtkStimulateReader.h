/*****************************************************************************
*
* Copyright (c) 2000 - 2015, Lawrence Livermore National Security, LLC
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
//                           vtkStimulateReader.h                            //
// ************************************************************************* //

#ifndef VTK_STIMULATE_READER_H
#define VTK_STIMULATE_READER_H

#include <vtkImageReader2.h>


// ****************************************************************************
//  Class: vtkStimulateReader
//
//  Purpose:
//      Reads the "Stimulate" image format, which is what is generated by
//      the NDE folks in Engineering.
//
//  Programmer: Hank Childs
//  Creation:   March 17, 2005
//
//  Modifications:
//
//    Mark C. Miller, Fri Apr 23 23:32:27 PDT 2010
//    Added tdata and dataType.
// ****************************************************************************

class vtkStimulateReader : public vtkImageReader2
{
public:
  static vtkStimulateReader *New();
  vtkTypeMacro(vtkStimulateReader,vtkImageReader2);

  int CanReadFile(const char* fname); 
  virtual const char* GetFileExtensions()
    {
      return ".sdt .spr .SDT .SPR";
    }

  virtual const char* GetDescriptiveName()
    {
      return "Stimulate";
    }
  
  void GetDimensions(int &x, int &y) { x = dims[0]; y = dims[1]; };
  void GetOrigin(float &x, float &y) { x = origin[0]; y = origin[1]; };
  void GetStep(float &x, float &y) { x = step[0]; y = step[1]; };


protected:
  enum dtype {UCHAR, SHORT, INT, FLOAT};
  int RequestInformation(vtkInformation* request,
                         vtkInformationVector** inputVector,
                         vtkInformationVector* outputVector);
  void ExecuteDataWithInformation(vtkDataObject *, vtkInformation* outInfo);
  virtual int OpenFile(void);
  vtkStimulateReader();
  ~vtkStimulateReader();
private:
  bool     haveReadSPRFile;
  bool     validSPRFile;
  int      dims[2];
  float    origin[2];
  float    step[2];
  dtype    dataType;

  vtkStimulateReader(const vtkStimulateReader&);  // Not implemented.
  void operator=(const vtkStimulateReader&);  // Not implemented.

  bool GetFilenames(const char *, char *spr_name, char *sdt_name);
  bool ReadSPRFile(const char *);
};

#endif


