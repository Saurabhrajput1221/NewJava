public class Try_Catch {
    public static void main(String[] args) {
        System.out.println("Try Catch...");
        int a = 1000;
        int b = 0;
        // int c = a/b;
        try {
            int c = a / b ;
            System.out.println( "This is answer = "+ c);
            
        } catch (Exception e) {
            System.out.println("We failed to divide because of...");
            System.out.println(e);
        }
       
    }
}
