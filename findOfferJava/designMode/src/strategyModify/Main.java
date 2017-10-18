package strategyModify;

public class Main {

	public static void main(String[] args) {
		
		CashFactory sc= new CashFactory("打八折");	
		double result=sc.getResult(400);
		
		
		sc=new CashFactory("正常收费");		
//		double resulr=sc.getResult(400);
		
		
		System.out.println(result);
	}

}
