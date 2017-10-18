package proxyMode;
/**
 * ¾²Ì¬´úÀí
 * @author Administrator
 *
 */
public class Proxy implements Base {
	private User user;
	public  Proxy(User user) {
		this.user=user;
		
	}
	@Override
	public void myPrint() {
		// TODO Auto-generated method stub
		user.myPrint();
	}

}

