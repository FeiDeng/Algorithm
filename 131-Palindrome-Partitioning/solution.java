public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        if(s==null||s.length()==0) return res;
        dfs(s,res,new ArrayList<String>(),0);
        return res;
    }
    
    public void dfs(String s, List<List<String>> res, List<String> temp,int index){
        if(s.length()==index){
            res.add(new ArrayList<String> (temp));
            return;
        }
        
        for(int i=index+1;i<=s.length();i++){
            String sub=s.substring(index,i);
            if(isPalin(sub)){
                temp.add(sub);
                dfs(s,res,temp,i);
                temp.remove(temp.size()-1);
            }
        }
    }
    
    public boolean isPalin(String s){
        int start=0,end=s.length()-1;
        while(start<s.length()&&end>=0&&start<=end){
            if(s.charAt(start)!=s.charAt(end))return false;
            start++;
            end--;
        }
        return true;
    }
}