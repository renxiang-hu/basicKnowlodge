package com.hurenxiang.designModel.proxy.staticProxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyHandler implements InvocationHandler {

    private Object targetObject;

    public Object newProxyInstance(Object targetObject){
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start invoke");
        System.out.println(method);
        for (int i = 0 ; i < args.length ; i++){
            System.out.println(args[i]);
        }
        Object ret = null;
        System.out.println("start call method......");
        ret = method.invoke(targetObject,args);
        System.out.println("success call method......");
        return ret;
    }
}
