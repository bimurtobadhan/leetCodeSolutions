package leetcode.upto200;

import leetcode.util.TreeNode;

public class P108ConvertSortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        return sortedArrayToBST(nums, start, end);
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if(start > end){
            return null;
        }
        int mid = (start + end)/2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.right = sortedArrayToBST(nums, mid + 1, end);
        treeNode.left = sortedArrayToBST(nums, start, mid -1);
        return treeNode;
    }

    public static void main(String[] args) {
        P108ConvertSortedArrayToBST solution = new P108ConvertSortedArrayToBST();
//        TreeNode treeNode = solution.sortedArrayToBST(new int[]{-10,-3,0,5,9});
        TreeNode treeNode = solution.sortedArrayToBST(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16});
        System.out.println(treeNode);
    }
}
