# ConstraintLayout
## 引入
```txt
compile 'com.android.support.constraint:constraint-layout:1.0.0-alpha8'
```

```txt
<android.support.constraint.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/activity_main_done"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    >
    .....
</android.support.constraint.ConstraintLayout>

```


## 继承
android.support.constraint.ConstraintLayout继承自ViewGroup
## 使用

### 通过边建立约束

app:layout_constraintAAAA_toBBBBOf
其中AAAA BBBB代表控件的Top,Bottom,Left,Right。
例如:
```txt
//代表此widget的底边与它的父widget的底边建立约束.这里parent也可以写成这个父widget的id.
app:layout_constraintBottom_toBottomOf="parent" 

app:layout_constraintLeft_toLeftOf="@+id/activity_main_done"

```

给控件指定起始位置,之后的margin是在这个值的基础上进行偏移的:

```txt
app:layout_constraintStart_toStartOf  
app:layout_constraintEnd_toEndOf  
app:layout_constraintStart_toEndOf  
app:layout_constraintEnd_toStartOf  

```

app:layout_constraintCenterX_toCenterX  
app:layout_constraintCenterY_toCenterY

宽高以固定比例展示:
app:layout_constraintDimensionRatio="1:3"表示宽高比为1:3,这个属性生效需要以下条件:
*  left ，right ，top ，bottom四条边都需要约束，bottom的约束可以用baseline代替;
*  宽高至少有一个是0dp或者-1dp，如果都是0dp的则会以父布局能容下的最大范围显示;




### 内容对齐
app:layout_constraintBaseline_toBaselineOf="@+id/cameraType"

### 绝对位置
app:layout_editor_absoluteX
app:layout_editor_absoluteY

### 偏移
默认值是0.5(也就是中心)
0.0表示最顶部或者最左边,1.0表示最底部或者最右边.
app:layout_constraintVertical_bias="0.5" 表示widget的顶部和底部约束的偏移;
app:layout_constraintHorizontal_bias=“0.5”表示widget的左边和右边约束的偏移;

### 比重
app:layout_constraintHorizontal_weight = ""
app:layout_constraintVertical_weight = ""



