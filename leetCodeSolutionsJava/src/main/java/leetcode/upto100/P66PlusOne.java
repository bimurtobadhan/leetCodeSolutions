package leetcode.upto100;

public class P66PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int rem = 0;
        for (int i = digits.length - 1; i >= 0 ; i--) {
            rem = (digits[i] + carry)%10;
            carry = (digits[i] + carry)/10;
            digits[i] = rem;
        }
        if(carry != 0){
            int result[] = new int[digits.length +1];
            result[0] = carry;
            for (int i = 0; i < digits.length; i++) {
                result[i+1] = digits[i];
            }
            return result;
        }
        return digits;
    }

    private void printArray(int result[]){
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%d ", result[i]);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        P66PlusOne solution = new P66PlusOne();
        solution.printArray(solution.plusOne(new int[]{1,2,3}));
        solution.printArray(solution.plusOne(new int[]{4,3,2,1}));
        solution.printArray(solution.plusOne(new int[]{9,9,9,9}));
        solution.printArray(solution.plusOne(new int[]{0,0,9,9}));
        solution.printArray(solution.plusOne(new int[]{0,0,9,1}));
    }
}
