package com.cny.principle.pattern.behavioral.observe;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 台风预警主题
 *
 * @author : chennengyuan
 */
public class TyphoonWarningSubject extends AbstraceSubject {

    private Set<AbstractObserve> observes = new HashSet<>();

    @Override
    boolean add(AbstractObserve abstractObserve) {
        if(abstractObserve != null){
            return observes.add(abstractObserve);
        }
        return false;
    }

    @Override
    boolean remove(AbstractObserve abstractObserve) {
        if(abstractObserve != null){
            return observes.remove(abstractObserve);
        }
        return false;
    }

    @Override
    void notifyAll(String message) {
        Iterator<AbstractObserve> iterator = observes.iterator();
        while (iterator.hasNext()) {
            AbstractObserve observe = iterator.next();
            observe.update(message);
        }
    }
}
