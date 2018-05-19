package com.imooc.springbootdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HttpAspect {
//    @Pointcut(value = "execution(public * com.imooc.springbootdemo.controller.ManController.manList(..))")
//    public void log() {
//        System.out.println(111111);
//    }

    // 这里配置了只拦截manList方法，如果要拦截ManController中全部的方法，那么要这样写
    //@Before(value = "execution(public * com.imooc.springbootdemo.controller.ManController.*(..))")
    @Before(value = "execution(public * com.imooc.springbootdemo.controller.ManController.manList(..))")
    public void log() {
        System.out.println("切面类");
    }
}
