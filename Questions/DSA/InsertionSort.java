package DSA;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Insertion Sort.....");
        int temp;
        int j;
        int arr[] = { 5, 6, 7, 4, 3, 2, 1 };
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);
        }

    }
}
