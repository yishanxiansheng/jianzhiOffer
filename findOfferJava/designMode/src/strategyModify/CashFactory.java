package strategyModify;

public class CashFactory {
	CashSuper cashSuper = null;

	public CashFactory(String type) {

		switch (type) {

		case "�����շ�":
			cashSuper = new CashNomal();
			break;

		case "��300��100":
			cashSuper = new CashReturn(300, 100);
			break;

		case "�����":
			cashSuper = new CashRebate(0.8);
			break;

		default:
			break;
		}
	}

	public  double getResult(double money) {
		return cashSuper.acceptCrash(money); 
	}
}
