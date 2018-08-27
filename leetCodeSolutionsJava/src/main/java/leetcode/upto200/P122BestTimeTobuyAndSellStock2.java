package leetcode.upto200;

public class P122BestTimeTobuyAndSellStock2 {

    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i-1];
            if(diff > 0)
                result += diff;
        }
        return result;
    }

    public static void main(String[] args) {
        P122BestTimeTobuyAndSellStock2 solution = new P122BestTimeTobuyAndSellStock2();
        System.out.println(solution.maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(solution.maxProfit(new int[]{1,2,3,4,5}));
        System.out.println(solution.maxProfit(new int[]{7,6,4,3,1}));
    }
}
