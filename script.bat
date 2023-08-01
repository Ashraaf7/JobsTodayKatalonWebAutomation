@echo off

REM Replace these paths with the actual paths to Katalon Studio and your Katalon project
set "KATALON_STUDIO_PATH=C:\Users\elost\.katalon\packages\Katalon_Studio_Windows_64-8.6.5\Katalon_Studio_Windows_64-8.6.5"
set "PROJECT_PATH=E:\Projects\JobsTodayKatalonWebAutomation"
set "TEST_SUITE_NAME=CandidateSuite"

REM Change the directory to Katalon Studio
cd /d "%KATALON_STUDIO_PATH%"

REM Execute the Katalon test suite
"%KATALON_STUDIO_PATH%\katalon.exe" -noSplash -runMode=console -projectPath="%PROJECT_PATH%" -testSuitePath="%TEST_SUITE_NAME%" -executionProfile="default"



REM Pause to see any error messages (remove this line if you don't need it)
pause
