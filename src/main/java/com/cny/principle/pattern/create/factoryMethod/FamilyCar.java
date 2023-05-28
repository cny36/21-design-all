package com.cny.principle.pattern.create.factoryMethod;

/**
 * @author : chennengyuan
 */
public class FamilyCar extends AbstractCar {

    @Override
    public void start() {
        System.out.println("家用车-start");
    }

    @Override
    public void stop() {
        System.out.println("家用车-stop");
    }
}
