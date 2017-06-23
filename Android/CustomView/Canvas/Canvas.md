# Canvas

>   android.graphics.Canvas
 

The Canvas class holds the "draw" calls. To draw something, you need 4 basic components: A Bitmap to hold the pixels, a Canvas to host the draw calls (writing into the bitmap), a drawing primitive (e.g. Rect, Path, text, Bitmap), and a paint (to describe the colors and styles for the drawing).

## 绘制方法，以drawXXX为主的绘制方法：
* void drawARGB (int a,int r,int g,int b):统一颜色绘制，四个参数取值范围0~255
* void drawArc (RectF oval, float startAngle, float sweepAngle, boolean useCenter, Paint paint):绘制弧面或弧线。对于绘制对应图形的填充面，还是图形的轮廓线，这在于画笔Paint中的setStyle。
    * oval：矩形；
    * startAngle：起点角度，0度的角度对应于0度的几何角（在手表3点钟）；
    * sweepAngle：顺时针扫过的角度；
    * useCenter：弧面或弧线；
    * paint：画笔
    ```txt
    //弧面
    RectF rectF = new RectF(100f, 100f, 500f, 500f);
    canvas.drawArc(rectF, 0, 150, true, mPaint);
    //弧形
    RectF rectF = new RectF(100f, 100f, 500f, 500f);
    canvas.drawArc(rectF, 0, 150, false, mPaint);
    ```
