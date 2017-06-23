# View

>   android.view.View
 
## View类的四个构造函数
* public View(Context context):通过java代码创建View时调用;
* public View(Context context, @Nullable AttributeSet attrs),系统从xml中获取View时系统会主动调用这个函数;
* public View(Context context, @Nullable AttributeSet attrs, int defStyleAttr)
* public View(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes)


## View构造函数中的参数
* Context：上下文
* AttributeSet attrs:从xml中定义的参数
* int defStyleAttr:主题中优先级最高的属性
* int defStyleRes:优先级次之的内置于View的style

在android中的属性可以在多个地方进行赋值,涉及到的优先级排序为:
Xml直接定义 > xml中style引用 > defStyleAttr > defStyleRes > theme直接定义

## View获取xml中定义的属性,以ImageView为例：
D:\Android\sdk\sources\android-25\android\widget:中ImageView.java中:四个构造函数的调用情况如下:
```txt
//系统不会主动调用,程序员调用
public ImageView(Context context) {
        super(context);
        initImageView();
    }
//只要在xml文件中定义了这个View,系统就会主动调用此函数
public ImageView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }
//系统不会主动调用,程序员调用
public ImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }
//系统不会主动调用,程序员调用
public ImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr,int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
    .....省略其它代码
    //获取属性的代码部分
    final TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ImageView, defStyleAttr, defStyleRes);
    //
    final Drawable d = a.getDrawable(R.styleable.ImageView_src);
    //
    mBaselineAlignBottom = a.getBoolean(R.styleable.ImageView_baselineAlignBottom, false);
    mBaseline = a.getDimensionPixelSize(R.styleable.ImageView_baseline, -1);
    setAdjustViewBounds(a.getBoolean(R.styleable.ImageView_adjustViewBounds, false));
    setMaxWidth(a.getDimensionPixelSize(R.styleable.ImageView_maxWidth, Integer.MAX_VALUE));
    setMaxHeight(a.getDimensionPixelSize(R.styleable.ImageView_maxHeight, Integer.MAX_VALUE));
    final int index = a.getInt(R.styleable.ImageView_scaleType, -1);
    ....
    //获取所有的属性后调用下面的代码
    a.recycle();
}
ImageView中可以在xml中定义的属性定义在下面的文件中:
D:\Android\sdk\platforms\android-25\data\res\values文件夹中的文件:attrs.xml中的节点如下(其父节点是:<resources>):
```txt
<declare-styleable name="ImageView">
    <!-- Sets a drawable as the content of this ImageView. -->
    <attr name="src" format="reference|color" />
    <!-- Controls how the image should be resized or moved to match the size
         of this ImageView.  See {@link android.widget.ImageView.ScaleType} -->
    <attr name="scaleType">
        <!-- Scale using the image matrix when drawing. See
             {@link android.widget.ImageView#setImageMatrix(Matrix)}. -->
        <enum name="matrix" value="0" />
        <!-- Scale the image using {@link android.graphics.Matrix.ScaleToFit#FILL}. -->
        <enum name="fitXY" value="1" />
        <!-- Scale the image using {@link android.graphics.Matrix.ScaleToFit#START}. -->
        <enum name="fitStart" value="2" />
        <!-- Scale the image using {@link android.graphics.Matrix.ScaleToFit#CENTER}. -->
        <enum name="fitCenter" value="3" />
        <!-- Scale the image using {@link android.graphics.Matrix.ScaleToFit#END}. -->
        <enum name="fitEnd" value="4" />
        <!-- Center the image in the view, but perform no scaling. -->
        <enum name="center" value="5" />
        <!-- Scale the image uniformly (maintain the image's aspect ratio) so both dimensions
             (width and height) of the image will be equal to or larger than the corresponding
             dimension of the view (minus padding). The image is then centered in the view. -->
        <enum name="centerCrop" value="6" />
        <!-- Scale the image uniformly (maintain the image's aspect ratio) so that both
             dimensions (width and height) of the image will be equal to or less than the
             corresponding dimension of the view (minus padding). The image is then centered in
             the view. -->
        <enum name="centerInside" value="7" />
    </attr>
    <!-- Set this to true if you want the ImageView to adjust its bounds
         to preserve the aspect ratio of its drawable. -->
    <attr name="adjustViewBounds" format="boolean" />
    <!-- An optional argument to supply a maximum width for this view.
         See {see android.widget.ImageView#setMaxWidth} for details. -->
    <attr name="maxWidth" format="dimension" />
    <!-- An optional argument to supply a maximum height for this view.
         See {see android.widget.ImageView#setMaxHeight} for details. -->
    <attr name="maxHeight" format="dimension" />
    <!-- The tinting color for the image. By default, the tint will blend using SRC_ATOP mode.
         Please note that for compatibility reasons, this is NOT consistent with the default
         SRC_IN tint mode used by {@link android.widget.ImageView#setImageTintList} and by
         similar tint attributes on other views. -->
    <attr name="tint" format="color" />
    <!-- If true, the image view will be baseline aligned with based on its
         bottom edge. -->
    <attr name="baselineAlignBottom" format="boolean" />
     <!-- If true, the image will be cropped to fit within its padding. -->
    <attr name="cropToPadding" format="boolean" />
    <!-- The offset of the baseline within this view. See {see android.view.View#getBaseline}
         for details -->
    <attr name="baseline" format="dimension" />
    <!-- @hide The alpha value (0-255) set on the ImageView's drawable. Equivalent
         to calling ImageView.setAlpha(int), not the same as View.setAlpha(float). -->
    <attr name="drawableAlpha" format="integer" />
    <!-- Blending mode used to apply the image tint. -->
    <attr name="tintMode" />
</declare-styleable>

通过declare-styleable在xml中定义后,系统会自动在R类中的内部类R.styleable中生成变量R.styleable.ImageView,以及R.styleable.ImageView_src等变量.
```







