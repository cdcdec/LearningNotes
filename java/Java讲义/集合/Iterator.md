# Iterator
public interface Iterator<E>对 collection 进行迭代的迭代器。
迭代器允许调用者利用定义良好的语义在迭代期间从迭代器所指向的collection 移除元素.
* boolean hasNext():如果仍有元素可以迭代，则返回 true.(换句话说,如果next返回了元素而不是抛出异常，则返回 true)。
* E next():返回迭代的下一个元素;
* void remove():从迭代器指向的collection中移除迭代器返回的最后一个元素（可选操作）。每次调用next只能调用一次此方法。如果进行迭代时用调用此方法之外的其他方式修改了该迭代器所指向的collection，则迭代器的行为是不确定的。