package primitive;

/**
 *  클레스 초기화 테스트
 *    - 클레스 초기화
 *    - 인스턴스 초기화
 *
 *
 * @author skan
 * @since 2021-06-04
 */
public class InitializationClass {
    String DATA;
    static String class_data;
    static {
        class_data = "1.클레스 초기화(상수값) - 1";
        String class_data_2 = "1.클레스 초기화-2";
        System.out.println(class_data);
        System.out.println(class_data_2);
        System.out.println(ConstValue.CONST_DATA);  // 스테틱 변수,메소드..는 참조 가능
    }
    {

        DATA = "2.인스턴스 데이터 최기화";
        System.out.println(DATA);
        this.methodTest();
    }

    public InitializationClass() {
        System.out.println("3. 인스턴스 초기화");
    }

    public void methodTest() {
        System.out.println("call methodTest");
    }
}

class ConstValue {
    static String CONST_DATA = "CONST_DATA";
}


class InitializationClassTest {

    public static void main(String[] args) {


        InitializationClass initializationClass = new InitializationClass();
        InitializationClass initializationClass1 = new InitializationClass();
        InitializationClass initializationClass2 = new InitializationClass();

        System.out.println("-----------------------------------------------------");
        System.out.println("맴버 필드값 참조 가능 = " + InitializationClass.class_data);
        //System.out.println(InitializationClass.class_data_2);  // 접근불가


    }

}
