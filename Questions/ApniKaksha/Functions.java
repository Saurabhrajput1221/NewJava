package Questions.ApniKaksha;

import java.util.jar.Attributes.Name;

import javax.print.attribute.standard.MediaSize.NA;

public class Functions {
   public static void Name(String name){
        System.out.println(name);
        return;
    }
    public static void mul (int a, int b){
        System.out.println( a*b);;
        return;
    }
    public static void factorial(int n){
        int fact = 1;
        for(int i= n; i>=1 ;i--){
            fact =( fact * i);
        }
        System.out.println(fact); ;
    }
    public static void main(String[] args) {
        System.out.println("Functions");

        Name("Saurabh Rajput");
       mul(55, 6);
       factorial(5);
    }
}
