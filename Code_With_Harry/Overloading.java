public class Overloading {

    // without return method...
    // static void str1(){
    // System.out.println("hello java");
    // }

    // Methods Overloading best example... same name function are called...

    // method 1
    static void foo() {
        System.out.println("hello foo one ");

    }

    static void foo(int a) {
        System.out.println("hello foo two ur value is" + a);
    }
    static void foo(int a, int b) {
        System.out.println("hello foo three ur value is " + a +" and " + b);
    }

    public static void main(String[] args) {

        System.out.println("Method Overloading in java...");

        foo();
        foo(56);
        foo(55,76);

        // without return call method (function...)
        // str1();
    }
}
