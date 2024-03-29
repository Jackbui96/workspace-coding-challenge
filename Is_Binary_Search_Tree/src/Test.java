import org.junit.Assert;

public class Test {
    @org.junit.Test
    public void testCases() {
        Solution s = new Solution();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);

        TreeNode root1 = new TreeNode(10);
        root1.left = new TreeNode(8);
        root1.right = new TreeNode(12);
        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(9);
        root1.right.left = new TreeNode(11);

        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(7);
        root2.left.left = new TreeNode(1);
        root2.right.left = new TreeNode(4);
        root2.right.left.right = new TreeNode(6);
        root2.right.left.right.left = new TreeNode(5);

        TreeNode root3 = new TreeNode(3);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(5);
        root3.left.left = new TreeNode(1);
        root3.left.right = new TreeNode(4);
        root3.printInOrderRecursion();

        Assert.assertFalse(s.checkBST(root));
        Assert.assertTrue(s.checkBST(root1));
        Assert.assertTrue(s.checkBST(root3));
    }
}
