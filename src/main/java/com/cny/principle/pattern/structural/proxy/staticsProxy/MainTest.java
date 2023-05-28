package com.cny.principle.pattern.structural.proxy.staticsProxy;

import com.cny.principle.pattern.structural.proxy.basic.IUserDao;
import com.cny.principle.pattern.structural.proxy.basic.UserDaoImpl;

/**
 * @author : chennengyuan
 */
public class MainTest {

    public static void main(String[] args) {
        IUserDao userDao = new UserDaoImpl();
        IUserDao userDaoProxy = new UserDaoImplProxy(userDao);

        userDaoProxy.add(1, "zs", 18);
        System.out.println("---------------");
        userDaoProxy.update(2,"ls", 28);
    }

}
