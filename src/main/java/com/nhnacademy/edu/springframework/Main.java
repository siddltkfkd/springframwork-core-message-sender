package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.service.MessageSendService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")){
			User user = new User("email@naver.com", "010-1234-1234");
			System.out.println(user.toString());

			MessageSendService service = context.getBean("messageSendService", MessageSendService.class);
			service.doSendMessage(user, "message");
		}
	}
}
