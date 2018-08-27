package leetcode.upto100;

public class P53MaximumSubArray {

    public int maxSubArray(int[] nums) {
        int max_so_far = nums[0];
        int max_at_i = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max_at_i = Math.max(nums[i], max_at_i + nums[i]);
            max_so_far = Math.max(max_at_i, max_so_far);
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        P53MaximumSubArray solution = new P53MaximumSubArray();
        System.out.println(solution.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
