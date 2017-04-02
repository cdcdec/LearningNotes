# css概述

CSS指层叠样式表(Cascading Style Sheets),用于定义如何显示HTML元素.

## 多重样式将层叠为一个
多重样式将层叠为一个,样式表允许以多种方式规定样式信息。样式可以规定在单个的HTML元素中，在 HTML页的头元素中，或在一个外部的CSS文件中。甚至可以在同一个HTML文档内部引用多个外部样式表。

## 层叠次序
一般而言，所有的样式会根据下面的规则层叠于一个新的虚拟样式表中，其中数字4拥有最高的优先权:
* 1.浏览器缺省设置
* 2.外部样式表
    >在head标签内,
    ```txt
        <link href="index.css" rel="stylesheet" type="text/css">
    ```
* 3.内部样式表(位于 <head> 标签内部)
    >在head标签内,
    ```txt
    <style type="text/css">
    body {background-color: yellow}
    </style>
    ```
* 4.内联样式(在HTML元素内部)
    ```txt
    <p style="font-size:1.6em;color:red;font-face:文泉驿正黑;">这一行是组合的</p>
    
    ```