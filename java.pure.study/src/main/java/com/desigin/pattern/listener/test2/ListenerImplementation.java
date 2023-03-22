package com.desigin.pattern.listener.test2;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2021 by CJENM|MezzoMedia. All right reserved.
 * @since 2021-01-19
 */
class ListenerImplementation implements Listener {

    public ListenerImplementation(boolean constructType, String threadName) {
        if (constructType) {
            Bclass myb = new Bclass(this);
            Thread thread = new Thread(myb, threadName);
            thread.start();
        }
    }

    public synchronized void startListener(String log) {
        String threadName = Thread.currentThread().getName();
        System.out.printf(" %s Bclass started: %s \n", threadName, log);
    }

    public synchronized void runListener(String log) {
        String threadName = Thread.currentThread().getName();
        System.out.printf(" %s Bclass running: %s \n", threadName, log);
    }

}

