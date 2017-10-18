package com.heshufan.insertSort;

public class insertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data={3,2,5,4,1};
		insert(data);
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

	private static void insert(int[] data) {
		int length = data.length;
		for (int i = 1; i < length; i++) {
			if(data[i] < data[i-1]){
				int temp = data[i];
				int j=0;
				for(j = i-1; j >= 0 && data[j] > temp; j--){
					data[j+1] = data[j];
				}
				data[j+1] = temp;
			}
			
		}
	}

}
