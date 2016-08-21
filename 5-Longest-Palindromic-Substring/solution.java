public class Solution {
    public String longestPalindrome(String s) {
       int len = s.length();
       if (len < 2) return s;
       
       String res = "";
       for(int i = 0; i < len - 1; i++){
           String even = expand(s, i, i + 1);
           if(even.length() > res.length()){
               res = even;
           }
           String odd = expand(s, i, i);
           if(odd.length() > res.length()){
               res = odd;
           }
       }
       return res;
    }
    
    public String expand(String s, int i, int j){
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        return s.substring(i+1,j);
    }
}