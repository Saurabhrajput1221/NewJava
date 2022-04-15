package chpter10;
class Myclass{
    int a;
    Myclass(int a){
        // use of this.
        System.out.println("my class");
       this.a = a;
    }
    public int get(){
        return a;
    }
    public int returnone(){
        return 1;
    }

}
class Myclass2 extends Myclass{
    Myclass2(int b){
        super(b);
        System.out.println("this is my child class " + b);
    }
}

public class this_super {
     public static void main(String[] args) {
         System.out.println("this and super.");
         Myclass Newclass = new Myclass(7);
         System.out.println(Newclass.get());

         Myclass2 newclass2 = new Myclass2(8);
  

     }
}
