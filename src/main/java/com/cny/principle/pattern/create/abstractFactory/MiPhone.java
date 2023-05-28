package com.cny.principle.pattern.create.abstractFactory;

/**
 * @author : chennengyuan
 */
public class MiPhone implements Phone{

    @Override
    public void call() {
        System.out.println("小米-call");
    }
}
