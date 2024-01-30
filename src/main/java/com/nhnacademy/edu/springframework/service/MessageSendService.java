package com.nhnacademy.edu.springframework.service;

import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

// usecase를 담당 (메시지를 보낸다)
public class MessageSendService {
	private MessageSender messageSender;
	@Value("${phoneNumber}")
	private String phoneNumber;

	public MessageSendService(){}

	public MessageSendService(MessageSender messageSender){
		this.messageSender = messageSender;
	}

	public void doSendMessage(User user, String message){
		user.setPhoneNumber(phoneNumber);
		messageSender.sendMessage(user, message);
	}


}
