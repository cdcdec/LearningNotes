# Map

> Map类提供了一个称为entrySet()的方法，这个方法返回一个Map.Entry实例化后的对象集。接着，Map.Entry类提供了一个getKey()方法和一个getValue()方法,Map.Entry同时也提供了一个setValue()方法,可以使用它修改map里面的值。

- 获取key

## 方法1

```txt
Map<String, String> map = new HashMap();       

for (Map.Entry entry : map.entrySet()) {  
    Object key = entry.getKey( );      
}
```

## 方法2

```txt
Map   hashmap =new  HashMap();       

Set  set=hashmap.entrySet();       

Iterator   iterator=set.iterator();       

while (iterator.hasNext() {       

    Map.Entry  mapentry = (Map.Entry) iterator.next();       

    System.out.println(mapentry.getkey()+"/"+ mapentry.getValue());       

}
```

## 方法3

```txt

Set keys = map.keySet( );       

if(keys != null) {       

    Iterator iterator = keys.iterator( );       

    while(iterator.hasNext( )) {       

        Object key = iterator.next( );       

        Object value = map.get(key);       

    }       

}
```
