package com.cny.principle.pattern.create.simpleFactory;

/**
 * @author : chennengyuan
 */
public class Bus extends AbstractCar{

    @Override
    public void start() {
        System.out.println("公交车-start");
    }

    @Override
    public void stop() {
        System.out.println("公交车-stop");
    }
}
