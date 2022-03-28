package thread.blocking;

import junit.framework.TestCase;
import lombok.val;
import org.junit.Test;

import java.util.stream.IntStream;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/03/28
 */
public class ObjectBlocking02Test {


    ObjectSDK objectSDK = new ObjectSDK();
    @Test
    public void blocking() {

        val intStream = IntStream.rangeClosed(1, 10);

        intStream.forEach(objectSDK::submit);

    }

}