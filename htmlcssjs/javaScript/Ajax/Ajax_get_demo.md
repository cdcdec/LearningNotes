# Ajax_get_demo
```txt
function loadTxt(){
var xmlhttp=new XMLHttpRequest();
xmlhttp.onreadystatechange=function(){
  if (xmlhttp.readyState==4 && xmlhttp.status==200){
    document.getElementById("myDiv").innerHTML=xmlhttp.responseText;
    }
  }
//xmlhttp.open("GET","cdc.txt",true);此种方法有可能获得的是服务器上的缓存,向URL添加一个唯一的ID,可以获得最新的结果,如下所示:
xmlhttp.open("GET","cdc.txt?t=" + Math.random(),true);
xmlhttp.send();
}
```

