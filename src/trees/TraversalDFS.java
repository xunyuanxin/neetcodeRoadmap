package trees;

import java.util.ArrayList;
import java.util.List;

public class TraversalDFS {
    public static void inOrderDFS(BinaryTreeNode root) {
        if (root == null) { return; }
        inOrderDFS(root.left);
        System.out.println(root.val);
        inOrderDFS(root.right);
    }

    public static List<Integer> inOrderTraversal(BinaryTreeNode root) {
        List<Integer> result = new ArrayList<>();
        addInorderTraversalVal(root, result);
        return result;
    }

    public static void addInorderTraversalVal(BinaryTreeNode root, List<Integer> arr) {
        if (root != null) {
            addInorderTraversalVal(root.left, arr);
            arr.add(root.val);
            addInorderTraversalVal(root.right, arr);
        }
    }

    public int kthSmallestDFS(BinaryTreeNode root, int k) {
        List<Integer> sortedList = inOrderTraversal(root);
        return sortedList.get(k - 1);
    }

    public static void preOrderDFS(BinaryTreeNode root) {
        if (root == null) { return; }
        System.out.println(root.val);
        preOrderDFS(root.left);
        preOrderDFS(root.right);
    }

    public static void postOrderDFS(BinaryTreeNode root) {
        if (root == null) { return; }
        postOrderDFS(root.left);
        postOrderDFS(root.right);
        System.out.println(root.val);
    }
}
