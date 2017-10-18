package com.heshufan.heap;

//堆排序，堆的本质是数组
//递归思想的核心是，从最后一个元素的父节点开始，构建大堆，构建大堆后，加入父节点a与子节点b交换，
//，那么子节点b下面的树可能会有变化，递归一次，此时将b作为父节点传进去





public class Heap {
	private int DEFAULT = 15;
	int[] element;
	private int size;// 堆的长度

	public Heap() {
		element = new int[DEFAULT];
	}

	public Heap(int capacity) {
		DEFAULT = capacity;
		element = new int[DEFAULT];
	}

	public Heap(int[] data) {
		element = data;
		size = data.length;
	}
	//创建最大堆
	public void build_maxHeap(int[] data) {
		
		int starIndex=getParent(size-1);
		
		for (int i = starIndex; i >=0; i--) {
			sub_maxHeap(data, size,i);
		}	
	}
	
	public void sub_maxHeap(int[] data,int size,int index) {//需要传入需要重新构建的父亲节点的下标
		int left=getLchild(index);
		int right=getRchild(index);
		int large=index;
		if (left<size&&data[left]>data[index]) {
			large=left;
		}
		if (right<size&&data[right]>data[index]&&data[right]>=data[left]) {
			large=right;
		}
		
		if (large!=index) {
			int tem=data[index];
			data[index]=data[large];
			data[large]=tem;
			sub_maxHeap(data, size,large);
		}
		
		
		
	}
	
	public void outHeap(int[] data){
		for (int i =data.length-1; i>=0; i--) {
			int tem=data[0];
			data[0]=data[i];
			data[i]=tem;
			sub_maxHeap(data, i,0);//每次调整后，进行重新构建最大堆树不能将换过去的最大值又重排，所以需要这里的i来控制递归
	
			
		}
	}
	
	
	
	
	
	
	
	public int  getParent(int index) {
		return (index-1)>>1;
	}
	public int  getLchild(int index) {
		return (index<<1)+1;
	}
	public int  getRchild(int index) {
		return (index<<1)+2;
	}

}
