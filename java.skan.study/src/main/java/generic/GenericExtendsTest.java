package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * Description : Generic 테스트
 *                     - extends  -> PE
 *                     - super    -> CS
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2021 by CJENM|MezzoMedia. All right reserved.
 * @since 2021-06-01
 */
public class GenericExtendsTest {

    public static void main(String[] args) {
        GenericExtendsTest.extendsTest(0.1);

        System.out.println("1. Extends 상위 타입은 에러 Error > 자기 자신과 ,자식 객체만 사용");
        GenericExtendsTest.extendsTestCase2(new Original() {});
        GenericExtendsTest.extendsTestCase2(new Circle());
        GenericExtendsTest.extendsTestCase2(new ShapesGeneric());

        //GenericExtendsTest.extendsTestCase3(new Original() {}); --> 에러
        //GenericExtendsTest.extendsTestCase3(new Circle());  -- > 에러
        GenericExtendsTest.extendsTestCase3(new DiamondGeneric());
        GenericExtendsTest.extendsTestCase3(new ShapesGeneric());

        System.out.println("2. 하위 클레스 타입은 에러 > 자기 자신과 상위 객체만 허용");
        GenericExtendsTest.superTestCase3(new ArrayList<ShapesGeneric>());
        //GenericExtendsTest.superTestCase3(new ArrayList<Circle>()); -> error
        GenericExtendsTest.superTestCase3(new ArrayList<Original>());

        //GenericExtendsTest.superTestCase4(new ArrayList<ShapesGeneric>()); --> error
        GenericExtendsTest.superTestCase4(new ArrayList<Circle>());
        GenericExtendsTest.superTestCase4(new ArrayList<Original>());


        GenericExtendsTest.getOriginal(new ShapesGeneric()).forEach(System.out::println);
    }


    public static  void superTestCase3(List<? super ShapesGeneric> data){
        System.out.println(data);
    }

    public static  void superTestCase4(List<? super Circle> data){
        System.out.println(data);
    }

    public static  <T extends Number> void extendsTest(T data){
        System.out.println(data);
    }

    public static  <T extends Original> void extendsTestCase2(T data){
        System.out.println(data);
    }

    public static  <T extends ShapesGeneric> void extendsTestCase3(T data){
        System.out.println(data);
    }

    public static <T extends Original>  List<T> getOriginal(T t){
        return List.of(t);
    }
}

// 최상위 객체
abstract class Original{
    String name;
}

// 상속구현한 네모
class ShapesGeneric extends Original{
    String superClass;
}

// 네모상속 구현한 다이아몬드
class DiamondGeneric extends ShapesGeneric{
    String superClass;
}



// 상속 구현한 원
class Circle extends Original {
  String circleSpecial;
}
