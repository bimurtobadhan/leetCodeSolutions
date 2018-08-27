package leetcode.upto200;

import leetcode.util.TreeNode;
import leetcode.util.Utility;

public class P111MinDepthOfBinaryTree {

    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }

    public static void main(String[] args) {
        P111MinDepthOfBinaryTree solution = new P111MinDepthOfBinaryTree();
//        TreeNode treeNode = Utility.processTreeNode("3 9 20 -1 -1 15 7");
        TreeNode treeNode = Utility.processTreeNode("1,2");
        System.out.println(solution.minDepth(treeNode));
    }
}
