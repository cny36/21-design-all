package com.cny.principle.pattern.behavioral.chain;

/**
 * 主管，最多只能批准6天
 *
 * @author : chennengyuan
 */
public class ManageLeaderHandler extends AbstractHandler {

    @Override
    public void process(LeaveRequest leaveRequest) {
        if(leaveRequest.getNum() <= 6) {
            System.out.println("主管审批通过");
        } else {
            if (getNextHandler() != null) {
                System.out.println("主管无权审批，提交给下节点处理");
                getNextHandler().process(leaveRequest);
            }
        }

    }
}
