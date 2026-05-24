package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LonggingAspect {

    // advice
    @Before("execution(* com.example.demo.service.UserService.deleteUserById(..))")
    public void logBeforeDelete(JoinPoint joinPoint) {
        System.out.println("AOP LOG : to call function deleteUser");
        System.out.println("AOP LOG : " + joinPoint.getSignature().getName());
    }


    @Around("execution(* com.example.demo.service.*.*(..))")
    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable{
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - start;
        System.out.println("AOP LOG : " + joinPoint.getSignature().getName());
        System.out.println("AOP LOG : ms: " + timeTaken);
    }
}
