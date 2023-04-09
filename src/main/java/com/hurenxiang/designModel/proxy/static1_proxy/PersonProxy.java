package com.hurenxiang.designModel.proxy.static1_proxy;

public class PersonProxy implements Person {

    private Student student = new Student();

    @Override
    public void wakeup() {
        System.out.println("早安~");
        student.wakeup();
    }

    @Override
    public void sleep() {
        System.out.println("晚安~");
        student.sleep();
    }
}
