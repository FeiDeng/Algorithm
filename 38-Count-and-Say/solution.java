public class Solution {
    public String countAndSay(int n) {
        if(n<=0) return null;
        StringBuffer sb=new StringBuffer("1");
        if(n==1) return sb.toString();
        int index=1;
        while(index<n){
            StringBuffer temp=new StringBuffer();
            int count=1;
            for(int i=1;i<sb.length();i++){
                if(sb.charAt(i)==sb.charAt(i-1)){
                    count++;
                }else{
                    temp.append(count);
                    temp.append(sb.charAt(i-1));
                    count=1;
                }
                
            }
            temp.append(count);
            temp.append(sb.charAt(sb.length()-1));
            sb=temp;
            index++;
        }
        return sb.toString();
    }
}