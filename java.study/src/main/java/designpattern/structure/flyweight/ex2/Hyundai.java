package designpattern.structure.flyweight.ex2;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2023 by CJENM|MezzoMedia. All right reserved.
 * @since 2023/01/27
 */
public class Hyundai implements Car{

    String cylinder;

    @Override
    public void build() {
        System.out.println("Hyundai car build");
    }
}
