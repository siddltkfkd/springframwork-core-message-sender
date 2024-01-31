package com.nhnacademy.edu.springframework.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class LoggingAspect {
	@Pointcut("execution(* com.nhnacademy.edu.springframework.sender.*.sendMessage(..))")
	private void sendMessage(){};
	@Pointcut("args(com.nhnacademy.edu.springframework.domain.User, String)")
	private void sendMessageArgs(){};
	@Around("sendMessage()")
	public Object advice(ProceedingJoinPoint pjp) throws Throwable {
		StopWatch watch = new StopWatch();
		watch.start();
		try{
			return pjp.proceed();
		} catch (RuntimeException e){
			System.out.println(e.getMessage());
			throw e;
		} finally {
			watch.stop();
			System.out.println(watch.prettyPrint());
		}
	}
}
