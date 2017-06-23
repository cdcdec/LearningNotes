# Canvas drawBitmapMesh方法

>   android.graphics.Canvas
 
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
把一个位图横向分成a块,纵向分成b块,则这个图一共形成了(a+1)乘以(b+1)个点.假设这个图是4px宽,4px高,横向被分成2块,纵向被分成2块,那么分成点的坐标为:
* 第一行 (0,0),(2,0),(4,0)---对应verts[0]=0,verts[1]=0,verts[2]=2,verts[3]=0,verts[4]=4,verts[5]=0;
* 第二行 (0,2),(2,2),(4,2)
* 第三行 (0,4),(2,4),(4,4)





