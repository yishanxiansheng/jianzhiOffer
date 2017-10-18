package dfs_bfs;
/**
 * 循环队列，循环队列有两个特点，
 * @author Administrator
 *
 */
public class Queue {
	final static private int Size=20;
	private int[] st;
	private int front;
	private int real;
	public Queue() {
		st = new int[Size];
		front =0 ;
		real = 0;
	}
	
	public void insert(int j){
		if((real+1)%Size!=front){
			st[real]=j;
			real=(real+1)%Size;
		}

	}
	public int  remove() {
		if(real!=front){
			int temp=st[front];
			front=(front+1)%Size;
			return temp;
			
		}
		
		

		return 0;
	}
	public boolean isEmpty(){
		return real==front;
	}
	
	
}
