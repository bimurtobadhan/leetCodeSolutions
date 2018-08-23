package leetcode;

public class P35SearchInsertPosition {
//    public int searchInsert(int[] nums, int target) {
//        int start = 0;
//        int end = nums.length - 1;
//
//        while(start <= end){
//            int mid = (start + end)/2;
//            if(nums[mid] == target)
//                return mid;
//            if(nums[mid] > target){
//                end = mid -1;
//            }else {
//                start = mid + 1;
//            }
//        }
//        return end;
//    }

    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) end = mid-1;
            else start = mid+1;
        }
        return start;
    }

    public static void main(String[] args) {
        P35SearchInsertPosition solution = new P35SearchInsertPosition();
//        System.out.println(solution.searchInsert(new int[]{4,7},5));
//        System.out.println(solution.searchInsert(new int[]{1,3,5,6},5));
        System.out.println(solution.searchInsert(new int[]{1,3,5,6},2));
//        System.out.println(solution.searchInsert(new int[]{1,3,5,6},7));
//        System.out.println(solution.searchInsert(new int[]{1,3,5,6},0));
    }
}
