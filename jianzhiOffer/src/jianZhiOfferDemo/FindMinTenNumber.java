package jianZhiOfferDemo;
import numUtils.*;
/**
 * �ҳ���С��N����
 * @author Administrator
 *
 */
public class FindMinTenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[100]; 
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (100*Math.random());
		}
		arryUtils.printArray(findMinNumber(array, 10));
		

	}
	/**
	 * �ҳ���С��N����
	 * @param array
	 * @param N
	 * @return
	 */
	public static int[] findMinNumber(int[] array, int N) {
		int[] result = new int[N];
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if(j < N){
				result[j] = array[i];
				j++;
			}else{
				int temp = array[i];
				
				int max=0;
				int n=0;
				for(int m = 0; m < 10; m++){
					if(result[m]>max){
						max=result[m];
						n=m;
					}
				}
				
				if(temp<max){
					result[n]=temp;
				}
			}
			
		}
		
		
		
		return result;
	}

}
