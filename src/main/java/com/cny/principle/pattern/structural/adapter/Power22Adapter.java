package com.cny.principle.pattern.structural.adapter;

/**
 * @author : chennengyuan
 */
public class Power22Adapter implements Power22V{

    private Power220V power220V;

    public Power22Adapter(Power220V power220V) {
        this.power220V = power220V;
    }

    @Override
    public int power22() {
        int power220 = power220V.power220();

        System.out.println("220V 模拟转换为 22V");
        int power22 = power220/10;

        return power22;
    }
}
