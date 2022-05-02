public class Try_Catch_Finally {
   public static double greet(){

       try {
           double a = 7;
           double b = 2;
           double c = a/b;
           return c ;
       } catch (Exception e) {
           
           System.out.println(e);
       }
       finally
       {
           System.out.println("Happy Ending...");
       }  
       return -1;
   }
    public static void main(String[] args) {
        System.out.println("Finally in try Catch...");
        double a = greet();
        System.out.println(a);

        
    }
}





