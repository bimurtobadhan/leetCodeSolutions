package leetcode.upto200;

import leetcode.util.Utility;

public class P167TwoSum2InputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length -1;
        int result [] = new int[2];
        while(start < end){
            int value = numbers[start] + numbers[end];
            if(value == target){
                result[0] = start + 1;
                result[1] = end + 1;
            }
            if(value > target){
                end--;
            }
            else {
                start++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        P167TwoSum2InputArrayIsSorted solution = new P167TwoSum2InputArrayIsSorted();
        Utility.printArray(solution.twoSum(new int[]{2,7,11,15},9));
    }
}
