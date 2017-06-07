# StringBuilder
1.StringBuilder清空
* 使用delete,sb.delete(0, sb.length());----效率高
* 使用setLength,sb.setLength(0);---效率次之
* 新生成一个,旧的由系统自动回收;---效率最差