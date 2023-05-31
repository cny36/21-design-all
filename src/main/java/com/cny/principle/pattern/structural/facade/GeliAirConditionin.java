package com.cny.principle.pattern.structural.facade;

/**
 * @author : chennengyuan
 */
public class GeliAirConditionin implements AirConditionin{

    @Override
    public void workMode() {
        System.out.println("格力空调-开启工作模式温度");
    }

    @Override
    public void sleepMode() {
        System.out.println("格力空调-开启睡眠模式温度");
    }
}
