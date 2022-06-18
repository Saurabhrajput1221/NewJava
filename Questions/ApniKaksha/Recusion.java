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
//     public static void Honoi(int n , String src , String helper , String  Dest){
// //    System.out.println("heooo " + n);
//         if (n == 1){
//             System.out.println("Transfer disk " + n + " from " + src + " to " + Dest);
//             return;
//         }else{
//              Honoi(n-1, src, Dest, helper);
//             //  System.out.println(n);
//              System.out.println("Transfer disk " + n + " from " + src + " to " + Dest);
//              Honoi(n-1, helper, src, Dest);
//         } 
//     }
/********************************************* */
 public static void RevStr( String str , int index){
     if( index == 0){
        System.out.println(str.charAt(index));
         return ;
     }else{
         System.out.print(str.charAt(index) + " ");
         RevStr(str, index -1);
         
     }
 }
    public static void main(String[] args) {
        System.out.println("Recusion...");
        String str = "Rajput";
        RevStr(str, str.length()-1);

        stringss







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
