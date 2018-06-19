#ifndef IMAGE_OBJECT_H
#define IMAGE_OBJECT_H
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

// ****************************************************************************
// Class: ImageObject
//
// Purpose:
//   Class for reading and writing image files.
//
// Notes:      
//
// Programmer: Brad Whitlock
// Creation:   Thu Sep 21 17:39:16 PST 2006
//
// Modifications:
//    Kathleen Biagas, Mon Jan 12 16:36:30 PST 2015
//    Add optional 'format' argument to 'Write' method.
//
// ****************************************************************************

class ImageObject
{
public:
    ImageObject();
    ImageObject(const ImageObject &);
    ImageObject(int width, int height);
    ImageObject(int width, int height, int depth);
    ~ImageObject();

    unsigned char *Pixel(int x, int y)
    {
        return pixels + ((y * w) + x) * depth;
    }

    const unsigned char *Pixel(int x, int y) const
    {
        return pixels + ((y * w) + x) * depth;
    }

    int Width() const
    { 
        return w;
    }

    int Height() const
    { 
        return h;
    }

    int Depth() const
    { 
        return depth;
    }

    bool Write(const char *filename, const char *format= 0);
    bool Read(const char *filename);

    void SetAllPixelsToColor(const int *rgb);
    void SetBlockToColor(int x0, int y0, int x1, int y1, const int *rgb);
    void Copy(const ImageObject &);
    void CopyBlock(const ImageObject &, int, int, int, int, int, int);
private:
    int w, h, depth;
    unsigned char *pixels;
};

#endif
