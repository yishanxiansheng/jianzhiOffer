package strategyModify;

public class Main {

	public static void main(String[] args) {
		
		CashFactory sc= new CashFactory("�����");	
		double result=sc.getResult(400);
		
		
		sc=new CashFactory("�����շ�");		
//		double resulr=sc.getResult(400);
		
		
		System.out.println(result);
	}

}
