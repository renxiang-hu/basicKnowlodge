package com.hurenxiang.basicKnowlodge;

public class ValueTransferDemo {
    public static void main(String[] args) {
        //这里的count就是实参
        int count = 0;
        update(count);
        System.out.println("main中的count："+ count);
    }

    //这方法中的参数就是形参
    public static void update(int count){
        count++;
        System.out.println("update中的count："+ count);
    }
}