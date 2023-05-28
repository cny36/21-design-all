package com.cny.principle.pattern.create.factoryMethod;

/**
 * @author : chennengyuan
 */
public class SportUtilityVehicle extends AbstractCar {

    @Override
    public void start() {
        System.out.println("越野车-start");
    }

    @Override
    public void stop() {
        System.out.println("越野车-stop");
    }
}
