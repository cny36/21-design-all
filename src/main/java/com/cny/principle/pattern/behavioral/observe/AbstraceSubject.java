package com.cny.principle.pattern.behavioral.observe;

/**
 * 抽象主题
 * @author : chennengyuan
 */
public abstract class AbstraceSubject {

    abstract boolean add(AbstractObserve abstractObserve);

    abstract boolean remove(AbstractObserve abstractObserve);

    abstract void notifyAll(String message);
}
