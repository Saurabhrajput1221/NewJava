package Questions.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class StringHardQuestions {
    // Longest Substring without Repeating Characters
    public static int LengthOfSubstring(String s) {
        int l = 0;
        int r = 0;
        Set<Character> sow = new HashSet<>();
        int max = 0;
        while (r < s.length()) {
            Character c = s.charAt(r);
            if (sow.add(c)) {
                max = Math.max(max, r - l + 1);
                r++;
            } else {
                while (s.charAt(l) != c) {
                    sow.remove(s.charAt(l));
                    l++;
                }
                sow.remove(c);
                l++;
            }
        }
        return max;
    }
/************************************************************************** */
    public static void main(String[] args) {
        System.out.println("String Hard Questions ");
        /************************************************************************** */
        // Longest Substring without Repeating Characters
        String s = "abcdcd";
        System.out.println(LengthOfSubstring(s));
    }
}