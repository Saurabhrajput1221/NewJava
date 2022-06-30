package Questions.DSA;
// Every Node store the current value and Next Node
class Node {
    // we created integer to store the value
    public int val;
    // Address of next node
    public Node next;

    // constructor
    Node(int val) {

        this.val = val;
        this.next = null;
    }
}

public class LinkList2 {

    // add First
    public static Node InsertHead(Node currHead, Node newNode) {

        // 1. Point to next of newnode to currNode // we point next to current head
        newNode.next = currHead;
        return newNode;
    }

    // Node is our datatype thas why we are passing Node as parameter
    public static void PrintList(Node head) {
        while (head != null) {
            System.out.print(head.val + " ->> ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        System.out.println("Linked list.....");
        // we need to strore the head of linkedList and Created head of linkedlist
        Node head = new Node(1);
        Node newNode = new Node(2);

        // head.next = newNode;
        head = InsertHead(head, newNode);
        head = InsertHead(head, new Node(55));
        head = InsertHead(head, new Node(5445));

        PrintList(head);

    }
}
