package com.cny.principle.pattern.structural.proxy.basic;

/**
 * @author : chennengyuan
 */
public class UserDaoImpl implements IUserDao{

    @Override
    public void add(int id, String name, int age) {
        System.out.println("UserDaoImpl add().....");
    }

    @Override
    public void update(int id, String name, int age) {
        System.out.println("UserDaoImpl update().....");
    }
}
