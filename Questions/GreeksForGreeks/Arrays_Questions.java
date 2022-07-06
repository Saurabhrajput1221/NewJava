package Questions.GreeksForGreeks;

import java.util.Arrays;

import javax.security.auth.kerberos.KerberosPrincipal;

// import java.lang.reflect.Array;
// import java.util.Arrays;
// import java.util.Vector;

// import java.net.Socket;
// import java.util.Arrays;

// import javax.sound.sampled.Mixer;

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
    /***************************************** */
    // Below code also valid for dublicate numbers
    // public static boolean Dublicate(int arr[]){
    // for(int i=0; i<arr.length-1;i++){
    // if(arr[0] == arr[i+1]){
    // return true;
    // }
    // }
    // return false;
    // }
    /****************************************************************************/
    // Chocolate Distribution
    // public static int ChocolateDis(int arr[], int m) {
    // int min = Integer.MAX_VALUE;
    // Arrays.sort(arr);
    // if (arr.length == 0 || m == 0) {
    // return 0;
    // }
    // if (m > arr.length) {
    // return -1;
    // }
    // for (int i = 0; i + m - 1 < arr.length; i++) {
    // // System.out.println("ans of index "+ arr[i]);
    // int diff = arr[i + m - 1] - arr[i];
    // // System.out.println(diff);
    // if (diff < min) {
    // min = diff;
    // }
    // }
    // return min;
    // }
    /************************************************************************** */

    // Search Element using function
    // public static void Search(int arr[], int key) {
    // if (arr.length == 0) {
    // System.out.println("not able to find index ");
    // }
    // for (int i = 0; i < arr.length; i++) {
    // if (key == arr[i]) {
    // System.out.println("index is " + i);
    // }
    // }
    // }
    /**
     */
    /************************************************************************** */
    // Next premutation // confusing to me
    // public static void permutation(int[] nums) {
    // int start = nums.length - 2;
    // System.out.println("Start index " + start);
    // int end = 0;
    // System.out.println("end index " + nums[end]);
    // while (start >= 0 && nums[start] >= nums[start + 1])
    // start--;
    // if (start >= 0) {
    // end = nums.length - 1;
    // while (nums[end] <= nums[start])
    // end--;
    // swap(nums, start, end);
    // }
    // reverse(nums, start + 1, nums.length - 1);

    // for (int i = 0; i < nums.length; i++) {
    // System.out.print(nums[i] + " ");
    // }

    // }

    // public static void swap(int nums[], int start, int end) {
    // int temp = 0;
    // temp = nums[start];
    // nums[start] = nums[end];
    // nums[end] = temp;
    // }

    // public static void reverse(int nums[], int start, int end) {
    // while (start < end) {
    // swap(nums, start++, end--);
    // }
    // }

    /************************************************************************** */

    // public static int MaxProfit(int price[]) {
    // int min = price[0];
    // int profit = 0;
    // if (price.length <= 1) {
    // return 0;
    // }
    // for (int i = 1; i < price.length; i++) {
    // if (price[i] < min) {
    // min = price[i];
    // } else {
    // if (price[i] - min > profit) {
    // profit = price[i] - min;
    // }
    // }
    // }
    // return profit;
    // }
    /************************************************************************** */
    // Repeat and Missing Number Array

    public static void printTwoElements(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int abs = Math.abs(arr[i]);
            if (arr[abs - 1] > 0) {
                arr[abs - 1] = -arr[abs - 1];
                // System.out.println(arr[abs-1]);
            } else {
                System.out.println("Repeated element " + abs);
            }
        }
        System.out.println("Missing Element ");
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                System.out.println(i + 1);
            }
        }
    }

    /************************************************************************** */

    public static void main(String args[]) {
        System.out.println("hello");
        /************************************************************************** */

        // Repeat and Missing Number Array
        int arr[] = { 1, 3, 4, 5, 4 };
        int n = arr.length;
        printTwoElements(arr, n);

        /************************************************************************** */
        // MaxProfit using recursion
        // int price[] = { 7, 1, 5, 3, 9, 4 };
        // System.out.println(MaxProfit(price));
        /************************************************************************** */
        // MaxProfit using ittration
        // // int price[] = { 7 ,1,5,3,6,4};
        // int min =price[0];
        // int profit = 0;
        // for(int i =0; i<price.length; i++){
        // if(price.length<=1){
        // System.out.println("No profit Earned");
        // }
        // if(price[i]<min){
        // min = price[i];
        // }else {
        // if(price[i]-min >profit){
        // profit = price[i] - min;
        // }
        // }
        // }
        // System.out.println(profit);

        /************************************************************************** */
        // Next permutation problem
        // int nums[] = { 1,1,5 };
        // permutation(nums);

        /************************************************************************** */
        // int arr[] = {5, 6,7,8,9,10,1,2,3};
        // int key = 10;
        // Search(arr, key);
        // for (int i = 0; i < arr.length ; i++) {
        // if (key == arr[i]) {
        // System.out.println("index of key is " + i);
        // } else {
        // System.out.println("sorry not able to find index key ");
        // }
        // }
        /************************************************************************** */
        // Chocolate Distribution
        // int arr[] = { 3, 4, 1, 9, 56, 7, 9, 12 };
        // int m = 5;
        // System.out.println(ChocolateDis(arr, m));

        // // Arrays.sort(arr);
        // // for(int i =0;i<arr.length; i++){
        // // System.out.println(arr[i]);
        // // }

        /************************************************************************** */
        // int arr[] = {1,2,3,6};
        // System.out.println( Dublicate(arr));;
        /************************************************************************** */

        // Dublicate Array using ittration
        // int arr[] = { 1, 2, 3, 1 };
        // int n = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        // if (n == arr[i]) {
        // System.out.println("true");
        // } else {

        // System.out.println("false");
        // }
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
