package com.nhnacademy.edu.springframework.service;

import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

// usecase를 담당 (메시지를 보낸다)
public class MessageSendService {
	private MessageSender messageSender;
	@Value("${phone}")
	private String phoneNumber;

	public void setMessageSender(MessageSender messageSender) {
		System.out.println("set messageSender invoked");
		this.messageSender = messageSender;
	}

	public void doSendMessage(User user, String message){
		user.setPhoneNumber(phoneNumber);
		messageSender.sendMessage(user, message);
	}


}
