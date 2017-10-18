package com.heshufan.quicksort;

public class QuickSort {
	
	int[] data;	
	
	public int  quickSort(int low,int high,int[] data) {
		
		int key =data[low];
		while (low <high) {
			while (low<high&&data[high]>=key) {//���������ҵ���һ����keyС������
				high--;
			}
			if (low<high) {
				data[low]=data[high];
			low++;
			}
			
			while(low<high&&data[low]<=key) {//���������ҵ���һ����key�������
				low++;	
			}
			if (low<high) {
				data[high]=data[low];
			high--;
			}
			
		}
		data[low]=key;//���һ���Ӹ�����
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
