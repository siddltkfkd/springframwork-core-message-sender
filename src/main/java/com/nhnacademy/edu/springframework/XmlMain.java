package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import com.nhnacademy.edu.springframework.service.MessageSendService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")){
			User user = new User("email@naver.com", "010-xxxx-xxxx");
			MessageSendService service = context.getBean("messageSendService", MessageSendService.class);
//			service.doSendMessage(user, "hi");

//
//			System.out.println("---------");
//			MessageSender a1 = context.getBean("emailMessageSender", MessageSender.class);
//			a1.sendMessage(user, "안녕");
//
//			System.out.println("---------");
//			MessageSender a2 = context.getBean("emailMessageSender", MessageSender.class);
//			a2.sendMessage(user, "안녕");
//
//			System.out.println("---------");
//			MessageSender b1 = context.getBean("smsMessageSender", MessageSender.class);
//			b1.sendMessage(user, "안녕하세요");
//
//			System.out.println("---------");
//			MessageSender b2 = context.getBean("smsMessageSender", MessageSender.class);
//			b2.sendMessage(user, "안녕하세요");

//			System.out.println();
//			System.out.println(a1.hashCode());
//			System.out.println(a2.hashCode());
//			System.out.println();
//			System.out.println(b1.hashCode());
//			System.out.println(b2.hashCode());
		}
	}
}
