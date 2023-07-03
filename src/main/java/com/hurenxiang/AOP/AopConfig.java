package com.hurenxiang.AOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.hurenxiang")
@EnableAspectJAutoProxy
public class AopConfig {
}
