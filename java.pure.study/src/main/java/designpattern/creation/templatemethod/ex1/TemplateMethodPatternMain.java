package designpattern.creation.templatemethod.ex1;

import designpattern.creation.templatemethod.ex1.implematation.Knight;
import designpattern.creation.templatemethod.ex1.implematation.Sorcerer;
import designpattern.creation.templatemethod.ex1.implematation.Warlock;
import designpattern.creation.templatemethod.ex1.implematation.Warrior;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/11/29
 */
public class TemplateMethodPatternMain {

    public static void main(String[] args) throws Exception {
        System.out.println("------------------------[Knight]-------------------------");
        Knight knight = new Knight();
        knight.tutorialPlay();

        System.out.println("------------------------[Warrior]-------------------------");
        Warrior warrior = new Warrior();
        warrior.tutorialPlay();

        System.out.println("------------------------[Sorcerer]-------------------------");
        Sorcerer sorcerer = new Sorcerer();
        sorcerer.tutorialPlay();

        System.out.println("------------------------[Warlock]-------------------------");
        Warlock warlock = new Warlock();
        warlock.tutorialPlay();

    }
}
