public class Solution {
    public void reverseWords(char[] s) {
        
        if(s==null||s.length<2) return;
        swap(s,0,s.length-1);
        int start=0,end=1;
        while(end<s.length){
            if(s[end]==' '){
                swap(s,start,end-1);
                start=end+1;
            }
                end++;
            
        }
        swap(s,start,s.length-1);
    }
    
    public void swap(char[] s,int start,int end){
        while(start<end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }
}