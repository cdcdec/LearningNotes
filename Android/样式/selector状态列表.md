# selector状态列表

StateListDrawable 是在 XML 中定义的可绘制对象，它根据对象的状态，使用多个不同的图像来表示同一个图形。例如，Button 小部件可以是多种不同状态（按下、聚焦或这两种状态都不是）中的其中一种，而且可以利用状态列表可绘制对象为每种状态提供不同的背景图片。

您可以在 XML 文件中描述状态列表。每个图形由单一&lt;selector&gt;元素内的&lt;item&gt;元素表示。每个&lt;item&gt;均使用各种属性来描述应用作可绘制对象的图形的状态。

在每个状态变更期间，将从上到下遍历状态列表，并使用第一个与当前状态匹配的项目 —此选择并非基于“最佳匹配”，而是选择符合状态最低条件的第一个项目。

文件位置：res/drawable/filename.xml,文件名用作资源 ID。

资源引用：在 Java 中：R.drawable.filename,在 XML 中：@[package:]drawable/filename

##### 语法：
```XML
<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android"
    android:constantSize=["true" | "false"]
    android:dither=["true" | "false"]
    android:variablePadding=["true" | "false"] >
    <item
        android:drawable="@[package:]drawable/drawable_resource"
        android:state_pressed=["true" | "false"]
        android:state_focused=["true" | "false"]
        android:state_hovered=["true" | "false"]
        android:state_selected=["true" | "false"]
        android:state_checkable=["true" | "false"]
        android:state_checked=["true" | "false"]
        android:state_enabled=["true" | "false"]
        android:state_activated=["true" | "false"]
        android:state_window_focused=["true" | "false"] />
</selector>
```
元素：
&lt;selector&gt;
必备。这必须是根元素。包含一个或多个 <item> 元素。
属性：

xmlns:android   

字符串。必备。定义XML命名空间，其必须是 "http://schemas.android.com/apk/res/android"。

android:constantSize

布尔值。如果可绘制对象报告的内部大小在状态变更时保持不变，则值为“true”（大小是所有状态的最大值）；如果大小根据当前状态而变化，则值为“false”。默认值为 false。

android:dither

布尔值。值为“true”时，将在位图的像素配置与屏幕不同时（例如：ARGB 8888 位图和 RGB 565 屏幕）启用位图的抖动；值为“false”时则停用抖动。默认值为 true。

android:variablePadding

布尔值。如果可绘制对象的内边距应根据选择的当前状态而变化，则值为“true”；如果内边距应保持不变（基于所有状态的最大内边距），则值为“false”。启用此功能要求您在状态变更时处理执行布局，这通常不受支持。默认值为 false。

&lt;item&gt;
定义要在某些状态期间使用的可绘制对象，如其属性所述。必须是&lt;selector&gt;元素的子项。
属性：

android:drawable

可绘制对象资源。必备。引用可绘制对象资源。

android:state_pressed

布尔值。如果在按下对象（例如触摸/点按某按钮）时应使用此项目，则值为“true”；如果在默认的未按下状态时应使用此项目，则值为“false”。

android:state_focused

布尔值。如果在对象具有输入焦点（例如当用户选择文本输入时）时应使用此项目，则值为“true”；如果在默认的非焦点状态时应使用此项目，则值为“false”。

android:state_hovered

布尔值。如果当光标悬停在对象上时应使用此项目，则值为“true”；如果在默认的非悬停状态时应使用此项目，则值为“false”。通常，这个可绘制对象可能与用于“聚焦”状态的可绘制对象相同。
此项为 API 级别 14 新引入的配置。

android:state_selected

布尔值。如果在使用定向控件浏览（例如使用方向键浏览列表）的情况下对象为当前用户选择时应使用此项目，则值为“true”；如果在未选择对象时应使用此项目，则值为“false”。
当焦点 (android:state_focused) 不充分（例如，列表视图有焦点但使用方向键选择其中的项目）时，使用所选状态。

android:state_checkable

布尔值。如果当对象可选中时应使用此项目，则值为“true”；如果当对象不可选中时应使用此项目，则值为“false”。（仅当对象可在可选中与不可选中小部件之间转换时才有用。）

android:state_checked

布尔值。如果在对象已选中时应使用此项目，则值为“true”；如果在对象未选中时应使用此项目，则值为“false”。

android:state_enabled

布尔值。如果在对象启用（能够接收触摸/点击事件）时应使用此项目，则值为“true”；如果在对象停用时应使用此项目，则值为“false”。

android:state_activated

布尔值。如果在对象激活作为持续选择（例如，在持续导航视图中“突出显示”之前选中的列表项）时应使用此项目，则值为“true”；如果在对象未激活时应使用此项目，则值为“false”。
此项为 API 级别 11 新引入的配置。

android:state_window_focused
布尔值。如果当应用窗口有焦点（应用在前台）时应使用此项目，则值为“true”；如果当应用窗口没有焦点（例如，通知栏下拉或对话框出现）时应使用此项目，则值为“false”。

##### 示例

XML 文件保存在 res/drawable/button.xml 中：

```xml
<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:state_pressed="true"
          android:drawable="@drawable/button_pressed" /> <!-- pressed -->
    <item android:state_focused="true"
          android:drawable="@drawable/button_focused" /> <!-- focused -->
    <item android:state_hovered="true"
          android:drawable="@drawable/button_focused" /> <!-- hovered -->
    <item android:drawable="@drawable/button_normal" /> <!-- default -->
</selector>

```

此布局 XML 将状态列表可绘制对象应用到按钮：

```xml
<Button
    android:layout_height="wrap_content"
    android:layout_width="wrap_content"
    android:background="@drawable/button" />

```

>注：请记住，Android 将应用状态列表中第一个与对象当前状态匹配的项目。因此，如果列表中的第一个项目不含上述任何状态属性，则每次都会应用它，这就是默认值应始终放在最后的原因（如以下示例所示）。
https://developer.android.google.cn/guide/topics/resources/drawable-resource.html?hl=zh-cn#StateList
