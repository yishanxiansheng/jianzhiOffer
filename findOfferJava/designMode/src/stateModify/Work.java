package stateModify;


public class Work {
	private double day;
	boolean isSuccess=false;
	private State current;
	
	public Work(){
		current=new firstState();
	}
	
	public double getDay() {
		return day;
	}
	public void setDay(double day) {
		this.day = day;
	}
	
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	
	public State getCurrent() {
		return current;
	}
	public void setCurrent(State current) {
		this.current = current;
	}
	public void writeProgram(){
		current.WriteProgram(this);
	}
	
	
}
