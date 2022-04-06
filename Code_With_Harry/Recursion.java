public class Recursion {

    // This is problem is solving by recursoin function...
    static int factorial_recursion(int n){
        if(n == 1){
            return 1;
        }
        else{
            // formula of calculating factorial...
            return n * factorial_recursion (n-1);
        }
          // This is problem is solving by iterative approach function...
  
        //   static int factorial_iterative(int n){
        //       if ( n == 1){
        //           return 1;
        //       }else{

        //           int factorial= 1;
        //           for(int i =1 ; i<=n; i++){
        //               factorial = factorial * i;
        //             }
        //             return factorial;
        //       }
          }

          public static void main(String[] args) {
              System.out.println(" Recursion starts...");
              System.out.println("This is problem is solving by recursoin function...");
              int x = 5;
              System.out.println(factorial_recursion(x));
              
            // System.out.println("This is problem is solving by iterative approach function...");
            //   int p = 6;
            //   System.out.println(factorial_iterative(p));
            }
        }

