package Questions.DSA;

public class QuickSort2 {
    public static int partition(int arr[], int low, int high) {
        // we set the pivot as last index of Array
        int pivot = arr[high];
        // i calculate how many empty spaces required for pivot Index
        // we consider there is no small element compare to pivot
        int i = low - 1;

        // we are running loop for low to high index
        for (int j = low; j < high; j++) {
            // we are checkig following condition
            if (arr[j] < pivot) {
                // after checking condition we increase the index valve
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[i];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        // i is our pivot index
        return i;

    }

    public static void QuickSort(int arr[], int low, int high) {

        if (low < high) {
            // we are calculating extact position of pivot index
            int pivotIdx = partition(arr, low, high);
            // for left side Array (from pivot)
            QuickSort(arr, low, pivotIdx - 1);
            // for Right side Array (from pivot)
            QuickSort(arr, pivotIdx + 1, high);

        }
    }

    public static void main(String[] args) {
        System.out.println("Quick Sort by Apana collage.....");
        int arr[] = { 6, 5, 4, 3, 1, 46 };
        int n = arr.length;
        // we are calling our function / Method
        QuickSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
