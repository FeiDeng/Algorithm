public class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        //boundary case
        if(s.length()<1||k<1) return 0;
        if(s.length()<k) return s.length();
        //two pointer , right will move; left will set to the leftmost if(map.length()==k&&!map.containsKey())
        //time O(n), space O(n)
        Map<Character,Integer> map=new HashMap<>();
        int left=0,right=0;
        int max=0;
        while(right<s.length()){
            if(map.size()==k&&!map.containsKey(s.charAt(right))){
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