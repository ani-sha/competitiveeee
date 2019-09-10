import java.util.*;
public class ReverseLL {
    Node head;
    public class Node {
        int data;
        Node next = null;

        Node(int d) {
            data = d;
        }
    }

    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr.next!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
    public static void main(String[] args) {
        ReverseLL rll = new ReverseLL();
    }
}
