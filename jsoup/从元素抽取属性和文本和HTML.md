# 从元素抽取属性和文本和HTML

## 方法

- 要取得一个属性的值，可以使用Node.attr(String key) 方法
- 对于一个元素中的文本，可以使用Element.text()方法
- 对于要取得元素或属性中的HTML内容，可以使用Element.html(), 或 Node.outerHtml()方法

## 例子

```txt
String html = "<p>An <a href='http://example.com/'><b>example</b></a> link.</p>";
Document doc = Jsoup.parse(html);//解析HTML字符串返回一个Document实现
Element link = doc.select("a").first();//查找第一个a元素

String text = doc.body().text(); // "An example link"//取得字符串中的文本
String linkHref = link.attr("href"); // "http://example.com/"//取得链接地址
String linkText = link.text(); // "example""//取得链接地址中的文本

String linkOuterH = link.outerHtml();
    // "<a href="http://example.com"><b>example</b></a>"
String linkInnerH = link.html(); // "<b>example</b>"//取得链接内的html内容
```

> 说明:上述方法是元素数据访问的核心办法。此外还其它一些方法可以使用:

> - Element.id()
> - Element.tagName()
> - Element.className() and Element.hasClass(String className)

> 这些访问器方法都有相应的setter方法来更改数据.
