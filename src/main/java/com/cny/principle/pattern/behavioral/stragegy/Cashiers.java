package com.cny.principle.pattern.behavioral.stragegy;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author : chennengyuan
 */
@Data
public class Cashiers {

    private AbstractStragegy abstractStragegy;

    public Cashiers(AbstractStragegy abstractStragegy) {
        this.abstractStragegy = abstractStragegy;
    }

    public BigDecimal computerPrice(BigDecimal price) {
        return abstractStragegy.calculateAmount(price);
    }

}
