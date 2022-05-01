// import java.util.Scanner;

public class QuestionsOnRecursion {    // 0 , 1, 1, 2,3
    static int fibonacii(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int ans = fibonacii(n - 2) + fibonacii(n - 1);
        return ans;

    }

    public static void main(String[] args) {
        System.out.println("Questions On Recursion");
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter any number and get fibonacii index number.");
        // int n = sc.nextInt();
        // int ans = fibonacii(n);
        // System.out.println(ans);
    }
}
