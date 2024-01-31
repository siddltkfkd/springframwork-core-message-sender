package com.nhnacademy.edu.springframework.aspect;

import com.nhnacademy.edu.springframework.domain.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {

	@Around("JavaPointCut.sendMessage() && !JavaPointCut.dooraySendMessage()")
	public Object sendMessage(ProceedingJoinPoint pjp) throws Throwable {
		StopWatch watch = new StopWatch(pjp.getTarget().getClass().getSimpleName().toString());
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

	@Around("JavaPointCut.dooraySendMessage()")
	public Object dooraySendMessage(ProceedingJoinPoint pjp) throws Throwable {
		StopWatch watch = new StopWatch(pjp.getTarget().getClass().getSimpleName().toString());
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
