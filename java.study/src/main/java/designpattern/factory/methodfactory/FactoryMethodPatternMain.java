package designpattern.factory.methodfactory;

/**
 *
 * factory pattern or factory method pattern
 * @author skan
 * @since 2022/12/05
 */
public class FactoryMethodPatternMain {

    public static void main(String[] args) {
        Character character = new KnightCharacterFactory().creationEvent("An", "Black");
        character = new WarriorCharacterFactory().creationEvent("Ahn", "Blue");
        character = new SorcererCharacterFactory().creationEvent("Jo", "Withe");


    }

}
