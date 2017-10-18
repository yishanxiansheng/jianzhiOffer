package strategyModify;

public class CashNomal extends CashSuper {

	@Override
	public double acceptCrash(double money) {
		
		return money;
	}

}
