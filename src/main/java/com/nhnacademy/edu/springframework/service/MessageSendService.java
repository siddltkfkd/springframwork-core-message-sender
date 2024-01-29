package com.nhnacademy.edu.springframework.service;

import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.sender.MessageSender;

// usecase를 담당 (메시지를 보낸다)
public class MessageSendService {
	private MessageSender messageSender;

	public MessageSendService(){}

//	public MessageSendService(MessageSender messageSender){
//		this.messageSender = messageSender;
//	}
//
	public void doSendMessage(User user, String message){
		messageSender.sendMessage(user, message);
	}

	public void setMessageSender(MessageSender messageSender) {
		System.out.println("set messageSender invoked");
		this.messageSender = messageSender;
	}
}
