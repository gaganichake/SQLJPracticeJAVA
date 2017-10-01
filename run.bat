@echo off
set JAVA_HOME=C:\Program Files (x86)\Java\jdk1.6.0_25
set SQLJ_HOME=C:\Users\Gagan\Softwares\Programing\SQLJ\lib\oracle\10g\sqlj
set PROJ_HOME=C:\Users\Gagan\Workspace\SQLJPractice\SQLJPracticeJAVA
set ORA_JDBC=C:\Users\Gagan\Softwares\Programing\jdbc-drivers\oracle\10.2.0.5\ojdbc14.jar;
set CLASSPATH=%SQLJ_HOME%\lib\*;%ORA_JDBC%;
path=%SQLJ_HOME%\bin;%JAVA_HOME%\bin;
cd=%PROJ_HOME%\bin
java  gagan.sqlj.practice.helloworld.HelloWorld
pause