FOR /R %%f IN (.\Input-Files\*.dwg) DO (
"C:\Program Files\Autodesk\AutoCAD 2013\accoreconsole.exe" /i "%%f" /s ".\Scripts\core-export-jpg.scr" /l en-US
)
timeout /t 10