* drawBitmap:绘制使用指定的矩阵的位图
```txt
//方法1
void drawBitmap (Bitmap bitmap,float left, float top, Paint paint) 
//方法2               
void drawBitmap (Bitmap bitmap, Rect src, Rect dst, Paint paint)
//方法3               
void drawBitmap (Bitmap bitmap, Matrix matrix, Paint paint)

mBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.logo);
canvas.drawBitmap(mBitmap, 0, 0, mPaint);
//绘制Bitmap的一部分，并对其拉伸
//srcRect绘制Bitmap的哪一部分
Rect src = new Rect(0, 0, mBitmap.getWidth(), mBitmap.getHeight() / 3);
//dstRecF绘制的Bitmap拉伸到哪里
RectF dst = new RectF(0, mBitmap.getHeight(), canvas.getWidth(), mBitmap.getHeight() + 200);
canvas.drawBitmap(mBitmap, src, dst, mPaint);
Matrix matrix = new Matrix();
matrix.postTranslate(0, mBitmap.getHeight() + 200);
canvas.drawBitmap(mBitmap, matrix, mPaint);

```
* drawBitmapMesh:绘制网格顶点被均匀地分布在该位图
```txt
void drawBitmapMesh (Bitmap bitmap, int meshWidth,int meshHeight,float[] verts, int vertOffset,int[] colors,int colorOffset, Paint paint)
bitmap：位图
meshWidth：横向上把该源位图划成成多少格
meshHeight：竖向上把该源位图划成成多少格
verts：长度为(meshWidth + 1)乘以(meshHeight + 1)除以2的数组，它记录了扭曲后的位图各顶点位置;
vertOffset：控制verts数组中从第几个数组元素开始才对bitmap进行扭曲
colors：可以为null，指定在每个顶点，其值由对应的位图颜色相乘内插的颜色。如果不为空，必须有至少（meshWidth+ 1）*（meshHeight+ 1）+ colorOffset数组中的值。
colorOffset int: Number of color elements to skip before drawing
paint：画笔，可以为null


```
* drawCircle:绘制圆
```txt
void drawCircle (float cx, float cy, float radius, Paint paint)
//cx，cy代表圆心的坐标
//radius圆的半径
//paint画笔
canvas.drawCircle(500f, 500f, 200, mPaint);
```
* void drawColor (int color):设置画布颜色
* drawLine:画线
```txt
//方法一,startX，startY起点坐标,stopX，stopY终点坐标,paint画笔
void drawLine (float startX, float startY, float stopX, float stopY, Paint paint)
//canvas.drawLine(100f,100f,500f,500f,mPaint);
//方法二,pts：绘制直线的端点数组，每条直线占用4个数据，即起终点坐标。
paint：绘制直线所使用的画笔。
void drawLines (float[] pts, Paint paint)
float[] pts = {100f, 100f, 400f, 400f,
                400f, 400f, 250f, 560f,
                250f, 560f, 400f, 800f,
                400f, 800f, 280f, 880f};
canvas.drawLines(pts, mPaint);
//方法三,pts:绘制直线的端点数组,每条直线占用4个数据,即起终点坐标。
offset：跳过的数据个数，取值为4的倍数。
count：实际参与绘制的数据个数。
paint：绘制直线所使用的画笔。            
void drawLines (float[] pts, int offset, int count, Paint paint)
float[] pts = {100f, 100f, 400f, 400f,
                400f, 400f, 250f, 560f,
                250f, 560f, 400f, 800f,
                400f, 800f, 280f, 880f};
//有选择地绘制直线
canvas.drawLines(pts, 4, 8, mPaint);

```
* void drawOval (RectF oval,Paint paint):绘制椭圆
```txt
RectF rectF = new RectF(100f, 100f, 600f, 500f);
//等同于圆的效果
//RectF rectF = new RectF(100f, 100f, 500f, 500f);
canvas.drawOval(rectF, mPaint);

```
* void drawPath (Path path,Paint paint):绘制路径
```txt
Path path = new Path();
//向Path中加入Arc
RectF arcRecF = new RectF(0, 0, 500, 500);
path.addArc(arcRecF, 0, 135);
canvas.drawPath(path, mPaint);
```
* void drawPoint (float x, float y, Paint paint)drawPoint:绘制点，x，y分别是点坐标.
```txt
void drawPoints (float[] pts, 
                int offset, 
                int count, 
                Paint paint)
void drawPoints (float[] pts, 
                Paint paint)

```
* drawPoints与drawLines类似
* void drawRGB (int r, int g, int b):RGB绘制画布颜色，取值也是0~255
* drawRect:绘制矩形,
```txt
//前四个参数分别表示矩形的左，顶，右，低
void drawRect (float left, float top, float right, float bottom, Paint paint)
void drawRect (Rect r,Paint paint)
void drawRect (RectF rect,Paint paint)
Rect 和 RectF区别是Rect初始化 是int，RectF 是float


```
* drawRoundRect:绘制圆矩形,rx：圆角x方向的半径,ry：圆角y方向的半径
```txt
void drawRoundRect (RectF rect, float rx, float ry, Paint paint)
RectF rectF = new RectF(100f, 100f, 500f, 500f);
canvas.drawRoundRect(rectF, 50, 150, mPaint);

```
* drawText绘制文本
```txt

void drawText (CharSequence text, int start, int end, float x, float y, Paint paint);
void drawText (String text, float x, float y, Paint paint);
void drawText (String text, int start, int end, float x, float y, Paint paint)
//start：指的文本从哪个开始；end：文本结束的位置；x，y：文本起点
mPaint.setTextSize(50);
String text = "我的微信公众号：吴小龙同学";
canvas.drawText(text, 2, text.length(), 100, 100, mPaint)
canvas.drawText("我的微信公众号：吴小龙同学", 100, 400, mPaint);


```
* drawTextOnPath:沿着Path绘制一段文字,hOffset:与路径起始点的水平偏移距离;vOffset:与路径中心的垂直偏移量.
```txt
void drawTextOnPath (String text, Path path, float hOffset, float vOffset,Paint paint)
void drawTextOnPath (char[] text, int index, int count, Path path, float hOffset, float vOffset, Paint paint)

Path path = new Path();
//Path.Direction.CW，沿外环；Path.Direction.CCW，沿内环
path.addCircle(500, 500, 200, Path.Direction.CW);
mPaint.setTextSize(50);
// 绘制路径
canvas.drawPath(path, mPaint);
String text = "我的微信公众号：吴小龙同学";
canvas.drawTextOnPath(text, path, 0f, 0f, mPaint);



```
* drawVertices:绘制顶点数组
```txt
void drawVertices (Canvas.VertexMode mode, 
                int vertexCount, 
                float[] verts, 
                int vertOffset, 
                float[] texs, 
                int texOffset, 
                int[] colors, 
                int colorOffset, 
                short[] indices, 
                int indexOffset, 
                int indexCount, 
                Paint paint)
```

