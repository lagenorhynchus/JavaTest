@echo off
set BASE_DIR=%~dp0
java -cp "%BASE_DIR%../lib/*" com.github.lagenorhynchus.javatest.FizzBuzz %*
