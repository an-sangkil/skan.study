package com.collection.normal;

import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
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
 * @since 2020-12-28
 */
public class DuplicationRemove {

    void duplicationRemoveTest() {
        List<Integer> originalData = new ArrayList<>();
        IntStream.range(0, 20).forEach(originalData::add);
        System.out.println("originalData size = " + originalData.size());
        System.out.println("originalData = " + originalData);

        System.out.println("\n  ====================== DEFAULT CONSTRUCT  FILTER =====================  \n ");

        List<Integer> filterData = new ArrayList<>();
        IntStream.range(0, 10).forEach(filterData::add);
        originalData.removeAll(filterData);

        System.out.println("filterData size = " + originalData.size());
        System.out.println("filterData = " + originalData);

    }

    void objectDuplicationRemoveTest() {
        List<Customer> originalData = new ArrayList<>();
        IntStream.range(0, 20).forEach(value -> {
            originalData.add(Customer.builder()
                    .masterId("master_1")
                    .customerName("customer_" + value)
                    .customerId("customer_" + value)
                    .ownerId("admin")
                    .build());
        });
        System.out.println("originalData size = " + originalData.size());
        System.out.println("originalData = " + originalData);

        System.out.println("\n  ====================== OBJECT FILTER =====================  \n ");

        List<Customer> filterData = new ArrayList<>();
        IntStream.range(0, 10).forEach(value -> {
            filterData.add(Customer.builder()
                    .masterId("master_1")
                    .customerName("customer_" + value)
                    .customerId("customer_" + value)
                    .ownerId("admin")
                    .build());
        });

        originalData.removeAll(filterData);
        System.out.println("object filterData size = " + originalData.size());
        System.out.println("object filterData = " + originalData);

    }

    public static void main(String[] args) {
        DuplicationRemove dr = new DuplicationRemove();
        dr.duplicationRemoveTest();

        System.out.println("\n\n\n ====================== LINE =====================  \n\n\n");

        dr.objectDuplicationRemoveTest();


    }
}

@Getter
@Setter@ToString
@EqualsAndHashCode(exclude = {"createdTime"})
class Customer {
    private String masterId;
    private String customerName;
    private String customerId;
    private String ownerId;

    private LocalDateTime createdTime;

    @Builder
    public Customer(String masterId, String customerName, String customerId, String ownerId) {
        this.masterId = masterId;
        this.customerName = customerName;
        this.customerId = customerId;
        this.ownerId = ownerId;
    }
}
