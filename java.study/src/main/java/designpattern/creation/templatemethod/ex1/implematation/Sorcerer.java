package designpattern.creation.templatemethod.ex1.implematation;

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
public class Sorcerer extends Person {
    @Override
    void characterCreation() {
        System.out.println("[사악한 여자 마법사]를 생성하였습니다.");
    }

    @Override
    void initQuest() {
        System.out.println("[사악한 여자 마법사] 클레스의 최초 퀘스트를 수행합니다.");
    }

    @Override
    void questRewardItem() {
        System.out.println("[사악한 여자 마법사] 클레스의 무기를 획득합니다.");
    }
}
