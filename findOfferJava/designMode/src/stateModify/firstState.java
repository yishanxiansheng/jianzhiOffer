package stateModify;

public class firstState extends State{

	@Override
	public void WriteProgram(Work work) {
		if (work.getDay()<30) {
			System.out.println("��ʼϲ��");
		}else {
			work.setCurrent(new SecondState());
			work.writeProgram();
		}
	}
	
}
