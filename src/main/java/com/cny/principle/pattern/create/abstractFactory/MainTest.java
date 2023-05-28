package com.cny.principle.pattern.create.abstractFactory;

/**
 * @author : chennengyuan
 */
public class MainTest {

    public static void main(String[] args) {
        AbstractPorductFactory miFactory = new MiProductFactory();
        miFactory.createPad().play();
        miFactory.createPhone().call();

        AbstractPorductFactory hwFactory = new HwProductFactory();
        hwFactory.createPad().play();
        hwFactory.createPhone().call();

        //TODO 一个工厂，可以创建多种产品，但是，新增产品时，需要修改历史代码，不符合开闭原则
        //TODO 比如，新增一个产品 Computer

    }

}
