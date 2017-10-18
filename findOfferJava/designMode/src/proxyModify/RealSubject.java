package proxyModify;

public class RealSubject extends Subject{

	@Override
	void Request() {
		System.out.println("真实的请求");
	}
	
}
