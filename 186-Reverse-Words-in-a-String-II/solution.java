public class Solution {
    public void reverseWords(char[] s) {
        
        if(s==null||s.length<2) return;
        swap(s,0,s.length-1);
        int start=-1,end=0;
        while(end<s.length){
            if(s[end]==' '){
                swap(s,start+1,end-1);
                start=end;
                end=start+1;
            }else{
                end++;
            }
        }
        swap(s,start+1,s.length-1);
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