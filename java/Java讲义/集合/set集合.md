# set集合
## Set接口
interface Set<E> extends Collection<E>,一个不包含重复元素的collection,并且最多包含一个null元素.set不包含满足e1.equals(e2)的元素对e1和e2。与e1和e2是否是同一个对象无关。即e1和e2可能是不同的对象,但是e1和e2通过equal比较后,返回true,则Set里面不能同时出现e1,e2.

## HashSet
HashSet<E>extends AbstractSet<E>implements Set<E>, Cloneable, Serializable
* 不能保证元素的顺序;
* 是不同步的。
* 集合元素可以是null。
* 对基本的操作:add、remove、contains和size提供稳定的性能。
* 判断两个元素相等的标准是两个对象通过equal()方法比较相等,并且两个对象的hashCode()方法返回值也相等.
* 对此set进行迭代所需的时间与HashSet实例的大小(元素的数量)和底层HashMap实例(桶的数量)的“容量”的和成比例。因此，如果迭代性能很重要，则不要将初始容量设置得太高（或将加载因子设置得太低）。
### 构造方法
* public HashSet():构造一个新的空set，其底层HashMap实例的默认初始容量是16，加载因子是0.75。
* HashSet(Collection<? extends E> c):构造一个包含指定collection中的元素的新set。使用默认的加载因子 0.75 和足以包含指定collection中所有元素的初始容量来创建HashMap.
* HashSet(int initialCapacity,float loadFactor):构造一个新的空set，其底层HashMap实例具有指定的初始容量和指定的加载因子.
* HashSet(int initialCapacity):构造一个新的空set，其底层HashMap实例具有指定的初始容量和默认的加载因子(0.75).

## LinkedHashSet
LinkedHashSet<E>extends HashSet<E>implements Set<E>, Cloneable, Serializable:
具有可预知迭代顺序的Set接口的哈希表和链接列表实现,此链接列表定义了迭代顺序，即按照将元素插入到set中的顺序(插入顺序)进行迭代。
* 允许null值,线程不安全的.
* add、contains和remove性能比HashSet稍差一点,但是迭代所需时间与set的大小成正比，而与容量无关,性能比HashSet高。
### 构造方法
与HashSet的构造方法类似。




