package com.cny.principle.pattern.structural.bridging;

/**
 * @author : chennengyuan
 */
public class MainTest {

    public static void main(String[] args) {
        //小米折叠屏手机
        AbstractMobilePhone mobilePhone1 = new FoldingScreenMobilePhone(new MiBrand());
        mobilePhone1.showAllInfo();

        System.out.println("-----------------------------");

        //华为直面屏手机
        AbstractMobilePhone mobilePhone2 = new StraightScreenMobilePhone(new HuaweiBrand());
        mobilePhone2.showAllInfo();
    }

}
