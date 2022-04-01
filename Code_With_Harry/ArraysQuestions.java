import javax.naming.spi.DirStateFactory.Result;

public class ArraysQuestions {
    public static void main(String[] args) {
        System.out.println("ArraysQuestions...");
        // Question no1... print sum of float arrays...
        // float sum = 0;
        // float[] arr1 = {656.6f, 76.67f, 67.7f, 87.8f};
        // for (int i= 0 ; i<arr1.length ; i++){
        // sum = sum + arr1[ i ];
        // }
        // System.out.println(sum);

        // Question no2... print average of sum arrays...

        // float[] marks = {56, 76, 67, 87 ,78};
        // float sum = 0;
        // for( int i=0; i<marks.length; i++){
        // sum = sum + marks[i];
        // }
        // System.out.println(sum/(marks.length));

        // // Question no3...(i didnot write at my own...) Create matrix [2][2] print
        // sum
        // // of matrix...

        // int[][] mat1 = {
        // { 1, 2, 3 },
        // { 4, 5, 6 }
        // };
        // int[][] mat2 = {
        // { 5, 8, 3 },
        // { 4, 6, 6 }
        // };
        // int[][] result = {
        // { 0, 0, 0 },
        // { 0, 0, 0 }
        // };

        // for (int i = 0; i < mat1.length; i++) { // row number of times...
        // for (int j = 0; j < mat1[i].length; j++) { // column number of times...
        // System.out.print(result[i][j] + " ");
        // result[i][j] = mat1[i][j] + mat2[i][j];
        // }
        // System.out.println(""); // print new line only...
        // }

        // Question no4...(Note: this question is very very important...) print Reverse
        // Array...

        // int[] rollno = {1,2,3,4,5,6};
        // for(int i= rollno.length; i>0; i--){
        // System.out.print(rollno[i]);

        // }

        // Question no5... print max number of array...
        int[] arr = { 1, 3, 65675, 7, 8 };
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];

        }
        System.out.print(max);

    }
}
