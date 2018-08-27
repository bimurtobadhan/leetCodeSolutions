package leetcode.upto200;

import leetcode.util.TreeNode;
import leetcode.util.Utility;

public class P110BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        return Math.abs(maxDepth(root.right)-maxDepth(root.left)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        P110BalancedBinaryTree solution = new P110BalancedBinaryTree();
//        TreeNode treeNode = Utility.processTreeNode("3 9 20 -1 -1 15 7");
        TreeNode treeNode = Utility.processTreeNode("1,2,2,3,3,-1,-1,4,4");
        System.out.println(solution.isBalanced(treeNode));
    }
}
