package com.cny.principle.pattern.create.factoryMethod;

/**
 * @author : chennengyuan
 */
public class BusFactory extends AbstractCarFactory {


    @Override
    public AbstractCar createCar() {
        return new Bus();
    }
}
