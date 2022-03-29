package com.proxy.jdkproxy.dynamic001;

import java.lang.reflect.Proxy;


public class JDKDynamicProxyClient {
    public static void main(String args[]) throws Exception {

        MemberSerivce memberSerivce = new MemberSerivceImpl();
        DebugHandler debugHandler = new DebugHandler();

        // reflection.invocation 구현 핸들러에 ProxyTarget 주입
        debugHandler.setTarget(memberSerivce);
        MemberSerivce proxyManager = (MemberSerivce)
                Proxy.newProxyInstance(MemberSerivce.class.getClassLoader(),
                        new Class[]{MemberSerivce.class},
                        debugHandler);

        proxyManager.getMessage();

        System.out.println("end");

    }
}
