package proxyMode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
	private Object object;
	
	public ProxyFactory(Object object){
		this.object = object;
	}
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(
				object.getClass().getClassLoader(), 
				object.getClass().getInterfaces(), 
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// TODO Auto-generated method stub
						Object returnValue=method.invoke(object, args);
						return returnValue;
					}
				});
	}
}
