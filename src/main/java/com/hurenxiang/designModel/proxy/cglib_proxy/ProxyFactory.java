package com.hurenxiang.designModel.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理工厂，获取代理对象
 */
public class ProxyFactory implements MethodInterceptor {

    private TrainStation trainStation;

    public ProxyFactory(TrainStation trainStation){
        this.trainStation = trainStation;
    }

    public TrainStation getProxyObject(){
        //创建Enhancer对象，类似于jdk代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        TrainStation proxyObject = (TrainStation)enhancer.create();
        return proxyObject;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("收取一定的代理费用(cglib)");
        Object obj = method.invoke(trainStation,objects);
        return obj;
    }
}
