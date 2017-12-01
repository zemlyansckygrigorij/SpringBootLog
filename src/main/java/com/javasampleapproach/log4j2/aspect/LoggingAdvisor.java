package com.javasampleapproach.log4j2.aspect;

import com.javasampleapproach.log4j2.logging.Auditing;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sun.util.logging.resources.logging;

import java.util.Arrays;

/**
 * Logging Advisor.
 */
@Aspect
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class LoggingAdvisor {

    private final Auditing auditing;

   /// @Before("com.javasampleapproach.log4j2.controller.aspect.LoggingPointcut.logService()")
    @Before("com.javasampleapproach.log4j2.aspect.LoggingPointcut.logService()")
//@Pointcut("execution(public * com.javasampleapproach.log4j2.controller.service..*(..))")
    public void serviceLogBeforeAdvice(final JoinPoint joinPoint) {
        auditing.logService(joinPoint.getSignature().getDeclaringTypeName(),
                joinPoint.getSignature().getName(),
                Arrays.toString(joinPoint.getArgs()));
    }
}