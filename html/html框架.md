# html框架

## 框架

通过使用框架,可以在同一个浏览器窗口中显示不止一个页面。每份HTML文档称为一个框架，并且每个框架都独立于其他的框架.

### 框架结构标签(框架集)frameset

- 框架结构标签(frameset)定义如何将窗口分割为框架
- 每个frameset定义了一系列行或列
- rows/columns的值规定了每行或每列占据屏幕的面积

### 框架标签Frame

Frame标签定义了放置在每个框架中的HTML文档.

> - 框架默认有可见边框,用户可以拖动边框来改变它的大小。为了避免这种情况发生，可以在frame标签中加入:noresize="noresize" -
> - 为不支持框架的浏览器添加noframes标签.
> - 不能将body,/body标签与frameset,/frameset标签同时使用.body标签要放在frameset标签的里面。
> - noframes标签,必须嵌套于body,/body标签内。
> - frame标签内也可以嵌套frameset标签。

### 内联框架iframe

- height和width属性用于规定iframe的高度和宽度,属性值的默认单位是像素，但也可以用百分比来设定.
- src指向隔离页面的位置.
- frameborder属性规定是否显示iframe周围的边框,设置属性值为"0"就可以移除边框.
- iframe可用作链接的目标(target),链接的target属性必须引用iframe的name属性。
