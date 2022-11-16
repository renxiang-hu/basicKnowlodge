package com.hurenxiang.Lambda;

public class ThreadLambda {
    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("创建一个新线程");
//            }
//        }).start();
        new Thread(()->{
            System.out.println("创建一个线程");
        }).start();
    }
}
