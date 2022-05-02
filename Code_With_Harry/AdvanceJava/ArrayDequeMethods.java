package AdvanceJava;

import java.util.ArrayDeque;

public class ArrayDequeMethods {
    public static void main(String[] args) {

        ArrayDeque<Integer> D1 = new ArrayDeque<>();
        // ArrayDeque<Integer> D 2 = new ArrayDeque();

        D1.add(1);
        D1.add(2);
        D1.add(3);
        D1.add(4);
        D1.add(5);

        // D2.add(57);
        // D2.add(66);

        // D1.addAll(D2);
        /************************** */
        D1.addFirst(55);

        /************************** */
        System.out.println(D1.getFirst());
        System.out.println(D1.getLast());

        /************************** */

    }
}
