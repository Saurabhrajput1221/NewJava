import java.util.Scanner;

/**
 * User_input
 */
public class User_input {

    public static void main(String[] args) {
        System.out.println("Taking input from user...");
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter no 1...");
         int a = sc.nextInt();
         System.out.println("Enter no 2...");
         int b = sc.nextInt();
         System.out.println("This is your Sum...");
         int sum = (a+b);
          
         System.out.println(sum);

        
    }
}