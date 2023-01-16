package com.hurenxiang.designModel.proxy.staticProxyTest;

public class StaticProxyHandler implements ToBeProxyInterface{

    //目标对象
    private ToBeProxyedService1 toBeProxyedService1;

    //通过构造方法传入目标对象
    public StaticProxyHandler(ToBeProxyedService1 toBeProxyedService1){
        this.toBeProxyedService1 = toBeProxyedService1;
    }

    @Override
    public void addUser(String userId, String userName) {
        //添加打印日志的功能
        //开始添加用户
        System.out.println("start addUser()");
        toBeProxyedService1.addUser(userId,userName);
        System.out.println("success addUser");
    }

    @Override
    public void delUser(String userId) {
         toBeProxyedService1.delUser(userId);
    }

    @Override
    public String findUser(String userId) {
        toBeProxyedService1.findUser(userId);
        return "张三";
    }

    @Override
    public void modifyUser(String userId, String userName) {
         toBeProxyedService1.modifyUser(userId,userName);
    }
}
