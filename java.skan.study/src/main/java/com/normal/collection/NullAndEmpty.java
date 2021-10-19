package com.normal.collection;

import java.util.List;
import java.util.Optional;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2021 by CJENM|MezzoMedia. All right reserved.
 * @since 2021/10/12
 */
public class NullAndEmpty {

    public void emptyTest(List<String> testData) {

        System.out.println("==================TEST==================");
        System.out.print("Data = ");
        if (testData != null) {
            testData.forEach(System.out::print);
            System.out.print("\n");
        } else {
            System.out.println(testData);
        }


        if (testData == null || testData.size() < 1) {
            System.out.println("empty data, condition :  if (testDate == null || testDate.size() < 1) ");
        }

    }

    public void sizeCheck(List<String> testDate) {
        System.out.printf("size check %d", testDate.size());
    }
}
