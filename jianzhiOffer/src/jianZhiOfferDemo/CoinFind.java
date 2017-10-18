package jianZhiOfferDemo;

public class CoinFind {

	// 硬币的类型
	private static int[] money ={10, 5, 2, 1};

	// 每个硬币对应的数量
	private static int[] tote = new int[money.length];

	public static void main(String[] args){
		int myMoney = 129;
		findMoney(myMoney, 0);
		System.out.println("需要找的硬币总数:" + myMoney);
		for (int i = 0, length = money.length; i < length; i++){
			if (tote[i] != 0){
				System.out.println("硬币面值:" + money[i] + "\t数量:" + tote[i]);
			}
		}
	}

	/**
	 * 
	 * 找硬币
	 * 
	 * @param number
	 *            需要找的硬币数
	 * 
	 * @param index
	 *            比较硬币的下标索引
	 * 
	 */

	private static void findMoney(int number, int index){
		if (number > 0){
			if (number >= money[index]){
				tote[index]++;
				findMoney(number - money[index], index);
			}
			else{
				findMoney(number, ++index);
			}
		}
	}
}