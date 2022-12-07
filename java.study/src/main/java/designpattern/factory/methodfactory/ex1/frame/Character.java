package designpattern.factory.methodfactory.ex1.frame;

import lombok.*;

/**
 *
 * @author skan
 * @since 2022/12/05
 */
@ToString
@Getter
@Setter
public class Character {
    String name;
    String color;
    String gender;
    String header;
    String body;
    String footer;

    public enum attackType {
        SWORD,
        AXE,
        WAND,


    }
}


