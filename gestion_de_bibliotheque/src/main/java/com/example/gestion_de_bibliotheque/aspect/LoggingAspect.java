package com.example.gestion_de_bibliotheque.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;


@Component
@Aspect
public class LoggingAspect {

    @Around("execution(* com.example.gestion_de_bibliotheque.service.BookService.*(..))")

    public void createLog(ProceedingJoinPoint joinPoint){
        try {
            Object[] tab = joinPoint.getArgs();
            System.out.println(Arrays.toString(tab));
            Object result = joinPoint.proceed();
            System.out.println(result);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

}
