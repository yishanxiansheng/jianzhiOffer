package jianZhiOfferDemo;
import java.util.Stack;
/**
 * º¬ÓÐminº¯ÊýµÄÕ»
 * @author Administrator
 *
 */
public class minStack {

    Stack<Integer> minStack = new Stack<Integer>();
    Stack<Integer> stack = new Stack<Integer>();
    public void push(int node) {
        if(minStack.empty()== true|| stack.empty() == true){
            minStack.push(node);
            stack.push(node);
        }else{
            if(minStack.peek() > node){
                minStack.push(node);
            	stack.push(node);
            }else{
                stack.push(node);
            }
        }
    }
    
    public void pop() {
        if(minStack.peek() == stack.peek()){
            minStack.pop();
            stack.pop();
        }else{
            stack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        return minStack.peek();
    }
}
