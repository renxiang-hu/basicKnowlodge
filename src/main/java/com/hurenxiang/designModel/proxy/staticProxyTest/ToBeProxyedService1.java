package com.hurenxiang.designModel.proxy.staticProxyTest;

public class ToBeProxyedService1 implements ToBeProxyInterface {
    @Override
    public void addUser(String userId, String userName) {
        System.out.println("ToBeProxyedService1.addUser");
    }

    @Override
    public void delUser(String userId) {
        System.out.println("ToBeProxyedService1.delUser");
    }

    @Override
    public String findUser(String userId) {
        System.out.println("ToBeProxyedService1.findUser");
        return "张三";
    }

    @Override
    public void modifyUser(String userId, String userName) {
        System.out.println("ToBeProxyedService1.modifyUser");
    }
}
