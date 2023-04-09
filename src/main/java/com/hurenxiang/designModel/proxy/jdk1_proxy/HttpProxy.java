package com.hurenxiang.designModel.proxy.jdk1_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HttpProxy implements InvocationHandler {
    private HttpUtil httpUtil;

    public IHttp getInstance(HttpUtil httpUtil) {
        this.httpUtil = httpUtil;
        return (IHttp) Proxy.newProxyInstance(httpUtil.getClass().getClassLoader(), httpUtil.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        if ("request".equals(method.getName())) {
            System.out.println("发送数据：" + args[0]);
            result = method.invoke(httpUtil, args);
        } else if ("onSuccess".equals(method.getName())) {
            System.out.println("收到数据：" + args[0]);
            result = method.invoke(httpUtil, args);
        }
        return result;
    }
}
