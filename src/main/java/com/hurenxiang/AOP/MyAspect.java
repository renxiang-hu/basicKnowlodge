package com.hurenxiang.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Pointcut("execution(* com.hurenxiang.AOP.TargetClass.*(..))")
    public void point(){}

    @Before("point()")
    public void before(JoinPoint joinPoint){
        System.out.println(2+"==>@Before");
    }

    @Around("point()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println(1+"==>@Around 方法执行前");
        proceedingJoinPoint.proceed();
        System.out.println(5+"==>@Around 方法执行后");
    }

    @AfterReturning(value = "point()" , returning = "obj")
    public void afterReturning(Object obj){
        System.out.println(3+"==>@AfterReturning");
        System.out.println("3后置通知中拿到返回值："+obj);
    }

    @After("point()")
    public void after(){
        System.out.println(4+"==>@After");
    }

    @AfterThrowing("point()")
    public void afterThrowing(){
        System.out.println("抛出异常后"+"==>@AfterThrowing");
    }
}
