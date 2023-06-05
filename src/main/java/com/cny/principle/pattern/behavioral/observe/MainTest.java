package com.cny.principle.pattern.behavioral.observe;

/**
 * @author : chennengyuan
 */
public class MainTest {

    public static void main(String[] args) {
        AbstraceSubject subject = new TyphoonWarningSubject();
        subject.add(new GovernmentObserve());
        subject.add(new TownspeopleObserve());

        subject.notifyAll("台风来了");
    }

}
