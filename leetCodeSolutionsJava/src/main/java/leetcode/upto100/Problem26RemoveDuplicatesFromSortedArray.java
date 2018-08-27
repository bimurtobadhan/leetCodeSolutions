package leetcode.upto100;

public class Problem26RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        int countNumbers = 1;
        int lastNumber = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != lastNumber){
                nums[countNumbers] = nums[i];
                countNumbers++;
                lastNumber = nums[i];

            }
        }
        return countNumbers;
    }

    public static void main(String[] args) {
        Problem26RemoveDuplicatesFromSortedArray solution = new Problem26RemoveDuplicatesFromSortedArray();
        int nums[] = new int[]{1,1,2};
        System.out.println(solution.removeDuplicates(nums));
    }
}
