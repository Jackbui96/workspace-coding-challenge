import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }

    public void printPreOrderRecursion() {
        System.out.print("Preorder traversal: " + this.data + " ");
        printPreOrderRecursion(this.left);
        printPreOrderRecursion(this.right);
        System.out.println();
    }

    private void printPreOrderRecursion(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            printPreOrderRecursion(node.left);
            printPreOrderRecursion(node.right);
        }
    }

    public void printInOrderRecursion() {
        System.out.print("Inorder traversal: ");
        printInOrderRecursion(left);
        System.out.print(data + " ");
        printInOrderRecursion(right);
        System.out.println();
    }

    private void printInOrderRecursion(TreeNode node) {
        if (node != null) {
            printInOrderRecursion(node.left);
            System.out.print(node.data + " ");
            printInOrderRecursion(node.right);
        }
    }

    public void printPostOrderRecursion() {
        System.out.print("Postorder traversal: ");
        printPostOrderRecursion(left);
        printPostOrderRecursion(right);
        System.out.print(data + " ");
        System.out.println();
    }

    private void printPostOrderRecursion(TreeNode node) {
        if (node != null) {
            printPostOrderRecursion(node.left);
            printPostOrderRecursion(node.right);
            System.out.print(node.data + " ");
        }
    }

    public void printPreOrderStack() {
        Stack<TreeNode> stack = new Stack<>();
        System.out.print("Preorder traversal: " + this.data + " ");

        if (left != null) {
            stack.add(left);
        }
        if (right != null) {
            stack.add(right);
        }

        while(!stack.isEmpty()) {
            TreeNode current = stack.peek();
            System.out.print(current.data + " ");
            stack.pop();

            if (current.left != null) {
                stack.add(current.left);
            }

            if (current.right != null) {
                stack.add(current.right);
            }
        }
    }
}
