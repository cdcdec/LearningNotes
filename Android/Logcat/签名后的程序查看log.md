# 签名后的程序查看log

## 例1:

- usb连接终端;
- 打开命令行,输入:adb shell
- 输入:logcat -d -v threadtime *:I
- 点击app上某个按钮后,立即执行上面的命令,可以看到程序里面写的log
