# Collection和Iterator接口

## Iterable
public interface Iterable<T>实现这个接口允许对象成为 "foreach" 语句的目标.
方法:Iterator<T> iterator()
返回一个在一组 T 类型的元素上进行迭代的迭代器。

## Iterator
public interface Iterator<E>对 collection 进行迭代的迭代器。
迭代器允许调用者利用定义良好的语义在迭代期间从迭代器所指向的collection 移除元素.
* boolean hasNext():如果仍有元素可以迭代，则返回 true.(换句话说,如果next返回了元素而不是抛出异常，则返回 true)。
* E next():返回迭代的下一个元素;
* void remove():从迭代器指向的collection中移除迭代器返回的最后一个元素（可选操作）。每次调用next只能调用一次此方法。如果进行迭代时用调用此方法之外的其他方式修改了该迭代器所指向的collection，则迭代器的行为是不确定的。

## Collection
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
* <T> T[] toArray(T[] a):返回包含此collection中所有元素的数组；返回数组的运行时类型与指定数组的运行时类型相同。如果指定的数组能容纳该collection，则返回包含此collection元素的数组。否则，将分配一个具有指定数组的运行时类型和此collection大小的新数组。

## 使用Iterator接口遍历集合元素
Iterator仅用于遍历集合,其没有盛装对象的能力.Iterator并不把集合元素本身传给了迭代变量,而是把集合元素的值传给了迭代变量,所以修改迭代变量的值对集合元素本身没有任何影响.但是可以删除某个迭代变量的值.
```txt
while(iterator.hasNext()){
			String book=iterator.next();
			if(book.equals("book3")){
				//在迭代工程中,不能修改集合元素,否则会引发异常
				//books.remove(book);  会引发异常
				iterator.remove();//将删除books这一个元素
			}
			//这行代码,不会改变集合元素本身的值.没有任何效果.
			book="asd";
		}

````
## 使用foreach遍历集合元素
foreach中的集合迭代变量也不是集合元素本身,系统只是依次把集合元素的值赋给迭代变量,因此修改迭代变量的值没有任何意义,同时在foreach中也不能修改这个集合,否则会引发异常.
```txt
public static void main(String[] args) {
        Collection<String> books = new HashSet<String>();
        books.add(new String("轻量级Java EE企业应用实战"));
        books.add(new String("疯狂Java讲义"));
        books.add(new String("疯狂Android讲义"));
        for (String obj : books) {
            // 此处的book变量也不是集合元素本身
            String book =obj;
            System.out.println(book);
            if (book.equals("疯狂Android讲义")) {
                // 下面代码会引发ConcurrentModificationException异常
                // books.remove(book);
            }
        }
        System.out.println(books);
    }
```