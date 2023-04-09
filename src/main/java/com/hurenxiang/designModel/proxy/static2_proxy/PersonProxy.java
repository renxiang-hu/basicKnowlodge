package com.hurenxiang.designModel.proxy.static2_proxy;

public class PersonProxy implements IPerson {

    private Person person;

    public PersonProxy(Person person) {
        this.person = person;
    }

    @Override
    public void eat() {
        System.out.println("我们正在吃饭");
        person.eat();
    }

    @Override
    public void sleep() {
        System.out.println("我们正在旅游");
        person.sleep();
    }
}
