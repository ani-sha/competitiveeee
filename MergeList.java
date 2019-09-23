class NODE {
    int data;
    NODE next;

    NODE (int D) {
        data = D;
        next = null;
    }
}
public class MergeList {

    NODE head;

    public void addNode(NODE node) {
        if(head==null)
            head=node;
        else {
            NODE temp = head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=node;
        }
    }

    public void printList() {
        NODE t = head;
        while(t.next!=null) {
            System.out.print(t.data+" ");
            t=t.next;
        }
        System.out.println();
    }

    public static NODE mergeList(NODE head1, NODE head2) {
        if(head1==null)
            return head2;
        if(head2==null)
            return head1;
        if(head1.data<=head2.data) {
            head1.next = mergeList(head1.next,head2);
            return head1;
        }
        else {
            head2.next = mergeList(head1,head2.next);
            return head2;
        }
    }
    public static void main(String[] args) {
        MergeList ll1 = new MergeList();
        MergeList ll2 = new MergeList();

        ll1.addNode(new NODE(5));
        ll1.addNode(new NODE(10));
        ll1.addNode(new NODE(15));
        ll1.addNode(new NODE(26));

        ll2.addNode(new NODE(2));
        ll2.addNode(new NODE(4));
        ll2.addNode(new NODE(8));
        ll2.addNode(new NODE(29));

        System.out.println("Sorted Merge List: ");

        ll1.head = mergeList(ll1.head, ll2.head);
        ll1.printList();
    }
}
