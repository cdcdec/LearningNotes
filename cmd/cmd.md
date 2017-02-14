# cmd

## chcp命令切换字符格式

> 在cmd里面执行命令时,会碰到出现中文乱码的情况

chcp命令切换字符格式:

```txt
chcp 65001   #换成utf-8代码页

chcp 936       #换成默认的gbk

chcp 437       #美国英语

一般默认为gbk，若要修改成 utf-8，则需要：

cmd窗口输入：

chcp 65001
```
