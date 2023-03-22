package designpattern.structure.flyweight.ex1;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2023 by CJENM|MezzoMedia. All right reserved.
 * @since 2023/01/12
 */
public class Marin extends Unit {
    public Marin(String color) {
        super(color);
    }

    public void position(double x, double y) {
        System.out.println(this + "   \t location ->  x : " + x + "y : " + y);
    }
}
