package stream;

import java.util.Optional;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/05/24
 */
public class Java8Optional {

    // ofNullable
    // Optional describing the given value, if non-null, otherwise returns an empty
    // 널이 아닌경우에는 데이터를 보여주고, 그렇치 않으면 다른데이터를 반환한다.
    public void nullCheck01() {
        String obj = null;
        // null 인경우엔 오류
        String result = Optional.ofNullable(obj).orElseGet(() -> "데이터가 Null 입니다.");
        System.out.println(result);

        obj = "test str";
        result = Optional.ofNullable(obj).orElseThrow(RuntimeException::new);
        System.out.println(result);
    }

    // of
    //Returns an Optional describing the given non-null value.
    // 지정된 값이 널이 아니라는 가정에만 사용 할것.
    public void nullCheck02() {
        Object obj = null;
        String result;
        obj = "test data";
        result = (String) Optional.of(obj).orElseGet(() -> "데이터가 Null 입니다.");
        System.out.println(result);

        obj = null;
        try {
            // 지정된 값이 널이기때문에 orElseGet도 동장하지 않음
            result = (String) Optional.of(obj).orElseGet(() -> "데이터가 Null 입니다.");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        try {
            Optional.of(obj).orElseThrow(() -> new RuntimeException("데이터가 Null 입니다."));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void nullCheck03() {
        Object obj = "data";
        Object result = Optional.of(obj).orElseThrow(() -> new RuntimeException("데이터가 Null 입니다."));
        System.out.println(result);

        obj = null;
        // 비어있는 String 으로 변환하면 of 사용 가능함!
        result = Optional.ofNullable(obj).orElseGet(String::new);
        Optional.of(result).ifPresentOrElse(s -> System.out.println(s),() -> System.out.println("데이터없음"));


    }
}
