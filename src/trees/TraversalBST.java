package trees;

import java.util.LinkedList;
import java.util.Queue;

public class TraversalBST {
    public static void traversalBFS(BinaryTreeNode root) {
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        if (root != null) { queue.add(root); }

        int level = 0;
        while (!queue.isEmpty()) {
            System.out.println("level: " + level);
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                BinaryTreeNode curr = queue.poll();
                System.out.println(curr.val);
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
            level++;
        }
    }
}
