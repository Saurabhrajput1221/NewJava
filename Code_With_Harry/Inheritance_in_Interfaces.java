interface SampleInterface{
    void meth1();
    void meth2();

}
interface childInterface extends SampleInterface{
    void meth3();
    void meth4();
}
class MainClass implements childInterface{
  public  void meth1(){
      System.out.println("Method1");
  }
  public  void meth2(){
    System.out.println("Method2");
}
public  void meth3(){
    System.out.println("Method3");
}
public  void meth4(){
    System.out.println("Method4");
}
}

public class Inheritance_in_Interfaces {
    public static void main(String[] args) {
        System.out.println("Inheritance_in_Interfaces..");
       MainClass obj = new MainClass();
       obj.meth1();
       obj.meth2();
       obj.meth3();
       obj.meth4();
  
    }
}
