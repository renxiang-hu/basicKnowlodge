package com.hurenxiang.designModel.DemoTest.Singleton03;

public class Test001 {
    public static void main(String[] args) {

    }
}

class Singleton{
    private volatile static Singleton singleton;
    private Singleton(){}
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class){
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
