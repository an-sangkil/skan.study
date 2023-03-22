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
public class CustomListener3 {

    Listener listener;
    public CustomListener3(Listener listener) {
        this.listener = listener;
    }

    public int summary (int a, int b) {
        int result = a+b;
        listener.onEvent(result);
        listener.onEvent();
        return result;
    }
}
