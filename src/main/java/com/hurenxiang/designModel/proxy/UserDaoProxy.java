package com.hurenxiang.designModel.proxy;

public class UserDaoProxy implements IUserDao{

    private IUserDao proxy;

    public UserDaoProxy(IUserDao proxy){
        this.proxy = proxy;
    }

    @Override
    public void save() {
        System.out.println("代理类");
        proxy.save();
        System.out.println("代理类");
    }
}
