package jianZhiOfferDemo;

public class CoinFind {

	// Ӳ�ҵ�����
	private static int[] money ={10, 5, 2, 1};

	// ÿ��Ӳ�Ҷ�Ӧ������
	private static int[] tote = new int[money.length];

	public static void main(String[] args){
		int myMoney = 129;
		findMoney(myMoney, 0);
		System.out.println("��Ҫ�ҵ�Ӳ������:" + myMoney);
		for (int i = 0, length = money.length; i < length; i++){
			if (tote[i] != 0){
				System.out.println("Ӳ����ֵ:" + money[i] + "\t����:" + tote[i]);
			}
		}
	}

	/**
	 * 
	 * ��Ӳ��
	 * 
	 * @param number
	 *            ��Ҫ�ҵ�Ӳ����
	 * 
	 * @param index
	 *            �Ƚ�Ӳ�ҵ��±�����
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