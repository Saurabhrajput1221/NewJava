package Questions.ApniKaksha;

// import javax.print.DocFlavor.STRING;
// import javax.sound.sampled.ReverbType;

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
    // static int Square(int x, int n) {
    // // System.out.println(x + " " + n);
    // if (n == 0) {
    // // System.out.println("hello");
    // return 1;
    // }
    // if (x == 0) {
    // return 0;
    // // for Stack height = logn
    // }if( n % 2 == 0){
    // return Square(x , n/2) * Square(x , n/2);
    // }else{
    // return Square(x , n/2) * Square(x , n/2) * x;
    // }
    // // else{
    // // int Xpownm1 = Square(x , n-1);
    // // // System.out.println(Xpownm1);
    // // int Xpown = x * Xpownm1;
    // // return Xpown;
    // // }
    // }
    /********************************************* */
    // Tower of Honoi
    // public static void Honoi(int n , String src , String helper , String Dest){
    // // System.out.println("heooo " + n);
    // if (n == 1){
    // System.out.println("Transfer disk " + n + " from " + src + " to " + Dest);
    // return;
    // }else{
    // Honoi(n-1, src, Dest, helper);
    // // System.out.println(n);
    // System.out.println("Transfer disk " + n + " from " + src + " to " + Dest);
    // Honoi(n-1, helper, src, Dest);
    // }
    // }
    /********************************************* */

    // I did at my own
    // public static void ReString(int index, String str) {
    // if (index == 0) {
    // System.out.println(str.charAt(0));
    // return;
    // } else {
    // System.out.print(str.charAt(index) + " ");
    // ReString(index - 1, str);
    // }
    // }
    /********************************************* */
    public static int first = -1;
    public static int last = -1;

    public static void FindOccuranc(int index, String str, char element) {
        // System.out.println(index);
        if (index == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currchar = str.charAt(index);
        // System.out.println("storage " + currchar );
        // System.out.println(element);
        if (currchar == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
                // System.out.println(last);
            }
        }
        FindOccuranc(index + 1, str, element);
    }

    public static void main(String[] args) {
        System.out.println("Recusion...");
        FindOccuranc(0, "abaacdaefaah", 'a');

        /********************************************* */
        // Print Revesers string using Recursion
        // String str = "Nitin";
        // ReString(str.length() - 1, str);
        /********************************************* */
        // Print Revesers string using ittration
        // String str = "Hello";
        // for(int i =str.length()-1; i>=0 ; i--){
        // System.out.println(str.charAt(i));
        // }

        /********************************************* */
        // I am not able to sol at my own You need lot of practice
        // Honoi(2, "src", "helper", "Dest");
        /********************************************* */
        // Print(1);
        /********************************************* */
        // naturalNum(5);
        /********************************************* */
        // Factorial(5);
        /********************************************* */
        // int ans = Square(5, 2);
        // System.out.println(ans);
        /********************************************* */

    }
}
