/*****************************************************************************
*
* Copyright (c) 2000 - 2011, Lawrence Livermore National Security, LLC
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
//                            avtDDCMDFileFormat.h                           //
// ************************************************************************* //

#ifndef AVT_DDCMD_FILE_FORMAT_H
#define AVT_DDCMD_FILE_FORMAT_H

#include <avtSTMDFileFormat.h>

#include <string>
#include <vector>

using std::string;
using std::vector;

// ****************************************************************************
//  Class: avtDDCMDFileFormat
//
//  Purpose:
//      Reads in DDCMD files as a plugin to VisIt.
//
//  Programmer: brugger -- generated by xml2avt
//  Creation:   Fri Aug 31 15:27:59 PST 2007
//
//  Modifications:
//    Eric Brugger, Thu Jan  3 11:07:49 PST 2008
//    I changed the destructor so that it is defined in the ".C" file.
//
//    Eric Brugger, Tue Jul 15 15:19:36 PDT 2008
//    I added support for the 'b' field type. This involved adding the method
//    bFieldConvert and the variables labelSize, iSpeciesSize, labelUnsigned
//    and iSpeciesUnsigned.
//
//    Eric Brugger, Thu Nov 20 10:44:45 PST 2008
//    I added the ability to read atom files, which required being able to
//    read multiple files to get all the data.
//
//    Eric Brugger, Fri Dec  5 16:37:44 PST 2008
//    I enhanced the reader to read ascii atom files.
//
// ****************************************************************************

class DDCMDHeader
{
  public:
                           DDCMDHeader(const char *, const char *);
    virtual               ~DDCMDHeader();

    inline unsigned int    GetHeaderLength() const { return headerLength; };
    inline bool            GetCGridFile() const { return cgridFile; };
    inline char           *GetDataType() const { return dataType; };
    inline unsigned int    GetLRec() const { return lRec; };
    inline unsigned int    GetNRecord() const { return nRecord; };
    inline unsigned int    GetNFiles() const { return nFiles; };
    inline unsigned int    GetNFields() const { return nFields; };
    inline unsigned int    GetSwap() const { return swap; };
    inline const double   *GetHMatrix() const { return hMatrix; };
    inline int             GetLoop() const { return loop; };
    inline double          GetTime() const { return time; };
    inline char          **GetFieldNames() const { return fieldNames; };
    inline char          **GetFieldTypes() const { return fieldTypes; };
    inline unsigned int   *GetFieldSizes() const { return fieldSizes; };
    inline unsigned int    GetNXFile() const { return nXFile; };
    inline unsigned int    GetNYFile() const { return nYFile; };
    inline unsigned int    GetNZFile() const { return nZFile; };
    inline unsigned int    GetNSpecies() const { return nSpecies; };
    inline char          **GetSpeciesNames() const { return speciesNames; };
    inline unsigned int    GetNGroups() const { return nGroups; };
    inline char          **GetGroupNames() const { return groupNames; };
    inline unsigned int    GetNTypes() const { return nTypes; };
    inline char          **GetTypeNames() const { return typeNames; };

  private:
    unsigned int           headerLength;
    bool                   cgridFile;
    char                  *dataType;
    unsigned int           lRec, nRecord, nFiles, nFields, swap;
    double                 hMatrix[9];
    int                    loop;
    double                 time;
    char                 **fieldNames, **fieldTypes;
    unsigned int          *fieldSizes;
    unsigned int           nXFile, nYFile, nZFile;
    unsigned int           nSpecies;
    char                 **speciesNames;
    unsigned int           nGroups;
    char                 **groupNames;
    unsigned int           nTypes;
    char                 **typeNames;
};
    
class avtDDCMDFileFormat : public avtSTMDFileFormat
{
  public:
                       avtDDCMDFileFormat(const char *);
    virtual           ~avtDDCMDFileFormat();

    //
    // This is used to return unconvention data -- ranging from material
    // information to information about block connectivity.
    //
    // virtual void      *GetAuxiliaryData(const char *var, int domain,
    //                                     const char *type, void *args, 
    //                                     DestructorFunction &);
    //

    virtual bool           ReturnsValidCycle() const { return true; };
    virtual int            GetCycle(void);
    virtual bool           ReturnsValidTime() const { return true; };
    virtual double         GetTime(void);

    void                   ActivateTimestep(void);

    virtual const char    *GetType(void)   { return "DDCMD"; };
    virtual void           FreeUpResources(void); 

    virtual vtkDataSet    *GetMesh(int, const char *);
    virtual vtkDataArray  *GetVar(int, const char *);
    virtual vtkDataArray  *GetVectorVar(int, const char *);

  protected:
    string                 fname;
    vector<string>         subnames;
    int                    nXFileBlocks, nYFileBlocks, nZFileBlocks, nBlocks;

    // Global header information
    bool                   cgridFile;
    int                    loop;
    double                 time;
    unsigned int           nXFile, nYFile, nZFile;
    unsigned int           nSpecies;
    char                 **speciesNames;
    unsigned int           nGroups;
    char                 **groupNames;
    unsigned int           nTypes;
    char                 **typeNames;

    // Mesh information
    string                 coordsUnit;
    int                    nDims;
    int                    nXMesh, nYMesh, nZMesh;
    int                    nXMeshBlocks, nYMeshBlocks, nZMeshBlocks;
    float                  xMin, yMin, zMin;
    float                  dX, dY, dZ;
    float                  coordsScale;
    int                    nPoints;

    // Block information
    int                    nXBlock, nYBlock, nZBlock;
    int                    nZonesBlock;
    int                    nVarsBlock;
    string                *varNamesBlock;
    float                **varsBlock;
    float                 *coordsBlock;
    unsigned              *pinfoBlock;

    // Variable information
    int                    labelOffset, iSpeciesOffset;
    int                    labelSize, iSpeciesSize;
    bool                   labelUnsigned, iSpeciesUnsigned;
    int                    groupOffset, speciesOffset, typeOffset;
    int                    pinfoOffset, xOffset, yOffset, zOffset;
    int                    pinfoSize, xSize, ySize, zSize;
    char                   pinfoType, xType, yType, zType;
    int                    nVars;
    string                *varNames;
    float                **varValues;
    int                   *varOffsets;
    int                   *varSizes;
    char                  *varTypes;

    // File information
    bool                   dataRead;
    long                  *nRecordsList;
    int                   *fileNumberList;
    off_t                 *fileOffsetList;

    char                  *readProcessorData;

    // Input buffer information
    int                    nInRecords;
    char                  *inProcessorData;

    virtual void           PopulateDatabaseMetaData(avtDatabaseMetaData *);

    void                   Convert(void *, int);
    long long              bFieldConvert(const unsigned char *, int);
    void                   DetermineBlockDecomposition();
    void                   ExchangeProcessorData(const DDCMDHeader *);
    void                   CopyExchangeDataToBlocks(const DDCMDHeader *);
    void                   CopyAsciiDataToBlocks(const DDCMDHeader *);
    void                   CopyBinaryDataToBlocks(const DDCMDHeader *);
    void                   CopyDataToBlocks(const DDCMDHeader *);
    void                   ReadProcessorChunk(const DDCMDHeader *,
                               const char *);
    void                   DetermineProcessorReadOffset(const DDCMDHeader *,
                               const char *);
    vector<DDCMDHeader*>   ReadHeader();
    void                   ParseCGridHeader(const DDCMDHeader *);
    void                   ParseAtomHeader(const DDCMDHeader *);
    void                   ReadCGridData(const DDCMDHeader *, const string &);
    void                   ReadAtomData(const DDCMDHeader *, const string &);
    void                   ReadData(vector<DDCMDHeader*> &);
    vtkDataSet            *GetPointMesh();
    vtkDataSet            *GetRectilinearMesh();
    vtkDataArray          *GetPointVar(const char *);
    vtkDataArray          *GetRectilinearVar(const char *);
};


#endif
