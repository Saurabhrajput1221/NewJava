package DSA;

public class BubbleSort {
    // Below lines printing only array
    // static void PrintArr(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // System.out.println();

    // }

    static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Bubble Sort");
        int arr[] = { 43, 3454, 3, 434, 63, 4 };
        // int arr[] = { 7, 8, 3, 1, 2 };
        // time complexity is n^2

        System.out.println(arr.length);
        
        for (int i = 0; i < arr.length; i++) {            
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swaping elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        PrintArr(arr);

    }
}
