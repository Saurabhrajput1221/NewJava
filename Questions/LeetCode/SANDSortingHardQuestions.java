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
    public static int countTriplets(int arr[], int sum) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                if (arr[i] + arr[j] + arr[k] >= sum) {
                    k--;
                } else {
                    ans = ans + (k - j);
                    j++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Searching and Sorting Hard Question...");
        // count triplets with sum smaller that a given value
        int arr[] = { 5, 1, 3, 4, 7 };
        int sum = 12;
        System.out.println(countTriplets(arr, sum));
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
