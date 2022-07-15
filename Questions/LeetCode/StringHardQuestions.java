package Questions.LeetCode;

import java.lang.Thread.State;

public class StringHardQuestions {
    // Longest Substring without Repeating Characters
    // public static int LengthOfSubstring(String s) {
    // int l = 0;
    // int r = 0;
    // Set<Character> sow = new HashSet<>();
    // int max = 0;
    // while (r < s.length()) {
    // Character c = s.charAt(r);
    // if (sow.add(c)) {
    // max = Math.max(max, r - l + 1);
    // r++;
    // } else {
    // while (s.charAt(l) != c) {
    // sow.remove(s.charAt(l));
    // l++;
    // }
    // sow.remove(c);
    // l++;
    // }
    // }
    // return max;
    // }
    /************************************************************************** */
// To much confusing.
    // public static int CharReplace(String s, int n) {
    //     int[] fre = new int[26];
    //     int start = 0;
    //     int freqlength = 0;
    //     int Longest = 0;

    //     for (int i = 0; i < s.length(); i++) {
    //         fre[s.charAt(i) - 'A']++;
    //         System.out.println("Freq " + fre[s.charAt(i) - 'A']);

    //         freqlength = Math.max(freqlength, fre[s.charAt(i) - 'A']);
    //         System.out.println("Length of freqlength " + freqlength);
    //         int maxwindow = i - start + 1;
    //         System.out.println("maxWindow " + maxwindow);

    //         if (maxwindow - freqlength > n) {
    //             fre[s.charAt(start) - 'A']--;
    //             start++;
    //         }
    //         Longest = Math.max(Longest, i - start + 1);
    //         System.out.println("Longest " + Longest);

    //     }
    //     return Longest;
    // }
    /************************************************************************** */


// String ans = "";
        
// for(int i=0; i<s.length(); i++){
//     int low = i, high = i;
//     while(low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)){
//         if(ans.length() < high-low+1){
//             ans = s.substring(low, high+1);
//         }
//         low--;
//         high++;
//     }
//     low = i;
//     high = i+1;
//     while(low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)){
//         if(ans.length() < high-low+1){
//             ans = s.substring(low, high+1);
//         }
//         low--;
//         high++;
//     }
// }
// return ans;


    




    public static void main(String[] args) {
        System.out.println("String Hard Questions ");


        /************************************************************************** */
        // String s = "ABAB";
        // int n = 2;
        // System.out.println(CharReplace(s, n));

        /************************************************************************** */
        // Longest Substring without Repeating Characters
        // String s = "abcdcd";
        // System.out.println(LengthOfSubstring(s));
    }
}