package com.heshufan.heap;

public class test {

	public static void main(String[] args) {
		int[] data={1,5,2,8,4,5};
		Heap heap=new Heap(data);
		heap.build_maxHeap(data);
		
		
		
		heap.outHeap(data);
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		
		
		
		
		
		
	}

}
