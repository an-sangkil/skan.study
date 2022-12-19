package designpattern.creation.templatemethod.ex2;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/11/30
 */
public class TemplateMethodPattern {

    public static void main(String[] args) {
        System.out.println("------------------------[Genessis]-------------------------");
        Genesis genesis = new Genesis();
        genesis.run();

        System.out.println("------------------------[K9]-------------------------");
        K9 k9 = new K9();
        k9.run();

        System.out.println("------------------------[Spark]-------------------------");
        Spark spark = new Spark();
        spark.run();


    }
}
