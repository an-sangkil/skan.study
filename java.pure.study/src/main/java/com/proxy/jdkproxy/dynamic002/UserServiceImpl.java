package com.proxy.jdkproxy.dynamic002;

import java.util.Random;

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
public class UserServiceImpl implements UserService{
    @Override
    public String saveUser(String userName) {
        System.out.printf("user save %s \n", userName);
        Random random = new Random();
        boolean ran = random.nextBoolean();
        System.out.println("random boolean value = " + ran);
        if(ran) {
            throw new RuntimeException("강제 예외 발생");
        }

        return "SAVE SUCCESS";
    }
}
