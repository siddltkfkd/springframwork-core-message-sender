package com.nhnacademy.edu.springframework.service;

import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// usecase를 담당 (메시지를 보낸다)
@Service
public class MessageSendService {
	@Autowired
	private MessageSender messageSender;

	public MessageSendService(){}

	public void doSendMessage(User user, String message){
		messageSender.sendMessage(user, message);
	}
}
