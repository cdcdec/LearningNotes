# Map
public interface Map<K,V>将键映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射到一个值。允许以键集、值集或键-值映射关系集的形式查看某个映射的内容。

此接口内的接口:public static interface Map.Entry<K,V>:映射项（键-值对）。Map.entrySet方法返回映射的collection视图，其中的元素属于此类。获得映射项引用的唯一 方法是通过此collection视图的迭代器来实现。
    * K getKey():返回与此项对应的键。
    * V getValue():返回与此项对应的值。如果已经从底层映射中移除了映射关系(通过迭代器的remove操作)，则此调用的结果是不确定的。


* Set<Map.Entry<K,V>> entrySet():返回此映射中包含的映射关系的Set视图.