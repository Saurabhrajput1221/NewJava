package Questions.DSA;
public class QuickSort {
    int partition(int[] arr, int low, int high) {

        int pivot = (arr[low] + arr[high]) / 2;
        while (low <= high) {
            while (arr[low] < pivot) {
                low++;
                while (arr[high] > pivot) {
                    high--;
                }
                if (low <= high) {
                    int temp = arr[low];
                    arr[low] = arr[high];
                    arr[high] = temp;

                    low++;
                    high--;
                }
            }
        }
        return low;

    }

    public void QuickSortRecursion(int[] arr, int low, int high) {

        int pi = partition(arr, low, high);
        if (low < pi - 1) {
            QuickSortRecursion(arr, low, pi - 1);
        }
        if (pi < high) {
            QuickSortRecursion(arr, pi, high);
        }
    }

    public void pritnarr(int arr[] , int l) {
        for (int i = 0; i <l; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Quick Sort.....");
        // Below code giving wrong output
        int arr[] = { 6, 5, 4, 3, 2, 1, 5, 3, 5 };
        int l = arr.length;
        System.out.println(l);
        QuickSort qsm = new QuickSort();
        qsm.pritnarr(arr, l -1);

        qsm.partition(arr, 0, arr.length-1);
        qsm.pritnarr(arr , l);
     System.out.println();

    }
}
