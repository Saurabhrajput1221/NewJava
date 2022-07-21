package Questions.ApniKaksha;

// import java.util.HashSet;
// import java.util.Set;

// import javax.lang.model.element.NestingKind;

// import java.util.Map;

// import javax.swing.text.html.HTMLDocument.RunElement;

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
    // public static int first = -1;
    // public static int last = -1;

    // public static void FindOccuranc(int index, String str, char element) {
    // // System.out.println(index);
    // if (index == str.length()) {
    // System.out.println(first);
    // System.out.println(last);
    // return;
    // }
    // char currchar = str.charAt(index);
    // // System.out.println("storage " + currchar );
    // // System.out.println(element);
    // if (currchar == element) {
    // if (first == -1) {
    // first = index;
    // } else {
    // last = index;
    // // System.out.println(last);
    // }
    // }
    // FindOccuranc(index + 1, str, element);
    // }
    /********************************************* */
    // public static boolean SortedArr(int arr[], int index) {
    // if (index == arr.length - 1) {
    // return true;
    // }
    // if (arr[index] < arr[index + 1]) {
    // return SortedArr(arr, index + 1);
    // // System.out.println(true);
    // } else {
    // return false;
    // }
    // }
    /********************************************* */

    // public static void MoveAllx(int index , int count , String str , String
    // newStr){
    // if(index == str.length()){
    // for(int i =0; i<count; i++){
    // newStr += 'x';
    // }
    // System.out.println(newStr);
    // return;
    // }
    // char currchar = str.charAt(index);
    // if(currchar== 'x'){
    // count++;
    // MoveAllx(index+1, count, str, newStr);
    // }else{
    // newStr += currchar;
    // MoveAllx(index+1, count, str, newStr);
    // }
    // }
    /********************************************* */
    // I did not understand DublicatesChar question
    // public static boolean[] Allchar = new boolean[26];

    // public static void DublicatesChar(String str, int index, String Newstr) {
    // if (index == str.length()) {
    // System.out.println(Newstr);
    // return;
    // }
    // char currchar = str.charAt(index);
    // // System.out.print(currchar);
    // if (Allchar[currchar - 'a']) {
    // DublicatesChar(str, index + 1, Newstr);
    // } else {
    // Newstr += currchar;
    // Allchar[currchar - 'a'] = true;
    // DublicatesChar(str, index + 1, Newstr);
    // }
    // }
    /********************************************* */
    // subsquences of String
    // public static void SubSrings(int index, String str, String newString) {
    // if (index == str.length()) {
    // System.out.println(newString + " ");
    // return;
    // } else {

    // char currchar = str.charAt(index);

    // SubSrings(index + 1, str, newString + currchar);

    // SubSrings(index + 1, str, newString);

    // }
    // }
    /********************************************* */
    // Print all Unique subsquences of String
    // public static void subsquencesUnique(int index, String str, String newstr ,
    // HashSet<String> set ){
    // if(index == str.length()){
    // if(set.contains(newstr)){
    // return;
    // }else{
    // System.out.println(newstr);
    // set.add(newstr);
    // return;
    // }

    // }
    // char currchar = str.charAt(index);

    // subsquencesUnique(index+1, str, newstr+ currchar , set);
    // subsquencesUnique(index+1, str, newstr , set);
    // }
    // /********************************************* */
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void Printcomb(int index, String str, String Combination) {
        if (index == str.length()) {
            System.out.println(Combination);
            return;
        }
        char currchar = str.charAt(index);
        // System.out.println(currchar);
        // mapping print 1st number for ex. "25" output will be "def"
        String mapping = keypad[currchar - '0'];
        // System.out.println(mapping.length());
        for (int i = 0; i < mapping.length(); i++) {
            System.out.print(mapping.charAt(i));
            // Printcomb(index + 1, str, Combination + mapping.charAt(i));
          
        }
    }

    public static void main(String[] args) {
        System.out.println("Recusion...");
        /********************************************* */
        // sol Once more time
        Printcomb(0, "23", "");

        /********************************************* */
        // // HashSet only store Unique String
        // HashSet<String> set = new HashSet<>();
        // subsquencesUnique(0, "aaa", "" , set);

        /********************************************* */
        /********************************************* */
        /********************************************* */
        // subsquences of String
        // SubSrings(0, "abc", "");

        /********************************************* */
        // Remove dublicates . I did not understand DublicatesChar question
        // DublicatesChar("abbccda", 0, "");

        /********************************************* */
        // Move x using Recursion
        // MoveAllx(0, 0, "axbcxxxd", "");

        /********************************************* */
        // Move x using ittration; I am not able to sol Below question using ittration;
        // String str = "Hxellxxxo";
        // int count = 0;
        // for (int i = 0; i < str.length(); i++) {
        // if (str.charAt(i) == 'x') {
        // count++;
        // }
        // // System.out.println(str.charAt(i));
        // }
        // System.out.println(count);
        // String NewStr = "";
        // for (int i = 0; i < count; i++) {
        // NewStr += 'x';
        // }
        // System.out.println(NewStr);

        /********************************************* */
        // Check sorted array using Recursion
        // int arr[] = { 1, 2, 3, 4, 5, 8 };
        // System.out.println( SortedArr(arr, 0));;

        /********************************************* */
        // Check sorted array using ittration
        // int arr[] = {1,5,3,4,5};
        // for(int i =0; i<arr.length-1; i++){
        // // System.out.println(arr[i]);
        // if(arr[i] < arr[i+1]){
        // System.out.println(true);
        // }else{
        // System.out.println(false);
        // }
        // // System.out.print(arr[i] + " ");
        // }

        /********************************************* */
        // FindOccuranc(0, "abaacdaefaah", 'a');

        /********************************************* */
        // Print Revesers String using Recursion
        // String str = "Nitin";
        // ReString(str.length() - 1, str);
        /********************************************* */
        // Print Revesers String using ittration
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
