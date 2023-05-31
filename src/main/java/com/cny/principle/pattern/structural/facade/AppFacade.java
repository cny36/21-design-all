package com.cny.principle.pattern.structural.facade;

/**
 * @author : chennengyuan
 */
public class AppFacade {

    private Audio audio;
    private AirConditionin airConditionin;

    public AppFacade(Audio audio, AirConditionin airConditionin){
        this.audio = audio;
        System.out.println("音响接入成功");
        this.airConditionin = airConditionin;
        System.out.println("空调接入成功");

        System.out.println("所有设备接入完成");
    }

    public void workModeOn(){
        audio.workMode();
        airConditionin.workMode();
    }

    public void sleepModeOn(){
        audio.sleepMode();
        airConditionin.sleepMode();
    }

}
