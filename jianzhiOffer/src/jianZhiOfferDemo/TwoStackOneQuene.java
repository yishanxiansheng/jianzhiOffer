package jianZhiOfferDemo;
import java.util.Stack;
/**
 * ����ջ����һ������
 * @author HeShufan
 *
 */
public class TwoStackOneQuene {

	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {
		stack1.push(node);
	}

	public int pop() {
		if (stack2.empty()) {
			while (!stack1.empty()) {
				stack2.push(stack1.pop());
			}

		}
		return stack2.pop();
	}

}
