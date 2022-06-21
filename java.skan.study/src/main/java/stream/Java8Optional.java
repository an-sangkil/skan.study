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

    public void nullCheck01 () {
        try {
            Object obj = null;
            Optional.ofNullable(obj).orElseThrow(()-> new RuntimeException("데이터가 Null 입니다."));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void nullCheck02 () {
        try {
            Object obj = null;
            Optional.of(obj).orElseThrow(() -> new RuntimeException("데이터가 Null 입니다."));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void nullCheck03 () {
        Object obj = new Object();
        Optional.of(obj).orElseThrow(()-> new RuntimeException("데이터가 Null 입니다."));
    }
}
