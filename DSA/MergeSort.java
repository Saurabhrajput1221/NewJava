package DSA;

import java.lang.reflect.Array;
import java.rmi.server.LogStream;

public class MergeSort {
    // static void divide(int arr[] , int si , int ei) {
    //     // (si + ei) /2   this also valid but its gives error in time complexity.
    //     int mid = si + (ei - si) / 2; 

    //     divide(arr, si, mid);

    // }
    int array[];
    int tempMergeArr[];
    int length;

    public void sort(int inputArr[]){
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergeArr = new int[length];
        divideArray(0, length-1);

    }
    public void divideArray(int lowerIndex, int higherIndex){
        if(lowerIndex<higherIndex){
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // It will sort the left side of Array.
            divideArray(lowerIndex , middle);

            // It will sort right side of Array.
            divideArray(middle+1, higherIndex);

            MergeArray(lowerIndex, middle , higherIndex);

        }
    }

    public void MergeArray(int lowerIndex , int middle , int higherIndex){
        for(int i = lowerIndex; i<=higherIndex; i++){
            tempMergeArr[i] = array[i];
        }
        int i = lowerIndex ;
        int j = middle +1;
        int k = lowerIndex;
        while(i<=middle && j<= higherIndex){
            if(tempMergeArr[i] <= tempMergeArr[j]){
                array[k] = tempMergeArr[i];
                i++;
            }
            else{
                array[k] = tempMergeArr[j];
                j++;
            }
            j++;
        }
        while(i<= middle){
            array[k] = tempMergeArr[i];
            k++;
            i++;
        }
    }

    public static void main(String[] args) {
        // System.out.println("Merge Sort");
        int arr[] = { 1, 4, 6, 8, 6, 4, 21 };
           MergeSort ms = new MergeSort();
           ms.sort(inputArr);

        //    for(int i =0;i<inputArr.length; i++){
        //        System.out.print(inputArr[i] + " ");
        //    }
        // System.out.println("");
        
    }
}