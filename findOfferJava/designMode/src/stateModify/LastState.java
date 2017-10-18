package stateModify;

public class LastState extends State {

	@Override
	public void WriteProgram(Work work) {
		if (work.getDay()>60) {
			if (work.isSuccess()) {
				System.out.println("Áµ°®");
			}else{
				System.out.println("Ê§°Ü");
			}
			
		}
	}

}
