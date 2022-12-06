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
public interface CharacterFactory {

    default Character creationEvent(String name,String color) {
        // 유효성 검사
        this.validation(name);

        Character character = makeCharacter(name, color);

        // 준비
        this.prepareFor(character.getName());

        // 데이터 저장
        this.createCharacterLog(character);

        // 생성알림
        this.notification(character);

        return character;
    }

    Character makeCharacter(String name, String color);

    // 유효성검사
    private void validation(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("이름을 입력해주세요.");
        }

    }

    // 준비
    private void prepareFor(String name) {
        System.out.println(name +" 를 만들 준비중입니다.");
    }

    // 캐릭터 생성 알림
    private void notification(Character character) {
        System.out.println("케릭터가 생성되었습니다. " + character);
    }

    // 저장
    private void createCharacterLog(Character character) {
        System.out.println(character + "를 db 에 저장합니다.");
    }



}
