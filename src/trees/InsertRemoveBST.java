package trees;

public class InsertRemoveBST {
    public static BinaryTreeNode insertBST(BinaryTreeNode root, int val) {
        if (root == null) { return new BinaryTreeNode(val); }
        if (val > root.val) {
            root.right = insertBST(root.right, val);
        } else if (val < root.val) {
            root.left = insertBST(root.left, val);
        }
        return root;
    }

    public static BinaryTreeNode findMinBST(BinaryTreeNode root) {
        BinaryTreeNode curr = root;
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }

    public static BinaryTreeNode removeBST(BinaryTreeNode root, int val) {
        if (root == null) { return null; }
        if (val > root.val) {
            root.right = removeBST(root.right, val);
        } else if (val < root.val) {
            root.left = removeBST(root.left, val);
        } else {
            //case 1: 0 or 1 child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                //case 2: 2 children
                BinaryTreeNode minNode = findMinBST(root.right);
                root.val = minNode.val;
                root.right = removeBST(root.right, minNode.val);
            }
        }
        return root;
    }
}
