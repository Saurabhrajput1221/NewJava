package DSA;

import javax.print.DocFlavor.STRING;

public class BubbleSort {
    // Below lines printing only array
    // Bubble sort of Numbers
    static void PrintArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Bubble sort using String
    // static void PrintArr(String[] helo) {
    // for (int i = 0; i < helo.length; i++) {
    // System.out.print(helo[i] + " ");
    // }
    // }

    public static void main(String[] args) {
        System.out.println("Bubble Sort");

        int arr[] = { 434, 546, 653, 3745, 646342, 45 };

        // System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {

                    // swaping elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        PrintArr(arr);
        // time complexity is n^2

        // Bubble sort using String
        // String helo[] = { "s", "b", "c", "d", "p", "a", "e", "f", "g" };
        // for (int i = 0; i < helo.length; i++) {
        // for (int j = 0; j < helo.length - i - 1; j++) {
        // if (helo[j].compareTo(helo[j + 1]) > 0) {
        // String temp = helo[j];
        // helo[j] = helo[j + 1];
        // helo[j + 1] = temp;

        // }
        // }
        // }

        // PrintArr(helo);

        // // Swaping elements.....
        // int a = 33;
        // int b = 55;
        // System.out.println(a + " " + b);
        // int swap = a;
        // a = b;
        // b = swap;
        // System.out.println(a + " " + b);

    }
}
