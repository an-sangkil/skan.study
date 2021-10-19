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
public abstract class Product {
    public abstract String name();
    public abstract int price();

    @Override
    public String toString() {
        return "product name : " + name() + ", price :" + price();
    }

    enum ProductEnum {
        COMPUTER, PRINTER;
    }
}
