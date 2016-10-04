public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle == null || needle.length() == 0) return 0;
        int i = 0;
        int j = 0;
        int start = 0;
        while(i < haystack.length() && j < needle.length()){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }else{
                start++;
                i = start;
                j = 0;
            }
        }
        if(j == needle.length()) return start;
        return -1;
    }
}