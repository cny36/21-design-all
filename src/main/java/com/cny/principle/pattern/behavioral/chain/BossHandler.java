package com.cny.principle.pattern.behavioral.chain;

/**
 * 老板
 *
 * @author : chennengyuan
 */
public class BossHandler extends AbstractHandler {

    @Override
    public void process(LeaveRequest leaveRequest) {
        if(leaveRequest.getNum() <= 30) {
            System.out.println("老板审批通过");
        }

    }
}
