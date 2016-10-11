public class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights == null || heights.length ==0){
            return 0;
        }
        int res = 0;
       
        Stack<Integer> stack = new Stack<>();
       
        int min = 0;
        for(int i = 0; i <= heights.length; i++){
           int cur = i == heights.length? 0:heights[i];
           if(stack.isEmpty()|| cur >= heights[stack.peek()]){
               stack.push(i);
           }else{
               int  h =heights[stack.pop()];
               res = Math.max(res, (stack.isEmpty()? i : i-stack.peek() - 1)*h);
               i--;
           }
        }
        return res;
        
    }
}