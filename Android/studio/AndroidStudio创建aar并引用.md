# Android Studio创建aar,并在工程中引用
## 创建并获取aar

* 在一个工程里面，"File"--->"New"---->"New Module..."-->"Android Library"
* 完成新建的Android Library,例如新的library的名称是:iconcolor
* Build工程后,在iconcolor library的build下面的outputs下面的aar文件夹里面就是生成的aar文件:iconcolor-debug.aar;

## 在工程中引用aar

"File"--->"New"--->"Module"--->Import .JAR/.AAR Package,选择aar文件所在路径,将aar文件引入到这个工程中.

## 在工程中依赖aar

工程右键选"Project Structure",左侧选择"app"--->右侧选"Dependencies"-->点击"+",选择要依赖的aar工程。可以在工程中使用这个aar了.


