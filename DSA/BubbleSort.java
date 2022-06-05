// package DSA;

// import java.util.Scanner;

// // import javax.print.DocFlavor.STRING;

// public class BubbleSort {
//     // Below lines printing only array
//     // Bubble sort of Numbers
//     // static void PrintArr(int arr[]) {
//     // for (int i = 0; i < arr.length; i++) {
//     // System.out.print(arr[i] + " ");
//     // }
//     // }

//     // Bubble sort of using String
//     // static void PrintArr(String[] helo) {
//     // for (int i = 0; i < helo.length; i++) {
//     // System.out.print(helo[i] + " ");
//     // }
//     // }

//     public static void main(String[] args) {
//         System.out.println(
//                 "Bubble Sort using 1) Take input from user, 2) Bubble sort of Number, 3)Bubble sort of String");

//         Scanner sc = new Scanner(System.in);
//         // /********************************************************* */
//         // // Take input from user.....
//         System.out.print("Enter Numbers of integers to sort  ");
//         int sum = 0;
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.print("Enter " + n + " integers ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = 0; j < arr.length - 1 - i ; j++) {
//                 if (arr[j] > arr[j + 1]) {

//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
                    

//                 }
//             }

//             sum++;
//         }
//         System.out.println("Sorted Array list");
//         for (int i = 0; i < n; i++) {
//             System.out.println(arr[i] + " ");
//         }
//         System.out.println( "Number of times sorted in  " + sum + " swap");
//         System.out.println("First Element of sorted Array is " + arr[0]);
//         System.out.println("Last Element of sorted Array is " + arr[arr.length-1]);
//         // int k = n - 1;
//         // System.out.println("Array is sorted in " + k + " swap");

//         /********************************************************* */
//         // Bubble sort using of Numbers.....
//         // int n = sc.nextInt();
//         // int arr[i] = sc.nextInt();
//         // int m = sc.nextInt();
//         // int arr [] = new int[n];
//         // int arr[] = { 434, 546, 653, 3745, 646342, 45 };

//         // System.out.println(arr.length);

//         // for (int i = 0; i < arr.length; i++) {
//         // for (int j = 0; j < arr.length - 1 - i; j++) {
//         // if (arr[j] > arr[j + 1]) {

//         // // swaping elements
//         // int temp = arr[j];
//         // arr[j] = arr[j + 1];
//         // arr[j + 1] = temp;

//         // }
//         // }
//         // }
//         // PrintArr(arr);
//         // time complexity is n^2

//         /********************************************************* */
//         // Bubble sort using String
//         // String helo[] = { "s", "b", "c", "d", "p", "a", "e", "f", "g" };
//         // for (int i = 0; i < helo.length; i++) {
//         // for (int j = 0; j < helo.length - i - 1; j++) {
//         // if (helo[j].compareTo(helo[j + 1]) > 0) {
//         // String temp = helo[j];
//         // helo[j] = helo[j + 1];
//         // helo[j + 1] = temp;

//         // }
//         // }
//         // }

//         // PrintArr(helo);

//         /********************************************************* */

//         // // Swaping elements.....
//         // int a = 33;
//         // int b = 55;
//         // System.out.println(a + " " + b);
//         // int swap = a;
//         // a = b;
//         // b = swap;
//         // System.out.println(a + " " + b);

//     }
// }
