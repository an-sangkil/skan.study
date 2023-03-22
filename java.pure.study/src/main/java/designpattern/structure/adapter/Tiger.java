package designpattern.structure.adapter;

/**
 *
 * @author skan
 * @since 2023/01/10
 */
public class Tiger implements Animal{
    private String name;

    public Tiger(String name) {
        this.name = name;
    }

    @Override
    public void walk() {
        System.out.println(name + " : 호랑이가 어슬렁 어슬렁");
    }

    @Override
    public void sound() {
        System.out.println(name + " : 호랑이가 어흥하고 소리를 냅니다.");
    }
}
