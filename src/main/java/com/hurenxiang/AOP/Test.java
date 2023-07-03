package com.hurenxiang.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        TargetClass bean = context.getBean("targetClass",TargetClass.class);
        bean.executeMethod("参数1","参数2");
    }
}
