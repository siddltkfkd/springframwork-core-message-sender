package com.nhnacademy.edu.springframework.sender;

import com.nhn.dooray.client.DoorayHookSender;
import com.nhnacademy.edu.springframework.service.MessageSendService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class DoorayMessageSenderTest {
	@InjectMocks
	private MessageSendService messageSendService;
	@Mock
	private DoorayHookSender doorayHookSender;

	@BeforeEach
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void testDoorayMessageSender() {
		when(doorayHookSender)
	}
}
