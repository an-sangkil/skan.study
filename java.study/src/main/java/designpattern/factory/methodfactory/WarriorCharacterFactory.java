package designpattern.factory.methodfactory;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/12/05
 */
public class WarriorCharacterFactory implements CharacterFactory {

    @Override
    public Character makeCharacter(String name, String color) {
        Character character = new Character(name, color);
        character.setGender("MALE");
        return character;
    }
}
