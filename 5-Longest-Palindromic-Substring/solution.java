public class Solution {
    public String longestPalindrome(String s) {
        int len=s.length();
        if(len<2) return s;
        
        boolean[][] dp=new boolean[len][len];
        int max=0;
        String result="";
        for(int i=len-1;i>=0;i--){
            for(int j=i;j<len;j++){
                if(s.charAt(i)==s.charAt(j)&&(j-i<3||dp[i+1][j-1])){
                   
                
                        dp[i][j]=true;
                        int cur=j-i+1;
                        if(cur>max){
                            max=cur;
                            result=s.substring(i,j+1);
                        }
                    
                }
            }
        }
        return result;
    }
}