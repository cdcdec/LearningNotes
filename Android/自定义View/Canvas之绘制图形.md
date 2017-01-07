# Canvas之绘制图形

######  Canvas的常用操作速查表
|操作类型|相关API|备注|
|:------:|:-----:|:-------:|
|绘制颜色 |drawColor, drawRGB, drawARGB | 使用单一颜色填充整个画布|
| 绘制基本形状  | drawPoint, drawPoints, drawLine, drawLines, drawRect, drawRoundRect, drawOval, drawCircle, drawArc | 依次为 点、线、矩形、圆角矩形、椭圆、圆、圆弧 |
|绘制图片	|drawBitmap, drawPicture|	绘制位图和图片|
|绘制文本	|drawText, drawPosText, drawTextOnPath|	依次为 绘制文字、绘制文字时指定每个文字位置、根据路径绘制文字|
|绘制路径|drawPath	|绘制路径，绘制贝塞尔曲线时也需要用到该函数|
|顶点操作	|drawVertices, drawBitmapMesh	|通过对顶点操作可以使图像形变，drawVertices直接对画布作用、 drawBitmapMesh只对绘制的Bitmap作用|
|画布剪裁|	clipPath, clipRect	|设置画布的显示区域|
|画布快照|	save, restore, saveLayerXxx, restoreToCount, getSaveCount|	依次为 保存当前状态、 回滚到上一次保存的状态、 保存图层状态、 回滚到指定状态、 获取保存次数|
|画布变换	|translate, scale, rotate, skew	|依次为 位移、缩放、 旋转、错切|
|Matrix(矩阵)	|getMatrix, setMatrix, concat	|实际上画布的位移，缩放等操作的都是图像矩阵Matrix， 只不过Matrix比较难以理解和使用，故封装了一些常用的方法。|


#####  Canvas详解

######  绘制颜色：

绘制颜色是填充整个画布，常用于绘制底色。

```java
canvas.drawColor(Color.BLUE); //绘制蓝色

```
######  创建画笔：

要想绘制内容，首先需要先创建一个画笔，如下：

```java
// 1.创建一个画笔
private Paint mPaint = new Paint();

// 2.初始化画笔
private void initPaint() {
	mPaint.setColor(Color.BLACK);       //设置画笔颜色
	mPaint.setStyle(Paint.Style.FILL);  //设置画笔模式为填充
	mPaint.setStrokeWidth(10f);         //设置画笔宽度为10px
}

// 3.在构造函数中初始化
public SloopView(Context context, AttributeSet attrs) {
   super(context, attrs);
   initPaint();
}


```
######  绘制点：

可以绘制一个点，也可以绘制一组点，如下：

```java
canvas.drawPoint(200, 200, mPaint);     //在坐标(200,200)位置绘制一个点
canvas.drawPoints(new float[]{          //绘制一组点，坐标位置由float数组指定
      500,500,
      500,600,
      500,700
},mPaint);

```
######  绘制直线：

绘制直线需要两个点，初始点和结束点，同样绘制直线也可以绘制一条或者绘制一组：

```java
canvas.drawLine(300,300,500,600,mPaint);    // 在坐标(300,300)(500,600)之间绘制一条直线
canvas.drawLines(new float[]{               // 绘制一组线 每四数字(两个点的坐标)确定一条线
    100,200,200,200,
    100,300,200,300
},mPaint);


```
######  绘制矩形:

确定确定一个矩形最少需要四个数据，就是对角线的两个点的坐标值，这里一般采用左上角和右下角的两个点的坐标。

关于绘制矩形，Canvas提供了三种重载方法，第一种就是提供四个数值(矩形左上角和右下角两个点的坐标)来确定一个矩形进行绘制。 其余两种是先将矩形封装为Rect或RectF(实际上仍然是用两个坐标点(对角线上的两个点)来确定的矩形)，然后传递给Canvas绘制，如下：

```java
// 第一种
canvas.drawRect(100,100,800,400,mPaint);

// 第二种
Rect rect = new Rect(100,100,800,400);
canvas.drawRect(rect,mPaint);

// 第三种
RectF rectF = new RectF(100,100,800,400);
canvas.drawRect(rectF,mPaint);

```

>Rect和RectF两者有什么区别吗？两者最大的区别就是精度不同，Rect是int(整形)的，而RectF是float(单精度浮点型)的。除了精度不同，两种提供的方法也稍微存在差别.

######  绘制圆角矩形:

绘制圆角矩形也提供了两种重载方式，如下：

```java
// 第一种
RectF rectF = new RectF(100,100,800,400);
canvas.drawRoundRect(rectF,30,30,mPaint);

// 第二种 在API21的时候才添加上
canvas.drawRoundRect(100,100,800,400,30,30,mPaint);

```
###### 绘制椭圆：

相对于绘制圆角矩形，绘制椭圆就简单的多了，因为他只需要一个矩形作为参数:

```java

// 第一种
RectF rectF = new RectF(100,100,800,400);
canvas.drawOval(rectF,mPaint);

// 第二种
canvas.drawOval(100,100,800,400,mPaint);

```
######  绘制圆：

绘制圆形也比较简单, 如下：

```java
//绘制圆形有四个参数，前两个是圆心坐标，第三个是半径，最后一个是画笔。
canvas.drawCircle(500,500,400,mPaint);  // 绘制一个圆心坐标在(500,500)，半径为400 的圆。

```

######  绘制圆弧：
```java

// 第一种 startAngle:开始角度,sweepAngle:扫过角度,useCenter:是否使用中心
//使用了中心点之后绘制出来类似于一个扇形，而不使用中心点则是圆弧起始点和结束点之间的连线加上圆弧围成的图形
public void drawArc(@NonNull RectF oval, float startAngle, float sweepAngle, boolean useCenter, @NonNull Paint paint){}

// 第二种
public void drawArc(float left, float top, float right, float bottom, float startAngle,
            float sweepAngle, boolean useCenter, @NonNull Paint paint) {}


```

##### Paint

绘制的基本形状由Canvas确定，但绘制出来的颜色,具体效果由Paint确定


######  画笔的三种模式

```java
STROKE                //描边
FILL                  //填充
FILL_AND_STROKE       //描边加填充
```
