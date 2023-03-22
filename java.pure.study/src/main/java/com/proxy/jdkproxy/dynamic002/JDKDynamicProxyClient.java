package com.proxy.jdkproxy.dynamic002;

import java.lang.reflect.Proxy;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/03/29
 */
public class JDKDynamicProxyClient {

    public static void main(String[] args) {

        UserService proxyInstance = (UserService) Proxy.newProxyInstance(UserService.class.getClassLoader(), new Class[]{UserService.class}, (proxy, method, args1) -> {
            UserService userService = new UserServiceImpl();

            System.out.println("1. invoke before..");

            Object invoke = null;
            try {
                invoke = method.invoke(userService, args1);
            }catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("2. invoke end..");
            return invoke;
        });

        String data = proxyInstance.saveUser("skan");
        System.out.printf("data = %s \n", data);
    }
}
