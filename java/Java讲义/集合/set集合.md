# set集合
## Set接口
interface Set<E> extends Collection<E>,一个不包含重复元素的collection,并且最多包含一个null元素.set不包含满足e1.equals(e2)的元素对e1和e2。与e1和e2是否是同一个对象无关。即e1和e2可能是不同的对象,但是e1和e2通过equal比较后,返回true,则Set里面不能同时出现e1,e2.

## HashSet
HashSet<E>extends AbstractSet<E>implements Set<E>, Cloneable, Serializable
* 不能保证元素的顺序;
* 是不同步的。
* 集合元素可以是null。
* 判断两个元素相等的标准是两个对象通过equal()方法比较相等,并且两个对象的hashCode()方法返回值也相等.


