public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> min;

    /** initialize your data structure here. */
    public MinStack() {
        stack=new Stack<Integer>();
        min=new Stack<Integer>();
    }
    
    public void push(int x) {
        if(min.isEmpty()||x<=min.peek())min.push(x);
        stack.push(x);
    }
    
    public void pop() {
         if(stack.pop().equals(min.peek())){
             min.pop();
         }
    }
    
    public int top() {
        return stack.isEmpty()==true?0:stack.peek();
    }
    
    public int getMin() {
        return min.isEmpty()==true?0:min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */