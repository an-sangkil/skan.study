package stream;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2021 by CJENM|MezzoMedia. All right reserved.
 * @since 2021/10/18
 */
public class PeekTest {

    public static void main(String[] args) {
        AtomicInteger index = new AtomicInteger(0);
        StringBuffer stringBuffer = new StringBuffer();
        IntStream.range(0,1230)
                .peek(value ->  {

                    stringBuffer.append(value).append(",");
                    if (index.get() % 100 == 0) {
                        stringBuffer.setLength(0); // 초기화
                    }

                })
                .mapToObj(operand -> String.valueOf(operand));
    }
}
