# this section should go in its own "prepare windows type cmake file"
IF (MSVC_VERSION)
  SET(ERRMSG "You have chosen a compiler version not currently supported.  You will need to build all dependent 3rd party libraries with this compiler, and provide the correct locations for them.")
  MESSAGE(STATUS "MSVC_VERSION=${MSVC_VERSION}")
  IF (MSVC_VERSION EQUAL "1800")
      SET(VISIT_MSVC_VERSION "MSVC2013")
  ELSEIF (MSVC_VERSION EQUAL "1700")
      SET(VISIT_MSVC_VERSION "MSVC2012")
      VISIT_OPTION_DEFAULT(VISIT_ENABLE_XDB ON TYPE BOOL)
  ELSEIF(MSVC_VERSION GREATER_EQUAL "1910")
      SET(VISIT_MSVC_VERSION "MSVC2017")
  ELSE()
      MESSAGE(SEND_ERROR "${ERRMSG}")
  ENDIF()
ELSE (MSVC_VERSION)
  MESSAGE(SEND_ERROR "${ERRMSG}")
ENDIF(MSVC_VERSION)

# this can be left in generic_windows.cmake, but allow user to
# have their own config-site file

IF (CMAKE_CL_64 AND MSVC_VERSION LESS "1910")
    SET(VISIT_MSVC_VERSION "${VISIT_MSVC_VERSION}-x64")
ENDIF ()
MESSAGE(STATUS "Prebuilt library directory name: ${VISIT_MSVC_VERSION}")

IF(NOT DEFINED VISIT_WINDOWS_DIR)
    IF(EXISTS ${VISIT_SOURCE_DIR}/../windowsbuild)
        SET(VISIT_WINDOWS_DIR ${VISIT_SOURCE_DIR}/../windowsbuild)
    ELSE()
        message(FATAL_ERROR "Please set VISIT_WINDOWS_DIR to location of 'windowsbuild' files")
    ENDIF()
ENDIF()
get_filename_component(VISIT_WINDOWS_DIR ${VISIT_WINDOWS_DIR} ABSOLUTE)
SET(VISITHOME ${VISIT_WINDOWS_DIR}/${VISIT_MSVC_VERSION})


# Create the NSIS installer package (override default from root CMakeLists.txt
OPTION(VISIT_MAKE_NSIS_INSTALLER "Create an installer package using NSIS." ON)
VISIT_OPTION_DEFAULT(VISIT_USE_7ZIP true TYPE BOOL)

##############################################################
##
## Required libraries
##
##############################################################

##
## BOOST
##
VISIT_OPTION_DEFAULT(VISIT_BOOST_DIR ${VISITHOME}/boost_minimal_headers/1.60.0)


##
## VTK
##
if (MSVC_VERSION LESS "1910")
  VISIT_OPTION_DEFAULT(VISIT_VTK_DIR  ${VISITHOME}/vtk-qt5/${VTK_VERSION})
else()
  VISIT_OPTION_DEFAULT(VISIT_VTK_DIR  ${VISITHOME}/vtk/${VTK_VERSION})
endif()

##
## QT
##
VISIT_OPTION_DEFAULT(VISIT_QT5 true TYPE BOOL)
if (MSVC_VERSION LESS "1910")
  VISIT_OPTION_DEFAULT(VISIT_QT_DIR     ${VISITHOME}/Qt/5.6.1)
else()
  VISIT_OPTION_DEFAULT(VISIT_QT_DIR     ${VISITHOME}/Qt/5.6.3)
endif()

##
## QWT
##
VISIT_OPTION_DEFAULT(VISIT_QWT_DIR     ${VISITHOME}/Qwt/6.1.2)

##
## PYTHON
##
if (MSVC_VERSION LESS "1910")
  VISIT_OPTION_DEFAULT(VISIT_PYTHON_DIR ${VISITHOME}/python/2.7.11)
else()
  VISIT_OPTION_DEFAULT(VISIT_PYTHON_DIR ${VISITHOME}/python/2.7.14)
endif()

##
## PYSIDE
##
VISIT_OPTION_DEFAULT(VISIT_PYSIDE_DIR ${VISITHOME}/PySide/2.0.0-2017.08.30)


##############################################################
##
## Some misc libraries Database readers may depend upon
##
##############################################################

##
## JPEG
##
IF(MSVC12)
  IF (CMAKE_CL_64)
     set(JPEG_LIBNAME_PREFIX_LIB false CACHE INTERNAL "Is 'lib' prefixed to jpeg libname")
    VISIT_OPTION_DEFAULT(VISIT_JPEG_DIR     ${VISITHOME}/jpeg/9a)
    SET(JPEGVER "9a")
  ENDIF()
