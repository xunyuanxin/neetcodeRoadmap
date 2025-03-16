package backtracking;

import commonClass.TreeNode;

import java.util.ArrayList;

public class CanReachLeaf {
    public static boolean canReachLeaf(TreeNode root) {
        if (root == null || root.val == 0) { return false; }
        if (root.left == null && root.right == null) { return true; }
        if (canReachLeaf(root.left)) { return true; }
        if (canReachLeaf(root.right)) { return true; }
        return false;
    }

    public static boolean leafPath(TreeNode root, ArrayList<Integer> path) {
        if (root == null || root.val == 0) {
            return false;
        }
        path.add(root.val);
        if (root.left == null && root.right == null) {
            return true;
        }
        if (leafPath(root.left, path)) { return true; }
        if (leafPath(root.right, path)) { return true; }
        path.remove(path.size() - 1);
        return false;
    }
}
