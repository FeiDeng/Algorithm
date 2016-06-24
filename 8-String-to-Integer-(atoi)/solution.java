public class Solution {
    public int myAtoi(String str) {
        int res=0;
        int index=0;
        boolean isNegative=false;
        while(index<str.length()&&str.charAt(index)==' '){
            index++;
        }
        
        if(index<str.length()&&(str.charAt(index)=='-'||str.charAt(index)=='+')){
            isNegative=str.charAt(index)=='-'?true:false;
            index++;
        }
        
        while(index<str.length()&&str.charAt(index) >= '0' && str.charAt(index) <= '9'){
            if(res>Integer.MAX_VALUE/10||(res==Integer.MAX_VALUE/10&&str.charAt(index)-'0'>7)){
                return (isNegative==true)?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            res=res*10+str.charAt(index)-'0';
            index++;
        }
        
         return (isNegative==true)?-1*res:res;
    }
}