@echo off
FOR /R %%f IN (..\Input-Files\*.dwg) DO (

REM export jpg without any formatting
REM core-export-jpg-no-formatting
REM "C:\Program Files\Autodesk\AutoCAD 2013\accoreconsole.exe" /i "%%f" /s "..\Scripts\core-export-jpg-no-formatting.scr" /l en-US
REM timeout /t -1

REM export jpg with Bluebeam formatting
REM core-export-jpg-Bluebeam-format
REM "C:\Program Files\Autodesk\AutoCAD 2013\accoreconsole.exe" /i "%%f" /s "..\Scripts\core-export-jpg-Bluebeam-format.scr" /l en-US
REM timeout /t -1

REM plot-pdf-simple
REM "C:\Program Files\Autodesk\AutoCAD 2013\accoreconsole.exe" /i "%%f" /s "..\Scripts\core-plot-pdf-simple.scr" /l en-US
REM timeout /t -1

REM plot-pdf-detailed
REM "C:\Program Files\Autodesk\AutoCAD 2013\accoreconsole.exe" /i "%%f" /s "..\Scripts\core-plot-pdf-detailed.scr" /l en-US
REM timeout /t -1

REM export-jpg-AutoCAD-toolpalette-format
"C:\Program Files\Autodesk\AutoCAD 2013\accoreconsole.exe" /i "%%f" /s "..\Scripts\core-export-jpg-AutoCAD-toolpalette-format.scr" /l en-US
REM timeout /t -1

REM export-jpg-AutoCAD-toolpalette-format
REM "C:\Program Files\Autodesk\AutoCAD 2013\accoreconsole.exe" /i "%%f" /s "..\Scripts\core-data-extraction.scr" /l en-US
REM timeout /t -1

REM require keystroke to continue
REM useful for individual file validation during the batch process
REM useful during testing
REM timeout /t -1
)
REM 10 second pause at end of program to evaluate windows command prompt state
timeout /t 10