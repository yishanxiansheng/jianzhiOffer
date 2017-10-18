package stateModify;

public class Main {

	public static void main(String[] args) {
		Work work=new Work();
		work.setDay(10);
		work.writeProgram();
		
		work.setDay(40);
		work.writeProgram();
		
		work.setDay(70);
		work.writeProgram();
	}

}
