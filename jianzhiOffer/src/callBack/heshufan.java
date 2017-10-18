package callBack;
public class heshufan {
	private static button button;

	public static void main(String[] args) {
		button=new button();
		button.setClicKlistener(new button.ClicKlistener() {
			
			@Override
			public void jishuan() {				
			}
		});

    }
}

