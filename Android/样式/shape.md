# shape形状可绘制对象   

这是在 XML 中定义的一般形状。文件位置:res/drawable/filename.xml文件名用作资源 ID。资源引用：在 Java 中：R.drawable.filename在 XML 中：@[package:]drawable/filename.
##### 语法:

```txt
<?xml version="1.0" encoding="utf-8"?>
<shape
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape=["rectangle" | "oval" | "line" | "ring"] >
    <corners
        android:radius="integer"
        android:topLeftRadius="integer"
        android:topRightRadius="integer"
        android:bottomLeftRadius="integer"
        android:bottomRightRadius="integer" />
    <gradient
        android:angle="integer"
        android:centerX="float"
        android:centerY="float"
        android:centerColor="integer"
        android:endColor="color"
        android:gradientRadius="integer"
        android:startColor="color"
        android:type=["linear" | "radial" | "sweep"]
        android:useLevel=["true" | "false"] />
    <padding
        android:left="integer"
        android:top="integer"
        android:right="integer"
        android:bottom="integer" />
    <size
        android:width="integer"
        android:height="integer" />
    <solid
        android:color="color" />
    <stroke
        android:width="integer"
        android:color="color"
        android:dashWidth="integer"
        android:dashGap="integer" />
</shape>

```

元素:

*   &lt;shape &gt;形状可绘制对象,这必须是根元素。
属性;
1.  xmlns:android,其值必须是"http://schemas.android.com/apk/res/android",这是个必备值用于定义XML命名空间.

2.  android:shape关键字。定义形状的类型。有效值为：

|值	      |描述   |
|:----:|:-----:|
|"rectangle"|填充包含视图的矩形。这是默认形状。|
|"oval"|适应包含视图尺寸的椭圆形状。|
|"line"|跨越包含视图宽度的水平线。此形状需要 <stroke> 元素定义线宽。|
|"ring"|环形。|

仅当android:shape="ring"如下时才使用以下属性:

android:innerRadius
尺寸。环内部（中间的孔）的半径，以尺寸值或尺寸资源表示。
android:innerRadiusRatio
浮点型。环内部的半径，以环宽度的比率表示。例如，如果 android:innerRadiusRatio="5"，则内半径等于环宽度除以 5。此值被 android:innerRadius 覆盖。默认值为 9。
android:thickness
尺寸。环的厚度，以尺寸值或尺寸资源表示。
android:thicknessRatio
浮点型。环的厚度，表示为环宽度的比率。例如，如果 android:thicknessRatio="2"，则厚度等于环宽度除以 2。此值被 android:innerRadius 覆盖。默认值为 3。
android:useLevel
布尔值。如果这用作 LevelListDrawable，则此值为“true”。这通常应为“false”，否则形状不会显示。


&lt;corners&gt;
为形状产生圆角。仅当形状为矩形时适用。
属性：

android:radius
尺寸。所有角的半径，以尺寸值或尺寸资源表示。对于每个角，这会被以下属性覆盖。
android:topLeftRadius
尺寸。左上角的半径，以尺寸值或尺寸资源表示。
android:topRightRadius
尺寸。右上角的半径，以尺寸值或尺寸资源表示。
android:bottomLeftRadius
尺寸。左下角的半径，以尺寸值或尺寸资源表示。
android:bottomRightRadius
尺寸。右下角的半径，以尺寸值或尺寸资源表示。


>注：（最初）必须为每个角提供大于 1 的角半径，否则无法产生圆角。如果希望特定角不要倒圆角，解决方法是使用 android:radius 设置大于 1 的默认角半径，然后使用实际所需的值替换每个角，为不希望倒圆角的角提供零（“0dp”）。

&lt;gradient&gt;
指定形状的渐变颜色。
属性：

android:angle
整型。渐变的角度（度）。0 为从左到右，90 为从上到上。必须是 45 的倍数。默认值为 0。
android:centerX
浮点型。渐变中心的相对 X 轴位置 (0 - 1.0)。
android:centerY
浮点型。渐变中心的相对 Y 轴位置 (0 - 1.0)。
android:centerColor
颜色。起始颜色与结束颜色之间的可选颜色，以十六进制值或颜色资源表示。
android:endColor
颜色。结束颜色，表示为十六进制值或颜色资源。
android:gradientRadius
浮点型。渐变的半径。仅在 android:type="radial" 时适用。
android:startColor
颜色。起始颜色，表示为十六进制值或颜色资源。
android:type:

关键字。要应用的渐变图案的类型。有效值为：

|值	|说明|
|:----:|:-----:|
|"linear"	|线性渐变。这是默认值。|
|"radial"	|径向渐变。起始颜色为中心颜色。|
|"sweep"	|流线型渐变。|

android:useLevel
布尔值。如果这用作 LevelListDrawable，则此值为“true”。

&lt;padding&gt;
要应用到包含视图元素的内边距（这会填充视图内容的位置，而非形状）。
属性：

android:left
尺寸。左内边距，表示为尺寸值或尺寸资源
android:top
尺寸。上内边距，表示为尺寸值或尺寸资源
android:right
尺寸。右内边距，表示为尺寸值或尺寸资源
android:bottom
尺寸。下内边距，表示为尺寸值或尺寸资源
<size>
形状的大小。
属性：

android:height
尺寸。形状的高度，表示为尺寸值或尺寸资源
android:width
尺寸。形状的宽度，表示为尺寸值或尺寸资源

>注：默认情况下，形状按照此处定义的尺寸按比例缩放至容器视图的大小。在 ImageView 中使用形状时，可通过将 android:scaleType 设置为 "center" 来限制缩放。

&lt;solid&gt;
用于填充形状的纯色。
属性：

android:color
颜色。应用于形状的颜色，以十六进制值或颜色资源表示。
&lt;stroke&gt;
形状的笔划中线。
属性：

android:width
尺寸。线宽，以尺寸值或尺寸资源表示。
android:color
颜色。线的颜色，表示为十六进制值或颜色资源。
android:dashGap
尺寸。短划线的间距，以尺寸值或尺寸资源表示。仅在设置了 android:dashWidth 时有效。
android:dashWidth
尺寸。每个短划线的大小，以尺寸值或尺寸资源表示。仅在设置了 android:dashGap 时有效。


```txt

//XML 文件保存在 res/drawable/gradient_box.xml 中：

<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle">
    <gradient
        android:startColor="#FFFF0000"
        android:endColor="#80FF00FF"
        android:angle="45"/>
    <padding android:left="7dp"
        android:top="7dp"
        android:right="7dp"
        android:bottom="7dp" />
    <corners android:radius="8dp" />
</shape>


//此布局 XML 会将形状可绘制对象应用到视图：

<TextView
    android:background="@drawable/gradient_box"
    android:layout_height="wrap_content"
    android:layout_width="wrap_content" />

//此应用代码将获取形状可绘制对象，并将其应用到视图：

Resources res = getResources();
Drawable shape = res. getDrawable(R.drawable.gradient_box);

TextView tv = (TextView)findViewByID(R.id.textview);
tv.setBackground(shape);

```


>来源:https://developer.android.google.cn/guide/topics/resources/drawable-resource.html?hl=zh-cn#Shape
