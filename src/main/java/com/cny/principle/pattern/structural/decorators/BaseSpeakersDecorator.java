package com.cny.principle.pattern.structural.decorators;

/**
 * @author : chennengyuan
 */
public class BaseSpeakersDecorator extends AbstractSpeakers{

    private AbstractSpeakers abstractSpeakers;

    public BaseSpeakersDecorator(AbstractSpeakers abstractSpeakers){
        this.abstractSpeakers = abstractSpeakers;
    }

    @Override
    void execute() {
        abstractSpeakers.execute();
    }
}
