import java.util.Scanner;

/**
 * Hello
 */
public class Hello {
    static void SsortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // selection sort at my own
        int arr[] = { 1, 3, 5, 43, 2 };
        for (int i = 0; i < arr.length; i++) {
            int small = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[small] > arr[j]) {
                    small = j;

                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
            System.out.print(arr[i] + "  ");

        }

        SsortArray(arr);

        // System.out.println("Hello java...");
        // System.out.println("hello world...");
        // Scanner sc = new Scanner( System.in);
        // // int n = sc.nextInt();
        // // int b = sc.nextInt();

        // // int a = 90;
        // // int b = 10;
        // // int add = n + b;
        // // System.out.print(add);
        // int size, i, j, temp;
        // int [] arr= new int[50];
        // Scanner scan = new Scanner(System.in);

        // System.out.print("Enter Array Size : ");
        // size = scan.nextInt();

        // System.out.print("Enter Array Elements : ");
        // for (i = 0; i < size; i++) {
        // arr[i] = scan.nextInt();
        // }

        // // System.out.print("Sorting Array using Selection Sort Technique..\n");
        // // for (i = 0; i < size; i++) {
        // // for (j = i + 1; j < size; j++) {
        // // if (arr[i] > arr[j]) {
        // // temp = arr[i];
        // // arr[i] = arr[j];
        // // arr[j] = temp;
        // // }
        // // }
        // // }

        // System.out.print("Now the Array after Sorting is :\n");
        // for (i = 0; i < size; i++) {
        // // System.out.print(arr[i] + " ");
        // }

    }
}