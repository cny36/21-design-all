package com.cny.principle.pattern.create.simpleFactory;

/**
 * @author : chennengyuan
 */
public class SimpleFactory {

    public AbstractCar create(String name) {
        if ("公交车".equals(name)) {
            return new Bus();
        } else if ("越野车".equals(name)) {
            return new SportUtilityVehicle();
        } else {
            return null;
        }
    }

}
