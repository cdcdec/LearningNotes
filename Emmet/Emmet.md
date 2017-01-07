# Emmet

Emmet插件以前被称作为Zen Coding，是一个文本编辑器的插件，它可以帮助您快速编写HTML和CSS代码，从而加速Web前端开发.

## 创建初始文档

只要输入!或html:5，然后点击tab键，你就会看到一个HTML5的doctype默认标签。

- html:5或!：HTML5文档类型
- html:xt：XHTML过渡型文档类型
- html:xs：XHTML严格型文档类型
- html:4t：HTML4过渡型文档类型
- html:4s：HTML4严格型文档类型

## 子元素>

使用>运算符可以用来生成彼此嵌套的元素:

```txt
section>div>p
上面的代码会生成下面的代码:
<section>
    <div>
        <p></p>
    </div>
</section>
```

## 相邻元素+

使用+运算符可以用来生成彼此相邻的元素:

```txt
section+div+p
上面代码会生成下面的代码:
<section></section>
<div></div>
<p></p>
```

## 返回上一层^

使用^运算符，可以让你的代码返回上一层。当你使用>嵌套元素时，想让后面的回到上一层，那么这个方法很适用.

```txt
section>div>p>a^p
这个缩写将两个段落元素都放置在div内，但只有第一个段落里会包含一个链接。
<section>
    <div>
        <p><a href=""></a></p>
        <p></p>
    </div>
</section>
其实这个就相当于:
section>div>(p>a)+p
```

## 乘法*

如果你想一次性生成多个相同的元素，比如列表中的li，那么就可以使用乘法运算符*:

```txt
ul>li*5
上面代码会生成5个li:
<ul>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
</ul>
除了能一次性生成多个相同的标签之外，我们还可以通过$符号做递增；通过$@-符号做递减；
ul>li.item.item-$*5生成以下内容:
<ul>
  <li class="item item-1"></li>
  <li class="item item-2"></li>
  <li class="item item-3"></li>
  <li class="item item-4"></li>
  <li class="item item-5"></li>
</ul>
ul>li.item.item-$@-*5生成以下内容:
<ul>
  <li class="item item-5"></li>
  <li class="item item-4"></li>
  <li class="item item-3"></li>
  <li class="item item-2"></li>
  <li class="item item-1"></li>
</ul>
ul>li.item.item-$@-3*5生成以下内容:
<ul>
  <li class="item item-7"></li>
  <li class="item item-6"></li>
  <li class="item item-5"></li>
  <li class="item item-4"></li>
  <li class="item item-3"></li>
</ul>
```

## 组合

在Emmet中可以通过()将一个块组合在一起:

```txt
ul>(li>a)*3
上面的代码就会生成3个li，而且每个li中套了一个a.
```

## 快速添加类名、ID、文本和属性

- 使用E#ID添加ID名
- 使用E.class添加类名
- 使用E[attr]添加属性
- 使用E{text}添加文本

## 省略标签名

下面的示例表示省略div,li,tr,td,option.

```txt
.item<====>div.item
ul>.item<=====>ul>li.item
ol>.item<=====>ol>li.item
table(tbody,thead或tfoot)>.item<======>table(tbody,thead或tfoot)>tr.item
tr>.item<=====>tr>td.item
select(optgroup)>.item<=====>select(optgroup)>option.item
```

## 更多用法请从下图中查询

![更多语法](emmetSyntax.jpg)
