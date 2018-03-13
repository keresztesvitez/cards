@echo off
REM Sets code page to UTF-8 (needed for the card symbols)
chcp 65001 > nul
java -jar -Dfile.encoding=UTF-8 .\target\cards-1.0-SNAPSHOT.jar