ELSEIF(MSVC11)
  IF (CMAKE_CL_64)
     set(JPEG_LIBNAME_PREFIX_LIB false CACHE INTERNAL "Is 'lib' prefixed to jpeg libname")
    VISIT_OPTION_DEFAULT(VISIT_JPEG_DIR     ${VISITHOME}/jpeg/9)
  ENDIF()
elseif(MSVC_VERSION GREATER_EQUAL "1910")
     set(JPEG_LIBNAME_PREFIX_LIB false CACHE INTERNAL "Is 'lib' prefixed to jpeg libname")
    VISIT_OPTION_DEFAULT(VISIT_JPEG_DIR     ${VISITHOME}/jpeg/9b)
ENDIF()

##
## SZIP
##
SET(SZIP_LIB_NAME "szip")
if(MSVC_VERSION LESS "1910")
  VISIT_OPTION_DEFAULT(VISIT_SZIP_DIR     ${VISITHOME}/szip/2.1)
else()
  VISIT_OPTION_DEFAULT(VISIT_SZIP_DIR     ${VISITHOME}/szip/2.1.1)
endif()

##
## ZLIB
##
SET(ZLIB_LIB_NAME "zlib")
if(MSVC_VERSION LESS "1910")
  VISIT_OPTION_DEFAULT(VISIT_ZLIB_DIR     ${VISITHOME}/zlib/1.2.8)
else()
  VISIT_OPTION_DEFAULT(VISIT_ZLIB_DIR     ${VISITHOME}/zlib/1.2.11)
endif()

##############################################################
##
## Database reader plugin support libraries
##
## For libraries with LIBDEP settings, order matters.
## Libraries with LIBDEP settings that depend on other
## Library's LIBDEP settings must come after them.
##############################################################

##
## HDF4
##
set(HDF4_LIBNAMES_AFFIX_DLL false CACHE INTERNAL "Is 'dll' appended to hdf4 libnames")
IF(MSVC12)
  VISIT_OPTION_DEFAULT(VISIT_HDF4_DIR     ${VISITHOME}/hdf4/4.2.10)
  VISIT_OPTION_DEFAULT(VISIT_HDF4_LIBDEP  
      JPEG_LIBRARY_DIR JPEG_LIB
      SZIP_LIBRARY_DIR SZIP_LIB
      ZLIB_LIBRARY_DIR ZLIB_LIBRARY
      TYPE STRING
  )
ELSEIF(MSVC11)
  VISIT_OPTION_DEFAULT(VISIT_HDF4_DIR     ${VISITHOME}/hdf4/4.2.10)
  VISIT_OPTION_DEFAULT(VISIT_HDF4_LIBDEP  
      VTK_LIBRARY_DIRS vtkjpeg-${VTK_MAJOR_VERSION}.${VTK_MINOR_VERSION}
      SZIP_LIBRARY_DIR SZIP_LIB 
      ZLIB_LIBRARY_DIR ZLIB_LIBRARY
      TYPE STRING
  )
elseif(MSVC_VERSION LESS "1910")
  VISIT_OPTION_DEFAULT(VISIT_HDF4_DIR     ${VISITHOME}/hdf/4.2.13)
  VISIT_OPTION_DEFAULT(VISIT_HDF4_LIBDEP  
      JPEG_LIBRARY_DIR JPEG_LIB
      SZIP_LIBRARY_DIR SZIP_LIB
      ZLIB_LIBRARY_DIR ZLIB_LIBRARY
      TYPE STRING
  )

ENDIF()

##
## HDF5
##
if(MSVC_VERSION LESS "1910")
  set(VISIT_HDF5_VERSION "1.8.14")
else()
  set(VISIT_HDF5_VERSION "1.8.19")
endif()
VISIT_OPTION_DEFAULT(HDF5_LIBNAMES_AFFIX_DLL OFF TYPE BOOL)
VISIT_OPTION_DEFAULT(VISIT_HDF5_DIR     ${VISITHOME}/hdf5/${VISIT_HDF5_VERSION})
VISIT_OPTION_DEFAULT(VISIT_HDF5_LIBDEP  
    SZIP_LIBRARY_DIR SZIP_LIB 
    ZLIB_LIBRARY_DIR ZLIB_LIBRARY
    TYPE STRING
)

