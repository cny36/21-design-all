package com.cny.principle.pattern.structural.decorators;

/**
 * @author : chennengyuan
 */
public class MainTest {

    public static void main(String[] args) {
        AbstractSpeakers speakers = new BaseSpeakers();
        speakers.execute();

        System.out.println("-------------------");

        speakers = new TranslateSpeakerDecorator(speakers);
        speakers.execute();
    }

}
