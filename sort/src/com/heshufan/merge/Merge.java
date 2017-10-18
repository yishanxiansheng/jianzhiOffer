package com.heshufan.merge;
//递归排序

public class Merge {

	public static void main(String[] args) {
		int a[]={6,3,0,1,4,5};
		mergeSort(a, 0, a.length-1);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
		
	}
	public static void mergeSort(int[] data,int start,int end){
		
		int position=(start+end)/2;
		if (start<end) {
			mergeSort(data, start, position);
			mergeSort(data, position+1, end);
			merge(data, start, position, end);
		}
	}
	public static void merge(int[] data,int start,int position,int end) {//将两个数组进行归并，本质不是两个数组，只是借用下标将数组分开
		int leng1=position-start+1;                               //两个数组其实已经排好序了
		int leng2=end-position;
		int[] A=new int[leng1];
		int[] B=new int[leng2];
		for (int i = 0; i < leng1; i++) {
			A[i]=data[start+i];
//			System.out.println(A[i]);
		}
//		A[leng1]=Integer.MAX_VALUE;

		for (int i = 0; i < leng2; i++) {
			B[i]=data[position+i+1];
//			System.out.println(B[i]);		
		}
//		B[leng2]=Integer.MAX_VALUE;
		
		
		
		int m=0,i=0,n=0;
		for ( i = start; i <= end && m < leng1 && n < leng2; i++) {
			if(A[m]<B[n]){
				data[i]=A[m];
				m++;
			}else{
				data[i]=B[n];
				n++;
			}
		}
		if (m<leng1) {
			for(int j=m;j<leng1&&m<leng1;j++){
				data[++i]=A[m];
				m++;
				
			}
		} 
		if (n<leng2) {
			for(int j=n;j<leng2&&n<leng2;j++){
				data[++i]=B[n];
				n++;
				
			}
		} 
		
		
	}

}
