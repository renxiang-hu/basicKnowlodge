package com.hurenxiang.designModel.FactoryDemo.simpleFactoryDemo;


public class Test {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("RECTANGLE");
        circle.draw();
    }
}
