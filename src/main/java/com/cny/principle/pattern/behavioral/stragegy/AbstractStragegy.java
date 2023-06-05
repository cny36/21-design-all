package com.cny.principle.pattern.behavioral.stragegy;

import java.math.BigDecimal;

/**
 * 计算金额抽象策略类，模拟超市打折
 *
 * @author : chennengyuan
 */
public abstract class AbstractStragegy {

    abstract BigDecimal calculateAmount(BigDecimal amount);

}
