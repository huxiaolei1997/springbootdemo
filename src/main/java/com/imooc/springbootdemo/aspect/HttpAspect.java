package com.imooc.springbootdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class HttpAspect {
//    @Pointcut(value = "execution(public * com.imooc.springbootdemo.controller.ManController.manList(..))")
//    public void log() {
//        System.out.println(111111);
//    }
    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    // 这里配置了只拦截manList方法，如果要拦截ManController中全部的方法，那么要这样写
    //@Before(value = "execution(public * com.imooc.springbootdemo.controller.ManController.*(..))")
    @Pointcut(value = "execution(public * com.imooc.springbootdemo.controller.ManController.*(..))")
    public void log() {
        //System.out.println("切面类");
    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        //System.out.println(111111);
        logger.info("doBefore");
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        // URL
        logger.info("url={}", request.getRequestURL());
        // method
        logger.info("method={}", request.getMethod());
        // ip
        logger.info("ip={}", request.getRemoteAddr());
        // 类方法
        logger.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        // 参数
        logger.info("args={}", joinPoint.getArgs());
    }

    @After("log()")
    public void doAfter() {
        //System.out.println(222222);
        logger.info("doAfter");
    }

    @AfterReturning(returning = "object", pointcut = "log()")
    public void doAfterReturning(Object object) {
        logger.info("response={}", object.toString());
    }
}
