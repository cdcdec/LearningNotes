# eclipse中配置jdk

## eclipse中配置JRE
window -> preference -> java -> install jres -> add -> standard vm -> 设置好相应的jre home。

## eclipse配置jdk版本
window -> preference -> java ->Compliance,Compiler compliance level;

## java.lang.UnsupportedClassVersionError问题的解决方法
运行某个工程时报上述错误,是因为这个工程设置的jre的版本和工程进行编译的jdk的版本不一至.工程右键--->Properties--->Java Compiler,在JDK Compliance里面选择对应的JDK版本。
