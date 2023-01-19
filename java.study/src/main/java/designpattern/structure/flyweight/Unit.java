package designpattern.structure.flyweight;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author skan
 */
@ToString
@Getter@Setter
public class Unit {

    public Unit(String color) {
        this.color = color;
    }

    private String color;


}
