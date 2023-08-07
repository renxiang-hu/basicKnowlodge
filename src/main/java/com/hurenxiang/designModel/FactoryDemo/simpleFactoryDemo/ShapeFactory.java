package com.hurenxiang.designModel.FactoryDemo.simpleFactoryDemo;

import org.springframework.util.StringUtils;

import java.util.ArrayList;

public class ShapeFactory {
    public static Shape getShape(String type){
       if (StringUtils.isEmpty(type)) {
           return null;
       }
       if (type.equalsIgnoreCase("CIRCLE")) {
           return new Circle();
       } else if (type.equalsIgnoreCase("RECTANGLE")) {
           return new Rectangle();
       }
       return null;
    }
}
