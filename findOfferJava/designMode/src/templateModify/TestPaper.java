package templateModify;

abstract class TestPaper {
	public void questionA(){
		System.out.println("��Ŀһ��");
		System.out.println("answer:"+answer1());
	}
	public void questionB(){
		System.out.println("��Ŀ����");
		System.out.println("answer:"+answer2());
	}
	public void questionC(){
		System.out.println("������");
		System.out.println("answer:"+answer3());
	}
	
	protected abstract String answer1();
	protected abstract String answer2();
	protected abstract String answer3();
}
