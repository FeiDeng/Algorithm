public class Solution {
    public int maxProfit(int k, int[] prices) {
        int len=prices.length;
        
        if(len<2) return 0;
        
        if(k>=len/2){
            int profit=0;
            for(int i=1;i<len;i++){
                if(prices[i]>prices[i-1]){
                    profit+=prices[i]-prices[i-1];
                }
            }
            return profit;
        }
        
         int[][] dp = new int[k+1][len];
    for (int i = 1; i <= k; i++) {
        int localMax = dp[i-1][0] - prices[0];
        for (int j = 1; j < len; j++) {
            dp[i][j] = Math.max(dp[i][j-1],  prices[j] + localMax);
            localMax = Math.max(localMax, dp[i-1][j] - prices[j]);
        }
    }
    return dp[k][len-1];
        
    }
}