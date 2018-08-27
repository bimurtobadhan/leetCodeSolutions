package leetcode.upto200;

import leetcode.util.TreeNode;
import leetcode.util.Utility;

public class P104MaxDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        P104MaxDepthOfBinaryTree solution = new P104MaxDepthOfBinaryTree();

        TreeNode treeNode1 = Utility.processTreeNode("1 -1 2");
        TreeNode treeNode2 = Utility.processTreeNode("1 2 -1");
        TreeNode treeNode3 = Utility.processTreeNode("1 2 2 3 4 4 3");
        TreeNode treeNode4 = Utility.processTreeNode("1 2 3 4 5 6 7 8 9 10 11");
        TreeNode treeNode5 = Utility.processTreeNode("1 2 2 -1 3 -1 3");
        TreeNode treeNode6 = Utility.processTreeNode("3 9 20 -1 -1 15 7");
        TreeNode treeNode7 = Utility.processTreeNode("3");

        System.out.println(solution.maxDepth(treeNode1));
        System.out.println(solution.maxDepth(treeNode2));
        System.out.println(solution.maxDepth(treeNode3));
        System.out.println(solution.maxDepth(treeNode4));
        System.out.println(solution.maxDepth(treeNode5));
        System.out.println(solution.maxDepth(treeNode6));
        System.out.println(solution.maxDepth(treeNode7));
    }
}
