# window
Window对象表示浏览器中打开的窗口.如果文档包含框架(frame或iframe 标签)，浏览器会为HTML文档创建一个window对象，并为每个框架创建一个额外的window对象。

## window对象方法
* open()用于打开一个新的浏览器窗口或查找一个已命名的窗口.window.open(URL,name,features,replace),URL,一个可选的字符串，声明了要在新窗口中显示的文档的 URL。如果省略了这个参数，或者它的值是空字符串，那么新窗口就不会显示任何文档。name,一个可选的字符串，该字符串是一个由逗号分隔的特征列表，其中包括数字、字母和下划线，该字符声明了新窗口的名称。这个名称可以用作标记<a>和<form>的属性target的值。如果该参数指定了一个已经存在的窗口，那么 open()方法就不再创建一个新窗口，而只是返回对指定窗口的引用。在这种情况下,features将被忽略。features:一个可选的字符串，声明了新窗口要显示的标准浏览器的特征。如果省略该参数，新窗口将具有所有标准特征。窗口特征,请参照:Window_Features.md.replace:一个可选的布尔值。规定了装载到窗口的URL是在窗口的浏览历史中创建一个新条目，还是替换浏览历史中的当前条目。支持下面的值：
true - URL替换浏览历史中的当前条目。
false - URL在浏览历史中创建新的条目。
```txt
//在新浏览器窗口中打开about:blank页
<script type="text/javascript">
myWindow=window.open('','','width=200,height=100')
myWindow.document.write("This is 'myWindow'")
myWindow.focus()
</script>

```
* setTimeout():用于在指定的毫秒数后调用函数或计算表达式。setTimeout(code,millisec),code,必需。要调用的函数后要执行的JavaScript代码串。millisec,必需。在执行代码前需等待的毫秒数。setTimeout()只执行code一次。如果要多次调用，请使用setInterval()或者让code自身再次调用setTimeout()。
```txt
//5秒后执行函数:pp()
setTimeout("pp()",5000);
//每隔一秒执行一次函数
function timedCount()
{
setTimeout("timedCount()",1000);
console.log(1);
}
//5秒后关闭窗口
window.setTimeout('window.close()',5000);
```
* close() 方法用于关闭浏览器窗口。某个窗口可以通过调用self.close()或只调用close()来关闭其自身。只有通过JavaScript代码打开的窗口才能够由JavaScript代码关闭。这阻止了恶意的脚本终止用户的浏览器。
* moveTo()方法可把窗口的左上角移动到一个指定的坐标.window.moveTo(x,y),x,窗口新位置的x坐标;y,窗口新位置的y坐标.出于安全方面的原因，浏览器限制此方法使其不能把窗口移出屏幕。