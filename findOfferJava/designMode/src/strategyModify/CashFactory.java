package strategyModify;

public class CashFactory {
	CashSuper cashSuper = null;

	public CashFactory(String type) {

		switch (type) {

		case "正常收费":
			cashSuper = new CashNomal();
			break;

		case "满300返100":
			cashSuper = new CashReturn(300, 100);
			break;

		case "打八折":
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
