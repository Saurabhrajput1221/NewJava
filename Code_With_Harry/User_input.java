import java.util.Scanner;

/**
 * User_input
 */
public class User_input {

    public static void main(String[] args) {
        System.out.println("Taking input from user...");
        // Scanner means i want to create new object...
         Scanner sc = new Scanner(System.in);
        //  System.out.println("Enter no 1...");
        //  int a = sc.nextInt();

        //  System.out.println("Enter no 2...");
        //  int b = sc.nextInt();

        //  System.out.println("This is your Sum...");
        //  int sum = (a+b);
          
        //  System.out.println(sum);

        // for (String) single...
    //     System.out.println("for single word...");
    //   String str = sc.next();
    //   System.out.println(str);

      // for (String) line ...
      System.out.println("for Line or word...");
      String str2 = sc.nextLine();
      System.out.println(str2);
        
    }
}