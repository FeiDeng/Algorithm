public class Solution {
     Map<Character, String> map;
    public List<String> letterCombinations(String digits) {
        map = setup();
        List<String> res = new ArrayList<>();
        if(digits == null || digits.length() == 0){
            return res;
        }
        dfs(digits,0,res,"");
        return res;
    }
    
    public void dfs(String digits,int index, List<String> res, String temp){
        if(index == digits.length()){
            res.add(temp);
            return;
        }
        char c = digits.charAt(index);
        String chars = map.get(c);
        for(int i = 0;i < chars.length();i++){
            char cur=chars.charAt(i);
            dfs(digits,index+1,res,temp+cur);
        }
    }
    
     public Map<Character,String> setup(){
        Map<Character,String> map = new HashMap<Character,String>();
        map.put('1',"");
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        map.put('0',"");
        return map;
    }
}