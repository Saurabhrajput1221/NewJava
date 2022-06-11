package Questions;

public class ExtraPr {
    public static void main(String[] args) {
        System.out.println("Patterns");
        int n = 5;
        int k = 5;
        for(int i =1; i<=n ; i++){
            for(int j =1; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        

        
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // int sum = 1;
        // for(int i =1;i<=n; i++ ){
        //     for(int j=1 ; j<=i; j++){
        //         System.out.print(sum + " ");
        //         sum++;
        //     }
        //     System.out.println();
        // }
        // for(int i =n ; i>=1; i--){
        //     for(int j =1; j<=i ; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for(int i =0 ; i<n; i++){
        //     for(int j =0 ; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <=k; j++) {
        //         if (i == 1 || i == n || j == 1 || j == k) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i =0; i<n; i++){
        // for(int j=0 ;j <k; j++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
    }
}
