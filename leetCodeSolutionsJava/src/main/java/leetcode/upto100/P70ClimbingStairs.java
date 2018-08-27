package leetcode.upto100;

public class P70ClimbingStairs {

    public int climbStairs(int n) {
        if(n==0)
            return 0;
        if(n == 1)
            return 1;
        if(n==2)
            return 2;
        else
            return climbStairs(n-2) + 2;
    }

    public static void main(String[] args) {
        P70ClimbingStairs solution = new P70ClimbingStairs();
        System.out.println(solution.climbStairs(1));
        for (int i = 0; i < 10; i++) {
            System.out.println(solution.climbStairs(i));
        }
    }
}
