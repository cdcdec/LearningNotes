# Ajax
AJAX=异步JavaScript和XML,AJAX是一种用于创建快速动态网页的技术。通过在后台与服务器进行少量数据交换，AJAX可以使网页实现异步更新。这意味着可以在不重新加载整个网页的情况下，对网页的某部分进行更新。传统的网页(不使用AJAX)如果需要更新内容，必需重载整个网页面。

## XMLHttpRequest对象
XMLHttpRequest用于在后台与服务器交换数据.
### 创建XMLHttpRequest对象的语法
* variable=new XMLHttpRequest();
* variable=new ActiveXObject("Microsoft.XMLHTTP");(IE5,IE6)
### XMLHttpRequest对象的方法
* open(method,url,async),规定请求的类型、URL 以及是否异步处理请求;method:请求的类型:GET或POST,url:文件在服务器上的位置;async:true(异步)或false(同步)
* send(string):将请求发送到服务器,参数string:仅用于POST请求。
* setRequestHeader(header,value):向请求添加HTTP头,header:规定头的名称,value:规定头的值;
### XMLHttpRequest对象的属性
* responseText:获得字符串形式的响应数据;
* responseXML:如果来自服务器的响应是XML,而且需要作为XML对象进行解析,使用responseXML属性.
* onreadystatechange:存储函数(或函数名)，每当readyState属性改变时，就会调用该函数.
* readyState:存有XMLHttpRequest的状态。从0到4发生变化,0:请求未初始化;1: 服务器连接已建立;2:请求已接收;3:请求处理中;4: 请求已完成，且响应已就绪;
* status:200: "OK",404: 未找到页面.






