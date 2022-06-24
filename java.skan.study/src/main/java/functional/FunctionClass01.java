package functional;

/**
 * 1. 메소드참조 테스트
 * 2. 익명함수 테스트
 *
 * @author skan
 * @version Copyright (C) 2022 by  All right reserved.
 * @since 2022/03/22
 */
public class FunctionClass01 {


    public static void main(String[] args) {

        //1.  일반적인 구현제 주입 방식
        MessageSender m3 = new MessageSenderImpl();
        m3.sendMessage("1", "2");

        //2. 익명함수(클레스)를 통한 속성 전달
        MessageSender m1 = ((messageStr, m2) -> System.out.printf("message 1=%s,  2=%s  \n", messageStr, m2));
        m1.sendMessage("A", "B");

        //3. 메도스 참조
        //3.1 파라미터가 개수가 같아야지만 동작한다.
        //3.2 메소드가 static 이어야 한다.
        MessageSender m2 = MessageSender02::sendMessage;
        m2.sendMessage("가", "나");

    }

    static class MessageSender02 {

        // 스테틱 메소드 테스트
        public static void sendMessage(String messageStr, String m2) {
            System.out.printf("message 2=%s,  2=%s  \n", messageStr, m2);
        }
    }


    static class MessageSenderImpl implements MessageSender {
        @Override
        public void sendMessage(String messageStr, String m2) {
            System.out.printf("message 3=%s,  3=%s  \n", messageStr, m2);
        }
    }


    @FunctionalInterface
    interface MessageSender {
        abstract void sendMessage(String messageStr, String m2);
    }

}


