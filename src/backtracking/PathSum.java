package backtracking;

import commonClass.TreeNode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) { return false; }
        targetSum -= root.val;
        if (root.left == null && root.right == null) { return targetSum == 0; }
        if (hasPathSum(root.left, targetSum)) {
            return true;
        }
        if (hasPathSum(root.right, targetSum)) {
            return true;
        }
        return false;
    }
}
