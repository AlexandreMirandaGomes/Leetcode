@echo off
setlocal

set "GRADLE_VERSION=8.10.2"
set "DIST_NAME=gradle-%GRADLE_VERSION%-bin"
set "DIST_URL=https://services.gradle.org/distributions/%DIST_NAME%.zip"
set "CACHE_DIR=%USERPROFILE%\.gradle\wrapper\dists\%DIST_NAME%"
set "ZIP_PATH=%CACHE_DIR%\%DIST_NAME%.zip"
set "GRADLE_HOME=%CACHE_DIR%\%DIST_NAME%"

if not exist "%GRADLE_HOME%\bin\gradle.bat" (
  if not exist "%CACHE_DIR%" mkdir "%CACHE_DIR%"

  if not exist "%ZIP_PATH%" (
    echo Downloading Gradle %GRADLE_VERSION%...
    powershell -NoProfile -ExecutionPolicy Bypass -Command "[Net.ServicePointManager]::SecurityProtocol=[Net.SecurityProtocolType]::Tls12; Invoke-WebRequest -UseBasicParsing -Uri '%DIST_URL%' -OutFile '%ZIP_PATH%'"
    if errorlevel 1 (
      echo Failed to download Gradle distribution.
      exit /b 1
    )
  )

  powershell -NoProfile -ExecutionPolicy Bypass -Command "Expand-Archive -Force -Path '%ZIP_PATH%' -DestinationPath '%CACHE_DIR%'"
  if errorlevel 1 (
    echo Failed to extract Gradle distribution.
    exit /b 1
  )
)

"%GRADLE_HOME%\bin\gradle.bat" -p "%~dp0" %*
