package com.hurenxiang.basicKnowlodge;

public class ValueTransferTest {
    public static void main(String[] args) {
        User user = new User();
        user.setName("hurenxiang");
        changeVal(user);
        System.out.println("main方法里面的user"+ user);
    }

    public static void changeVal(User user){
        user = new User();
        user.setName("superman");
        System.out.println("chanVal方法里面的user"+ user);
    }
}
