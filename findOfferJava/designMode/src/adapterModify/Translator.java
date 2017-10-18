package adapterModify;

public class Translator extends player{

	private ForeignPlayer player=new ForeignPlayer();
	public Translator(String name) {
		super(name);
		
	}

	@Override
	void Attack() {
		player.attack();
	}

	@Override
	void Dffense() {
		player.deffense();
	}

}
