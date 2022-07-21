package Questions.LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class SANDSortingHardQuestions {
    // majority element
    // public static void findMajority(int arr[]){
    // HashMap<Integer,Integer> map = new HashMap<>();
    // for(int i =0;i<arr.length;i++){
    // if(map.containsKey(arr[i])){
    // int count = map.get(arr[i]) +1;
    // System.out.println("count " + count);
    // if(count>arr.length/2){
    // System.out.println("majority Elemnt found "+ arr[i]);
    // return;
    // }else{
    // map.put(arr[i],count);
    // }
    // }else{
    // map.put(arr[i], 1);
    // }
    // }
    // System.out.println("No Majority element avilable");
    // }
    /***********************************************************************/
    // count triplets with sum smaller that a given value
    // public static int countTriplets(int arr[], int sum) {
    // int ans = 0;
    // Arrays.sort(arr);
    // // 1,3,4,5,7
    // for (int i = 0; i < arr.length; i++) {
    // int j = i + 1;
    // int k = arr.length - 1;
    // while (j < k) {
    // if (arr[i] + arr[j] + arr[k] >= sum) {
    // k--;
    // } else {
    // ans = ans + (k - j);
    // j++;
    // }
    // }
    // }
    // return ans;
    // }
    /***********************************************************************/
    // Maximum Sum Subsequence with no adjacent elements
    // public static int findMaxSum(int arr[]) {
    // int icld = arr[0];
    // int excl = 0;
    // int excl_new;
    // for (int i = 1; i < arr.length; i++) {
    // excl_new = Math.max(icld, excl);
    // icld = excl + arr[i];
    // excl = excl_new;
    // }
    // return Math.max(icld, excl);
    // }
    /***********************************************************************/
    // Merge Sorted Arrays using O(1) Space
    public static int arr1[] = new int[] {1,5,9,10,15,20};
    public static int arr2[] = new int[] {2,3,8,13};
    
    public static void mergesort(int arr1[], int arr2[]) {
        int m = arr1.length;
        // int n = arr2.length;
        int i = 0;
        int j = 0;
        int k = m - 1;
        while (i <= arr1.length - 1 && j < arr2.length - 1) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else {
                int temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        System.out.println("Searching and Sorting Hard Question...");
        // Merge Sorted Arrays using O(1) Space
        mergesort(arr1, arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        // int arr1[] = { 1, 5, 9, 10, 15, 20 };
        // int arr2[] = { 2, 3, 8, 13 };
        

        /***********************************************************************/
        // Maximum Sum Subsequence with no adjacent elements
        // int arr[] = { 5, 5, 10, 100, 10, 5 };
        // System.out.println(findMaxSum(arr));
        /***********************************************************************/
        // count triplets with sum smaller that a given value
        // int arr[] = { 5, 1, 3, 4, 7 };
        // int sum = 12;
        // System.out.println(countTriplets(arr, sum));
        /***********************************************************************/
        // majority element
        // int arr[] = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };
        // findMajority(arr);
        // HashMap<Integer,String> n = new HashMap<>();
        // n.put(1,"mango");
        // n.put(2,"orange");
        // n.put(3,"banana");
        // n.put(4,"apple");
        // n.put(5,"pineapple");
        // System.out.println(n);

    }
}
