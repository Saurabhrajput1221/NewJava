import java.util.Scanner;

public class Questions_Error_Exception {
    public static void main(String[] args) {
        System.out.println("Questions_Error_Exception...");

        // // Quession No 1
        // try {
        // int a = 45/0;
        // System.out.println(a);
        // } catch (ArithmeticException e) {
        // System.out.println("ha ha...");

        // }
        // catch(IllegalArgumentException e){
        // System.out.println("heee heee...");

        // }

        // Question No 2 (Need more practice...)
        System.out.println("Enter valid Number...");
        boolean flag = true;

        while (flag) {
            int[] marks = new int[3];
            marks[0] = 24;
            marks[1] = 55;
            marks[2] = 58;
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            try {
                System.out.println("array index is existed..." + marks[n]);
                flag = false;

            } catch (Exception e) {
                System.out.println("Array index is not existed...");

            }
        }
    }
}
