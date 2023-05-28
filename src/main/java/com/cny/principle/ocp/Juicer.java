package com.cny.principle.ocp;

/**
 * @author : chennengyuan
 * 榨汁机
 */
public class Juicer {

    public void press(Fruits fruits) {
        System.out.println("榨的" + fruits.getName() + "汁");
    }

}
