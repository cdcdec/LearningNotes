# git

![git原理图](git原理图.png)

- Workspace:工作区，执行git add *命令就把改动提交到了暂存区，执行git pull命令将远程仓库的数据拉到当前分支并合并，执行git checkout [branch-name]切换分支;
- Index:暂存区，执行git commit -m '说明' 命令就把改动提交到了仓库区（当前分支）
- Repository:仓库区（或本地仓库），执行git push origin master提交到远程仓库，执行git clone 地址将克隆远程仓库到本地
- Remote:远程仓库，就是类似github，coding等网站所提供的仓库

> 注：实际操作命令和上述命令会有所不同，这里这是解释清楚命令和仓库的关系。

## git术语

术语             | 定义
-------------- | -------------------------------------------------------------------------------------------------------------------------------
仓库（Repository） | 一个仓库包括了所有的版本信息、所有的分支和标记信息。在Git中仓库的每份拷贝都是完整的。仓库让你可以从中取得你的工作副本。
分支（Branches）   | 一个分支意味着一个独立的、拥有自己历史信息的代码线（code line）。你可以从已有的代码中生成一个新的分支，这个分支与剩余的分支完全独立。默认的分支往往是叫master。用户可以选择一个分支，选择一个分支执行命令git checkout branch
标记（Tags）       | 一个标记指的是某个分支某个特定时间点的状态。通过标记，可以很方便的切换到标记时的状态，例如2009年1月25号在testing分支上的代码状态
提交（Commit）     | 提交代码后，仓库会创建一个新的版本。这个版本可以在后续被重新获得。每次提交都包括作者和提交者，作者和提交者可以是不同的人
修订（Revision）   | 用来表示代码的一个版本状态。Git通过用SHA1 hash算法表示的id来标识不同的版本。每一个 SHA1 id都是160位长，16进制标识的字符串.。最新的版本可以通过HEAD来获取。之前的版本可以通过"HEAD~1"来获取，以此类推。

## 忽略特定的文件

在.gitignore文件中配置Git忽略特定的文件或者是文件夹,这个文件可以存在于不同的文件夹中,可以包含不同的文件匹配模式.以'#'开始的行，被视为注释.比如.gitignore内容可以如下:

```txt
#忽略所有的iml文件
*.iml
.gradle
#忽略文件夹
/local.properties
/.idea/workspace.xml
/.idea/libraries
.DS_Store
/build
/captures
.externalNativeBuild
```

## git配置

Git的设置文件为.gitconfig，它可以在用户主目录下(全局配置)，也可以在项目目录下(项目配置).

```txt
#列出Git可以在该处找到的所有的设置,会列出用户名,邮箱号等信息
git config --list
#编辑Git配置文件,这个命令只能在某个仓库下面进行,执行命令后会弹出一个txt文件,里面会显示这个仓库的地址等配置信息
git config -e
#编辑Git配置文件,执行命令后会弹出一个txt文件,里面会显示全局的配置信息.global前面有两个横杠。
git config -e --global
#设置提交代码时的用户信息
git config --global user.name "John Doe"
git config --global user.email johndoe@example.com
#如果你希望在一个特定的项目中使用不同的名称或e-mail地址，你可以在该项目中运行上述命令而不要--global选项
```
