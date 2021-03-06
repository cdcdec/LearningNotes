# sql

SQL的全称是:Structured Query Language,也就是结构化查询语言.是检索和操作关系型数据库的标准语言。

## sql语句的类型

- 查询语句:主要由select关键字完成,是sql语句中最复杂、功能最丰富的语句。
- DML:(Data Manipulation Language,数据操纵语言)语句,主要由insert,update,delete三个关键字完成.
- DDL(Data Definition Language,数据定义语言)语句,主要由create,alter,drop和truncate四个关键字完成.
- DCL()语句,主要由grant和revoke两个关键字完成.
- 事务控制语句:主要由commit,rollback和savepoint三个关键字完成。

## sql语句标识符

标识符用于定义表名,列名,也可用于定义变量等。标识符的命名规则如下:

- 以字母开头
- 包含字母,数字和三个特殊字符

  ```
  (#_$)
  ```

- 不能使用当前数据库系统的关键字、保留字,通常建议使用多个单词连缀而成,单词之间用_分割

## sql语句其它

- sql语句(关键字)不区分大小写 * 多条sql语句必须以;分割，单条sql语句后面可以不加分号，但是建议加上分号。
- sql语句可以写在一行也可以写在多行,因为sql语句中的空格会被忽略。
- 注释

  - 使用-- （两个连字符）嵌在行内。-- 之后的文本就是注释;
  - 在一行的开始处使用#，这一整行都将作为注释;
  - 从/_开始，到_/结束，/_和_/之间的任何内容都是注释。
