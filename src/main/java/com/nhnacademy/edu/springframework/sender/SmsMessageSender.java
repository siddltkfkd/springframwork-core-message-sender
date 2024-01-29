package com.nhnacademy.edu.springframework.sender;

import com.nhnacademy.edu.springframework.domain.User;

public class SmsMessageSender implements MessageSender {
	public SmsMessageSender(){
		System.out.println("created "+ this.getClass().getSimpleName());
	}
	@Override
	public void sendMessage(User user, String message) {
		System.out.println("SMS message Sender : " + user.getPhoneNumber() + ", message : "  + message);
	}
	private void init(){
		System.out.println("init " + this.getClass().getSimpleName());
	}

	private void destroy(){
		System.out.println("destroy " + this.getClass().getSimpleName());
	}
}
