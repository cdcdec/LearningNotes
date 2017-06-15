# CardView 

android.support.v7.widget.CardView,继承FrameLayout


```txt
<android.support.v7.widget.CardView
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:card_view="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="horizontal"
    card_view:cardBackgroundColor="@android:color/black"
    card_view:cardCornerRadius="10dp">

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="100dp"
        android:padding="1dp">

        <ImageView
            android:id="@+id/pic"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_centerInParent="true"
            android:scaleType="centerCrop" />
    </RelativeLayout>
</android.support.v7.widget.CardView>


```
## CardView属性介绍
* android:cardCornerRadius
  * 在xml文件中设置card圆角的大小
* CardView.setRadius
  * 在代码中设置card圆角的大小
* android:cardBackgroundColor
  * 在xml文件中设置card背景颜色
* android:elevation
  * 在xml文件中设置阴影的大小
* card_view:cardElevation
  * 在xml文件中设置阴影的大小
* card_view:cardMaxElevation
  * 在xml文件中设置阴影最大高度
* card_view:cardCornerRadius
在xml文件中设置卡片的圆角大小
* card_view:contentPadding
  * 在xml文件中设置卡片内容于边距的间隔
* card_view:contentPaddingBottom
  * 在xml文件中设置卡片内容于下边距的间隔
* card_view:contentPaddingTop
  * 在xml文件中设置卡片内容于上边距的间隔
* card_view:contentPaddingLeft
  * 在xml文件中设置卡片内容于左边距的间隔
* card_view:contentPaddingRight
  * 在xml文件中设置卡片内容于右边距的间隔
* card_view:contentPaddingStart
  * 在xml文件中设置卡片内容于边距的间隔起始
* card_view:contentPaddingEnd
  * 在xml文件中设置卡片内容于边距的间隔终止
* card_view:cardUseCompatPadding
  * 在xml文件中设置内边距，V21+的版本和之前的版本仍旧具有一样的计算方式
* card_view:cardPreventConrerOverlap
  * 在xml文件中设置内边距，在V20和之前的版本中添加内边距，这个属性为了防止内容和边角的重叠.


