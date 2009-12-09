##
## Programs and options...
##
include /Projects/VisIt/src/1.12RC/src/include/make-variables
TOPDIR=/Projects/VisIt/src/1.12RC/src


##
## Libraries and includes...
##
VTK_INCLUDE= \
  -I/Projects/VisIt/src/1.12RC/src/include/vtk \
  -I/Projects/VisIt/src/1.12RC/src/include/vtk/Common \
  -I/Projects/VisIt/src/1.12RC/src/include/vtk/Filtering \
  -I/Projects/VisIt/src/1.12RC/src/include/vtk/Graphics \
  -I/Projects/VisIt/src/1.12RC/src/include/vtk/Hybrid \
  -I/Projects/VisIt/src/1.12RC/src/include/vtk/IO \
  -I/Projects/VisIt/src/1.12RC/src/include/vtk/Imaging \
  -I/Projects/VisIt/src/1.12RC/src/include/vtk/Rendering \
  -I/Projects/VisIt/src/1.12RC/src/include/vtk/Utilities
CXXFLAGS=$(CXXFLAGSORIG) $(HDF5_INCLUDE)
CPPFLAGS=$(CPPFLAGSORIG) $(VTK_INCLUDE) -I. -I/Projects/VisIt/src/1.12RC/src/include -I/Projects/VisIt/src/1.12RC/src/include/mesa -I/Projects/VisIt/src/1.12RC/src/include/visit $(PY_CXXFLAGS)
LDFLAGS=$(LDFLAGSORIG) $(PLUGIN_LDFLAGS) -L/Projects/VisIt/src/1.12RC/src/plugins/databases

##
## Files...
##
PLUGINDIR=databases
PLUGINNAME=M3DC1Database

WIDGETS=
VIEWERWIDGETS=
ISRC=M3DC1PluginInfo.C
COMMONSRC=M3DC1PluginInfo.C M3DC1CommonPluginInfo.C avtM3DC1Options.C
MSRC=M3DC1MDServerPluginInfo.C avtM3DC1FileFormat.C
ESRC=M3DC1EnginePluginInfo.C avtM3DC1FileFormat.C


SRC=$(ISRC) $(COMMONSRC) $(MSRC) $(ESRC)

SHLIB_FORCED=$(HDF5_LIB) $(ZLIB_LIB) 

ELIBS_FOR_MACOSX_PREBINDING=$(ZLIB_LIB) $(GLEW_LIBS) $(MESA_LIBS) $(GL_LIBS)
MLIBS_FOR_MACOSX_PREBINDING=$(GLEW_LIBS) $(ZLIB_LIB) $(MESA_LIBS) $(GL_LIBS)
ILIBS=
MLIBS=-lpipeline_ser -ldatabase_ser -lmir_ser -lavtmath_ser -ldbatts -lavtexceptions -lstate -lmisc -lcomm -lexpr -lparser -lutility -lplugin -lvisit_vtk -llightweight_visit_vtk  $(MLIBS_FOR_MACOSX_PREBINDING) $(VTK_LIBS)
ESERLIBS=-lpipeline_ser -ldatabase_ser -lmir_ser -lavtmath_ser -ldbatts -lavtexceptions -lstate -lcomm -lmisc -lexpr -lparser -lplugin -lutility -lvisit_vtk -llightweight_visit_vtk $(ELIBS_FOR_MACOSX_PREBINDING) $(VTK_LIBS)
EPARLIBS=-lpipeline_par -ldatabase_par -lmir_par -lavtmath_par -ldbatts -lavtexceptions -lstate -lcomm -lmisc -lexpr -lparser -lplugin -lutility -lvisit_vtk -llightweight_visit_vtk $(ELIBS_FOR_MACOSX_PREBINDING) $(VTK_LIBS) $(SHLIB_MPI_LIBS)

IDSO=/Projects/VisIt/src/1.12RC/src/plugins/databases/libIM3DC1Database.dylib
MDSO=/Projects/VisIt/src/1.12RC/src/plugins/databases/libMM3DC1Database.dylib
ESERDSO=/Projects/VisIt/src/1.12RC/src/plugins/databases/libEM3DC1Database_ser.dylib
EPARDSO=/Projects/VisIt/src/1.12RC/src/plugins/databases/libEM3DC1Database_par.dylib


DISTRIB=

##
## Derived objects
##
IOBJ_tmp=$(ISRC:.C=.o)
GOBJ_tmp=$(COMMONSRC:.C=.o) $(GSRC:.C=.o)
SOBJ_tmp=$(COMMONSRC:.C=.o) $(SSRC:.C=.o)
VOBJ_tmp=$(COMMONSRC:.C=.o) $(VSRC:.C=.o)
MOBJ_tmp=$(COMMONSRC:.C=.o) $(MSRC:.C=.o) $(MSPECIFICSRC:.C=_mds.o)
ESEROBJ_tmp=$(COMMONSRC:.C=.o) $(ESRC:.C=.o)     $(ESPECIFICSRC:.C=_eng.o)
EPAROBJ_tmp=$(COMMONSRC:.C=.o) $(ESRC:.C=_par.o) $(ESPECIFICSRC:.C=_par_eng.o)

IOBJ=$(IOBJ_tmp:.c=.o)
GOBJ=$(GOBJ_tmp:.c=.o)
SOBJ=$(SOBJ_tmp:.c=.o)
VOBJ=$(VOBJ_tmp:.c=.o)
MOBJ=$(MOBJ_tmp:.c=.o)
ESEROBJ=$(ESEROBJ_tmp:.c=.o)
EPAROBJ=$(EPAROBJ_tmp:.c=.o)

MOCSRC = $(WIDGETS:.h=_moc.C)
MOCOBJ = $(MOCSRC:.C=.o)

VIEWERMOCSRC = $(VIEWERWIDGETS:.h=_moc.C)
VIEWERMOCOBJ = $(VIEWERMOCSRC:.C=.o)

##
## Standard targets...
##
all: message $(IDSO) $(MDSERVERLIB) $(ENGINELIBSER) $(ENGINELIBPAR)

clean:
	$(RM) $(IOBJ) $(COMMONOBJ)
	$(RM) $(GOBJ) $(SOBJ) $(VOBJ) $(MOBJ) $(ESEROBJ) $(EPAROBJ)
	$(RM) $(MOCSRC) $(MOCOBJ) $(VIEWERMOCSRC) $(VIEWERMOCOBJ)
	$(RM) $(IDSO) $(GDSO) $(SDSO) $(VDSO) $(MDSO) $(ESERDSO) $(EPARDSO)
	$(RM) $(JAVAOBJ)

##
## Other targets...
##
message:
	@echo
	@echo "****************************************************************************"
	@echo "*** Building avtM3DC1 Database Plugin"
	@echo "****************************************************************************"

##
## Automatic dependency stuff
##
include /Projects/VisIt/src/1.12RC/src/include/make-targets
