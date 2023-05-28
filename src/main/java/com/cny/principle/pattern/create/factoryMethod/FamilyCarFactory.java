package com.cny.principle.pattern.create.factoryMethod;

/**
 * @author : chennengyuan
 */
public class FamilyCarFactory extends AbstractCarFactory {


    @Override
    public AbstractCar createCar() {
        return new FamilyCar();
    }
}
