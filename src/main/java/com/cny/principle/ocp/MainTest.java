package com.cny.principle.ocp;

/**
 * @author : chennengyuan
 */
public class MainTest {

    public static void main(String[] args) {
        Apple apple = new Apple("苹果");
        Pear pear = new Pear("梨");

        // 开闭原则
        // 新增水果只需要新增水果类就行了,不需要修改任何代码
        Juicer juicer = new Juicer();
        juicer.press(apple);
        juicer.press(pear);
    }
}
