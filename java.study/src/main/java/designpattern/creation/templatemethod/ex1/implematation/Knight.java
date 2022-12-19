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
public class Knight extends Person {
    @Override
    void characterCreation() {
        System.out.println("[기사] 클레스를 생성하였습니다.");
    }

    @Override
    void initQuest() {
        System.out.println("[기사] 클레스의 최초 퀘스트를 수행합니다.");
    }

    @Override
    void questRewardItem() {
        System.out.println("[기사] 클레스의 무기를 획득합니다.");
    }

    @Override
    protected boolean isFirstQuestHookMethod(){
        return true;
    }
}
