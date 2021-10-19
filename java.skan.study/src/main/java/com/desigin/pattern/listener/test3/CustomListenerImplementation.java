package com.desigin.pattern.listener.test3;

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
public class CustomListenerImplementation implements Listener {

    public int summary (int a, int b) {
        return a+b;
    }

    @Override
    public void onEvent() {
        System.out.println("[Type - 1,3]합산이 완료 되었습니다.   event call");
    }

    @Override
    public void onEvent(int summary) {

        System.out.println("[Type - 3] 합산 결과물은 type 3 call = >" + summary);

    }
}
