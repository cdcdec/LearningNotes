# 关于终端更新的简单说明

--------------------------------------------------------------------------------

## 需要后台实现的部分

### 上传界面

> <http://218.29.38.132:8099/DownGoingMIPD/main.jsp>

上传界面由后台实现,界面上需要的元素有:

- 终端的版本号(上传者输入)

- 终端的安装程序(上传者上传)

- 终端升级的类型(上传者选择)

- 此版本的描述,例如添加了那些功能,修正了那些bug,等等.(上传者输入)

上传后的文件:

- 终端的安装文件,例如MobileWorkstation1.0.18.9.apk。
- versionUpdate.txt

上传后的文件说明:

- 终端名称+版本号+后缀
- versionUpdate.txt

```txt
//versionUpdate.txt
{
    "type":"force",//force:强制升级,normal:非强制升级
    "version":"1.0.18.9",
    "path":"http://61.149.253.74/DownGoingMIPD/MobileWorkstation1.0.18.9.apk",
    "desc":"1.修复了一些bug.2.增加了xx功能."
}
```

上传后文件的保存位置:

- pc端:DownGoingMIPD/terminal/pc
- 手机和pad端:DownGoingMIPD/terminal/pad_mobilephone
- 镭射终端:DownGoingMIPD/terminal/laser
- 移动工作站:DownGoingMIPD

### 下发接口(后台实现,并提供给终端)

- pc:<http://ip地址/DownGoingMIPD/terminal/pc/versionUpdate.txt>
- 手机端和pad端:<http://ip地址/DownGoingMIPD/terminal/pad_mobilephone/versionUpdate.txt>
- 镭射终端:<http://ip地址/DownGoingMIPD/terminal/laser/versionUpdate.txt>
- 移动工作站:<http://ip地址/DownGoingMIPD/versionUpdate.txt>

### 实用工具模块中关于程序版本的页面(后台实现,并提供给终端)

- 由后台提供一个网页,终端去加载。这个网页需要根据各个终端分别提供,pc端的页面上提供点击下载安装包的功能;移动端的网页上面提供各个终端的二维码图片。

--------------------------------------------------------------------------------

## 终端实现的部分

### 根据后台提供的下发接口,实现各终端更新的功能

- pc端,手机和pad端,镭射终端,移动工作站在程序首个页面加载结束的时候,去访问更新接口,如果有更新就弹出对话框,提示用户有新的更新。如果接口里面type的值是normal时,对话框包含"确定"和"取消"按钮,程序根据用户的选择去响应是否更新;如果接口里面type的值是force时,对话框只包含"确定"按钮,用户点击"确定"后更新程序;
- 移动工作站在"系统"设置页面里面有"检测更新"的功能,此功能是以前已经实现了的。

### 在"实用工具"模块中加载后台提供的显示下载链接或者二维码图片的页面。

## 下载界面

<http://218.29.38.132:8099/DownGoingMIPD/updatePackage.jsp>
