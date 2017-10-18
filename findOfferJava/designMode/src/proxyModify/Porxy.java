package proxyModify;

public class Porxy extends Subject{
	private RealSubject realSubject;
	@Override
	void Request() {
		if (realSubject==null) {
			realSubject=new RealSubject();
		}
		realSubject.Request();
	}

}
