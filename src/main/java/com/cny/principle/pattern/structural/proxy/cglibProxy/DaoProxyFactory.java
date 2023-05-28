package com.cny.principle.pattern.structural.proxy.cglibProxy;

import com.cny.principle.pattern.structural.proxy.basic.IUserDao;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author : chennengyuan
 */
public class DaoProxyFactory implements MethodInterceptor {

    private IUserDao target;

    public DaoProxyFactory(IUserDao userDao){
        this.target = userDao;
    }

    public IUserDao getUserDaoProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        Object object = enhancer.create();
        return (IUserDao) object;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("采用 CGLIB 实现动态代理");
        System.out.println("before add");
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("after add");
        return result;
    }
}