## 裁剪方法,以clipXXX为主的
* clipPath:裁剪路径,op:各种裁剪组合模式,有六个枚举常量:
```txt
//op:各种裁剪组合模式,有六个枚举常量

boolean clipPath (Path path, Region.Op op)
boolean clipPath (Path path)
Path path = new Path();
RectF arcRecF = new RectF(0, 0, 500, 500);
path.addArc(arcRecF, 0, 135);
canvas.clipPath(path);
canvas.drawColor(Color.RED);

```
* clipRect:裁剪矩形
boolean clipRect (float left, float top, float right, float bottom, Region.Op op)
boolean clipRect (RectF rect)
boolean clipRect (int left, int top, int right, int bottom)
boolean clipRect (RectF rect, Region.Op op)
boolean clipRect (Rect rect)

canvas.clipRect(100, 100, 400, 500);
canvas.drawColor(Color.RED);
```txt
Region.Op,各种裁剪组合模式，有六个枚举常量:
// 填充颜色
canvas.drawColor(Color.BLUE);
canvas.save();
canvas.clipRect(100, 100, 400, 500);
canvas.clipRect(200, 200, 600, 600, Region.Op.DIFFERENCE);
canvas.drawColor(Color.RED);
canvas.restore();
// 绘制和裁剪一样的矩形便于观察
canvas.drawRect(100, 100, 400, 500, mPaint);
canvas.drawRect(200, 200, 600, 600, mPaint);

Region.Op DIFFERENCE,Region.Op INTERSECT,Region.Op REPLACE,Region.Op REVERSE_DIFFERENCE,Region.Op UNION,Region.Op XOR


```

## 变换方法
rotate，scale、skew、translate旋转、缩放、错切、平移
* rotate:
void rotate (float degrees)
void rotate (float degrees, float px, float py)
画布的旋转
degrees：顺时针旋转的角度
px和py 基准点平移，默认起点（0,0）
```txt
canvas.drawColor(Color.BLUE);
canvas.drawRect(new Rect(0, 0, 400, 400), mPaint);
mPaint.setColor(Color.YELLOW);
canvas.rotate(45);
canvas.drawRect(new Rect(0, 0, 400, 400), mPaint);

```

* scale
//方法1
void scale (float sx, float sy)
画布的缩放
sx、sy是x、y方向上缩放的倍数
```txt
canvas.drawColor(Color.BLUE);
mPaint.setColor(Color.GREEN);
canvas.drawRect(0, 0, 400, 500, mPaint);
canvas.scale(0.5f, 0.5f);
mPaint.setColor(Color.RED);
canvas.drawRect(0, 0, 400, 500, mPaint);
```

//方法2
void scale (float sx,  float sy, float px,float py)
px和py 分别为缩放的基准点。
```txt
canvas.drawColor(Color.BLUE);
mPaint.setColor(Color.GREEN);
canvas.drawRect(0, 0, 400, 500, mPaint);
// 保存画布状态
canvas.save();
canvas.scale(0.5f, 0.5f);
mPaint.setColor(Color.RED);
canvas.drawRect(0, 0, 400, 500, mPaint);
canvas.restore();
canvas.scale(0.5f, 0.5f, 200, 200);
mPaint.setColor(Color.WHITE);
canvas.drawRect(0, 0, 400, 500, mPaint);

```

* void skew (float sx,float sy):画布的错切
float sx:将画布在x方向上倾斜相应的角度，sx为倾斜角度的tan值；
float sy:将画布在y轴方向上倾斜相应的角度，sy为倾斜角度的tan值；
比如在X轴方向上倾斜45度，tan45=1;

* void translate (float dx,float dy):画布的平移,dx，dy平移量
```txt
canvas.drawColor(Color.BLUE);
//坐标从起点（0,0）变成了（100,100）
canvas.translate(100, 100);
canvas.drawRect(new Rect(0, 0, 400, 400), mPaint);
```

## 画布锁定和还原
以saveXXX和restoreXXX构成的画布锁定和还原

```txt
int save (int saveFlags)
int save ()
void restore ()
```

```txt
save 保存当前矩阵，剪辑到一个私有堆栈。save()方法之后的代码，可以调用Canvas的平移、放缩、旋转、裁剪等操作
restore 恢复Canvas之前保存的状态
save和restore要配对使用，restore可以比save少，但不能多，如果restore调用次数比save多，会引发Error。

```
