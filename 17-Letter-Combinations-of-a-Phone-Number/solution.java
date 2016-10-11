public class Solution {
     Map<Character, String> map;
    public List<String> letterCombinations(String digits) {
        
        map = setup();
        List<String> result = new ArrayList<>();
        if(digits == null || digits.length() == 0) return result;
        dfs(digits,0,result, "");
        return result;
    }
    
    public void dfs(String digits, int index, List<String> result, String temp){
        if(index == digits.length()){
            result.add(temp);
            return;
        }
        String cur = map.get(digits.charAt(index));
        for(int i = 0; i < cur.length(); i++){
            char c = cur.charAt(i);
            dfs(digits,index + 1, result, temp + c);
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