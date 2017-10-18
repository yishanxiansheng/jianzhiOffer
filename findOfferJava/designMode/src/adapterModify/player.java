package adapterModify;

public abstract class player {
	
	protected String name;

	public player(String name) {
		this.name = name;
	}
	abstract void Attack();
	abstract void Dffense();
	
}
