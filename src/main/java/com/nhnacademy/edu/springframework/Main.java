package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.sender.EmailMessageSender;
import com.nhnacademy.edu.springframework.sender.SmsMessageSender;
import com.nhnacademy.edu.springframework.service.MessageSendService;

public class Main {
	public static void main(String[] args) {
		User user = new User("abc@naver.com", "010-1234-1234");
//		new MessageSendService(new SmsMessageSender()).doSendMessage(user, "밥먹자");
//		new MessageSendService(new EmailMessageSender()).doSendMessage(user, "뭐먹지?");
	}
}