public class Solution {
    public int minDistance(String word1, String word2) {
        int[] dp=new int[word2.length()+1];
        dp[0]=0;
        for(int j=1;j<word2.length()+1;j++){
            dp[j]=j;
        }
        for(int i=1;i<word1.length()+1;i++){
            int pre=dp[0];
            dp[0]=i;
            for(int j=1;j<word2.length()+1;j++){
                int temp=dp[j];
                if(word1.charAt(i-1)==word2.charAt(j-1)) dp[j]=pre;
                else{
                    dp[j]=Math.min(dp[j]+1,Math.min(pre+1,dp[j-1]+1));
                }
                pre=temp;
            }
        }
        return dp[word2.length()];
    }
}