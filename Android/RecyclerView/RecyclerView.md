# RecyclerView

> RecyclerView 小部件比 ListView 更高级且更具灵活性。 此小部件是一个用于显示庞大数据集的容器，可通过保持有限数量的视图进行非常有效的滚动操作。 如果您有数据集合，其中的元素将因用户操作或网络事件而在运行时发生改变，请使用 RecyclerView 小部件。

## 简介

RecyclerView 类别将通过提供下列功能简化庞大数据集的显示与处理：

- 用于项目定位的布局管理器
- 用于通用项目操作（例如删除或添加项目）的默认动画 您也可灵活选择如何为 RecyclerView 小部件定义自定义布局管理器与动画。

## 使用

如果要使用 RecyclerView 小部件，您必须指定一个适配器和一个布局管理器。布局管理器将确定 RecyclerView 内各项目视图的位置并决定何时重新使用用户已不可见的项目视图。如果要重新使用（或重复使用）一个视图，布局管理器可能会要求适配器以数据集中的另一个元素替换视图的内容。 以此方式重复使用视图将可避免创建不必要的视图或执行成本高昂的 findViewById() 查找，从而改善性能。

### RecyclerView 提供这些内置布局管理器:

- LinearLayoutManager 以垂直或水平滚动列表方式显示项目。
- GridLayoutManager 在网格中显示项目。
- StaggeredGridLayoutManager 在分散对齐网格中显示项目。 如果要创建一个自定义布局管理器，请扩展 RecyclerView.LayoutManager类别。

### 如果要创建一个适配器，请扩展 RecyclerView.Adapter 类别。

## 动画

RecyclerView 在默认情况下启用增添与删除项目的动画。如果要自定义这些动画，请扩展 RecyclerView.ItemAnimator 类别并使用 RecyclerView.setItemAnimator() 方法。
