# Tomcat_windows服务

## 删除服务

以管理员身份打开cmd,输入: sc delete 服务名; 例如: sc delete tomcat7;

## 安装服务

下载bin文件夹里面有service.bat的Tomcat版本,cmd进入Tomcat的bin文件夹,执行命令service install tomcat8.5,执行,tomcat8.5是自己命名的服务名.
```txt
D:\android_web\apache-tomcat-8.5.11\bin>service.bat install tomcat8.5
Installing the service 'tomcat8.5' ...
Using CATALINA_HOME:    "D:\android_web\apache-tomcat-8.5.11"
Using CATALINA_BASE:    "D:\android_web\apache-tomcat-8.5.11"
Using JAVA_HOME:        "D:\JAVA_JDK\jdk1.8.0_121"
Using JRE_HOME:         "D:\JAVA_JDK\jdk1.8.0_121\jre"
Using JVM:              "D:\JAVA_JDK\jdk1.8.0_121\jre\bin\server\jvm.dll"
The service 'tomcat8.5' has been installed.
```
如果在安装tomcat后,又改变了JAVA_HOME,JRE_HOME的值,那么在服务里面将不能启动tomcat,此时需要将tomcat服务移除掉,然后重新安装tomcat服务;

## 卸载服务

cmd进入Tomcat的bin文件夹,执行命令service.bat remove tomcat8.5,执行,tomcat8.5是要删除的服务名.
