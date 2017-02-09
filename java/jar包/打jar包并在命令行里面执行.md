# 打jar包并在命令行里面执行

## 使用Eclipse的export的功能

## 在命令行里面执行

```txt
//test.jar是要执行的jar包的名称,"http://www.kanunu8.com/book/4349/" "出走十五年"这是要传递的两个参数。
java -jar test.jar "http://www.kanunu8.com/book/4349/" "出走十五年"
```

> java -Dfile.encoding=utf-8 -jar test.jar "参数1" "参数2" 在Eclipse中是正确的，但是打出jar包后，启动命令行一直没设置字符串默认编码，因此java虚拟机就按照所在系统的默认编码运行了.
