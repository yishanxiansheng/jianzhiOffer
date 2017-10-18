package com.heshufan.heap;

//�����򣬶ѵı���������
//�ݹ�˼��ĺ����ǣ������һ��Ԫ�صĸ��ڵ㿪ʼ��������ѣ�������Ѻ󣬼��븸�ڵ�a���ӽڵ�b������
//����ô�ӽڵ�b����������ܻ��б仯���ݹ�һ�Σ���ʱ��b��Ϊ���ڵ㴫��ȥ





public class Heap {
	private int DEFAULT = 15;
	int[] element;
	private int size;// �ѵĳ���

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
	//��������
	public void build_maxHeap(int[] data) {
		
		int starIndex=getParent(size-1);
		
		for (int i = starIndex; i >=0; i--) {
			sub_maxHeap(data, size,i);
		}	
	}
	
	public void sub_maxHeap(int[] data,int size,int index) {//��Ҫ������Ҫ���¹����ĸ��׽ڵ���±�
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
			sub_maxHeap(data, i,0);//ÿ�ε����󣬽������¹������������ܽ�����ȥ�����ֵ�����ţ�������Ҫ�����i�����Ƶݹ�
	
			
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
