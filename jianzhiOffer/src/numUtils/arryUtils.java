package numUtils;
/**
 * ´òÓ¡Êý×é
 * @author Administrator
 *
 */
public class arryUtils {
	
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void swap(int a ,int b){
		int temp = a;
		a = b;
		b = temp;
	}
}
