package com.proxy.jdkproxy.dynamic001;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DebugHandler implements InvocationHandler {

	public DebugHandler() {
	}

	private Object target;
	
	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		System.out.println("----------------------------");
		System.out.println("Method 호출  = " + method);
		
		
		return method.invoke(target, args);
	}

}
