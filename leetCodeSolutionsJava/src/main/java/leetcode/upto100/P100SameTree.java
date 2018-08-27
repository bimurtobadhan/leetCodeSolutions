package leetcode.upto100;

import leetcode.util.TreeNode;
import leetcode.util.Utility;

public class P100SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q != null){
            return false;
        }
        if(p != null && q==null){
            return false;
        }
        if(p==null && q==null)
            return true;

        if(p.val != q.val)
            return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        P100SameTree solution = new P100SameTree();
        TreeNode treeNode1 = Utility.processTreeNode("1 -1 2");
        TreeNode treeNode2 = Utility.processTreeNode("1 2 -1");

        System.out.println(solution.isSameTree(treeNode1,treeNode2));

        TreeNode treeNode3 = Utility.processTreeNode("1 2 3 4 5 6 5 8 9 10 11");
        TreeNode treeNode4 = Utility.processTreeNode("1 2 3 4 5 6 7 8 9 10 11");
        System.out.println(solution.isSameTree(treeNode3, treeNode4));
    }
}
