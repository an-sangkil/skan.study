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
 * @since 2022/12/06
 */
public class SorcererCharacterFactory implements CharacterFactory{
    @Override
    public Character makeCharacter(String name, String color) {
        Character character = new Character(name, color);
        character.setGender("FEMALE");
        return character;
    }
}
