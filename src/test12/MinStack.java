package test12;

import com.sun.org.apache.xml.internal.serializer.ToStream;

import java.util.Stack;

class MinStack {
    Stack<Integer> stack=new Stack<Integer>();
    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(val);
            stack.push(val);
        }else{
            int aa=stack.peek();
            stack.push(val);
            if(aa<val){
                stack.push(aa);
            }else{
                stack.push(val);
            }
        }

    }

    public void pop() {
        stack.pop();
        stack.pop();
    }

    public int top() {
        return stack.get(stack.size()-2);
    }

    public int getMin() {
        return stack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
