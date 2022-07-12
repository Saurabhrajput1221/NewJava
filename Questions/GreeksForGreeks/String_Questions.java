package Questions.GreeksForGreeks;

import java.rmi.dgc.Lease;

public class String_Questions {
    // valid Palindrome
    // public static boolean Ispalindrome(String s) {
    // s = s.toLowerCase();
    // StringBuilder b = new StringBuilder();
    // for (int i = 0; i < s.length(); i++) {
    // if (Character.isLetter(s.charAt(i))) {
        // To add at the last position using append
    // b.append(s.charAt(i));
    // // System.out.println(b);
    // }
    // }
    // int n = b.length() - 1;
    // for (int i = 0; i < b.length() / 2; i++) {
    // if (b.charAt(i) != b.charAt(n - i)) {
    // System.out.println("string is not a palindrome ");
    // return false;
    // }
    // }
    // System.out.println("string is a palindrome ");
    // return true;
    // }
    /*************************************************************************** */
    // valid Anagram 
public static boolean isAnagram(String s , String t){
     int cnt[] = new int[26];
      if(s.length() != t.length()){
          return false;
      }
      for(char c : s.toCharArray()){
          cnt[c - 'a']++;
      }
      for(char c : t.toCharArray()){
          cnt[c - 'a']--;
      }
      return true;
}
    public static void main(String[] args) {
        System.out.println("String...........");
        // valid Anagram 
        String s = "tea";
        String t = "atedf";
        System.out.println(isAnagram(s, t));

        /*************************************************************************** */
        // valid Palindrome
        // String s = "A Man, a plan , a canal: panama";
        // System.out.println(Ispalindrome(s));

    }
}
