# 走进java
## java技术体系
Sun官方所定义的Java技术体系包括以下几个组成部分:
* Java程序设计语言
* 各种硬件平台上的Java虚拟机 
* Class文件格式
* Java API类库
* 来自商业机构和开源社区的第三方Java类库

### JDK
我们可以把Java程序设计语言、Java虚拟机、Java API类库这三部分统称为JDK(Java Development Kit)，JDK是用于支持Java程序开发的最小环境.
### JRE
可以把JavaAPI类库中的Java SE API子集和Java虚拟机这两部分统称为JRE(Java Runtime Environment),JRE是支持Java程序运行的标准环境.

### Java技术体系可以分为4个平台
* Java Card：支持一些Java小程序(Applets)运行在小内存设备(如智能卡)上的平台。
* Java ME(Micro Edition):支持Java程序运行在移动终端(手机、PDA)上的平台,对Java API有所精简,并加入了针对移动终端的支持,这个版本以前称为J2ME。
* Java SE(Standard Edition):支持面向桌面级应用(如Windows下的应用程序)的Java 平台,提供了完整的Java核心API，这个版本以前称为J2SE。 
* Java EE(Enterprise Edition):支持使用多层架构的企业应用(如ERP、CRM应用)的Java平台，除了提供JavaSEAPI外，还对其做了大量的扩充并提供了相关的部署支持，这个版本以前称为J2EE。 
 
## java发展史
* 1991年4月，由James Gosling博士领导的绿色计划(Green Project)开始启动，此计划的 目的是开发一种能够在各种消费性电子产品(如机顶盒、冰箱、收音机等)上运行的程序架构。这个计划的产品就是Java语言的前身:Oak(橡树)。
* 1995年5月23日,Oak语言改名为Java,并且在SunWorld大会上正式发布Java1.0版本.Java语言第一次提出了“Write Once,Run Anywhere”的口号。 
* 1996年1月23日,JDK 1.0发布,Java语言有了第一个正式版本的运行环境.JDK 1.0提供了一个纯解释执行的Java虚拟机实现(Sun Classic VM)。JDK1.0版本的代表技术包括:Java虚拟机、Applet、AWT等。在1996年5月底,Sun公司于美国旧金山举行了首届JavaOne大会,从此JavaOne成为全世界数百万Java语言开发者每年一度的技术盛会.
* 1997年2月19日,Sun公司发布了JDK1.1.技术代表有:JAR文件格式、JDBC、JavaBeans、RMI,内部类(Inner Class)和反射(Reflection)都是在这个时候出现的。
* 1998年12月4日,JDK迎来了一个里程碑式的版本JDK1.2,Sun在这个版本中把Java技术体系拆分为3个方向，分别是面向桌面应用开发的 J2SE(Java 2 Platform,Standard Edition)、面向企业级开发的J2EE(Java 2 Platform,Enterprise Edition)和面向手机等移动终端开发的J2ME(Java 2 Platform,Micro Edition)。
* 1999年4月27日,HotSpot虚拟机发布.后来它成为了JDK1.3及之后所有版本的SunJDK的默认虚拟机。
* 2002年2月13日,JDK1.4发布.新的技术特性,如正则表达式、异常链、NIO、日志类、XML解析器和XSLT转换器等.
* 2004年9月30日,JDK 1.5发布,新特性:自动装
箱、泛型、动态注解、枚举、可变长参数、遍历循环(foreach循环)等。在虚拟机和API层面上，这个版本改进了Java的内存模型(Java Memory Model,JMM)、提供了java.util.concurrent并发包等。
* 2006年12月11日,JDK 1.6发布,Sun终结了从JDK1.2开始已经有8年历史的J2EE、J2SE、J2ME的命名方式，启用Java SE 6、Java EE 6、Java ME 6的命名方式.



