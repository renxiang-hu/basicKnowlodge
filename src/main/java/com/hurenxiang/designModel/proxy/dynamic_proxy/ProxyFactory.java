package com.hurenxiang.designModel.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 获取代理对象的工厂类，代理类也实现了对应的接口
 */
public class ProxyFactory {

    //声明目标对象
    private TrainStation trainStation;

    public ProxyFactory(TrainStation trainStation){
        this.trainStation = trainStation;
    }

    //获取代理对象的方法
    public SellTickets getProxyObject(){
        /**
         * ClassLoader loader : 类加载器，用于加载代理类，可以通过目标对象获取类加载器
         * Class<?>[] interfaces : 代理类实现的接口的字节码对象
         * InvocationHandler : 代理对象的调用处理程序
         */
        SellTickets proxyObject = (SellTickets)Proxy.newProxyInstance(trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     *  Object proxy : 代理对象。和proxyObject对象是同一个对象
                     *  method ：对接口中的方法进行封装的method对象
                     *  Object[] args ：调用方法的实际参数
                     *
                     *  返回值：方法的返回值
                     *
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                        System.out.println("invoke方法执行了...");
                        System.out.println("代理点收取一定的费用");
                          //执行目标对象的方法
                          Object o = method.invoke(trainStation,args);
                          return o;
                    }
                });
        return proxyObject;
    }
}
