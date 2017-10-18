package strategyModify;
/**
 * ·µÏÖ
 * @author Administrator
 *
 */
public class CashReturn extends CashSuper {
	
	private double moneyContion=0;
	private double moneyReturn=0;
	
	
	public CashReturn(double moneyContion, double moneyReturn) {
		this.moneyContion = moneyContion;
		this.moneyReturn = moneyReturn;
	}


	@Override
	public double acceptCrash(double money) {
		double result=money;
		if (money>=moneyContion) {
			result=money-(int)money/moneyContion*moneyReturn;
		}
		return result;
	}

}
