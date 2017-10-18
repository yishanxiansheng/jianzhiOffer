package com.heshufan.quicksort;

public class QuickSort {
	
	int[] data;	
	
	public int  quickSort(int low,int high,int[] data) {
		
		int key =data[low];
		while (low <high) {
			while (low<high&&data[high]>=key) {//从右向左找到第一个比key小的数据
				high--;
			}
			if (low<high) {
				data[low]=data[high];
			low++;
			}
			
			while(low<high&&data[low]<=key) {//从左向右找到第一个比key大的数据
				low++;	
			}
			if (low<high) {
				data[high]=data[low];
			high--;
			}
			
		}
		data[low]=key;//最后一个坑给填上
		return low;
	}
	
	
	public void sort(int low,int high) {
		
		if (low<high) {
			int result=quickSort(low,high,data);
			sort(low, result-1);
			sort(result+1, high);
		}
	}
}
