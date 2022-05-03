package Oops;

// class Base2 {
//     int x;

//     public int getx() {
//         return x;
//     }

//     public void setx(int n) {
//         x = n;
//     }

//     public void printMe() {
//         System.out.println("I am a cunstructor");
//     }

// }

// class childbase extends Base2 {

//     int y;

//     public void sety(int n) {
//         y = n;
//     }

//     public int gety() {
//         return y;
//     }
// }

class Vehicle {
    int noOfwheels;
    int noOfSeats;

    //methods...
    void Accelarator(){
        System.out.println("driving vehicle.....");
    }
    void Applybrake(){
        System.out.println("Appling brake...");

    }

}

class Twowheeler extends Vehicle{

    Twowheeler(){
        this.noOfwheels = 2;
        this.noOfSeats = 2;
    }
}
class Fourwheeler extends Vehicle{

    Fourwheeler(){
        this.noOfwheels = 4;
        // this.noOfSeats = 2;
    }
}

class Ducati extends Twowheeler{
    Ducati(){
        this.noOfSeats = 1;
    }

    // if we didnot writre below method it will print Appling brake....otherwise it will print Appling Brake Ducati...
    @Override
    void Applybrake(){
        System.out.println("Appling Brake Ducati...");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Inheritance");
        Ducati D = new Ducati();
        System.out.println(D.noOfSeats +"..."+ D.noOfwheels);
        D.Applybrake();
        











        // // Inheritance Example of parents class
        // Base2 hi = new Base2();
        // hi.printMe();

        // // hi.setx(78);
        // // System.out.println(hi.getx());

        // // Inheritance Example of child class
        // // childbase ch = new childbase();
        // // ch.sety(87);
        // // System.out.println(ch.gety());
    }
}

