package com.cny.principle.pattern.behavioral.observe;

/**
 * @author : chennengyuan
 */
public class GovernmentObserve extends AbstractObserve {

    @Override
    void update(String message) {
        System.out.println(message + ", 政府部门正在做对应的措施中。。。。");
    }
}
