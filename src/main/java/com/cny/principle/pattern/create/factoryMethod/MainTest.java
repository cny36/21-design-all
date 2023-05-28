package com.cny.principle.pattern.create.factoryMethod;

/**
 * 工厂方法模式
 *
 * @author : chennengyuan
 */
public class MainTest {

    public static void main(String[] args) {
        AbstractCarFactory carFactory1 = new BusFactory();
        carFactory1.createCar().start();

        AbstractCarFactory carFactory2 = new SportUtilityVehicleFactory();
        carFactory2.createCar().start();

        //TODO 新增一个新类型 FamilyCar，并不用修改历史代码，只需要增加新类即可满足，实现了开闭原则
        AbstractCarFactory carFactory3 = new FamilyCarFactory();
        carFactory3.createCar().start();

    }

}
