package designpattern.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author skan
 * @since 2023/01/12
 */
public class ItemFactory {

    private final Map<String, Unit> unitPool = new HashMap<>();

    public Unit create(String key, String type) {

        if (unitPool.containsKey(key)) {
            System.out.println("repair : ===============================");
            System.out.println(unitPool.get(key));
            return unitPool.get(key);
        } else {

            var item = switch (type) {
                case "goliath" -> new Goliath(key);
                case "marin" -> new Marin(key);
                default -> throw new IllegalArgumentException("type 이 존재 하지 않습니다.");
            };

            System.out.println("New    :  ===============================");
            System.out.println(item);

            unitPool.put(key,item);

            return item;
        }
    }

}
