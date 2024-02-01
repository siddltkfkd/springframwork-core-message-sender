package com.nhnacademy.edu.springframework.config;

import com.nhn.dooray.client.DoorayHookSender;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.web.client.RestTemplate;


@Configuration
@ComponentScan(basePackages = "com.nhnacademy.edu.springframework")
@PropertySource(value = {"classpath:user.properties"}, encoding = "UTF-8")
@EnableAspectJAutoProxy
public class JavaConfig {
	private final RestTemplate restTemplate = new RestTemplate();
	@Value("${hookUrl}")
	private String url;
	@Bean
	public DoorayHookSender doorayHookSender(){
		return new DoorayHookSender(restTemplate, url);
	}
}
