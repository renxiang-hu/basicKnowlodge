package com.hurenxiang.designModel.proxy.staticProxyTest;

public class ToBeProxyedService2 implements ToBeProxyInterface {
    @Override
    public void addUser(String userId, String userName) {
        System.out.println("ToBeProxyedService2.addUser");
    }

    @Override
    public void delUser(String userId) {
        System.out.println("ToBeProxyedService2.delUser");
    }

    @Override
    public String findUser(String userId) {
        System.out.println("ToBeProxyedService2.findUser");
        return "张三";
    }

    @Override
    public void modifyUser(String userId, String userName) {
        System.out.println("ToBeProxyedService2.modifyUser");
    }
}
