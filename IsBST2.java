//Method2
class NodeOne {
    int data;
    NodeOne left, right;

    public NodeOne(int d) {
        data = d;
        left = right = null;
    }
}
public class IsBST2 {
    static NodeOne root;

    static boolean isBST(NodeOne root, NodeOne l, NodeOne r) {
        if(root == null)
            return false;

        if(l!=null && root.data <= l.data)
            return false;
        if(r!=null && root.data >= r.data)
            return false;

        return (isBST(root.left, l, root) && isBST(root.right, root, r));
    }

    public static void main(String[] args) {
        IsBST2 bt = new IsBST2();
        bt.root = new NodeOne(3);
        bt.root.left = new NodeOne(2);
        bt.root.right = new NodeOne(5);
        bt.root.left.left = new NodeOne(1);
        bt.root.left.right = new NodeOne(4);

        if (isBST(root,null,null))
            System.out.print("Is BST");
        else
            System.out.print("Not a BST");
    }
}

