package com.cny.principle.pattern.create.factoryMethod;

/**
 * @author : chennengyuan
 */
public class SportUtilityVehicleFactory  extends AbstractCarFactory{

    @Override
    public AbstractCar createCar() {
        return new SportUtilityVehicle();
    }
}
