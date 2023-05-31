package com.cny.principle.pattern.behavioral.template;

/**
 * @author : chennengyuan
 */
public abstract class AbstractDeveloper {

    protected void preWork(){
        System.out.println("每日工作前，站立式晨会");
    }

    protected void postWork(){
        System.out.println("每日下班前，写工作总结");
    }

    protected abstract void working();


    public final void work(){
        preWork();
        working();
        postWork();
    }
}
