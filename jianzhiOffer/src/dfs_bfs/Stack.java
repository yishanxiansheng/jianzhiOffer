package dfs_bfs;
/**
 * ջ
 * @author Administrator
 *
 */
public class Stack {
	final private static int Size=20;
	private int[] st;
	private int top;
	
	
	public Stack() {
		st=new int[Size];
		top=-1;
	}
	
	public int peek(){
		return st[top];
	}
	
	public void push(int j){
		st[++top]=j;
	}
	
	public int pop(){
		return st[top--];
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	
	
}
