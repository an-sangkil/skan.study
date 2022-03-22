package primitive;

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
 * @since 2022/03/22
 */
class CollectionClassTest {

    CollectionClass collectionClass = new CollectionClass();
    @Test
    void generationNumber() {
        collectionClass.generationNumber().forEach(System.out::println);
    }
}