package com.proxy;

import java.lang.reflect.Proxy;


public class ProxyTest {
	public static void main(String args[]) throws Exception {
		
		IEmpManager empManager = new EmpManager();
		DebugHandler debugHandler = new DebugHandler();
		debugHandler.setTarget(empManager);
		
		IEmpManager proxyManager = (IEmpManager)Proxy.newProxyInstance(IEmpManager.class.getClassLoader(), new Class[] {IEmpManager.class}, debugHandler);
		
		proxyManager.getMessage();
		System.out.println("end");
		
	}
}
