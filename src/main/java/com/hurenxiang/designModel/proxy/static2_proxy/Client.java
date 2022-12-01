package com.hurenxiang.designModel.proxy.static2_proxy;

public class Client {
    public static void main(String[] args) {
        Person person = new Person();
        PersonProxy proxy = new PersonProxy(person);
        proxy.eat();
        proxy.sleep();
    }
}
