package com.cny.principle.pattern.structural.adapter;

/**
 * @author : chennengyuan
 */
public class MainTest {

    /**
     * 模拟 220V电压转换为22V电压
     *
     * @param args
     */
    public static void main(String[] args) {
        Power22Adapter power22Adapter = new Power22Adapter(new Power220V());

        System.out.println(power22Adapter.power22());
    }

}
