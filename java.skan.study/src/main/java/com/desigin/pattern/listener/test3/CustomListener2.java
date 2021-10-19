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
public class CustomListener2 {
    public int summary (int a, int b, Listener listener) {
        int result = a+b;
        listener.onEvent(result);
        listener.onEvent();
        return result;
    }
}
