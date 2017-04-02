# html全局属性
下面的全局属性可用于任何HTML元素
* accesskey,几乎所有浏览器均支持accesskey属性，除了Opera.规定激活(使元素获得焦点)元素的快捷键.
```txt
以下元素支持accesskey属性:a,area,button,input,label,legend以及textarea。
//例如,使用Shift+Alt+快捷键或者Alt+快捷键
<a href="http://www.w3school.com.cn/css/" accesskey="c">CSS</a>

```
* class属性,规定元素的类的名称。如需为一个元素规定多个类，用空格分隔类名。
	>class属性不能在以下HTML元素中使用:base,head,html,meta,param,script,style以及title.类名不能以数字开头！只有InternetExplorer支持这种做法
* contenteditable属性规定元素内容是否可编辑，如果元素未设置contenteditable属性，那么元素会从其父元素继承该属性。true表示可编辑,false表示不可编辑。
* contextmenu,规定div元素的上下文菜单。上下文菜单会在用户右键点击元素时出现.目前只有Firefox支持contextmenu属性。contextmenu属性的值是要打开的menu元素的id。
* 使用data-*属性来嵌入自定义数据,data-*属性用于存储页面或应用程序的私有自定义数据,data-*属性赋予我们在所有HTML 元素上嵌入自定义data属性的能力,存储的(自定义)数据能够被页面的JavaScript 中利用，以创建更好的用户体验(不进行Ajax调用或服务器端数据库查询),data-* 属性包括两部分:1)属性名不应该包含任何大写字母，并且在前缀"data-"之后必须有至少一个字符;
2)属性值可以是任意字符串;用户代理会完全忽略前缀为"data-"的自定义属性。
```txt
<li data-animal-type="bird">Owl</li>
```
* dir:规定元素内容的文本方向,dir属性在以下标签中无效:base,br,frame,frameset,hr,iframe,param以及script.ltr:默认。从左向右的文本方向;rtl:从右向左的文本方向.
* draggable:规定元素是否可拖动,链接和图像默认是可拖动的,true,规定元素的可拖动的。false,规定元素不可拖动。auto,使用浏览器的默认行为。
* dropzone:规定在元素上拖动数据时，是否拷贝、移动或链接被拖动数据。目前所有主流浏览器都不支持dropzone属性.copy:拖动数据会产生被拖动数据的副本。move:拖动数据会导致被拖动数据被移动到新位置。link:拖动数据会产生指向原始数据的链接。
* hidden:规定元素仍未或不再相关,浏览器不应显示已规定hidden属性的元素,
```txt
<p hidden>这个段落应该被隐藏。</p>
```
* id规定HTML元素的唯一的id,id在HTML文档中必须是唯一的.
* lang属性规定元素内容的语言,lang属性在以下标签中无效:base,br,frame,frameset,hr,iframe,param以及script.
* spellcheck规定是否对元素进行拼写和语法检查,input元素中的文本值(非密码),textarea元素中的文本,可编辑元素中的文本.true,对元素进行拼写和语法检查,false,不检查元素。
* style,规定元素的行内样式(inline style),style属性将覆盖任何全局的样式设定，例如在style标签或在外部样式表中规定的样式。属性值:一个或多个由分号分隔的CSS属性和值。
* tabindex属性规定元素的tab键控制次序(当tab键用于导航时),以下元素支持 tabindex属性:a,area,button,input,object,select以及textarea。属性值:规定元素的tab键控制次序(1是第一个).
* title:规定关于元素的额外信息,这些信息通常会在鼠标移到元素上时显示一段工具提示文本(tooltip text)。title属性常与form以及a元素一同使用，以提供关于输入格式和链接目标的信息。同时它也是abbr和acronym元素的必需属性。
* translate:规定是否应该翻译元素内容,yes,规定应该翻译元素内容;no,规定不应翻译元素内容.

