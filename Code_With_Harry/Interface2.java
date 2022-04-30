interface Mywifi {
    void howmanyconnected(int n);

}
interface Mycamera{
    void howmuchMegafixle(int m);
}
class oldphone{
    void callNumber(){
        System.out.println("you can just call to someone in old phone");

    }
    void picCall(){
        System.out.println("you can just Pick call of someone in old phone");
    }
}
class Smartphone extends oldphone implements Mywifi, Mycamera{

    void Mysmartphone(){
        System.out.println("This is smart phone");
    }
    public void howmanyconnected(int n){
        
        System.out.println(  n +" peoples are connected" );
    }
    public void howmuchMegafixle(int m ){
        System.out.println("my camera is "+ m + " Megafixle..");
    }
    public void callNumber(){
        System.out.println("old phone");
    }
}

public class Interface2 {
    public static void main(String[] args) {
        System.out.println("This is Interface2");
        Smartphone Newphone = new Smartphone();
        Newphone.Mysmartphone();
        Newphone.howmanyconnected(6);
        Newphone.howmuchMegafixle(64);
        Newphone.callNumber();
    }
}
