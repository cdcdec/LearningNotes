# js获取font-size的值
## chrome FF
```txt
//chrome FF
var h = document.getElementsByTagName('html')[0];
var fontSize = window.getComputedStyle(h, null).getPropertyValue('font-size');
```

## IE
```txt
//IE
var h = document.getElementsByTagName('html')[0];
var fontSize = window.currentStyle['font-size'];
```