package com.cny.principle.pattern.structural.facade;

/**
 * @author : chennengyuan
 */
public class MiAudio implements Audio{

    @Override
    public void workMode() {
        System.out.println("小米音响-播放工作模式专属BGM");
    }

    @Override
    public void sleepMode() {
        System.out.println("小米音响-播放睡眠模式专属BGM");
    }
}
