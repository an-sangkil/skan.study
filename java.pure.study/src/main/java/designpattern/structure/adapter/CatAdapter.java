package designpattern.structure.adapter;

/**
 *
 * @author skan
 * @since 2023/01/10
 */
public class CatAdapter implements Animal {

    private final Cat cat;

    public CatAdapter(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void walk() {
        cat.move();
    }

    @Override
    public void sound() {
        cat.bark();
    }
}
