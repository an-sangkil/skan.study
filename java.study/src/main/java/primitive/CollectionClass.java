package primitive;

import java.util.LinkedList;
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
 * @since 2022/03/22
 */
public class CollectionClass {

    public LinkedList<Integer> generationNumber() {

        LinkedList<Integer> linkedList = new LinkedList<>();
        IntStream.rangeClosed(1,99).forEach(linkedList::add);

        return linkedList;
     }
}
