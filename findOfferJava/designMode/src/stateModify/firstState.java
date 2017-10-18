package stateModify;

public class firstState extends State{

	@Override
	public void WriteProgram(Work work) {
		if (work.getDay()<30) {
			System.out.println("¿ªÊ¼Ï²»¶");
		}else {
			work.setCurrent(new SecondState());
			work.writeProgram();
		}
	}
	
}
