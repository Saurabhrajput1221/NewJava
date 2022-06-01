// package Chapter11;

abstract class Base {
    public Base() {
        System.out.println("I am base constructor.");
    }

    public void sayhello() {
        System.out.println("Hello");
    }

    abstract public void greet();
}

class child extends Base {
    public void greet() {
        System.out.println("good morning");
    }
}

public class Abstract_Interfaces {
    public static void main(String[] args) {
        System.out.println("Abstract Interfaces.");

        // Base b = new Base(); // this is not valid.

        child b = new child();
        b.sayhello();
        b.greet();
    }
}
