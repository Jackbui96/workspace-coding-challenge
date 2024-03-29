import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    /**
     * Note1: Do not check for each node to see if node.left > current or node.right < current as this might happens:
     *
     *        3
     *      /   \
     *     2     7
     *    / \   /
     *   1  4  6
     * => This is not a BST
     */

    boolean checkBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            TreeNode current = queue.remove();

            if (current.left != null && current.left.data > current.data) {
                return false;
            }

            if (current.right != null && current.right.data < current.data) {
                return false;
            }

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }

        return true;
    }
}
