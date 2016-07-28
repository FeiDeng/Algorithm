public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<2) return 0;
        int n=prices.length;
        int min=prices[0];
        int[] dp=new int[n];
        
        for(int i=1;i<n;i++){
            dp[i]=Math.max(prices[i]-min,dp[i-1]);
            min=Math.min(min,prices[i]);
        }
        int max=prices[n-1];
        int res=0;
        for(int i=n-2;i>=0;i--){
            res=Math.max(max-prices[i]+dp[i],res);
            max=Math.max(max,prices[i]);
        }
        return res;
    }
}