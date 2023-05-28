package com.cny.principle.pattern.create.simpleFactory;

/**
 * 简单工厂模式
 *
 * @author : chennengyuan
 */
public class MainTest {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        AbstractCar bus = simpleFactory.create("越野车");

        bus.start();
        bus.stop();

        //TODO 应对变化时，需要修改 SimpleFactory，不符合开闭原则
    }

}
