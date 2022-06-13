package Questions.ApniKaksha;

public class BackTracking {
    public static void PrintPermutation(String str, String perm, int index) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currStr = str.charAt(i);
            // System.out.println("Current Str" + currStr);
            String newStr = str.substring(0, i) + str.substring( i + 1);
            // System.out.println("New String " + newStr);
            PrintPermutation(newStr, perm + currStr, index + 1);
           
        }
    }

    public static void main(String[] args) {
        System.out.println("BackTracking");
        String str = "ABC";
        PrintPermutation(str, "", 0);
        // System.out.println(str.substring(0 + 1));

        // for(int i =0; i<=str.length(); i++){
        // System.out.println(str.charAt(i));;

        // }

    }
}
