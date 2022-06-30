package DSA;

public class PrMergeSort {
    static void conquer(int[] arr, int mid, int si, int ei) {
        int merge[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merge[x++] = arr[idx1++];

            } else {

                merge[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merge[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            merge[x++] = arr[idx2++];
        }
        for (int i = 0, j = si; i < merge.length; i++, j++) {
            arr[j] = merge[i];
        }

    }

    static void Divide(int arr[], int si, int ei) {
        int mid = si + (ei - si) / 2;
        if (si >= ei) {
            return;
        }

        // for 1st array
        Divide(arr, si, mid);
        // for 2nd array;
        Divide(arr, mid + 1, ei);
        // adding divided array into merge array using conquer Method or function
        conquer(arr, mid, si, ei);
    }

    public static void main(String[] args) {
        System.out.println(" Practice of Merge sort.....");

        int[] arr = { 1,2,8,5, 6 ,8,9 };
        Divide(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
