package com.cny.principle.pattern.behavioral.stragegy;

import java.math.BigDecimal;

/**
 * @author : chennengyuan
 */
public class MainTest {

    public static void main(String[] args) {
        Cashiers cashiers = new Cashiers(new FullMinusStragegy());
        System.out.println(cashiers.computerPrice(new BigDecimal(1000)));

        cashiers.setAbstractStragegy(new DiscountStragegy());
        System.out.println(cashiers.computerPrice(new BigDecimal(1000)));
    }

}
