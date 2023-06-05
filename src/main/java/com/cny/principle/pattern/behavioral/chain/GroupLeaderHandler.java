package com.cny.principle.pattern.behavioral.chain;

/**
 * 小组长，最多只能批准3天
 *
 * @author : chennengyuan
 */
public class GroupLeaderHandler extends AbstractHandler {

    @Override
    public void process(LeaveRequest leaveRequest) {
        if(leaveRequest.getNum() <= 3) {
            System.out.println("小组长审批通过");
        } else {
            if (getNextHandler() != null) {
                System.out.println("小组长无权审批，提交给下节点处理");
                getNextHandler().process(leaveRequest);
            }
        }


    }
}
