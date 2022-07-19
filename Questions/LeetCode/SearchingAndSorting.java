package Questions.LeetCode;

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
    // public static ArrayList<Integer> commanEle(int arr1[], int arr2[], int
    // arr3[]) {
    // int i = 0, j = 0, k = 0;
    // while (i < arr1.length && j < arr2.length && k < arr3.length) {

    // if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
    // System.out.println("arr1[i] is " + arr1[i] + " arr2[j] is "+ arr2[j] +
    // "arr3[k] is " + arr3[k]);
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
    // Searching in an array where adjacent differ by at most k
    // public static int search(int arr[], int k, int x) {
    // int i = 0;
    // while (i < arr.length) {
    // if (arr[i] == x) {
    // return i;
    // }
    // i = i + Math.max(1, Math.abs(arr[i] - x) / k);
    // }
    // return -1;
    // }
    /**************************************************************************/
    // ceiling in a sorted array
    // public static int CeilSearch(int arr[] , int x){
    // int low =0;
    // int high = arr.length-1;
    // if(arr.length==0){
    // return -1;
    // }
    // while(low<=high){
    // int mid = low +(high -low)/2;
    // if(x == arr[mid] ){
    // return mid;
    // }
    // if(x <arr[mid]){
    // high = mid -1;
    // }else{
    // low = mid +1;
    // }
    // }
    // return low;
    // }
    /**************************************************************************/

    public static void main(String[] args) {
        System.out.println("Searching And Sorting...");
        /**************************************************************************/
        // ceiling in a sorted array
        // int arr[] = { 1, 2, 8, 10, 10, 12, 19 };
        // int arr[] = { 1, 2, 8, 10, 10, 12, 19 };
        // int x = 3;
        // int ceil = (CeilSearch(arr, x));
        // if (ceil == -1) {
        // System.out.println("ceiling of " + x + " doesn't exist in array ");

        // } else {
        // System.out.println("ceiling of " + x + " is " + arr[ceil]);
        // }
        /**************************************************************************/
        // Searching in an array where adjacent differ by at most k
        // int arr[] = {2,4,5,7,7,6};
        // int arr[] = { 20, 40, 50, 70, 70, 60 };
        // int x = 60;
        // int k = 20;
        // System.out.println(search(arr, k, x));
        // int s = Math.abs(arr[0] - 60)/20;
        // System.out.println(s);

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
