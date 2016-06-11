public class Solution {
    public String longestPalindrome(String s) {
        int len=s.length();
        if(len<2) return s;
        boolean[][] dp=new boolean[s.length()][s.length()];
        int start=0, end=s.length()-1;
        int max=0;
        for(int i=0;i<len;i++){
            dp[i][i]=true;
            if(i+1<len&&s.charAt(i)==s.charAt(i+1)) dp[i][i+1]=true;
        }
        
        for(int i=len-1;i>=0;i--){
            for(int j=i;j<len;j++){
                if(s.charAt(i)==s.charAt(j)&&(j-i<3||dp[i+1][j-1]==true)){
                    dp[i][j]=true;
                    int temp=j-i+1;
                    if(temp>max){
                        max=temp;
                        start=i;
                        end=j;
                    }
                }
            }
        }
        return s.substring(start,end+1);
    }
}