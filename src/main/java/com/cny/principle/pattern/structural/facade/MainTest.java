package com.cny.principle.pattern.structural.facade;

/**
 * @author : chennengyuan
 */
public class MainTest {

    public static void main(String[] args) {
        Audio miAudio = new MiAudio();
        AirConditionin geli = new GeliAirConditionin();

        AppFacade appFacade = new AppFacade(miAudio, geli);
        System.out.println("开启工作模式");
        appFacade.workModeOn();

        System.out.println("开启睡眠模式");
        appFacade.sleepModeOn();
    }

}
