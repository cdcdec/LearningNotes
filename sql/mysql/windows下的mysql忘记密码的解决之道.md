# windows下的mysql忘记密码的解决之道

- 需要关闭MySQL Server服务。在"运行"窗口，输入"services.msc"，进入"服务"窗口。找到mysql服务,将其关闭.
- MySQL的安装位置,获取其下的.ini文件的位置。该文件记录了MySQL的配置信息。如果我们想跳过登录权限，就必须获取该文件的位置。 需要注意的是，不同版本的.ini文件的名称不同，在MySQL 5.1时，它是my.ini，而在MySQL 5.6则是my-default.ini。
- 打开命令行窗口，输入如下的命令：

  ```txt

  C:\Users\wang>mysqld --defaults-file="D:\Program Files\MySQL\MySQL Server 5.6\my-default.ini" --console --skip-grant-tables
  ```

  > 此时该窗口不可再写入。这也是检验命令是否正确执行的一个标准.

- 另外打开一个命令行窗口，输入命令：mysql -u root -p，回车即可进入mysql命令行界面

- 执行命令

  ```txt
  mysql->show database;
  mysql->use mysql
  mysql->update user set password=PASSWORD('12345') where USER='root';
  这样，就将新密码设为了12345。
  ```

- 将第一个命令行窗口关闭，并开启MySQL服务.新密码是:12345
