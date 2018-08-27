package leetcode.upto100;

public class P27RemoveElement {
    public int removeElement(int[] nums, int val) {
        int lengthPointer = 0;
        for (int n = 0; n < nums.length; n++) {
            if(nums[n] != val){
                nums[lengthPointer] = nums[n];
                lengthPointer++;
            }
        }
        return lengthPointer;
    }

    public static void main(String[] args) {
        P27RemoveElement solution = new P27RemoveElement();
        int nums[] = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(solution.removeElement(nums, val));
    }
}
