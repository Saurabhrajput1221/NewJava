public class QuestionsOnMethods {

    // // problem
    // print array using methods and loop...
    static void Arrayprinting(int hello[]) {
        for (int i = 0; i < hello.length; i++) {
            System.out.print(hello[i] + " ");
        }
    }

    // // problem No 1
    // static void multiplicationNumber(int n) {
    // for (int i = 0; i <= 10; i++) {
    // System.out.println(n * i);
    // }
    // }

    // problem 2 prit start like
    // *
    // * *
    // * * *
    // * * * *

    // static void Stars(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 0; j < i; j++) {

    // System.out.print("*" + " ");
    // }
    // System.out.println();
    // }
    // }

    // // problem No 3 calculate sum of n natural numbers using function

    // static void sumNaturalNo(int n){
    // int sum = 0;
    // for(int i=0; i<=n; i++){
    // sum = sum + i ;
    // }
    // System.out.println(sum);
    // }

    // problem 4 prit start like usig methods
    // * * * *
    // * * *
    // * *
    // *
    // static void ReverseStarts(int n) {
    // for (int i = n; i > 0; i--) {
    // for (int j = i; j > 0; j--) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    public static void main(String[] args) {
        System.out.println("multiplication of n Number");
        // Problem.....
        int ho[] = { 4, 2, 5, 32, 5 };
        Arrayprinting(ho);

        // problem No 1
        // multiplicationNumber(2);

        // problem No 2
        // Stars(6);

        // problem No 3
        // sumNaturalNo(10);

        // problem No 4
        // ReverseStarts(5);
    }
}
