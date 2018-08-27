package leetcode.util;

import java.util.List;
import java.util.StringTokenizer;

public class Utility {
    public static ListNode processInput(String numberInString){
        StringTokenizer tokenizer = new StringTokenizer(numberInString," ");
        ListNode startNode = new ListNode(Integer.parseInt(tokenizer.nextToken()));
        ListNode result = startNode;
        while(tokenizer.hasMoreTokens()){
            ListNode node = new ListNode(Integer.parseInt(tokenizer.nextToken()));
            startNode.next = node;
            startNode = startNode.next;
        }
        startNode.next = null;
        return result;
    }

    public static TreeNode processTreeNode(String numberInString){
        StringTokenizer tokenizer = new StringTokenizer(numberInString," ,");
        int tree [] = new int[tokenizer.countTokens()+1];
        for (int i = 1; i < tree.length; i++) {
            tree[i] = Integer.parseInt(tokenizer.nextToken());
        }
        TreeNode treeNode = prepareTreeNode(tree, 1);
        return treeNode;
    }

    public static void printArray(int result[]){
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%d ", result[i]);
        }
        System.out.println();
    }

    public static void printArray(List result){
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i)  + " ");
        }
        System.out.println();
    }

    public static void print(List<List<Integer>> lists){
        System.out.print("[\n");
        for (List<Integer> list : lists) {
            System.out.print("\t[");
            for (Integer aList : list) {
                System.out.printf("%d ", aList);
            }
            System.out.print("]\n");
        }
        System.out.print("]\n");
    }

    private static TreeNode prepareTreeNode(int[] tree, int i) {
        if(i >= tree.length)
            return null;
        if(tree[i] == -1)
            return null;
        TreeNode treeNode = new TreeNode(tree[i]);
        treeNode.left = prepareTreeNode(tree, 2*i);
        treeNode.right = prepareTreeNode(tree, 2*i+1);
        return treeNode;
    }
}
