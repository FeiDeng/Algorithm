public class Solution {
    public String longestPalindrome(String s) {
        int len=s.length();
        if(len<2) return s;
        
        String result="";
        for(int i=0;i<s.length()-1;i++){
            String odd=expand(s,i,i);
            if(odd.length()>result.length()){
                result=odd;
            }
            String even=expand(s,i,i+1);
            if(even.length()>result.length()){
                result=even;
            }
        }
        return result;
    }
    
    public String expand(String s, int i,int j){
        while(j<s.length()&&i>=0&&s.charAt(i)==s.charAt(j)){
            j++;
            i--;
        }
        return s.substring(i+1,j);
    }
}