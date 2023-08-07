package com.hurenxiang.Bean.lifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class User implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public User(){
        System.out.println("User构造方法执行了......");
    }

    private String name;

    @Value("张三")
    public void setName(){
        System.out.println("setName方法执行了......");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory方法执行了......");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName方法执行了.......");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext方法执行了......");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet方法执行了......");
    }

    @PostConstruct
    public void init(){
        System.out.println("init方法执行了......");
    }

    @PreDestroy
    public void destory(){
        System.out.println("destory方法执行了......");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("des.....");
    }
}
