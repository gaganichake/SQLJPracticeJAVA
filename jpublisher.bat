@echo off
set JAVA_HOME=C:\Program Files (x86)\Java\jdk1.6.0_25
set SQLJ_HOME=C:\Users\Gagan\Softwares\Programing\SQLJ\lib\oracle\10g\sqlj
set PROJ_HOME=C:\Users\Gagan\Workspace\SQLJPractice\SQLJPracticeJAVA
set ORA_JDBC=C:\Users\Gagan\Softwares\Programing\jdbc-drivers\oracle\10.2.0.5\ojdbc14.jar;
set CLASSPATH=%SQLJ_HOME%\lib\*;%ORA_JDBC%;
path=%SQLJ_HOME%\bin;%JAVA_HOME%\bin;
cd=%PROJ_HOME%\JPubGenerated
jpub -user=system/gagan -url=jdbc:oracle:thin:@//localhost:1521/XE -driver=oracle.jdbc.driver.OracleDriver -dir=%PROJ_HOME%\JPubGenerated -package=gagan.sqlj.practice.helloworld
echo Help:
echo Command: jpub -user=user_name/password -sql=database_object_types [option_list]
echo Where database_object_types Specifies a comma-separated list of database object types for which JPublisher will generate class files. If the -sql option is not specified, class files for all object types contained in the specified schema are generated.
pause