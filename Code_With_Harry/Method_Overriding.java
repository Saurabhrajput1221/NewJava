package chpter10;

class A {
    int a;
    public void meth1(){
        System.out.println("this is method 1 in class A");
    }
    public void meth2(){
        System.out.println("this is method 2 in class A");
    }
}
class B extends A{
    @Override
    public void meth1(){
        System.out.println("this is method 1 in class B");
    }
}
public class Method_Overriding{
    public static void main(String[] args) {
        System.out.println("Method Overrinding.");
        A a = new A();
        a.meth1();
        B b = new B();
        b.meth1();

    }
}