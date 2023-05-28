package com.cny.principle.pattern.structural.proxy.jdkProxy;

import com.cny.principle.pattern.structural.proxy.basic.IUserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author : chennengyuan
 */
public class DaoProxyFactory {

    private IUserDao userDao;

    public DaoProxyFactory(IUserDao userDao){
        this.userDao = userDao;
    }

    public IUserDao getUserDaoProxy(){
        Object instance = Proxy.newProxyInstance(userDao.getClass().getClassLoader(),
                userDao.getClass().getInterfaces(),
                new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("采用 JDK 实现动态代理");
                System.out.println("before add");
                Object result = method.invoke(userDao, args);
                System.out.println("after add");
                return result;
            }
        });

        return (IUserDao) instance;
    }

}
