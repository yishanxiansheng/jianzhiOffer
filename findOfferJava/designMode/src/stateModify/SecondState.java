package stateModify;

public class SecondState extends State {

	@Override
	public void WriteProgram(Work work) {
		if (work.getDay()<60) {
			System.out.println("×·Çó");
		}else {
			work.setCurrent(new LastState());
			work.writeProgram();
		}
	}

}
