# StringStringBufferStringBuilder

## String

用于封装字符串(一连串的字符序列)的一个类,是不可变类,一旦一个String对象被创建后,包含在这个对象中的字符序列就不可改变了,直至这个对象被销毁。

## StringBuffer

StringBuffer代表一个字符序列可变的字符串,一个StringBuilder对象被创建后,通过StringBuffer对象的append(),insert(),reverse(),setCharAt(),setLength()等方法可以改变这个字符串对象的字符序列。

## StringBuilder

与StringBuffer功能类似,但是没有实现线程安全功能,效率比StringBuffer高。
