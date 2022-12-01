package designpattern.templatemethod.ex1.implematation;

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
public abstract class Person {

    public void tutorialPlay() {

        this.characterCreation();
        this.ready();
        this.firstChapterMoveTown();

        System.out.printf("최초 퀘스트 수행여부 %s \n", isFirstQuestHookMethod());
        if (isFirstQuestHookMethod()) {
            this.firstQuestAccept();
            this.initQuest();
        }

        this.questRewardItem();
    }

    // 케릭터를 생성합니다.
    abstract void characterCreation() ;

    // 케릭터가 준비됬다.
    final void ready () {
        System.out.println("OOO 케릭터가 생성 되었습니다. ");
    }

    // 상속하는 클레스에서 변경하지 못하도록 final 을 지정한다.
    // 게임 시작시 무조건 NPC를 만나 마을로 이동해야 한다.
    final void firstChapterMoveTown() {
        System.out.println("NPC를 만나 Start 마을 [시작 마을]로 함께 이동합니다.");
    }

    // 상속하는 클레스에서 변경하지 못하도록 final 을 지정한다.
    //  - 마을로 이동한후 퀘스트를 수락해야 한다,
    //  - 케릭터 직업별로 퀘스트를 수해하지 않아도 되는 직업이 있다.
    final void firstQuestAccept() {
        System.out.println("케릭터별 최최 퀘스트를 수행합니다. ");
    }

    // 캐릭터별 최초 퀘스트 수행
    abstract void initQuest() ;

    // 캐릭별 최초 수행퀘스트후 보상아이템
    abstract void questRewardItem();

    // 최초클레스 생성시 쿼스트를 수행해야 하는지에 대한 hooking method
    protected boolean isFirstQuestHookMethod() {
        // prepareOther 혹은 hook method 라고 불리우며 추상클레스에서 abstract 가 붙지 않음 함수를 말한다.

        return false;
    }
}
