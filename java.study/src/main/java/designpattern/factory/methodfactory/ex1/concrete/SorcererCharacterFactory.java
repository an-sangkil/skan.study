package designpattern.factory.methodfactory.ex1.concrete;

import designpattern.factory.methodfactory.ex1.frame.Character;
import designpattern.factory.methodfactory.ex1.frame.CharacterFactory;

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
public class SorcererCharacterFactory implements CharacterFactory {
    @Override
    public Character makeCharacter() {
        Character character = new Character();

        /// 성별은 FIX
        character.setGender("FEMALE");
        return character;
    }
}
