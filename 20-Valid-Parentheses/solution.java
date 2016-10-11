public class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        if(s == null || s.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                stack.push(map.get(c));
            }else{
                if(stack.isEmpty() || c != stack.pop()){
                    return false;
                }
            }
        }
        if(stack.size()> 0) return false;
        return true;
    }
}