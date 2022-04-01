public class Method {

   // Example No 1
    // static int abc(int x, int y) {
    //     int Z;
    //     if (x > y) {
    //         Z = (x - y);
    //     } else {
    //         Z = (x + y) * 5;
    //     }
    //     return Z;
    // }

    // Example No 2
    static int sum(int a , int b){
        int c = a+b;
        return c;
    }

    public static void main(String[] args) {
        System.out.println("Methods...");
        // // Example No 2
        int c;
        c = sum(5, 5);
        System.out.println(c);


        // Example No 3 using same function...
      
        int x = 56;
        int y = 4 ;
        int d ;
        d = sum(x, y);
        System.out.println(d);

        // Example No 1
        // int a = 5;
        // int b = 7;
        // // int c;
        // c = abc(a, b);
        // int a1 = 5;
        // int b1 = 2;
        // int c1 = 0;
        // c1 = abc(a1, b1);

        // System.out.println(c1);
        // // System.out.println(c);

    }
}
