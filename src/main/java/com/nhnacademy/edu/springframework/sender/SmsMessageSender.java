package com.nhnacademy.edu.springframework.sender;

import com.nhnacademy.edu.springframework.domain.User;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class SmsMessageSender implements MessageSender {
	public SmsMessageSender(){
	}

	@Override
	public boolean sendMessage(User user, String message) {
		System.out.println("SMS message Sender : " + user.getPhoneNumber() + ", message : "  + message);
		return true;
	}
}
