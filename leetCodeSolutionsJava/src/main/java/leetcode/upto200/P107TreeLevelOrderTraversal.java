package leetcode.upto200;

import leetcode.util.TreeNode;
import leetcode.util.Utility;

import java.util.*;

public class P107TreeLevelOrderTraversal {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        int height = maxDepth(root);
        List<List<Integer>> result = new ArrayList<>();
        List<List<TreeNode>> treeNodes = new ArrayList<>();
        height--;
        if(root == null){
            return result;
        }
        result.add(Collections.singletonList(root.val));
        treeNodes.add(Collections.singletonList(root));
        while(height>0){
            List<Integer> values = new ArrayList<>();
            List<TreeNode> treeNodeArrayList = new ArrayList<>();
            for(TreeNode treeNode : treeNodes.get(0)){
                if(treeNode.left != null){
                    treeNodeArrayList.add(treeNode.left);
                    values.add(treeNode.left.val);
                }
                if(treeNode.right != null){
                    treeNodeArrayList.add(treeNode.right);
                    values.add(treeNode.right.val);
                }
            }
            height--;
            result.add(0, values);
            treeNodes.add(0,treeNodeArrayList);
        }

        return result;
    }

    private int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }


    private void print(List<List<Integer>> lists){
        System.out.print("[\n");
        for (List<Integer> list : lists) {
            System.out.print("[");
            for (Integer aList : list) {
                System.out.printf("%d ", aList);
            }
            System.out.print("]\n");
        }
        System.out.print("]\n");
    }


    public static void main(String[] args) {
        P107TreeLevelOrderTraversal solution = new P107TreeLevelOrderTraversal();

        TreeNode treeNode1 = Utility.processTreeNode("1 -1 2");
        TreeNode treeNode2 = Utility.processTreeNode("1 2 -1");
        TreeNode treeNode3 = Utility.processTreeNode("1 2 2 3 4 4 3");
        TreeNode treeNode4 = Utility.processTreeNode("1 2 3 4 5 6 7 8 9 10 11");
        TreeNode treeNode5 = Utility.processTreeNode("1 2 2 -1 3 -1 3");
        TreeNode treeNode6 = Utility.processTreeNode("3 9 20 -1 -1 15 7");
        TreeNode treeNode7 = Utility.processTreeNode("");
        TreeNode treeNode8 = null;

//        solution.print(solution.levelOrderBottom(treeNode1));
//        solution.print(solution.levelOrderBottom(treeNode2));
//        solution.print(solution.levelOrderBottom(treeNode3));
//        solution.print(solution.levelOrderBottom(treeNode4));
//        solution.print(solution.levelOrderBottom(treeNode5));
//        solution.print(solution.levelOrderBottom(treeNode6));
//        solution.print(solution.levelOrderBottom(treeNode7));
        solution.print(solution.levelOrderBottom(null));
    }
}
