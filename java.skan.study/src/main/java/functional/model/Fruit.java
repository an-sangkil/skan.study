package functional.model;

import lombok.Getter;
import lombok.Setter;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/06/24
 */
@Getter
@Setter
public class Fruit {
    private int weight;
    private String color;

    public Fruit() {
    }

    public Fruit(int weight) {
        this.weight = weight;
    }

    public Fruit(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }
}
