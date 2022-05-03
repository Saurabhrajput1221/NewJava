package AdvanceJava2;



interface DemoAno{
    void meth1(int a);
    // void meth2();
}
// class NewClass implements DemoAno{
//     @Override
//     public void meth1(){
//         System.out.println("This is meth one in New Class...");
//     }
// }

public class AnonymousClass_LambdaExpression {
    public static void main(String[] args) {
        System.out.println("Anonymous Class...");

// AnonymousClass ...
        // DemoAno obj = new DemoAno() {
        //     public void meth1(){
        //         System.out.println("This is meth one");
        //     }
        //     public void meth2(){
        //         System.out.println("This is meth two");
        //     }

        // };
        // obj.meth1();
        // obj.meth2();

        /***********************************************/
        // LambdaExpression ...

        // DemoAno New = new NewClass() ;            
        //     New.meth1();

        DemoAno obj = (n)->{
            System.out.println("This is an LambdaExpression... " + n);
        };
        obj.meth1(55);
        
      

    }
    
}
