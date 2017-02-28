# mysql报错

## Generated keys not requested. You need to specify Statement.RETURN_GENERATED_KEYS to Statement.execute,解决方法如下:

```txt
String SQL = ""; //whatever my String is
PreparedStatement ps = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
ps.setString(1, "value");
//Other necessary ps.setXXX() methods

//now update
ps.executeUpdate();

ResultSet rs = ps.getGeneratedKeys();
```
