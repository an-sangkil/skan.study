package thread.coffee;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @since 2022/11/17
 */

@Data
public class CoffeeEntity {
    private String name;
    private long price;

    public CoffeeEntity() {
    }

    public CoffeeEntity(String name, long price) {
        this.name = name;
        this.price = price;
    }
}
