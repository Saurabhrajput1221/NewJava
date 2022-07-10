package Questions.GreeksForGreeks;

import java.util.Arrays;

import javax.lang.model.element.Element;
import javax.lang.model.util.ElementScanner14;
import javax.swing.text.html.HTMLDocument.RunElement;
import Questions.ApniKaksha.str;

public class ArrayHardQuestions {
    /****************************************************************** */
    // Kth Largest Element in an Array
    // public static int findLargestElm(int nums[], int k) {
    // Arrays.sort(nums);
    // int i = nums.length;
    // // System.out.println("length of array " + i );
    // // for(int j=0;j<i;j++){
    // // System.out.print(nums[j] + " ");
    // // }
    // return nums[i - k];
    // }

    /****************************************************************** */
    // Trapping Rain Water
    // public static int trap(int height[]) {
    // int Rmax = 0;
    // int Lmax = 0;
    // int result = 0;
    // int i = 0;
    // int j = height.length - 1;

    // while (i <= j) {
    // if (height[i] <= height[j]) {
    // if (Lmax < height[i]) {
    // Lmax = height[i];
    // } else {
    // result += Lmax - height[i];
    // }
    // i++;
    // } else {
    // if (Rmax < height[j]) {
    // Rmax = height[j];
    // } else {
    // result += Rmax - height[j];
    // }
    // j--;
    // }
    // }
    // return result;
    // }
    /****************************************************************** */
    // Product of Array Except Self
    // public static int productExceptSelf(int arr[]) {
    // int curr = 1;
    // int n = arr.length - 1;
    // int ans[] = new int[n];
    // for (int i = 0; i < n; i++) {
    // ans[i] = curr;
    // curr *= arr[i];
    // }
    // curr = 1;
    // for (int i = n - 1; i >= 0; i--) {
    // ans[i] *= curr;
    // curr *= arr[i];
    // }
    // // print array
    // for (int i = 0; i < ans.length; i++) {
    // System.out.println(ans);
    // }
    // return curr;
    // }
    /****************************************************************** */

    // public static int maxProduct(int arr[]) {
    // int result = Integer.MIN_VALUE;
    // int product = 1;

    // for (int i = 0; i < arr.length; i++) {
    // product *= arr[i];
    // result = Math.max(product, result);
    // System.out.println("Result " + result);
    // if (product == 0) {
    // return 1;
    // }
    // }
    // product = 1;
    // for (int i = arr.length - 1; i >= 0; i--) {
    // product *= arr[i];
    // result = Math.max(product, result);
    // if (product == 0) {
    // return 0;
    // }
    // }
    // return result;
    // }
    /****************************************************************** */
    // Find Minimum in Rotated Sorted Array
    // public static int findMin(int arr[]) {
    // int l = 0;
    // int r = arr.length - 1;
    // if (arr.length == 1) {
    // return arr[0];
    // }
    // if (arr[l] <= arr[r]) {
    // return arr[l];
    // }
    // while (l <= r) {
    // int mid = l + (r - l) / 2;
    // if (arr[mid] > arr[mid + 1]) {
    // return arr[mid + 1];
    // } else if (arr[mid] < arr[mid - 1]) {
    // return arr[mid];
    // } else if (arr[l] < arr[mid]) {
    // l = mid + 1;

    // } else if (arr[mid] < arr[r]) {
    // r = mid - 1;
    // }
    // }
    // return -1;
    // }
    /****************************************************************** */

    
    public static void main(String[] args) {
        System.out.println("Array");

        /****************************************************************** */
        // Find Minimum in Rotated Sorted Array
        // int arr[] = { 5, 6, 7, 8, 1, 2 };
        // int arr[] = { 4, 5, 6, 7, 8, 0, 1, 3 };
        // int arr[] = { 11, 13, 15, 17 };
        // System.out.println(findMin(arr));

        /****************************************************************** */
        // int arr[] = { 2, 3, -2, 4 };
        // int arr[] = {0,2};
        // int arr[] = { -2, 0, -1 };
        // System.out.println(maxProduct(arr));
        /****************************************************************** */
        // Product of Array Except Self
        // int arr[] = { 1, 2, 3, 4 };
        // productExceptSelf(arr);

        /****************************************************************** */
        // Trapping Rain Water
        // int height[] = { 4, 2, 0, 3, 2, 5 };
        // // System.out.println(height.length-1 + " length of hi.");
        // // int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        // System.out.println(trap(height));
        /****************************************************************** */
        // int nums[] = { 3, 2, 1, 5, 6, 4 };
        // int k = 4;
        // System.out.println("ans " + findLargestElm(nums, k));

        /****************************************************************** */

    }
}
