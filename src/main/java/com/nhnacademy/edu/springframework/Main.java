package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.service.MessageSendService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// 패키지명은 상위만 간단하게 써도 된다. MainConfig.class라고 써도 잘 동작함
		// 패키지 이름을 시작하는 하위 패키지들을 다 검색함
		// -> 시간이 오래 걸릴 수 있다.
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.nhnacademy.edu.springframework");
		User user = new User("email@naver.com", "010-xxxx-xxxx");
		MessageSendService service = context.getBean("messageSendService", MessageSendService.class);
		service.doSendMessage(user, "hi");
	}
}
