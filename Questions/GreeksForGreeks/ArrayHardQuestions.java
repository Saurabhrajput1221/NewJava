package Questions.GreeksForGreeks;

import java.util.Arrays;

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
    public static int productExceptSelf(int arr[]) {
        int curr = 1;
        int n = arr.length - 1;
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = curr;
            curr *= arr[i];
        }
        curr = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= arr[i];
        }
        // print array
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans);
        }
        return curr;

    }
    /****************************************************************** */

    public static void main(String[] args) {
        System.out.println("Array");
        /****************************************************************** */
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
