public class HelloWorld{
  public static void main(String [] strs){
    if(strs.length>0){
      for(int i=0;i<strs.length;i++){
        System.out.println("=="+strs[i]);
      }
    }
    System.out.println("java 程序!");
  }
}
