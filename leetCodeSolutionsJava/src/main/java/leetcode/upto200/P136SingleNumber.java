package leetcode.upto200;

import java.util.HashSet;
import java.util.Set;

public class P136SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> numberSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            if(numberSet.contains(number))
                numberSet.remove(number);
            else numberSet.add(number);
        }
        Integer result[] = new Integer[1];
        result = numberSet.toArray(result);
        return result[0];
    }

    public static void main(String[] args) {
        P136SingleNumber solution = new P136SingleNumber();
        System.out.println(solution.singleNumber(new int[]{1}));
        System.out.println(solution.singleNumber(new int[]{4,1,2,1,2}));
    }
}
