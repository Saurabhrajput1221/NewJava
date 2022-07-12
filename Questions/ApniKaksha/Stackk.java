package Questions.ApniKaksha;

import java.util.Stack;

public class Stackk {
    public static void main(String[] args) {
        System.out.println("Stack");
        Stack<Character> s1 = new Stack<>();
        s1.push('a');
        s1.push('b');
        s1.push('c');
        s1.push('d');
        s1.push('e');
        // pop removing last element
        // s1.pop();
        // Using peek you  can see last element from stack
        System.out.println("last element of stack = " + s1.peek());;

        System.out.println(s1);

    }
}
