package com.cny.principle.pattern.behavioral.observe;

/**
 * @author : chennengyuan
 */
public class TownspeopleObserve extends AbstractObserve {

    @Override
    void update(String message) {
        System.out.println(message + ", 市民正在居家中。。。。");
    }
}
