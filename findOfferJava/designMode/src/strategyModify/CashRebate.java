package strategyModify;
/**
 * Дђел
 * @author Administrator
 *
 */
 public class CashRebate extends CashSuper {
	private double moneyRebate=1d;
	
	
	public CashRebate(double moneyRebate) {
		this.moneyRebate = moneyRebate;
	}


	@Override
	public double acceptCrash(double money) {
		return money*moneyRebate;
	}

}
