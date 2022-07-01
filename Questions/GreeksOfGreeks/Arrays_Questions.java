package Questions.GreeksOfGreeks;

import java.util.Arrays;

import javax.sound.sampled.Mixer;

// import java.util.Scanner;

// import Questions.ApniKaksha.str;

public class Arrays_Questions {

    // Solved problem using function same on Geeks of Greeks
    // public static void MinMax(int items[], int n) {
    // int max = items[0];
    // int min = items[0];

    // for (int i = 1; i < items.length; i++) {
    // // int max;
    // if (max > items[i]) {
    // max = items[i];
    // } else if (min < items[i]) {
    // min = items[i];
    // }
    // }
    // System.out.println(max);
    // System.out.println(min);
    // }
    /************************************************************************** */
    // Print Revers Array
    // public static void RevArray(int arr[], int n) {

    // if (n == arr.length) {
    // // System.out.println(arr);
    // }
    // for (int i = arr.length - 1; i >= 0; i--) {
    // // System.out.println(arr[i]);
    // }
    // }
    /************************************************************************** */
    // public static void ReveArray(int arr[], int start, int end) {
    // int temp;
    // while (start < end) {
    // temp = arr[start];
    // arr[start] = arr[end];
    // arr[end] = temp;
    // start++;
    // end--;

    // }
    // }

    // public static void PrintArr(int arr[], int n) {
    // for (int i = 0; i <= n; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // System.out.println();
    // }
    /************************************************************************** */
    // Maximum SubArray

    // public static int SubArray(int arr[]) {
    // int Maximum = Integer.MIN_VALUE;
    // int sum = 0;
    // if (arr.length == 0) {
    // return 0;
    // }
    // for (int i = 0; i < arr.length; i++) {
    // sum += arr[i];
    // if (sum > Maximum) {
    // Maximum = sum;
    // }
    // if (sum <= 0) {
    // sum = 0;
    // }
    // }
    // return Maximum;
    // }
    /************************************************************************** */
    // public static boolean Dublicate(int arr[]){
    // Arrays.sort(arr);
    // for(int i =0 ;i<arr.length-1; i++){
    // System.out.println(arr[i]);
    // if( arr[i] == arr[i+1]){
    // return true;
    // }
    // }
    // return false;
    // }
    /************************************************************************** */
    public static void main(String args[]) {
        System.out.println("hello");
        /************************************************************************** */
        // int arr[] = {1,2,3,1};
        // System.out.println( Dublicate(arr));;
        /************************************************************************** */
        // Dublicate Array using ittration
        // int arr[] = { 1, 2, 3, 1 };
        // int n = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        //     if (n == arr[i]) {
        //         System.out.println("true");
        //     } else {

        //         System.out.println("false");
        //     }
        // }

        /************************************************************************** */
        // Maximum SubArray
        // int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        // System.out.print(SubArray(arr));
        /************************************************************************** */
        // Maximum SubArray using ittreation
        // int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        // int Maximum = Integer.MIN_VALUE;
        // // int Maximum = 0; // maximum = 0 also work
        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // sum += arr[i];
        // if (sum > Maximum) {
        // Maximum = sum;
        // }
        // if (sum <= 0) {
        // sum = 0;

        // }
        // System.out.println("sum is "+ sum);
        // }

        // System.out.println(Maximum);
        /************************************************************************** */

        // Print Revese of Array

        // int arr[] = { 1, 2, 3, 4, 5, 6 };
        // System.out.println("Printed orignal Arry ");
        // PrintArr(arr, 5);
        // System.out.println("Reversed Array ");
        // ReveArray(arr, 0, 5);

        // PrintArr(arr, 5);

        /************************************************************************** */
        // int arr[] = { 4, 5, 1, 2 };
        // int n = arr.length;
        // RevArray(arr, n);
        /************************************************************************** */
        // int arr[] = {4,5,1,2};
        // for(int i=arr.length-1; i>=0; i--){
        // System.out.print(arr[i] +" ");
        // }

        /************************************************************************** */
        // int items[] = {1000, 11, 445, 1, 330, 3000 };
        // int n = items.length;
        // MinMax(items, n);
        /************************************************************************** */
        // // // print Maximum and Minimum Element in an Array
        // // Take user input

        // // Scanner sc = new Scanner(System.in);
        // // int n = sc.nextInt();
        // // int items[] = new int[n];
        // // for (int i = 0; i < items.length; i++) {
        // // items[i] = sc.nextInt();
        // // }
        // // // for(int i =0 ;i<items.length; i++){
        // // // // System.out.print(items[i]+ " ");
        // // // }

        // // // int items[] = { 5000, 11, 445, 6, 330, 3000 };
        // // int min = items[0];
        // // int max = items[0];

        // // for (int i = 1; i < items.length; i++) {
        // // if (min > items[i]) {
        // // min = items[i];
        // // } else if (max < items[i]) {
        // // max = items[i];
        // // }
        // // }
        // // System.out.println("Maximum Number from array is " + max);
        // // System.out.println("Minimum Number from array is " + min);

    }

}
