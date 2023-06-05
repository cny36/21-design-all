package com.cny.principle.pattern.behavioral.chain;

/**
 * @author : chennengyuan
 */
public class MainTest {

    public static void main(String[] args) {
        AbstractHandler handler1 = new GroupLeaderHandler();
        handler1.nextHandler(new ManageLeaderHandler());
        handler1.nextHandler(new BossHandler());

        handler1.process(new LeaveRequest("张三", 4, "回家"));
    }

}