##
## CONDUIT
##
if(MSVC_VERSION LESS "1910")
VISIT_OPTION_DEFAULT(VISIT_CONDUIT_DIR ${VISITHOME}/conduit/v0.3.0)
VISIT_OPTION_DEFAULT(VISIT_CONDUIT_LIBDEP  
    HDF5_LIBRARY_DIR HDF5_LIB ${VISIT_HDF5_LIBDEP} TYPE STRING)
endif()

##
## NETCDF
##
if(MSVC_VERSION LESS "1910")
  VISIT_OPTION_DEFAULT(VISIT_NETCDF_DIR   ${VISITHOME}/netcdf/4.1.1)
else()
  VISIT_OPTION_DEFAULT(VISIT_NETCDF_DIR   ${VISITHOME}/netcdf/4.5.0)
endif()
VISIT_OPTION_DEFAULT(VISIT_NETCDF_LIBDEP 
    HDF5_LIBRARY_DIR HDF5_LIB ${VISIT_HDF5_LIBDEP}
    TYPE STRING
)

##
## BOXLIB
##
VISIT_OPTION_DEFAULT(VISIT_BOXLIB_DIR ${VISITHOME}/BoxLib/1.3.5)

##
## CCMIO
##
VISIT_OPTION_DEFAULT(VISIT_CCMIO_DIR    ${VISITHOME}/ccmio/2.6.1)

##
## CFITSIO
##
if(MSVC_VERSION EQUAL "1800")
  VISIT_OPTION_DEFAULT(VISIT_CFITSIO_DIR  ${VISITHOME}/cfitsio/3370)
elseif(MSVC_VERSION EQUAL "1700")
  VISIT_OPTION_DEFAULT(VISIT_CFITSIO_DIR  ${VISITHOME}/cfitsio/3006)
elseif(MSVC_VERSION GREATER_EQUAL "1910")
  VISIT_OPTION_DEFAULT(VISIT_CFITSIO_DIR  ${VISITHOME}/cfitsio/3.420)
endif()

##
## CGNS
##
VISIT_OPTION_DEFAULT(VISIT_CGNS_DIR     ${VISITHOME}/cgns/3.2.1)
VISIT_OPTION_DEFAULT(VISIT_CGNS_LIBDEP 
    HDF5_LIBRARY_DIR HDF5_LIB ${VISIT_HDF5_LIBDEP}
    TYPE STRING
)

##
## GDAL
##
if(MSVC_VERSION EQUAL "1800")
    SET(VISIT_GDAL_VERSION "1.11.1")
elseif(MSVC_VERSION EQUAL "1700")
    SET(VISIT_GDAL_VERSION "1.10.0")
elseif(MSVC_VERSION GREATER_EQUAL "1910")
    SET(VISIT_GDAL_VERSION "2.2.2")
endif()
VISIT_OPTION_DEFAULT(VISIT_GDAL_DIR     ${VISITHOME}/gdal/${VISIT_GDAL_VERSION})

##
## H5PART
##
VISIT_OPTION_DEFAULT(VISIT_H5PART_DIR   ${VISITHOME}/h5part/1.6.6)
VISIT_OPTION_DEFAULT(VISIT_H5PART_LIBDEP 
    HDF5_LIBRARY_DIR HDF5_LIB ${VISIT_HDF5_LIBDEP}
    TYPE STRING
)

##
## MFEM
##
VISIT_OPTION_DEFAULT(VISIT_MFEM_DIR     ${VISITHOME}/mfem/3.3)

##
## MILI
##
VISIT_OPTION_DEFAULT(VISIT_MILI_DIR     ${VISITHOME}/Mili/15.1)

##
## SILO
##
VISIT_OPTION_DEFAULT(VISIT_SILO_DIR     ${VISITHOME}/silo/4.10.3)
VISIT_OPTION_DEFAULT(VISIT_SILO_LIBDEP  
    HDF5_LIBRARY_DIR HDF5_LIB ${VISIT_HDF5_LIBDEP}
    TYPE STRING
)

##
## XDMF
##
if (MSVC_VERSION LESS "1910")
    VISIT_OPTION_DEFAULT(VISIT_XDMF_DIR ${VISITHOME}/Xdmf-vtk-qt5/2.1.1)
else()
    VISIT_OPTION_DEFAULT(VISIT_XDMF_DIR ${VISITHOME}/Xdmf/2.1.1)
endif()

VISIT_OPTION_DEFAULT(VISIT_XDMF_LIBDEP 
    HDF5_LIBRARY_DIR HDF5_LIB ${VISIT_HDF5_LIBDEP}
    VTK_LIBRARY_DIRS vtklibxml2-${VTK_MAJOR_VERSION}.${VTK_MINOR_VERSION}
    TYPE STRING)

