package leetcode;

public class Problem9PalindromeNumber {
    public boolean isPalindrome(int x) {
        String intString = ""+x;
        StringBuilder stringBuilder = new StringBuilder(intString);
        String palinDromeString = stringBuilder.reverse().toString();
        if(intString.equals(palinDromeString))
            return true;
        else return false;
    }

    public static void main(String[] args) {
        Problem9PalindromeNumber solution = new Problem9PalindromeNumber();
        System.out.println(solution.isPalindrome(121));
        System.out.println(solution.isPalindrome(-121));
        System.out.println(solution.isPalindrome(10));
    }
}
