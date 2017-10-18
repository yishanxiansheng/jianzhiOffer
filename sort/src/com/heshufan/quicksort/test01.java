package com.heshufan.quicksort;

public class test01 {

	public static void main(String[] args) {
			int [] data={6,8,7,9,0,1,3,2,4,5};
			QuickSort quickSort=new QuickSort();
			quickSort.data=data;
			quickSort.sort(0, quickSort.data.length-1);
			for (int i = 0; i < quickSort.data.length; i++) {
				System.out.println(quickSort.data[i]);
			}
	}

}
