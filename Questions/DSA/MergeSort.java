package Questions.DSA;

public class MergeSort {

    static void conquer(int arr[], int mid, int si, int ei) {
        // we are creating new array to merger the divided array
        int merged[] = new int[ei - si + 1];

        // idx1 tracking 1st array(divided array)
        int idx1 = si;
        // idx2 tracking 2nd array (divide array)
        int idx2 = mid + 1;
        // Now we are tracking Merge array
        int x = 0;

        // we comparing divided array and merge into merged array
        while (idx1 <= mid && idx2 <= ei) {
            // If 1st element is big we simply add index1 (index1 of 1st divided array)
            // element to merge array(at index 0 and increase elements++) we are checking
            // the below condition
            if (arr[idx1] <= arr[idx2]) {
                // we add elements in merged array
                merged[x++] = arr[idx1++];
                // x ++; idx1++; //we can also write
            } else {
                // If 2nd element is big we simply add index2 (2nd arrays 1 element) into
                // merge(we created empty) array
                merged[x++] = arr[idx2++];
            }
        }
        while(idx1 <= mid){
            merged[x++] = arr[idx1++];
        }
        while(idx2 <= ei){
            merged[x++] = arr[idx2++];
        }
        for(int i =0, j=si; i<merged.length; j++, i++){
            arr[j] = merged[i];
        }
    }

    static void divide(int arr[], int si, int ei) {
        // (si + ei) /2 this also valid but its gives error in time complexity.
        int mid = si + (ei - si) / 2;
        // we are checking starting index is big or equal to then we simply return the
        // array
        if (si >= ei) {
            return;
        }

        // for left side array
        divide(arr, si, mid);
        // for right side array
        divide(arr, mid + 1, ei);
        // we merge divided array in one single array its called as conquer
        conquer(arr, mid, si, ei);

    }

    public static void main(String[] args) {
        System.out.println("Merge sort by Apana collage.....");

        int [] arr = {4,2,3,1,6,565465};
        divide(arr, 0, arr.length-1);
        for(int i = 0 ; i<arr.length; i++){
            System.out.print( arr[i] + " ");
        }
    }
}
