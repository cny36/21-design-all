package com.cny.principle.pattern.structural.proxy.cglibProxy;

import com.cny.principle.pattern.structural.proxy.basic.IUserDao;
import com.cny.principle.pattern.structural.proxy.basic.UserDaoImpl;

/**
 * @author : chennengyuan
 */
public class MainTest {

    public static void main(String[] args) {
        DaoProxyFactory daoProxyFactory = new DaoProxyFactory(new UserDaoImpl());
        IUserDao userDaoProxy = daoProxyFactory.getUserDaoProxy();

        userDaoProxy.add(6, "6666", 66);
    }

}
