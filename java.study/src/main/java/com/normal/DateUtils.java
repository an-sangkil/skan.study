package com.normal;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/09/06
 */
@Slf4j
public class DateUtils {

    public static void LocalDateBeforeAfter() {

        LocalDate start = LocalDate.of(2022, 8, 5);
        LocalDate end = LocalDate.of(2022, 9, 6);

        LocalDate standardDate = LocalDate.of(2022, 9, 1);

        System.out.println(start.isBefore(standardDate));
        System.out.println(start.isAfter(standardDate));

    }

    public static void main(String[] args) {
        DateUtils.LocalDateBeforeAfter();

    }
}
