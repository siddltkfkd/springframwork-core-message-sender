package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.config.JavaConfig;
import com.nhnacademy.edu.springframework.service.MessageSendService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		MessageSendService service = context.getBean("messageSendService", MessageSendService.class);
		service.doSendMessage("name", "hi");

	}
}
