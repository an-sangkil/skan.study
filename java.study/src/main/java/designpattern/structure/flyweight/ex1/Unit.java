package designpattern.structure.flyweight.ex1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author skan
 */
@ToString
@Getter@Setter
abstract public class Unit {
    private String color;

    public Unit(String color) {
        this.color = color;
    }

    public abstract void position(double x, double y ) ;

}
