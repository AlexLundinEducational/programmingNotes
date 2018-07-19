@echo off
%SystemRoot%\explorer.exe "%CD%\Input-Files"
%SystemRoot%\explorer.exe "%CD%\Output-Files"
%SystemRoot%\explorer.exe "%CD%\Scripts"
%SystemRoot%\explorer.exe "%CD%\Windows-Batch-Processes"

REM require keystroke to continue
REM useful during testing
timeout /t -1
