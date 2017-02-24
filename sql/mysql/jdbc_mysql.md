# jdbc_mysql

## 警告:

```text

Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
```

消除警告:在url=jdbc:mysql://127.0.0.1:3306/books后面添加以下内容:

```text
?useUnicode=true&characterEncoding=utf-8&useSSL=false

添加后,整个内容如下:
url=jdbc:mysql://127.0.0.1:3306/books?useUnicode=true&characterEncoding=utf-8&useSSL=false
```
