package com.heshufan.bubble;
//ц╟ещеепР

public class Bubble {

	public static void main(String[] args) {
		int[] data={3,2,5,4,1};
		int[] data1=bubble(data);
		for (int i = 0; i < data1.length; i++) {
			System.out.println(data1[i]);
		}
		
		
		
	}
	public static int[] bubble(int[] data){
		int tem;
		for (int i = 0; i < data.length; i++) {
			for (int j = data.length-1; j >i; j--) {
				if (data[j]<data[j-1]) {
					tem=data[j];
					data[j]=data[j-1];
					data[j-1]=tem;
				}
			}
		}
		return data;
	}

}
