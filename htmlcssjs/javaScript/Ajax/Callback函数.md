# Callback函数
callback函数是一种以参数形式传递给另一个函数的函数。
```txt
//callBack是回调函数
function loadXMLDoc(url,callBack){
	var xmlhttp=new XMLHttpRequest();
	xmlhttp.onreadystatechange=callBack;
	xmlhttp.open("GET",url,true);
	xmlhttp.send();
}
function myFunction(){
	loadXMLDoc("/ajax/test1.txt",function(){
		if(xmlhttp.readyState==4 && xmlhttp.status==200){
    		document.getElementById("myDiv").innerHTML=xmlhttp.responseText;
    	}
	});
}
```


