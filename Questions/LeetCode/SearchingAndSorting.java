package Questions.LeetCode;

import java.util.ArrayList;

import AdvanceJava.Arraylist;

// import java.util.Arrays;
// import java.util.Collections;

public class SearchingAndSorting {
    // Permute Two Arrays such that Sum of Every Pair is Greater or Equal to K
    // public static String IsPossible(Integer[] a, int b[], int k){
    // Arrays.sort(a, Collections.reverseOrder());
    // // System.out.print( Arrays.sort(a, Collections.reverseOrder()));

    // // Sort the array b[] in increasing order.
    // Arrays.sort(b);
    // for(int i =0;i<a.length;i++){
    // if(a[i] + b[i] <= k){
    // return "NO";
    // }
    // }
    // return "YES";
    // }

    /**************************************************************************/
    // counting sort (Too much confusing)
    // public static void countSort(int[] arr) {
    // int max = Arrays.stream(arr).max().getAsInt();
    // // print max value from array
    // System.out.println(max + " max value");
    // int min = Arrays.stream(arr).min().getAsInt();
    // // print min value from array
    // System.out.println("Minimum val " + min);

    // int range = max - min + 1;
    // System.out.println("range " + range);

    // int count[] = new int[range];
    // System.out.println("count length " + count.length);

    // int output[] = new int[arr.length];
    // System.out.println("output length " + output.length);

    // for (int i = 0; i < arr.length; i++) {
    // // below line count how many elm are repeated
    // count[arr[i] - min]++;

    // // System.out.println("count of " +count[arr[i] - min] +" this is min " +
    // min);
    // }

    // for (int i = 1; i < count.length; i++) {

    // count[i] = count[i] + count[i - 1];
    // // System.out.println(" count index are below " + count[i]);
    // }
    // for (int i = arr.length - 1; i >= 0; i--) {
    // output[count[arr[i] - min] - 1] = arr[i];
    // count[arr[i] - min]--;
    // System.out.println(" arr[i] " + output[i]);
    // // 1, 2, 3, 4, 2, 5, 8
    // }
    // for (int i = 0; i < arr.length; i++) {
    // arr[i] = output[i];
    // }
    // for (int i = 0; i < arr.length; i++) {
    // System.out.println(arr[i] + " ");
    // }
    // }
    /**************************************************************************/
    // find common elements three sorted arrays
    // public static ArrayList<Integer> commanEle(int arr1[], int arr2[], int arr3[]) {
    // int i = 0, j = 0, k = 0;
    // while (i < arr1.length && j < arr2.length && k < arr3.length) {

    // if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
    // System.out.println("arr1[i] is " + arr1[i] + " arr2[j] is "+ arr2[j] + "arr3[k] is " + arr3[k]);
    // i++;
    // j++;
    // k++;
    // } else if (arr1[i] < arr2[j]) {
    // i++;
    // } else if (arr2[j] < arr3[k]) {
    // j++;
    // } else {
    // k++;
    // }
    // }
    // return null;
    // }
    /**************************************************************************/
    public static void main(String[] args) {
        System.out.println("Searching And Sorting...");
        /**************************************************************************/
        // find common elements three sorted arrays
        // int arr1[] = { 1, 5, 10, 20, 40, 80 };
        // int arr2[] = { 6, 7, 20, 80, 100 };
        // int arr3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
        // commanEle(arr1, arr2, arr3);
        /**************************************************************************/
        // counting sort
        // int arr[] = { 1, 2, 3, 4, 2, 5, 8 };
        // // int[] arr = { -5, -10, 0, -3, 8, 5, -1, 10 };
        // countSort(arr);

        /**************************************************************************/
        // Permute Two Arrays such that Sum of Every Pair is Greater or Equal to K
        // Integer a[] = { 1, 2, 2, 1 };
        // int b[] = { 3, 3, 3, 4 };
        // int k = 10;
        // System.out.println(IsPossible(a, b, k));

    }
}
