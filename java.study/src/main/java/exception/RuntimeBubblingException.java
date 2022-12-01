package exception;

/**
 *
 *  버블링 익셉션 테스트
 *
 *  @author skan
 * @since 2022/11/15
 */
public class RuntimeBubblingException {


    public static void main(String[] args) {
        RuntimeBubblingException runtimeBubblingException = new RuntimeBubblingException();
        runtimeBubblingException.method_1();
    }

    public void method_1() {
        try {
            System.out.println("method 1");
            this.method_2();
        }catch (RuntimeException e) {
            System.out.println("익셉션 발생~~!!");
            e.printStackTrace();
        }
    }

    public void method_2() {
        System.out.println("method 2");
        new SubClassBubbling().method_3();
    }
}

class SubClassBubbling {


    public void method_3() {

        System.out.println("method 3 ");
        throw new RuntimeException("bubbling test");

    }
}
