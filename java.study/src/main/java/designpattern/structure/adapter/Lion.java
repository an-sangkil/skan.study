package designpattern.structure.adapter;

/**
 *
 * @author skan
 * @since 2023/01/10
 */
public class Lion implements Animal{

    private String name;

    public Lion(String name) {
        this.name = name;
    }

    @Override
    public void walk() {
        System.out.println(name + " : 사자가 성큼성큼 걷습니다.");
    }

    @Override
    public void sound() {
        System.out.println(name + " : 사자가 포효합니다.");
    }
}
