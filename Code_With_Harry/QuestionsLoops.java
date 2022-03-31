public class QuestionsLoops {
    public static void main(String[] args) {
        System.out.println("Questions On Loops...");
        // Question 1  ... print stars like this...
    //         * 
    //         * *  
    //         * * *
    //         * * * *

    //      for( int i = 0; i<5; i++){
    //          for(int j = 0; j<i; j++){
                 
    //              System.out.print("*");
    //          }
    //          System.out.print('\n');
    //  }                               


  // Question 2  ... print stars like this...
     //         * * * *
     //         * * * 
     //         * *  
     //         * 
    // for( int i = 4; i>0; i--){
    //     for(int j = i; j>0; j--){
            
    //         System.out.print("*");
    //     }
    //     System.out.print('\n');

    // }    

    // Question 3  ... print (N numbers) sum of even nubers...
            
    //   int numbers = 5;
    //   int sum = 0;
    //   System.out.println("follwing no are even Numbers...");
    //   for ( int i = 0; i<numbers; i++){
    //       System.out.println(i*2);
    //       sum = sum + (2*i);
    // }
    // System.out.println("sum of even Numbers...");
    // System.out.println(sum);


    // Question No 4... print multiplication table of a given Number n...

    // int Table = 19;
    // int lengthOfTable = 10;

    // for(int i = 1; i<=lengthOfTable; i++){
    //     System.out.println(Table*i);
    // }

        // Question No 5... print multiplication table of a given Number n in Reverse Order...
        
        // int n = 5;
        // for (int i=10; i>0; i--){
        //     System.out.println(n*i);
        // }    
        
        
        // Question No 6... print factorial of a given Number n...
             
//         int factorial = 1;
//         int n = 5;

//         for(int i = 1 ; i<=n; i++){
//             factorial = (factorial*i);
//         }
// System.out.println(factorial);


       // Question No 7... calculate sum of any Number table(eg. table having addition like )...

       int n = 8 ;
       int sum = 0;
       for (int i = 1; i<=10; i++){
           sum = ( sum) + (n*i);
        // System.out.println(n*i);
       }
       System.out.println(sum);

       


    }
}
