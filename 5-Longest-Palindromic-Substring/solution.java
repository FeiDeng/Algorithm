public class Solution {
    public String longestPalindrome(String s) {
        int len=s.length();
        if(len<2) return s;
        String result="";
        for(int i=0;i<s.length()-1;i++){
            String even=expand(i,i,s);
            if(even.length()>result.length()) result=even;
            String odd=expand(i,i+1,s);
            if(odd.length()>result.length()) result=odd;
        }
        return result;
    }
    
    public String expand(int start, int end,String s){
        while(start>=0&&end<s.length()&&s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }
        return s.substring(start+1,end);
    }
}