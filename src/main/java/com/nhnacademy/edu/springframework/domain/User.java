package com.nhnacademy.edu.springframework.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class User {
	private String email;
	@Value("${phone}")
	private String phoneNumber;

	public User(String email){
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString(){
		return "User { email : " + email + ", phoneNumber : " + phoneNumber + " }";
	}
}
