package findMaxSerialNum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * 寻找数组中最大连续数组的长度
 * @author Administrator
 *
 */
public class findMaxSerialArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String string = sc.nextLine();
			string = string.substring(1, string.length() - 1);
			int result = findMax(string);
			System.out.println(result);
		}
		sc.close();

	}

	private static int findMax(String input) {
		String inputs[] = input.split(",");

		Map<Integer, Integer> map = new HashMap<>();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < inputs.length; i++) {
			int j = Integer.valueOf(inputs[i]);
			if (!map.containsKey(j)) {
				map.put(j, 1);
				if (j < min) {
					min = j;
				}
				if (j > max) {
					max = j;
				}
			}
		}
		int count = 1;
		int macCount = 1;
		for (int i = min + 1; i <= max; i++) {
			if (map.containsKey(i)) {
				count++;
				if (count > macCount) {
					macCount = count;
				}
			} else {
				count = 0;
			}
		}
		return macCount;
	}
}

