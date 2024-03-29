package designpattern.creation.factory.methodfactory.ex1;

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
public class KnightCharacterFactory implements CharacterFactory {

    @Override
    public Character makeCharacter() {
        Character character = new Character();

        /// 성별은 FIX
        character.setGender("MALE");

        return character;
    }
}
