package Questions.ApniKaksha;

import java.util.Scanner;

public class TwoOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int SumOdd = 0;
        int SumEven = 0;
        int[]  arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();

            if(arr[i] % 2 == 0){
                SumEven = arr[i] + SumEven;
                
            }else{

                SumOdd = arr[i] + SumOdd;
            }
        }
        System.out.println(SumOdd);
    }
}
