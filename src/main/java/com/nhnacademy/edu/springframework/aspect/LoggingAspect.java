package com.nhnacademy.edu.springframework.aspect;

import com.nhnacademy.edu.springframework.domain.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class LoggingAspect {
	@Value("${hookUrl}")
	String hookUrl;
	@Value("${name}")
	private String name;
	@Value("${phoneNumber}")
	private String phoneNumber;
	@Value("${email}")
	private String email;

	@Around(value = "JavaPointCut.sendMessage() && args(user, message) && !JavaPointCut.dooraySendMessage()")
	public Object sendMessage(ProceedingJoinPoint pjp, User user, String message) throws Throwable {
		StopWatch watch = new StopWatch(pjp.getTarget().getClass().getSimpleName().toString());
		watch.start();
		try{
			System.out.println(user.toString());
			user.setEmail(email);
			user.setPhoneNumber(phoneNumber);
			System.out.println(user.toString());
			return pjp.proceed(new Object[] {user, message});
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
			System.out.println(pjp.getTarget().getClass().getSimpleName() + "." + pjp.getSignature().getName() + " " + watch.getTotalTimeMillis() + "ms");
		}
	}


}
