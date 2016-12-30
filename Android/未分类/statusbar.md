# statusbar 状态栏

##### 获取状态栏高度

* 方法1

```txt
//必须在view已经绘制完毕后才能调用
Rect  rect=new  Rect();
view.getWindowVisibleDisplayFrame(rect);
int statusBar=rect.top;

```

* 方法2

```txt
//在view绘制前就可以调用
public static int getStatusBarHeight(Context context) {  
        Class<?> c = null;  
        Object obj = null;  
        java.lang.reflect.Field field = null;  
        int x = 0;  
        int statusBarHeight = 0;  
        try {  
            c = Class.forName("com.android.internal.R$dimen");  
            obj = c.newInstance();  
            field = c.getField("status_bar_height");  
            x = Integer.parseInt(field.get(obj).toString());  
            statusBarHeight = context.getResources().getDimensionPixelSize(x);  
            return statusBarHeight;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return statusBarHeight;  
    }

```

* 方法3

屏幕高度-根布局.getHeight()-actionbar高度=statusBar的高度;

actionBar高度的获取？？？
