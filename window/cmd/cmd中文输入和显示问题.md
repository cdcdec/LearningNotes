# cmd中文输入和显示问题
(1)右击cmd窗口，点默认值。在选项中默认代码页，选择936.---->无效果
(2)在cmd中输入：chcp 936,---->有效果.但是只能改变当前页的输入和显示,下次再进入时就没有效果了。
>chcp命令用于显示或设置活动代码页编号.
(3)新建文本，复制粘贴以下代码，把文件类型改成reg ：Windows Registry Editor Version 5.00 [HKEY_CURRENT_USER\Console\%SystemRoot%_system32_cmd.exe] "CodePage"=dword:000003a8
之后双击运行。点是。
(4)运行regedit,打开注册表.在HKEY_CURRENT_USER\Console\%SystemRoot%_system32_cmd.exe中找到CodePage。
双击打开CodePage，输入3a8---->有效果,永久改变。

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
