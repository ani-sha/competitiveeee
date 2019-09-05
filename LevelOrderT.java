class NodeTwo {
    int data;
    NodeTwo left, right;

    public NodeTwo(int d) {
        data = d;
        left = right = null;
    }
}

public class LevelOrderT {
    NodeTwo root;

    public LevelOrderT() {
        root = null;
    }

    void printLevelOrder() {
        int h = height(root);
        for(int i=1; i<=h; i++)
            printLevel(root,i);
    }

    int height(NodeTwo root) {
        if(root == null)
            return 0;
        else {
            int lh = height(root.left);
            int rh = height(root.right);

            if(lh > rh)
                return (lh+1);
            else
                return (rh+1);
        }
    }

    void printLevel(NodeTwo root, int level) {
        if(root == null)
            return;
        if(level == 1)
            System.out.print(root.data + " ");
        else if(level > 1) {
            printLevel(root.left,level-1);
            printLevel(root.right,level-1);
        }
    }

    public static void main(String[] args) {
        LevelOrderT bt = new LevelOrderT();
        bt.root = new NodeTwo(1);
        bt.root.left = new NodeTwo(2);
        bt.root.right = new NodeTwo(3);
        bt.root.left.left = new NodeTwo(4);
        bt.root.left.right = new NodeTwo(5);

        System.out.println("Level order traversal of binary tree is ");
        bt.printLevelOrder();
    }
}
