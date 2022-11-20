package com.hurenxiang.designModel.proxy;

public class UserDao implements IUserDao{
    @Override
    public void save() {
        System.out.println("真实主题角色 ---- > 被代理");
    }
}
