package com.hurenxiang.designModel.proxy.jdk2_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class proxyHandler implements InvocationHandler {
    //被代理对象
    private Object target;

    //有参构造器，传入被代理对象
    public proxyHandler(Object target) {
        this.target = target;
    }

    /**
     * 代理类处理逻辑
     * 获取到的代理类执行方法最终会执行此方法中的逻辑
     *
     * @param proxy  代理对象
     * @param method 被代理方法
     * @param args   被代理方法的参数数组
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是前置功能......");
        Object invoke = method.invoke(target, args);
        System.out.println("我是后置功能......");
        return invoke;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
}
