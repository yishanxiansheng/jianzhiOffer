package com.heshufan.halfsort;
//���ֲ��ҷ�����ǰ���������Ѿ��ź���
public class Half_sort {

	public static void main(String[] args) {
		int[] a={1,3,5,6,9};
		System.out.println(find(a, 2));
	}

	public static int find(int[] a, int b) {
		int location = 0;
		int left = 0;
		int right = a.length-1;
		location = (left + right) / 2;
		while (a[location] != b) {
			location = (left + right) / 2;
			if (a[location] > b) {
				right = location-1;
			} else if (a[location] < b) {
				left = location+1;//�����1��1
			} else if (a[location]==b) {
				return location;
			} 
			if (left>right) {
				return -1;				
			}
		}
		return location;
	}

}
