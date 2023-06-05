package com.cny.principle.pattern.behavioral.stragegy;

import java.math.BigDecimal;

/**
 * @author : chennengyuan
 */
public class FullMinusStragegy extends AbstractStragegy {

    @Override
    BigDecimal calculateAmount(BigDecimal amount) {
        System.out.println("使用满减计价策略");
        return amount.compareTo(new BigDecimal(1000)) > 0 ? amount.subtract(new BigDecimal(100)) : amount;
    }
}
