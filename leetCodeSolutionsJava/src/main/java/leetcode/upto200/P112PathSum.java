package leetcode.upto200;

import leetcode.util.TreeNode;
import leetcode.util.Utility;

public class P112PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        return hasPathSum(root, sum, 0);
    }

    public boolean hasPathSum(TreeNode root, int sum, int parentValue) {
        if(root.left == null && root.right==null){
            if(root.val + parentValue == sum)
                return true;
            else return false;
        }
        boolean leftPathSum = false;
        boolean rightPathSum = false;
        if(root.left != null){
            leftPathSum = hasPathSum(root.left, sum, parentValue + root.val);
        }
        if(root.right != null){
            rightPathSum = hasPathSum(root.right, sum , parentValue + root.val);
        }
        return leftPathSum || rightPathSum;
    }

    public static void main(String[] args) {
        P112PathSum solution = new P112PathSum();
//        TreeNode treeNode = Utility.processTreeNode("3 9 20 -1 -1 15 7");
        TreeNode treeNode = Utility.processTreeNode("5");
        System.out.println(solution.hasPathSum(treeNode,5));
    }
}
