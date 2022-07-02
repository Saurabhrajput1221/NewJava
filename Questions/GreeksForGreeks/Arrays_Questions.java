package Questions.GreeksForGreeks;

import java.lang.reflect.Array;
import java.util.Arrays;

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
    /************************************************************************** */

    // Search an Element in a Sorted and Pivoted Array
    public static int pivotedBinarySearch(int arr[], int n, int key){
        int pivot = findPivot(arr, 0 ,n-1);
        System.out.println("pivot "+pivot);
        if (pivot == -1)
        return binarySearch(arr, 0, n - 1, key);

    // If we found a pivot, then first
    // compare with pivot and then
    // search in two subarrays around pivot
    if (arr[pivot] == key)
        return pivot;
    if (arr[0] <= key)
        return binarySearch(arr, 0, pivot - 1, key);
    return binarySearch(arr, pivot + 1, n - 1, key);
}


    
    static int findPivot(int arr[], int low, int high)
    {
        // base cases
        if (high < low)
            return -1;
        if (high == low)
            return low;
 
        /* low + (high - low)/2; */
        int mid = (low + high) / 2;
        if (mid < high && arr[mid] > arr[mid + 1])
            return mid;
        if (mid > low && arr[mid] < arr[mid - 1])
            return (mid - 1);
        if (arr[low] >= arr[mid])
            return findPivot(arr, low, mid - 1);
        return findPivot(arr, mid + 1, high);
    }
    static int binarySearch(int arr[], int low, int high, int key)
    {
        if (high < low)
            return -1;
 
        /* low + (high - low)/2; */
        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid - 1), key);
    }

    public static void main(String args[]) {
        System.out.println("hello");
        int arr1[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int n = arr1.length;
        int key = 3;
        System.out.println("Index of the element is : "
                           + pivotedBinarySearch(arr1, n, key));
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
