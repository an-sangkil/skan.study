package com.normal.finallogic;

import com.CustomDisplayName;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2020 by CJENM|MezzoMedia. All right reserved.
 * @since 2020-12-21
 */
public class FinalLogic {



    public static void main(String[] args) {
        FinalLogic finalLogic = new FinalLogic();
        finalLogic.collectionFinalLoginTest();
    }

    /*
        List 를 메소드 안에 final 로 설정 하고 난뒤에도 add 가 가능한지 확인
         - 객체 타입을 final로 생성 했기 때문에 속성갑에 대한 변경은가능하다, 하지만 새로운 new List는 안된다.
     */
    public void collectionFinalLoginTest () {
        final List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        System.out.printf("final collection data = %s \n", strings);

    }

    @CustomDisplayName(name = "String join 테스트 ")
    public void joinStringTest() {
        String data = String.join(",","1","2");
        System.out.println(data);
    }


}
