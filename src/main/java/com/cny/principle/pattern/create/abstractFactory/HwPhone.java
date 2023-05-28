package com.cny.principle.pattern.create.abstractFactory;

/**
 * @author : chennengyuan
 */
public class HwPhone implements Phone{

    @Override
    public void call() {
        System.out.println("华为-call");
    }
}
