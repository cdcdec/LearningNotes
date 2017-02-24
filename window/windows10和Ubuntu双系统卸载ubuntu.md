# windows10和Ubuntu双系统卸载ubuntu

- 在windows10上面安装ubuntu系统后,每次开机后会进入系统选择界面,且默认的是进入ubuntu系统,也无法更改进入的顺序。

- 卸载ubuntu系统:

  - 下载MBRFix工具点击下载，放在c盘根目录下(exe文件很小,只有64kb)
  - 按下WIN+X打开命令图示符（管理员）
  - 进入c盘根目录,执行下面的命令:

    ```txt
    //注意命令中的大小写
    MbrFix /drive 0 fixmbr /yes
    ```

  - 重启电脑,则直接进入windows10.
