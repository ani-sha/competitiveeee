class N {
    int data;
    N left, right;

    public N (int d) {
        data = d;
        left = right = null;
    }
}

public class LowestCommonAncestor {
    N root;

    N findLCA(int n1, int n2) {
        return findLCA(root, n1, n2);
    }

    N findLCA(N root, int n1, int n2) {
        if(root == null)
            return null;
        if(root.data == n1 || root.data == n2)
            return root;

        N left_lca = findLCA(root.left, n1, n2);
        N right_lca = findLCA(root.right, n1, n2);

        if(left_lca != null && right_lca != null)
            return root;
        return (left_lca!=null) ? left_lca : right_lca;
    }
}
