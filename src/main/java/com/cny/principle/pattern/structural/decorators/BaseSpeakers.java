package com.cny.principle.pattern.structural.decorators;

/**
 * @author : chennengyuan
 */
public class BaseSpeakers extends AbstractSpeakers{

    @Override
    void execute() {
        System.out.println("小爱音箱-基础版-听音乐");
    }
}
