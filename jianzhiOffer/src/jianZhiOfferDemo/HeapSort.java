package jianZhiOfferDemo;

import numUtils.*;

/**
 * ¶ÑÅÅÐò
 * @author Administrator
 *
 */
public class HeapSort {

	public static void main(String[] args) {
		int a[]={0,50,10,90, 30, 70, 40, 80, 60, 20};
		int length=a.length-1;//10
		for (int i = length/2; i >= 1 ; i--) {
			adjustHeap(a, i, length);
		}
		
		for(int i = length; i >= 2; i--){

			swap(a, i, 1);
			adjustHeap(a, 1, i-1);
			
		}
		arryUtils.printArray(a);

	}

	private static void adjustHeap(int[] a, int s, int m) {
		// TODO Auto-generated method stub

		int temp = a[s];
		for(int i = 2*s; i <= m; i *= 2 ){
			if( i < m && a[i] < a[i+1]){
				i++;
			}
			if(a[i] <= temp){
				break;
			}
			a[s] = a[i];
			s=i;
		}
		a[s] = temp;
		
		
	}

	private static void swap(int[] a, int s, int j) {
		// TODO Auto-generated method stub
		int temp = a[s];
		a[s] = a[j];
		a[j] = temp;
	}

}
