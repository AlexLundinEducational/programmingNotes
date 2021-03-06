--Alex Lundin
--06/26/2018
------------------------------------------------------------------------------------------------------------------------------------------------------------
-- AutoCAD Core Console has limited capabilities in terms of what scripts are allowed to do.
-- Don't expect to be able to do everything that LISP has to offer inside AutoCAD Core Console.

-- What commands are avaiaible?
-- I stored the entire list at the end of this file, they are from Kean's research and are not my ideas[1].
-- Kean Walmsley has a great blog post summarizing what commands are allowed.
-- He chooses to program in .NET, which is another option, I choose to program in LISP.
-- Both options are API calls (Application Programmer Interfaces) into AutoCAD's system architecture.
-- He discovered his findings on what commands are avaiable in AutoCAD Core Console
-- by using some of his .NET programs.
-- The same thing could be done in LISP, so don't be scared if his code is different from what you are used to.
-- He's already done the research, so see his post if your curious how he determined what commands are avaiable.
-- I'll store the entire list at the end of this text file too[1].
http://www.keanw.com/2012/03/commands-that-work-in-the-autocad-2013-core-console.html



References
[1] Through the Interface. (2018). Commands that “work” in the AutoCAD 2013 Core Console. 
	[online] Available at: http://www.keanw.com/2012/03/commands-that-work-in-the-autocad-2013-core-console.html [Accessed 26 Jun. 2018].
	
	
