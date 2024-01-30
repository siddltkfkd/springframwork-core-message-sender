package com.nhnacademy.edu.springframework.config;

import com.nhnacademy.edu.springframework.sender.EmailMessageSender;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import com.nhnacademy.edu.springframework.sender.SmsMessageSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:/beans.xml")
public class MainConfig {
	@Bean("smsMessageSender")
	public MessageSender smsMessageSender() {
		return new SmsMessageSender();
	}
	@Bean("emailMessageSender")
	public MessageSender emailMessage() {
		return new EmailMessageSender();
	}
}
