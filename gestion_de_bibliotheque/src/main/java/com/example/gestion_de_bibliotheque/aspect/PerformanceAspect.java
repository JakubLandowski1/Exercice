package com.example.gestion_de_bibliotheque.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceAspect {

    @Around("execution(* com.example.gestion_de_bibliotheque.service.BookService.*(..))")
    public Object performance(ProceedingJoinPoint joinPoint) throws Throwable {
        Long start = System.currentTimeMillis();
        try {
            return joinPoint.proceed(joinPoint.getArgs());
        } finally {
            Long end = System.currentTimeMillis();
            Long duree = end - start;
            System.out.println("1" + duree + "ms" );
        }

    }


}
