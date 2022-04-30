class c1 {

    public int a = 10;
    protected int b = 34;
    int c = 45;
    private int d = 55;
    public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}


 

public class Access_Modifier {
    public static void main(String[] args) {
        System.out.println("Access Modifiers...");
        c1 c = new c1();
        c.meth1(); 
    //    System.out.println(c.a);
    //    System.out.println(c.b);
    //    System.out.println(c.c);
    //    System.out.println(c.d);
    }
}
