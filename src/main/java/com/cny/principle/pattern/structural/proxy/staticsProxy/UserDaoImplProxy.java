package com.cny.principle.pattern.structural.proxy.staticsProxy;

import com.cny.principle.pattern.structural.proxy.basic.IUserDao;

/**
 * @author : chennengyuan
 */
public class UserDaoImplProxy implements IUserDao {

    private IUserDao userDao;

    public UserDaoImplProxy(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(int id, String name, int age) {
        System.out.println("before add");
        userDao.add(id, name, age);
        System.out.println("after add");
    }

    @Override
    public void update(int id, String name, int age) {
        System.out.println("before update");
        userDao.update(id, name, age);
        System.out.println("after update");
    }
}
