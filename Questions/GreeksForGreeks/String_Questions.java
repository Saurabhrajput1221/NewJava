package Questions.GreeksForGreeks;

import java.rmi.dgc.Lease;
import java.util.Stack;

import javax.print.FlavorException;
import javax.swing.text.FlowView.FlowStrategy;

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
    // public static boolean isAnagram(String s, String t) {
    // int[] alpha = new int[26];

    // for (int i = 0; i < s.length(); i++) {
    // alpha[s.charAt(i) - 'a']++;
    // // System.out.println(alpha[s.charAt(i) - 'a'] + " Add to string");

    // }
    // for (int i = 0; i < t.length(); i++) {
    // alpha[t.charAt(i) - 'a']--;
    // // System.out.println(alpha[t.charAt(i) - 'a'] + " new removal string");

    // }
    // for (int i = 0; i < alpha.length; i++) {
    // System.out.println(" aplpha char " + alpha[i]);
    // if (alpha[i] != 0) {
    // return false;
    // }
    // }
    // return true;
    // }
    /*************************************************************************** */
    // valid parentheses
    public static String parentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            Character current = s.charAt(i);
            // System.out.print(current + " ");

            if (current.equals('(') || current.equals('{') || current.equals('[')) {
                stack.push(current);
                System.out.println(stack + " this is current stack");
            } else {
                Character lastopene;
                if (stack.isEmpty()) {
                    return "false";
                } else {
                    lastopene = stack.peek();
                }
                if (current.equals(')') && !lastopene.equals('(')) {
                    return "false";
                } else if (current.equals('}') && !lastopene.equals('{')) {
                    return "false";
                } else if (current.equals(']') && !lastopene.equals('[')) {
                    return "false";
                }
                stack.pop();
            }
        }

        return "stackt is empty = " + " true ";
    }

    public static void main(String[] args) {
        System.out.println("String...........");
        // valid parentheses
        String s = "{}";
        System.out.println(parentheses(s));

        // Stack<Character> c = new Stack<>();
        // for (int i = 0; i < s.length(); i++) {
        // Character a = s.charAt(i);
        // System.out.println(a);
        // if (a.equals('(') || a.equals('{')) {
        // System.out.println("new thing " + c.push(a));;
        // }
        // }
        // System.out.println(c + "hello");
        /*************************************************************************** */
        // valid Anagram
        // String s = "raat";
        // String t = "caar";
        // System.out.println(isAnagram(s, t));

        /*************************************************************************** */
        // valid Palindrome
        // String s = "A Man, a plan , a canal: panama";
        // System.out.println(Ispalindrome(s));

    }
}
