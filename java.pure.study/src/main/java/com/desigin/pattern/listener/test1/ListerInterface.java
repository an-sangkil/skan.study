package com.desigin.pattern.listener.test1;

import java.util.concurrent.TimeUnit;

/**
 * <pre>
 * Class Name  : ListenerTest1.java
 * Description :
 * Modification Information
 *
 *    수정일　　　 　　  수정자　　　     수정내용
 *    ────────────   ─────────   ───────────────────────────────
 *    2015. 1. 15.        ask               최초생성
 * </pre>
 *
 * @author ask
 * @version Copyright (C) 2014 by SKAN.COMPANY All right reserved.
 * @since 2015. 1. 15.
 */

class ListenerTest {
    public static void main(String... arg) throws Exception {
        Responder r = new Responder();
        r.listenerTestMethod("aa", "bb");
    }
}

public interface ListerInterface {
    public void startListener();

    public void runListener(int countNumber);
}

class InitListener {

    private ListerInterface listenerInterface;

    public InitListener(ListerInterface listenerInterface) {
        System.out.println("new InitListener(ListerInterface listenerInterface) 인스턴스 실행 ");

        this.listenerInterface = listenerInterface;
        listenerInterface.startListener();
    }

    public void methodCall(String a, String b) {

        System.out.println(a + "/" + b);
        for (int i = 0; i < 100; i++) {
            listenerInterface.runListener(i);

        }
    }
}

class Responder implements ListerInterface {

    public void listenerTestMethod(String a, String b) {
        InitListener inL = new InitListener(this);
        inL.methodCall(a, b);
    }

    @Override
    public void startListener() {
        System.out.println("Listener Call !");
    }

    @Override
    public void runListener(int countNumber) {
        System.out.println(countNumber);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}

