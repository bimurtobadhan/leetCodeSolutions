package leetcode.upto100;

import leetcode.util.Utility;

public class P88MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num1Index = m-1;
        int num2Index = n -1;
        for (int i = m + n - 1; i >= 0; i--) {
            int num1Value = num1Index >= 0 ? nums1[num1Index] : Integer.MIN_VALUE;
            int num2Value = num2Index >= 0 ? nums2[num2Index] : Integer.MIN_VALUE;
            if(num1Value > num2Value){
                nums1[i] = num1Value;
                num1Index--;
            }else{
                nums1[i] = num2Value;
                num2Index--;
            }
        }
    }

    public static void main(String[] args) {
        P88MergeSortedArray solution = new P88MergeSortedArray();
        int nums1[] = new int[]{1,2,3,0,0,0};
        solution.merge(nums1, 2, new int[]{2,5,6}, 2);
        Utility.printArray(nums1);
    }
}
