public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0){
            return "";
        }
        
        int max = 1;
        String res = "";
        boolean[][] dp = new boolean[s.length()][s.length()];
        for(int i = 0; i < s.length(); i++){
            dp[i][i] = true;
            res = s.substring(i,i+1);
        }
        
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                 dp[i][i + 1] = true;
                 max = 2;
                 res = s.substring(i,i+2);
            }
        }
        
        for (int i = s.length() - 1; i >= 0; i--){
            for (int j = i; j < s.length(); j++){
                if (j - i > 1 && dp[i+1][j-1] && s.charAt(i)== s.charAt(j)){
                   dp[i][j] = true;
                   if(j - i + 1 > max){
                       max = j - i + 1;
                       res = s.substring(i, j + 1);
                   }
                }
            }
        }
        return res;
    }
}