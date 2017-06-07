# AndroidStudio引入Lambda表达式

*  依次点击 【File】【Other Settings】【Default Project Structure】确保当前项目使用的JDK版本是1.8;

*  打开项目（Project）的build.gradle，在dependencies节点添加

	```txt

	classpath 'me.tatarka:gradle-retrolambda:3.2.5'

	```
* 打开项目（Module）的build.gradle，在根节点添加
	```txt
	
	apply plugin: 'me.tatarka.retrolambda'


	```
* 打开项目（Module）的build.gradle，在android节点增加
	```txt

		compileOptions {
			sourceCompatibility JavaVersion.VERSION_1_8
			targetCompatibility JavaVersion.VERSION_1_8
		}

	```


