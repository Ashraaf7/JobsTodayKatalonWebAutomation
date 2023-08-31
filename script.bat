@echo off

REM Replace these paths with the actual paths to Katalon Studio and your Katalon project
set "KATALON_STUDIO_PATH=C:\Users\elost\.katalon\packages\Katalon_Studio_Windows_64-8.6.5"
set "PROJECT_PATH=E:\Projects\JobsTodayKatalonWebAutomation\JobsToday.prj"
set "TEST_SUITE_NAME=Test Suites\CandidateSuite"

REM Change the directory to Katalon Studio
cd /d "%KATALON_STUDIO_PATH%"

REM Output the current directory for debugging purposes
echo Current Directory: %CD%

REM List the contents of the current directory for debugging purposes
dir

REM Execute Katalon Studio in console mode
katalon -noSplash -runMode=console -projectPath="E:\Projects\JobsTodayKatalonWebAutomation\JobsToday.prj" -retry=0 -testSuitePath="Test Suites/CandidateSuite" -browserType="Edge Chromium" -executionProfile="default" -apiKey="144f3c3e-230b-4428-ab3f-5bc14651b288" --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true

REM Pause to see any error messages (remove this line if you don't need it)
pause


katalon -propertiesFile="E:\Projects\JobsTodayKatalonWebAutomation\console.properties" -runMode=console