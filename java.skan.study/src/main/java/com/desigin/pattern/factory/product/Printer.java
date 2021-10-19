package com.desigin.pattern.factory.product;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2021 by CJENM|MezzoMedia. All right reserved.
 * @since 2021-05-31
 */
public class Printer extends Product{

    private String name;
    private int price;

    public Printer(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public int price() {
        return this.price;
    }


    public void toStringCustom () {
        System.out.println("항목 :: " + this.name + ", 가격 :: "+ this.price);
    }

}
