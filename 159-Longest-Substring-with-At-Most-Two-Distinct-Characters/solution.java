public class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        //boundary case
        if(s==null||s.length()==0) return 0;
        
        //two pointer, right=>move when map.size()<=2 and update map with new index;
        //when map.size()>2, left move to leftmost character+1 and remove left most character from map
        Map<Character,Integer> map=new HashMap<>();
        int left=0,right=0;
        int max=0;
        while(right<s.length()){
            if(map.size()==2&&!map.containsKey(s.charAt(right))){
                int leftMost=s.length();
                for(int i:map.values()){
                    leftMost=Math.min(leftMost,i);
                }
                map.remove(s.charAt(leftMost));
                left=leftMost+1;
            }
            map.put(s.charAt(right),right);
            
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}