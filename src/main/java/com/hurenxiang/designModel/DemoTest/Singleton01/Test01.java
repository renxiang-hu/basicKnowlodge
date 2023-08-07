package com.hurenxiang.designModel.DemoTest.Singleton01;

public class Test01 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1==instance);
    }
}

class Singleton{
    private static Singleton singleton;
    private Singleton(){}
    static {
        singleton = new Singleton();
    }
    public static Singleton getInstance() {
        return singleton;
    }
}
