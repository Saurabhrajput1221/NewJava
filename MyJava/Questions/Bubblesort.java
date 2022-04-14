package Questions;

import java.util.Scanner;

class Bubblesort {

    static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void bubblesort(int [] arr) {
        int n = arr.length;
        
        for(int i =0; i<n; i++){
            for(int j=0 ; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Bubble sort question.");
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i= 0; i<n; i++ ){
            arr[i] = sc.nextInt();
        }
        bubblesort(arr);
        for ( int i =0; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}