package com.hurenxiang.Bean.Test;

import com.hurenxiang.Bean.config.SpringConfig;
import com.hurenxiang.Bean.lifeCycle.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        User bean = applicationContext.getBean(User.class);
        System.out.println(bean);
    }
}
