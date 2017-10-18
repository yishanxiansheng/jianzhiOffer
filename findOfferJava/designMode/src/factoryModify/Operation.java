package factoryModify;

public class Operation {
	
	private double numberA=0;
	private double numberB=0;
	
	
	public double getNumberA() {
		return numberA;
	}


	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}


	public double getNumberB() {
		return numberB;
	}


	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}
	public double getResult() {
		double result=0;
		return result;
	}
}
class OperationAdd extends Operation{
	@Override
	public double getResult() {
		double result=getNumberA()+getNumberB();
		return result;
	}
}

class OperationSub extends Operation{
	@Override
	public double getResult() {
		double result=getNumberA()-getNumberB();
		return result;
	}
}
class OperationMul extends Operation{
	@Override
	public double getResult() {
		double result=getNumberA()*getNumberB();
		return result;
	}
}
class OperationDiv extends Operation{
	@Override
	public double getResult() {
		double result=0;
		if (getNumberB()== 0) {
			System.out.println("分母不能为0");
		} else {
			result=(double)getNumberA()/getNumberB();
		}
		return result;
	}
}
