# Collection
public interface Collection<E> extends Iterable<E>:
根接口,表示一组对象，这些对象也称为collection的元素.一些collection允许有重复的元素，而另一些则不允许。一些collection是有序的，而另一些则是无序的。

* boolean add(E e):确保此collection包含指定的元素(可选操作).如果此collection由于调用而发生更改，则返回true.(如果此collection不允许有重复元素，并且已经包含了指定的元素，则返回false).
* boolean addAll(Collection<? extends E> c)将指定collection中的所有元素都添加到此collection中（可选操作）
* void clear():移除此collection中的所有元素(可选操作).
* boolean contains(Object o):如果此collection包含指定的元素，则返回true.
* boolean containsAll(Collection<?> c):如果此collection包含指定collection中的所有元素，则返回true.
* boolean isEmpty():如果此collection不包含元素，则返回true。
* Iterator<E> iterator():返回在此collection的元素上进行迭代的迭代器。关于元素返回的顺序没有任何保证（除非此collection是某个能提供保证顺序的类实例）。
* boolean remove(Object o):从此collection中移除指定元素的单个实例，如果存在的话（可选操作）。更确切地讲，如果此collection包含一个或多个满足 (o==null ? e==null : o.equals(e)) 的元素 e，则移除这样的元素。
* boolean removeAll(Collection<?> c):移除此collection中那些也包含在指定collection中的所有元素（可选操作）。此调用返回后,collection中将不包含任何与指定collection相同的元素。
* boolean retainAll(Collection<?> c):仅保留此collection中那些也包含在指定collection的元素（可选操作）。换句话说，移除此collection中未包含在指定collection中的所有元素。
* int size():返回此collection中的元素数。如果此collection包含的元素大于Integer.MAX_VALUE，则返回Integer.MAX_VALUE。
* Object[] toArray():返回包含此collection中所有元素的数组。如果collection对其迭代器返回的元素顺序做出了某些保证，那么此方法必须以相同的顺序返回这些元素.
* 