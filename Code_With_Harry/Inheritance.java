// import Oops.Inheritance;
// import java.lang.InstantiationError;

class Base2 {
    int x;

    public int getx() {
        return x;
    }

    public void setx(int n) {
        x = n;
    }

    public void printMe() {
        System.out.println("I am a cunstructor");
    }

}

class childbase extends Base2 {

    int y;

    public void sety(int n) {
        y = n;
    }

    public int gety() {
        return y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Inheritance");
        // Inheritance Example of parents class
        Base2 hi = new Base2();
        hi.printMe();

        // hi.setx(78);
        // System.out.println(hi.getx());

        // Inheritance Example of child class
        // childbase ch = new childbase();
        // ch.sety(87);
        // System.out.println(ch.gety());
    }
}















// class Base2 {
// int x;

// public int getx() {
// return x;

// }

// public void setx(int n) {
// x = n;
// }

// public void printme() {
// System.out.println("I am constructor...");
// }
// }

// class childbase extends Base2 {
// int y;

// public void sety(int n) {
// y = n;
// }
// public int gety(){
// return y;
// }
// }

// class babyderived {

// }