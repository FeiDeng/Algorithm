public class Solution {
    public int lengthOfLongestSubstring(String s) {
        //map record <key, index> 
        // time O(n),space O(n)
        Map<Character,Integer> map=new HashMap<>();
        int n=s.length();
        int start=0;
        int max=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                start=Math.max(start,map.get(c)+1);
            }
            map.put(c,i);
            max=Math.max(max,i-start+1);
        }
        return max;
    }
}