[1] Entire Command List from Kean's article
?, +CONSTRAINTSETTINGS, +PUBLISH, +SAVEAS, +UCSMAN, +VPORTS, 3DALIGN, 3DCLIP, -3DCONFIG, 3DCONFIG, 3DCORBIT, 
3DDISTANCE, 3DDWF, 3DDWFPUBLISH, 3DEDITBAR, 3DFACE, 3DFLY, 3DFORBIT, 3DMESH, 3DMOVE, 3DORBIT, 3DORBITCTR, 
3DORBITTRANSPARENT, -3DOSNAP, 3DOSNAP, 3DPAN, 3DPAN2, 3DPANTRANSPARENT, 3DPOLY, 3DROTATE, 3DSCALE, 3DSWIVEL, 
3DSWIVELTRANSPARENT, 3DWALK, 3DZOOM, 3DZOOM2, 3DZOOMTRANSPARENT, ABOUT, ACADWBLOCKDIALOG, ACGZDRAGACTION, 
ACISIN, ACISOUT, ACTMDRAGACTION, ACUCSEDITACTION, ADDSELECTED, AECDISPLAYMANAGERCONFIGSSELECTION, 
-AECDWGUNITS, -AECEXPORTTOAUTOCAD, AECFILEOPENMESSAGE, AECFILESAVEMESSAGE, AECOBJECTCOPYMESSAGE, 
AECOBJRELDUMP, AECOBJRELSHOW, AECOBJRELUPDATE, AECPOSTDXFINFIX, AECSETXREFCONFIG, AECVERSION, AI_EMPTYPRINC, 
AI_MOLC, AI_VIEWPORTS_ALERT, AIDIMFLIPARROW, AIDIMPREC, AIDIMSTYLE, AIDIMTEXTMOVE, AIMLEADEREDITADD, 
AIMLEADEREDITREMOVE, AIOBJECTSCALEADD, AIOBJECTSCALEREMOVE, ALIGN, ALLPLAY, AMECONVERT, ANNORESET, 
ANNOUPDATE, APERTURE, ARC, AREA, -ARRAY, ARRAY, -ARRAYCLOSE, ARRAYCLOSE, ARRAYEDIT, ARRAYPATH, ARRAYPOLAR, 
ARRAYRECT, ARX, -ATTDEF, ATTDEF, ATTDISP, -ATTEDIT, ATTEDIT, -ATTEXT, ATTEXT, AUDIT, AUTOCOMPLETE, 
AUTOCONSTRAIN, AUTOPUBLISH, BASE, -BHATCH, BHATCH, BLEND, -BLOCK, BLOCK, BLOOKUPTABLE, BMAKE, BMOD, BMPOUT, 
-BOUNDARY, BOUNDARY, BOX, BPOLY, BREAK, BREP, CAL, CELLSELECT, CHAMFER, CHAMFEREDGE, CHANGE, CHPROP, CIRCLE, 
CLASSICGROUP, CLASSICXREF, CLEANSCREENOFF, CLEANSCREENON, CLIP, CLOSEALL, -COLOR, COLOR, COMPILE, CONE, 
CONSTRAINTBAR, CONSTRAINTSETTINGS, CONVERT, CONVERTPOLY, CONVTONURBS, CONVTOSOLID, CONVTOSURFACE, COPY, 
COPYBASE, COPYCLIP, COPYHIST, COPYLINK, -COPYTOLAYER, COPYTOLAYER, CUTCLIP, CVADD, CVHIDE, -CVREBUILD, 
CVREBUILD, CVREMOVE, CVSHOW, CYLINDER, -DATAEXTRACTION, DATAEXTRACTION, DATALINK, DATALINKUPDATE, DBLIST, 
DCALIGNED, DCANGULAR, DCCONVERT, DCDIAMETER, DCDISPLAY, DCFORM, DCHORIZONTAL, DCLINEAR, DCRADIUS, DCVERTICAL, 
DDEDIT, DELAY, DELCONSTRAINT, DGNADJUST, DGNLAYERS, DIM, DIM1, DIMALIGNED, DIMANGULAR, DIMARC, DIMBASELINE, 
DIMBREAK, DIMCENTER, DIMCONSTRAINT, DIMCONTINUE, DIMDIAMETER, DIMDISASSOCIATE, DIMEDIT, DIMHORIZONTAL, 
-DIMINSPECT, DIMINSPECT, DIMJOGGED, DIMJOGLINE, DIMLINEAR, DIMORDINATE, DIMOVERRIDE, DIMRADIUS, 
DIMREASSOCIATE, DIMREGEN, DIMROTATED, DIMSPACE, -DIMSTYLE, DIMSTYLE, DIMTEDIT, DIMVERTICAL, DIST, 
DISTANTLIGHT, DIVIDE, DONUT, DOUGHNUT, DRAGMODE, DRAWORDER, DROPGEOM, DTEXT, DUMPCMDS, DVIEW, -DWFADJUST, 
DWFADJUST, -DWFATTACH, DWFATTACH, DWFCLIP, DWFFORMAT, DWFLAYERS, DXBIN, DXFIN, DXFOUT, -EATTEXT, EATTEXT, 
EDGESURF, EDITTABLECELL, ELEV, ELLIPSE, END, EPLOTEXT, ERASE, EXPLODE, -EXPORT, EXPORT, EXPORTDWF, 
EXPORTDWFX, EXPORTPDF, EXPORTSETTINGS, EXTEND, EXTRUDE, FILEOPEN, FILL, FILLET, FILLETEDGE, FLATSHOT, 
FREESPOT, FREEWEB, GCCOINCIDENT, GCCOLLINEAR, GCCONCENTRIC, GCEQUAL, GCFIX, GCHORIZONTAL, GCPARALLEL, 
GCPERPENDICULAR, GCSMOOTH, GCSYMMETRIC, GCTANGENT, GCVERTICAL, GEOMCONSTRAINT, GRADIENT, -GRAPHICSCONFIG, 
GRAPHICSCONFIG, GRAPHSCR, GRID, -GROUP, GROUP, GROUPEDIT, -HATCH, HATCH, -HATCHEDIT, HATCHEDIT, 
HATCHGENERATEBOUNDARY, HATCHSETBOUNDARY, HATCHSETORIGIN, HATCHTOBACK, HELIX, HELP, HIDE, HIDEOBJECTS, ID, 
-IMAGE, -IMAGEADJUST, IMAGECLIP, IMAGEQUALITY, IMPLIEDFACEX, IMPORT, IMPRINT, -INSERT, INSERT, -INTERFERE, 
INTERFERE, INTERSECT, ISOLATEOBJECTS, ISOPLANE, JOIN, JPGOUT, JUSTIFYTEXT, LAYCUR, -LAYDEL, LAYDEL, -LAYER, 
LAYERCLOSE, LAYERP, LAYERPMODE, LAYFRZ, LAYISO, LAYLCK, -LAYMCH, LAYMCH, LAYMCUR, -LAYMRG, LAYMRG, LAYOFF, 
LAYON, -LAYOUT, LAYOUT, LAYTHW, LAYULK, LAYUNISO, LAYVPI, LEADER, LENGTHEN, LIGHT, LIMITS, LINE, -LINETYPE, 
LINETYPE, LIST, LIVESECTION, LOAD, LOFT, LOGFILEOFF, LOGFILEON, LTSCALE, -LWEIGHT, LWEIGHT, MASSPROP, 
MATCHCELL, MEASURE, MEASUREGEOM, MESH, MESHCAP, MESHCOLLAPSE, MESHCREASE, MESHEXTRUDE, MESHMERGE, 
MESHOPTIONS, MESHPRIMITIVEOPTIONS, MESHREFINE, MESHSMOOTH, MESHSMOOTHLESS, MESHSMOOTHMORE, MESHSPIN, 
MESHSPLIT, MESHUNCREASE, MINSERT, MIRROR, MIRROR3D, MLEADER, MLEADERALIGN, MLEADERCOLLECT, 
MLEADERCONTENTEDIT, MLEADEREDIT, MLINE, MODEL, MOVE, MREDO, MTEDIT, -MTEXT, MTEXT, MTPROP, MULTIPLE, NAVBAR, 
NAVVCUBE, NCOPY, NETLOAD, NEW, -OBJECTSCALE, OFFSET, OOPS, OPEN, OPTCHPROP, ORTHO, -OSNAP, OSNAP, -OVERKILL, 
PAGESETUP, -PAN, -PARAMETERS, PARAMETERS, PARAMETERSCLOSE, -PARTIALOAD, PARTIALOAD, -PARTIALOPEN, PASTEBLOCK, 
PASTEORIG, PEDIT, PFACE, PLAN, PLANESURF, PLINE, -PLOT, PLOT, -PLOTSTAMP, -PLOTSTYLE, PNGOUT, POINT, 
POINTLIGHT, POLYGON, POLYSOLID, PRESSPULL, PREVIEW, PROJECTGEOMETRY, -PSETUPIN, PSETUPIN, PSFILL, PSOUT, 
PSPACE, -PUBLISH, PUBLISH, -PURGE, PURGE, PYRAMID, QDIM, QLEADER, QNEW, QSAVE, QTEXT, RAY, RECOVER, RECTANG, 
RECTANGLE, REDO, REDRAW, REDRAWALL, REGEN, REGEN3, REGENALL, REGENAUTO, REGION, -RENAME, RENAME, RESETBLOCK, 
RESUME, REVCLOUD, REVERSE, REVOLVE, REVSURF, ROTATE, ROTATE3D, RULESURF, SAVE, SAVEAS, SCALE, -SCALELISTEDIT, 
SCALETEXT, SCRIPT, SECTION, SECTIONPLANE, SECTIONPLANEJOG, SECTIONPLANESETTINGS, SECTIONPLANETOBLOCK, SELECT, 
SELECTSIMILAR, SEQUENCEPLAY, SETBYLAYER, SETVAR, -SHADE, SHADE, -SHADEMODE, SHADEMODE, SHAPE, SKETCH, SLICE, 
SNAP, SOLDRAW, SOLID, SOLIDEDIT, SOLPROF, SOLVIEW, SPACEMOUSEACTION, SPACETRANS, SPHERE, SPLINE, SPLINEDIT, 
SPOTLIGHT, STLOUT, STRETCH, -STYLE, STYLE, SUBTRACT, SURFBLEND, SURFEXTEND, SURFEXTRACTCURVE, SURFFILLET, 
SURFNETWORK, SURFOFFSET, SURFPATCH, SURFSCULPT, SURFTRIM, SURFUNTRIM, SWEEP, -TABLE, TABLE, TABLEDIT, 
TABLEEXPORT, TABLESTYLE, TABLET, TABSURF, TARGETPOINT, -TEXT, TEXT, TEXTEDIT, TEXTSCR, TEXTTOFRONT, THICKEN, 
TIFOUT, TIME, TINSERT, TOLERANCE, TORUS, TRACE, TRANSPARENCY, TRIM, U, UCS, UCSICON, UCSMAN, UNDEFINE, UNDO, 
UNGROUP, UNION, UNISOLATEOBJECTS, -UNITS, UNITS, UPDATETHUMBSNOW, -VIEW, VIEWBACK, VIEWCUBEACTION, 
VIEWFORWARD, VIEWGO, VIEWPLAY, VIEWPLOTDETAILS, VIEWPORTS, VIEWRES, -VISUALSTYLES, VPCLIP, VPLAYER, VPMAX, 
VPMIN, -VPORTS, VPORTS, VSCURRENT, VSSAVE, WALKFLYSETTINGS, -WBLOCK, WBLOCK, WEBLIGHT, WEDGE, WHOHAS, 
WIPEOUT, WMFIN, WMFOUT, -XBIND, XBIND, XCLIP, XEDGES, XLINE, XOPEN, -XREF, XREF, ZOOM.