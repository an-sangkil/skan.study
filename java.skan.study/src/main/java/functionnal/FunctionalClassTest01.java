package functionnal;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by  All right reserved.
 * @since 2022/03/22
 */
public class FunctionalClassTest01 {
    public void sendMessage(MessageSender messageSender) {
        messageSender.sendMessage("가","나");
    }

    public static void main(String[] args) {
        FunctionalClassTest01 mm = new FunctionalClassTest01();
        mm.sendMessage((messageStr, m2) -> System.out.printf("message 1=%s,  2=%s  \n", messageStr, m2 ));
        mm.sendMessage(MessageSenderImpl::sendMessage);
    }
}


class MessageSenderImpl {
    public static void sendMessage(String messageStr, String m2) {
        System.out.printf("message 2=%s,  2=%s  \n", messageStr, m2 );
    }
}




interface MessageSender {
    abstract void sendMessage(String messageStr, String m2);
}
