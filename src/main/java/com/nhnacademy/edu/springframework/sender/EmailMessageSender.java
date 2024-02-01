package com.nhnacademy.edu.springframework.sender;

import com.nhnacademy.edu.springframework.domain.User;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("real")
public class EmailMessageSender implements MessageSender {
	public EmailMessageSender(){
	}
	@Override
	public boolean sendMessage(User user, String message) {
		System.out.println("Email message Sender : " + user.getEmail() + ", message : " + message);
		return true;
	}
}
