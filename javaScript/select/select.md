# select

## 获取select的值

```txt
function getIndexValueText(){
    var sel=document.getElementById("selectID");
    //获取索引值
    var index=sel.selectedIndex;
    //获取索引对应的value值,即是option标签的value属性的值,如果没有这个属性,则获得option的值;
    var value_value=sel.options[index].value;
    //获取索引对应的值,即option元素的值。
    var txt_show=sel.options[index].text;

}
```

## 通过js改变select的取值

```txt
function changeSelect(){
    var sel=document.getElementById("selectID");
    //将select中的第四个option做为选中值,索引是从0开始的
    sel.options[4].selected=true;
}
```
