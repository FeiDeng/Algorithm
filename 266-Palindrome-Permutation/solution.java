public class Solution {
    public boolean canPermutePalindrome(String s) {
        int count=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!map.containsKey(c)) map.put(c,0);
            map.put(c,map.get(c)+1);
            if(map.get(c)%2==0){
                count--;
            }else{
                count++;
            }
           
        }
        
         if(count>1) return false;
         return true;
    }
}