package com.cny.principle.pattern.structural.decorators;

/**
 * @author : chennengyuan
 */
public class TranslateSpeakerDecorator extends BaseSpeakersDecorator{

    public TranslateSpeakerDecorator(AbstractSpeakers abstractSpeakers){
        super(abstractSpeakers);
    }

    @Override
    void execute() {
        super.execute();
        System.out.println("小爱音箱-增强版-翻译");
    }
}
