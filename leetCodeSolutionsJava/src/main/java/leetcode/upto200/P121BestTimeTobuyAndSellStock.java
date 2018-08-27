package leetcode.upto200;

public class P121BestTimeTobuyAndSellStock {

    public int maxProfit(int[] prices) {
        int maxCur = 0;
        int maxSoFar = maxCur;
        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i-1];
            maxCur = Math.max(diff, maxCur + diff);
            maxSoFar = Math.max(maxCur , maxSoFar);
        }
        if(maxSoFar < 0)
            return 0;
        return maxSoFar;
    }

    public static void main(String[] args) {
        P121BestTimeTobuyAndSellStock solution = new P121BestTimeTobuyAndSellStock();
        System.out.println(solution.maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(solution.maxProfit(new int[]{7,6,4,3,1}));
    }
}
