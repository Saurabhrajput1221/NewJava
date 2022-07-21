package Questions.LeetCode;

// import java.lang.annotation.Target;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.EnumSet;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;

// import javax.lang.model.element.Element;
// import javax.lang.model.util.ElementScanner14;
// import javax.swing.text.html.HTMLDocument.RunElement;

// import AdvanceJava.Arraylist;
// import Questions.ApniKaksha.str;

public class ArrayHardQuestions {
    /*******************************************************************/
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

    /*******************************************************************/
    // Trapping Rain Water
    // public static int trap(int height[]) {
    // int Rmax = 0;
    // int Lmax = 0;
    // int result = 0;
    // int i = 0;
    // int j = height.length - 1;
    // // 4, 2, 0, 3, 2, 5
    // while (i <= j) {
    // if (height[i] <= height[j]) {

    // if (Lmax < height[i]) {
    // Lmax = height[i];
    // } else {
    // result = result + Lmax - height[i];
    // // System.out.println("this is result " + result);
    // }
    // i++;
    // } else {
    // if (Rmax < height[j]) {
    // Rmax = height[j];
    // } else {
    // result += Rmax - height[j];
    // System.out.println("this is result " + result);
    // }
    // j--;
    // }
    // }
    // return result;
    // }

    /*******************************************************************/
    // Product of Array Except Self( need to sol again)

    public static void productExceptSelf(int arr[]) {
        if (arr.length == 0) {
            System.out.println(0);
            return;
        }
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        int prod[] = new int[arr.length];

        left[0] = 1;
        right[arr.length - 1] = 1;

        for (int i = 1; i < arr.length; i++) {
            left[i] = arr[i - 1] * left[i - 1];

        }
        for (int j = arr.length - 2; j >= 0; j--) {
            right[j] = arr[j + 1] * right[j + 1];
        }
        for (int i = 0; i < arr.length; i++) {
            prod[i] = left[i] * right[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" " + prod[i]);
        }
        return;
    }
    /*******************************************************************/

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

    /*******************************************************************/
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

    /*******************************************************************/
    // 3 Sum ( understood but confusing)
    // public static List<List<Integer>> threesum(int arr[]) {
    // // public static int threesum(int arr[]) {

    // Set<List<Integer>> res = new HashSet<>();
    // if (arr.length == 0) {
    // return new ArrayList<>(res);
    // }
    // Arrays.sort(arr);
    // for (int i = 0; i < arr.length - 2; i++) {
    // // int arr[] = { -1,0,1,2,-1,-4};
    // int j = i + 1;
    // int k = arr.length - 1;
    // while (j < k) {
    // int sum = arr[j] + arr[k];
    // if (sum == -arr[i]) {
    // res.add(Arrays.asList(arr[i], arr[j], arr[k]));
    // j++;
    // k--;
    // } else if (sum > -arr[i]) {
    // k--;
    // } else if (sum < -arr[i]) {
    // j++;
    // }
    // }
    // }
    // return new ArrayList(res);
    // }
    /*******************************************************************/
    // Container With Most Water
    // public static int MaxWater(int arr[]) {
    // int start = 0;
    // int end = arr.length - 1;
    // int MaxWater = 0;
    // while (start <= end) {
    // int Cap = (end - start) * Math.min(arr[start], arr[end]);
    // if (MaxWater < Cap) {
    // MaxWater = Cap;
    // }
    // if (arr[start] > arr[end]) {
    // end--;
    // } else {
    // start++;
    // }
    // }
    // return MaxWater;
    // }

    // /*******************************************************************/

    public static void main(String[] args) {
        System.out.println("Array");
        // int arr[] = { 11, 15, 6, 7, 9, 10 };

        /*******************************************************************/
        // Container With Most Water
        // int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        // int arr[] = { 6, 4, 2, 5, 4, 6, 1, 3, 5 };
        // int arr[] = { 6, 4, 5, 4, 6, 7, 6 };
        // int arr[] = { 1, 7 };
        // int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        // System.out.println(MaxWater(arr));
        /*******************************************************************/
        // 3 Sum
        // int arr[] = { -1,0,1,2,-1,-4};
        // System.out.println(threesum(arr));
        /*******************************************************************/
        // Find Minimum in Rotated Sorted Array
        // int arr[] = { 5, 6, 7, 8, 1, 2 };
        // int arr[] = { 4, 5, 6, 7, 8, 0, 1, 3 };
        // int arr[] = { 11, 13, 15, 17 };
        // System.out.println(findMin(arr));
        /*******************************************************************/
        // int arr[] = { 2, 3, -2, 4,3 };
        // int arr[] = {0,2};
        // int arr[] = { -2, 0, -1 };
        // System.out.println(maxProduct(arr));
        /*******************************************************************/
        // Product of Array Except Self
        int arr[] = { 1, 2, 3, 4 };
        productExceptSelf(arr);

        /*******************************************************************/
        // // Trapping Rain Water
        // int height[] = { 4, 2, 0, 3, 2, 5 };
        // // // System.out.println(height.length-1 + " length of hi.");
        // // int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        // System.out.println(trap(height));
        // /*******************************************************************/
        // int nums[] = { 3, 2, 1, 5, 6, 4 };
        // int k = 4;
        // System.out.println("ans " + findLargestElm(nums, k));

        /*******************************************************************/

    }
}
