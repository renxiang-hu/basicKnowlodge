package com.hurenxiang.designModel.DemoTest.Singleton02;

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
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
