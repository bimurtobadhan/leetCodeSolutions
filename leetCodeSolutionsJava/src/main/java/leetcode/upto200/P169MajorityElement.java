package leetcode.upto200;

import java.util.HashMap;
import java.util.Map;

public class P169MajorityElement {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> elementMap = new HashMap<>();
        int majorityCount = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            int count = elementMap.getOrDefault(nums[i],0);
            count = count+1;
            if(count > majorityCount)
                return nums[i];
            elementMap.put(nums[i], count);
        }
        return 0;
    }

    public static void main(String[] args) {
        P169MajorityElement solution = new P169MajorityElement();
        System.out.println(solution.majorityElement(new int[]{2,2,1,1,1,2,2}));
        System.out.println(solution.majorityElement(new int[]{2,2,1,1,1,1,2}));
        System.out.println(solution.majorityElement(new int[]{3,2,3}));
    }
}
