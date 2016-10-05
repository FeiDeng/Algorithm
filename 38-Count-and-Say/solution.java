public class Solution {
    public String countAndSay(int n) {
        if(n <= 0) return null;
        int index = 1;
        String res = "1";
        StringBuilder sb = new StringBuilder();
        while(index < n){
            int count =1;
           for(int i = 1; i < res.length(); i++){
                if(res.charAt(i) != res.charAt(i-1)){
                    sb.append(count).append(res.charAt(i-1));
                    count = 1;
                }else{
                    count++;
                }
               
            }
            sb.append(count).append(res.charAt(res.length()-1));
            res = sb.toString();
            sb = new StringBuilder();
            index++;
            
        }
        return res;
        
    }
}