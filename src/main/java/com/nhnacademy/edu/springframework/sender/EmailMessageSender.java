package com.nhnacademy.edu.springframework.sender;

import com.nhnacademy.edu.springframework.domain.User;
import org.springframework.stereotype.Component;

@Component
public class EmailMessageSender implements MessageSender {
	public EmailMessageSender(){
		System.out.println("created "+ this.getClass().getSimpleName());
	}
	@Override
	public void sendMessage(User user, String message) {
		System.out.println("Email message Sender : " + user.getEmail() + ", message : " + message);
	}

	private void init(){
		System.out.println("init " + this.getClass().getSimpleName());
	}

	private void destroy(){
		System.out.println("destroy " + this.getClass().getSimpleName());
	}
}
