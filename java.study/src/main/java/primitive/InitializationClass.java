package primitive;

/**
 * 초기화블록 (initial block) 테스트
 *    - 클레스 초기화
 *    - 인스턴스 초기화
 *    - 스테틱블록, 인스턴스 블록 초기화
 *
 *
 * @author skan
 * @since 2021-06-04
 */
public class InitializationClass {
    String DATA;
    static String class_data;


    static {
        // static block 클레스 로딩시 한번만
        class_data = "1.클레스 초기화(상수값) - only one";
        String class_data_2 = "1.클레스 초기화 - 변수 설정";
        System.out.printf("1. 상수값 %s : \n", class_data);
        System.out.printf("1. 스테틱안의 변수 설정된 값 %s \n", class_data_2);
        System.out.printf("1. static 변수 참조 가능 %s \n",ConstValue.CONST_DATA);  // 스테틱 변수,메소드..는 참조 가능
    }


    {
        // instance block 인스턴스가 생성될때 마다 실행
        DATA = "2. 인스턴스 최기화 - every";
        System.out.println(DATA);
        this.methodTest();
    }

    public InitializationClass() {
        System.out.println("3. 인스턴스 초기화 - every");
    }

    public void methodTest() {
        System.out.println("2.1 instance block 의 메소트 호출");
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
