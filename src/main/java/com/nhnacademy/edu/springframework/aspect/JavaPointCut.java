package com.nhnacademy.edu.springframework.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class JavaPointCut {
	@Pointcut("execution(* com.nhnacademy.edu.springframework.sender.*.sendMessage(..))")
	public void sendMessage(){};
	@Pointcut("execution(* com.nhnacademy.edu.springframework.sender.DoorayMessageSender.sendMessage(..))")
	public void dooraySendMessage(){};
	@Pointcut("args(com.nhnacademy.edu.springframework.domain.User, String)")
	public void sendMessageArgs(){};
}
