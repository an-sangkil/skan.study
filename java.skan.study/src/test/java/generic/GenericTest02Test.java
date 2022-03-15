package generic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/03/14
 */
class GenericTest02Test {

    GenericTest02 genericTest02 = new GenericTest02();

    @Test
    @DisplayName("")
    void create01() {
         genericTest02.create(new RequestMutateForm("test"));
    }
    @Test
    void create02() {
        genericTest02.create2("create 2");
    }

}