package Questions.GreeksForGreeks;

import javax.print.FlavorException;

public class String_Questions {

    public static boolean Ispalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))) {
                b.append(s.charAt(i));
                // System.out.println(b);
            }
        }
        int n = b.length() - 1;
        for (int i = 0; i < b.length()/2; i++) {
            if (b.charAt(i) != b.charAt(n-i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("String...........");
        String s = "A Man, a plan , a canal: panama";
       System.out.println(Ispalindrome(s));
  
    }
}
