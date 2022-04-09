package chpter10;
class Base1{
    Base1(){
        System.out.println("I am a constructor.");
    }
    Base1(int p){
        System.out.println("I have only one valve " + p);
    }
}
class Derived extends Base1{
     int y ;
     Derived(){
        System.out.println("Child class constructor.");
     }
     Derived(int a, int b){
         super(a);
         System.out.println("I have Two valves " + a + " and " + b  );
     }
    
     public void sety(int n){
         y = n;
     }
     public int gety(){
         return y;
     }
}
class childOfDerived extends Derived{
    childOfDerived(){
        System.out.println("I am a Child Of Derived ");
    }
    childOfDerived(int a , int b , int c){
        super(a , b);
        System.out.println("I have Three valves " + a + " and " + b + " and " + c );
    }
}
public class Constructors_In_Inheritance {
    public static void main(String[] args) {
        System.out.println("Constructors_In_Inheritance");

        // Base1 newBase = new Base1();
        // Derived newchild = new Derived();

        childOfDerived grandchilds = new childOfDerived();
        childOfDerived grandchild = new childOfDerived(12, 13,15);

         
    }
}
