package factoryModify;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
			try {
				System.out.println("����������A:");
				double numberA = sc.nextDouble();
				System.out.println("��ѡ���������+��-��*��/");
				String strOperate = sc.next();
				System.out.println("����������B:");
				double numberB = sc.nextDouble();

				
			    Operation operation=OperationFactory.creatOperation(strOperate);
			    operation.setNumberA(numberA);
			    operation.setNumberB(numberB);
			    
				
				System.out.println("���Ϊ��" +operation.getResult());
			} catch (Exception e) {
				System.out.println("��������");
			}
		sc.close();
	}
}

