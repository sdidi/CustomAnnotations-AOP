package com.springboot.guest.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import com.springboot.guest.services.LogHereService;

@Aspect
@Component
public class MethodLoggerAspect {
    public static final Logger log = LoggerFactory.getLogger(MethodLoggerAspect.class);
    
   
    
    @Around("@annotation(com.springboot.guest.annotations.LogHere)")
    public Object LogMethodInvocation(ProceedingJoinPoint joinPoint) throws Throwable{
    	log.info("Before method invocation");
    	Object methodInvocationAlert = null;
    	try {
    	methodInvocationAlert = joinPoint.proceed();
    	} catch(Throwable e) {
    		log.info("Problem with joinPoint.proceed method call");
    	}
    	log.info("After  method invocation");
    	return methodInvocationAlert;
    }
    
}
