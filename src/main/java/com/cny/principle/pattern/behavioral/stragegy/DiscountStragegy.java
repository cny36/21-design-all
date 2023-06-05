package com.cny.principle.pattern.behavioral.stragegy;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author : chennengyuan
 */
public class DiscountStragegy extends AbstractStragegy{

    @Override
    BigDecimal calculateAmount(BigDecimal amount) {
        System.out.println("使用打折计价策略");
        return amount.multiply(new BigDecimal("0.99").setScale(2, RoundingMode.HALF_UP));
    }
}
