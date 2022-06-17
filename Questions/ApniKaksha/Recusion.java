package Questions.ApniKaksha;

public class Recusion {
    // public static void Print(int n) {
    // if (n == 6) {
    // System.out.println("hello");
    // return;
    // } else {

    // System.out.print(n + " ");
    // Print(n + 1);
    // }
    // }

    /********************************************* */
    // Practice 2 Sum of natural numbers

    // static void naturalNum(int n) {
    // if (n == 0) {
    // return;
    // } else {
    // int sum = 0;
    // for (int i = 0; i <= n; i++) {
    // sum = i + sum;
    // }
    // System.out.println(sum);
    // }
    // }
    /********************************************* */
    // Factorial of N numbers
    // static void Factorial(int n) {
    // if (n == 0) {
    // return;
    // } else {
    // int fact = 1;
    // for (int i = n ; i >= 1 ; i--) {
    // fact = fact * i;
    // }
    // System.out.println(fact);
    // }
    // }
    /**
     * *******************************************
     */
    // Square of x to the power n
    static int Square(int x, int n) {
        // System.out.println(x + " " + n);
        if (n == 0) {
            // System.out.println("hello");
            return 1;
        }
        if (x == 0) {
            return 0;
        } else{

            int Xpownm1 = Square(x , n-1);
            // System.out.println(Xpownm1);
            int Xpown = x * Xpownm1;
            return Xpown;
        }
        
    }

    public static void main(String[] args) {
        System.out.println("Recusion...");
        // Print(1);
        /********************************************* */
        // naturalNum(5);
        /********************************************* */
        // Factorial(5);
        /********************************************* */
       int ans = Square(2, 5);
        System.out.println(ans);

    }
}
