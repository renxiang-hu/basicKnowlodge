package com.hurenxiang.designModel.module;

public class Client {
    public static void main(String[] args) {
        System.out.println("----------制作红豆豆浆---------");
        SoyaMilk soyaMilk = new RedBeanSoyaMilk();
        soyaMilk.make();
        System.out.println("----------制作花生豆浆---------");
        SoyaMilk soyaMilk1 = new PeanutSoyaMilk();
        soyaMilk1.make();
        System.out.println("----------制作纯豆浆-----------");
        SoyaMilk soyaMilk2 = new PureSoyaMilk();
        soyaMilk2.make();
    }
}
