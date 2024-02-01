package com.nhnacademy.edu.springframework.sender;

import com.nhn.dooray.client.DoorayHook;
import com.nhn.dooray.client.DoorayHookSender;
import com.nhnacademy.edu.springframework.annotation.Dooray;
import com.nhnacademy.edu.springframework.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"dooray", "default"})
public class DoorayMessageSender implements MessageSender{
	@Autowired
	DoorayHookSender doorayHookSender;
	@Value("${name}")
	private String name;
	@Value("${message}")
	private String message;

	public DoorayMessageSender(){}
	@Override
	@Dooray
	public boolean sendMessage(User user, String message) {
		doorayHookSender
				.send(DoorayHook.builder()
						.botName(name)
						.text(this.message)
						.build());
		return true;
	}
}
