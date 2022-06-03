package DSA;

public class SelectionSort {
    static void SelectionSortArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Slection Sort");
        int arr[] = { 7, 8, 54, 56 , 3, 1, 2 };

        for (int i = 0; i < arr.length; i++) {
            int small = i;

            for (int j = i + 1; j < arr.length; j++) {
                // System.out.println(arr[i] + " ");
                if (arr[small] > arr[j]) {
                    small = j;
                    
                }
            }
            // Swaping .....
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
            // TimeComplexity n^2

        }
        SelectionSortArr(arr);
    }
}
