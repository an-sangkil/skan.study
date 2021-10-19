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
public class CustomListenerMain {
    public static void main(String[] args) {

        // 인터페이스 직접 호출
        CustomListenerImplementation listener = new CustomListenerImplementation();
        int result = listener.summary(1, 2);
        System.out.println("[Type - 1] result =>" + result);
        listener.onEvent();


        // 익명 클레스를 사용한 테스트
        CustomListener2 customListener = new CustomListener2();
        customListener.summary(2, 3, new Listener() {
            @Override
            public void onEvent() {
                System.out.println("[Type - 2] 완료되고 나서 이벤트 호출 할대 그냥 사용하는 버튼, ");
            }

            @Override
            public void onEvent(int summary) {
                System.out.println("[Type - 2]합산결과는 =>" + summary);
            }
        });

        // 익명 클레스를 사용한 테스트
        CustomListenerImplementation customListenerImplementation = new CustomListenerImplementation();
        CustomListener3 customListener3 = new CustomListener3(customListenerImplementation);
        customListener3.summary(3,5);

    }
}
