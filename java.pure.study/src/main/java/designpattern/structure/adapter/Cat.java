package designpattern.structure.adapter;

/**
 *
 * @author skan
 * @since 2023/01/10
 */
public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println(name + " : 고양이가 사뿐사분 이동합니다.");
    }

    public void bark(){
        System.out.println(name + " : 냐용 웁니다.");
    }
}
