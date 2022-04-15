// package chpter10;
class One{
    public void name(){
        System.out.println("this is method in One(class).");
    }
    public void hello(){
        System.out.println("method in class One.");
    }
}
class Two extends One{ 
    @Override
    public void name(){
        System.out.println("this is method in Two (class).");
    }
    public void hi(){
        System.out.println("method in class Two.");
    }
}

public class Method_Dispatch {
    public static void main(String[] args) {
        System.out.println(" Dynamic Method Dispatch.");
        // generally we call method like this.
        // One obj = new One();
        // obj.name();


        // Best exmple of  Dynamic Method Dispatch.
        // but we can call Two using parent method.
        One obj1  = new Two(); 
        obj1.name();
        // obj1.hi();  // Not allowed.
        obj1.hello();  // Allowed. we can access only parent class methods.
    }
}
