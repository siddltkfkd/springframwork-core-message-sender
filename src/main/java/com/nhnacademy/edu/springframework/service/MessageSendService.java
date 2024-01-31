package com.nhnacademy.edu.springframework.service;

import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// usecase를 담당 (메시지를 보낸다)
@Service
// 클라이언트 : MessageSendService(클래스)
public class MessageSendService {
	private MessageSender messageSender;
	@Value("${phoneNumber}")
	private String phoneNumber;
	@Value("${email}")
	private String email;

	public MessageSendService(){}

	public MessageSendService(MessageSender messageSender){
		this.messageSender = messageSender;
	}

	public void setMessageSender(MessageSender messageSender){
		this.messageSender = messageSender;
	}

	public void doSendMessage(User user, String message){
		user.setPhoneNumber(phoneNumber);
		user.setEmail(email);
		//서버, 타겟 : messageSender
		messageSender.sendMessage(user, message);
	}
}
