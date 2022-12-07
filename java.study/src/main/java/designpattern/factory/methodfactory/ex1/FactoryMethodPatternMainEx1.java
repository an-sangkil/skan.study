package designpattern.factory.methodfactory.ex1;

import designpattern.factory.methodfactory.ex1.concrete.KnightCharacterFactory;
import designpattern.factory.methodfactory.ex1.concrete.SorcererCharacterFactory;
import designpattern.factory.methodfactory.ex1.concrete.WarriorCharacterFactory;
import designpattern.factory.methodfactory.ex1.frame.Character;

/**
 *
 * factory pattern or factory method pattern
 * @author skan
 * @since 2022/12/05
 */
public class FactoryMethodPatternMainEx1 {

    public static void main(String[] args) {
        // 기사 생성 - 기본 성별남
        Character character = new KnightCharacterFactory().creationEvent("An", "Black");

        // 전사 생성 - 기본 성별남
        character = new WarriorCharacterFactory().creationEvent("Ahn", "Blue");

        // 마법사 생성
        character = new SorcererCharacterFactory().creationEvent("Jo", "Withe");


    }

}
