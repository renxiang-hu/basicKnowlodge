package com.hurenxiang.designModel.Singleton;

public class Singleton2 {

    private Singleton2(){

    }

    private volatile static Singleton2 singleton2 = null;

    public static Singleton2 getInstance() {
        if (singleton2 == null) {
            synchronized (Singleton2.class) {
                if (singleton2 == null) {
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }
}
