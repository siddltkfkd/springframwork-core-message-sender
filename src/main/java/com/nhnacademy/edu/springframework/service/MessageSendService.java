package com.nhnacademy.edu.springframework.service;

import com.nhnacademy.edu.springframework.annotation.SMS;
import com.nhnacademy.edu.springframework.domain.SendType;
import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;

// usecase를 담당 (메시지를 보낸다)
public class MessageSendService {
	private MessageSender messageSender;

	public MessageSendService(){}
	@Autowired
	public void setMessageSender(@SMS(sendtype = SendType.SMS) MessageSender messageSender) {
		System.out.println("set messageSender invoked");
		this.messageSender = messageSender;
	}

	public void doSendMessage(User user, String message){
		messageSender.sendMessage(user, message);
	}


}
