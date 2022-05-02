package AdvanceJava;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        System.out.println("ArrayList...");
        ArrayList<Integer> L1 = new ArrayList<>();
        ArrayList<Integer> L2 = new ArrayList<>();
        // methods of arralist
        L1.add(6);
        L1.add(5);
        L1.add(54);
        L1.add(56);
       
        /************************* */
        L2.add(1);
        L2.add(2);
        /**************** */
        L1.addAll(L2);
        /************ */
        // L1.addAll(0, L2);
        /************************** */
        // L1.clear();
        /************************** */
        // System.out.println(L1.contains(6));
        /************************** */
        // System.out.println(L1.indexOf(54));
        /************************** */
        // System.out.println(L1.lastIndexOf(54));
        /************************** */
        L1.set(0, 55555);
            /************************** */
          System.out.println( "This is clone method... " + L1.clone());
              /************************** */
              System.out.println( "This is Empty method... " + L1.isEmpty());

        for (int i = 0; i < L1.size(); i++) {
            System.out.print(L1.get(i));
            System.out.print(", ");
        }
    }
}
