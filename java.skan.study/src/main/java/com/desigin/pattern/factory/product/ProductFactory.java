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
public class ProductFactory {

    public static Product makeProduct(String productName, int price, Product.ProductEnum productEnum) {
        Product product = switch (productEnum) {
            case PRINTER -> new Printer(productName, price);
            case COMPUTER -> new Computer(productName, price);
            default -> null;
        };

        return product;
    }


    public static void main(String[] args) {
        Product product = ProductFactory.makeProduct("LG 컴퓨터", 1000000, Product.ProductEnum.COMPUTER);
        System.out.println(product);

        product = ProductFactory.makeProduct("삼성 프린터", 500000, Product.ProductEnum.PRINTER);
        System.out.println(product);
    }


}
