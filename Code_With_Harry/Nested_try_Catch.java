import java.util.Scanner;

public class Nested_try_Catch {
    public static void main(String[] args) {
        System.out.println("Nested_try_catch...");
        int[] marks = new int[3];
        marks[0] = 2;
        marks[1] = 1;
        marks[2] = 45;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Enter your number...");
                int n = sc.nextInt();
                System.out.println("welcome...");
                try {
                    System.out.println("array index is existed..." + marks[n]);
                    flag = false;

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array index is not existed...");
                    System.out.println(e);
                }

            } catch (Exception e) {
                System.out.println("First try catch");
            }
           
        }

    }
}
