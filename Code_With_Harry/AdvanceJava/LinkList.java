package AdvanceJava;

import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        System.out.println("This is LinkList...");
        LinkedList<Integer> L1 = new LinkedList<>();
        LinkedList<Integer> L2 = new LinkedList<>();

        L1.add(1);
        L1.add(2);
        L1.add(3);
        L1.add(4);
        L1.add(5);
        /************************** */
        L2.add(10);
        L2.add(11);
        L2.add(12);
        L2.add(13);
        /************************** */
        L1.addAll(L2);
        /************************** */
        // L1.addLast(88);
        /************************** */
        L1.addFirst(55);
        /************************** */
        // L1.removeFirst();
        /************************** */
        // L1.removeLast();
        /************************** */
        System.out.println("This is size of Array... " + L1.size());
        /************************** */
        // L1.removeLastOccurrence(11);
        /************************** */
        // L1.poll();

        for (int i = 0; i < L1.size(); i++) {
            System.out.print(L1.get(i));
            System.out.print(", ");
        }
    }
}
