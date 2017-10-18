package proxyMode;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User();
		Proxy proxy=new Proxy(user);
		proxy.myPrint();
	}

}
