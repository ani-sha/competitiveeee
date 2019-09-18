//Method1

class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
public class IsBST {

    Node root;

    boolean isBST() {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean isBSTUtil(Node node, int min, int max) {
        if(node == null)
            return true;

        if(node.data < min || node.data > max)
            return false;

        return (isBSTUtil(node.left, min, node.data-1) && isBSTUtil(node.right,node.data+1,max));
    }

    public static void main(String[] args) {
        IsBST bt = new IsBST();
        bt.root = new Node(4);
        bt.root.left = new Node(2);
        bt.root.right = new Node(5);
        bt.root.left.left = new Node(1);
        bt.root.left.right= new Node(3);

        if(bt.isBST())
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
