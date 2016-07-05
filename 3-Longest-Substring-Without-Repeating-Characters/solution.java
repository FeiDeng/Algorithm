public class Solution {
    public int lengthOfLongestSubstring(String s) {
        //map record <key, index> 
        // time O(n),space O(n)
        Set<Character> set=new HashSet<>();
        
        int start=0;
        int end=0;
        int max=0;
        while(end<s.length()){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end++));
                //end++;
                max=Math.max(max,set.size());
            }else{
                set.remove(s.charAt(start++));
                //start++;
            }
        }
        return max;
    }
}