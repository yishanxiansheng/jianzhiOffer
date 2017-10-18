package factoryModify;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
			try {
				System.out.println("请输入数字A:");
				double numberA = sc.nextDouble();
				System.out.println("请选择运算符号+、-、*、/");
				String strOperate = sc.next();
				System.out.println("请输入数字B:");
				double numberB = sc.nextDouble();

				
			    Operation operation=OperationFactory.creatOperation(strOperate);
			    operation.setNumberA(numberA);
			    operation.setNumberB(numberB);
			    
				
				System.out.println("结果为：" +operation.getResult());
			} catch (Exception e) {
				System.out.println("输入有误");
			}
		sc.close();
	}
}

