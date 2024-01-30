package com.nhnacademy.edu.springframework.config;

import com.nhnacademy.edu.springframework.sender.MessageSender;
import com.nhnacademy.edu.springframework.service.MessageSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:/beans.xml")
public class ServiceConfig {
	@Autowired
	private SenderConfig senderConfig;
	@Bean
	public MessageSendService messageSendService(){
		return new MessageSendService(senderConfig.smsMessageSender());
	}
}
