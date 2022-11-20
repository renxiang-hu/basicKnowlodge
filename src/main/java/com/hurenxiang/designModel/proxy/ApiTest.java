package com.hurenxiang.designModel.proxy;

public class ApiTest {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        UserDaoProxy proxy = new UserDaoProxy(userDao);
        proxy.save();
    }
}
