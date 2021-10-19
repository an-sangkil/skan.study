package com.desigin.pattern.listener.test2;


public class ListenerMainTest2 {
    public static void main(String[] args) {

        // 1. 리스러를 상속받은 구현체에서 리서너를 실행
        ListenerMainTest2 listenerMainTest2 = new ListenerMainTest2();
        listenerMainTest2.listenerTest();


        // 2.
        ListenerImplementation t2 = new ListenerImplementation(false, null);
        Bclass myb = new Bclass(t2);
        Thread thread = new Thread(myb);
        thread.start();

    }


    public void listenerTest() {
        new ListenerImplementation(true, "default - 1");
    }

}


