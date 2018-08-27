package leetcode.upto200;

import leetcode.util.TreeNode;
import leetcode.util.Utility;

public class P101SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        TreeNode mirror = root;
        return isSameTree(root, mirror);
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
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

        return isSameTree(p.left, q.right) && isSameTree(p.right, q.left);
    }

    public static void main(String[] args) {
        P101SymmetricTree solution = new P101SymmetricTree();
//        TreeNode treeNode1 = Utility.processTreeNode("1 -1 2");
//        TreeNode treeNode2 = Utility.processTreeNode("1 2 -1");
//
//        System.out.println(solution.isSameTree(treeNode1,treeNode2));

        TreeNode treeNode3 = Utility.processTreeNode("1 2 2 3 4 4 3");
//        TreeNode treeNode4 = Utility.processTreeNode("1 2 3 4 5 6 7 8 9 10 11");
        System.out.println(solution.isSymmetric(treeNode3));

        TreeNode treeNode4 = Utility.processTreeNode("1 2 2 -1 3 -1 3");
//        TreeNode treeNode4 = Utility.processTreeNode("1 2 3 4 5 6 7 8 9 10 11");
        System.out.println(solution.isSymmetric(treeNode4));
    }
}
