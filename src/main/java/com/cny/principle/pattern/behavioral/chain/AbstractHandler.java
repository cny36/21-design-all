package com.cny.principle.pattern.behavioral.chain;


import lombok.Data;

/**
 * 抽象处理者类
 *
 * @author : chennengyuan
 */

public abstract class AbstractHandler {

    private AbstractHandler nextHandler;

    public AbstractHandler nextHandler(AbstractHandler handler) {
        this.nextHandler = handler;
        return this;
    }

    public AbstractHandler getNextHandler() {
        return nextHandler;
    }

    public abstract void process(LeaveRequest leaveRequest);
}
