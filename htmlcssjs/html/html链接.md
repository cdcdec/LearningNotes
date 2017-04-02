# html链接

1.  通过使用href属性 - 创建指向另一个文档的链接

  ```html
  <a href="url">Link text</a>
  ```

  href:属性规定链接的目标，相对路径或者绝对路径都可以。
  Link text:是元素的内容,可以是文字,也可以是其它HTML元素(a元素除外)。例如:

  ```html
  <a href="https://www.baidu.com"><p>123.com</p></a>

  <a href="https://www.baidu.com"><img src="images.jpg" /></a>

  ```

  *target*属性：定义被链接的文档在何处显示。

  ```html
  <!--在新窗口打开文档-->
  <a href="http://www.w3school.com.cn/" target="_blank">V</a>
  <!--将链接的画面内容，显示在目前的视窗中.(内定值)即:同窗口打开-->
  <a href="http://www.w3school.com.cn/" target="_self">V</a>
  <!--将链接的画面内容，当成文件的上一个画面。即:当前窗口打开-->
  <a href="http://www.w3school.com.cn/" target="_parent">V</a>
  <!--将框架中链接的画面内容，显示在没有框架的视窗中（即除去了框架)。即:顶端打开窗口-->
  <a href="http://www.w3school.com.cn/" target="_top">V</a>
  ```

2.  通过使用 name 属性 - 创建文档内的书签

  name 属性规定锚（anchor）的名称。
  当使用命名锚（named anchors）时，我们可以创建直接跳至该命名锚（比如页面中某个小节）的链接，这样使用者就无需不停地滚动页面来寻找他们需要的信息了。

  >注意:可以使用 id 属性来替代 name 属性，命名锚同样有效。

  * 创建一个书签
  ```html
  <a name="tips">基本的注意事项 - 有用的提示</a>
  ```
  * 在同一个文档中创建指向该锚的链接,或者在其他页面中创建指向该锚的链接

  ```html
  <!--在同一个文档中创建指向该锚的链接-->
  <a href="#tips">有用的提示</a>
  <!--在其他页面中创建指向该锚的链接-->
  <a href="http://xxx.cn/html/html.html#tips">有用的提示</a>
  ```

3.  邮件链接

  ```html
  <!--发送邮件,收件人地址为:420209677@qq.com,邮件的主题是hello again，%20表示一个空格-->
  <a href="mailto:420209677@qq.com?subject=Hello%20again">发送邮件</a>
  <!--发送邮件,收件人地址为:420209677@qq.com,抄送1@qq.com，密送:2@qq.com,邮件主题:关于放假,邮件内容:放假-->
  <a href="mailto:420209677@qq.com?cc=1@qq.com&bcc=2@qq.com&subject=关于放假&body=放假">发送邮件！</a>
  ```
