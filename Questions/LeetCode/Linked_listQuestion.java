package Questions.LeetCode;

import Questions.ApniKaksha.str;

public class Linked_listQuestion {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    /***********************************************************************/
    // Reverse Linked List
    public static Node reverselist(Node node) {
        if (node == null || node.next == null) {
            System.out.println("Node is empty");
            return node;
        }
        Node prev = null;
        Node curr = node;
        Node next = node.next;
        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    /***********************************************************************/
    public Node hasCycle(Node head) {
        Node fp = head;
        Node sp = head;
        while (fp != null && fp.next != null) {
            sp = sp.next;
            fp = fp.next.next;
            if (sp == fp) {
                return fp;
            }
        }
        return sp;
    }

    /***********************************************************************/
    void printList(Node node) {
        // for (int i = 0; i < 5; i++) {
        // System.out.println(node.data + " this is for loop ");
        // }
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        System.out.println("Linked list Questions...");
        /***********************************************************************/
        Linked_listQuestion list = new Linked_listQuestion();
        list.head = new Node(3);
        list.head.next = new Node(2);
        list.head.next.next = new Node(0);
        list.head.next.next.next = new Node(-4);

        System.out.println("Given Linked list");
        list.printList(head);
        /***********************************************************************/
        // Reverse Linked List
        // System.out.println("Reversed linked list ");
        // head = list.reverselist(head);
        // list.printList(head);

        /***********************************************************************/
        head = list.hasCycle(head);
        list.printList(head);

        /***********************************************************************/
        // Note
        // Insert : O(n)
        // Search : O(1);

    }
}
