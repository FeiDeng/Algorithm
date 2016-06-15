public class Solution {
    public int maxProfit(int[] prices) {
        int len=prices.length;
        if(len<2) return 0;
        int[] dp=new int[len];
        
        int min=prices[0];
        for(int i=1;i<len;i++){
            dp[i]=Math.max(dp[i-1],prices[i]-min);
            min=Math.min(min,prices[i]);
        }
        
        int max=prices[len-1];
        int res=0;
        for(int i=len-2;i>=0;i--){
            res=Math.max(res,max-prices[i]+dp[i]);
            max=Math.max(max,prices[i]);
        }
        return res;
    }
}