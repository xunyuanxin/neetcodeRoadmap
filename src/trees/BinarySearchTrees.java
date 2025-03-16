package trees;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTrees {
    //main benefit: insert, delete time complexity - O(logN)
    //sorted array: insert, delete time complexity - O(N)
    public static boolean binarySearchTree(BinaryTreeNode root, int target) {
        if (root == null) { return false; }
        if (target > root.val) {
            return binarySearchTree(root.right, target);
        } else if (target < root.val) {
            return binarySearchTree(root.left, target);
        } else {
            return true;
        }
    }
}
