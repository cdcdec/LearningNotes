# 解析和遍历html文档

## 解析html字符串

使用静态Jsoup.parse(String html) 方法或 Jsoup.parse(String html, String baseUri) 例如:

```txt
String html = "<html><head><title>First parse</title></head>"
  + "<body><p>Parsed HTML into a doc.</p></body></html>";
Document doc = Jsoup.parse(html);
```

parse(String html, String baseUri) 这方法能够将输入的HTML解析为一个新的文档 (Document），参数 baseUri 是用来将相对 URL 转成绝对URL，并指定从哪个网站获取文档。

## 解析一个body片段

使用Jsoup.parseBodyFragment(String html)方法,例如:

```txt
String html = "<div><p>Lorem ipsum.</p>";
Document doc = Jsoup.parseBodyFragment(html);
Element body = doc.body();
```

> Document.body()方法能够取得文档body元素的所有子元素，与 doc.getElementsByTag("body")相同.

## 根据URL获取Document

使用 Jsoup.connect(String url)方法,例如:

```txt
Document doc = Jsoup.connect("http://example.com/").get();
String title = doc.title();
```

> Connection接口还提供一个方法链来解决特殊请求,具体如下:

> ```txt
> Document doc = Jsoup.connect("http://example.com")
>   .data("query", "Java")
>   .userAgent("Mozilla")
>   .cookie("auth", "token")
>   .timeout(3000)
>   .post();
> ```

> 这个方法只支持Web URLs (http和https 协议)

## 从一个文件加载一个文档

可以使用静态 Jsoup.parse(File in, String charsetName, String baseUri) 方法,例如:

```txt

File input = new File("/tmp/input.html");
Document doc = Jsoup.parse(input, "UTF-8", "http://example.com/");
```

> 说明:parse(File in, String charsetName, String baseUri) 这个方法用来加载和解析一个HTML文件.baseUri 参数用于解决文件中URLs是相对路径的问题。如果不需要可以传入一个空的字符串。另外还有一个方法parse(File in, String charsetName) ，它使用文件的路径做为 baseUri。 这个方法适用于如果被解析文件位于网站的本地文件系统，且相关链接也指向该文件系统。
