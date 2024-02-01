package com.nhnacademy.edu.springframework.domain;

import java.io.Serializable;

public class User implements Serializable{
	private String email;
	private String phoneNumber;
	public User(String email, String phoneNumber){
		this.email = email;
		this.phoneNumber = phoneNumber;
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
	public String toString() {
		return "User{" +
				"email='" + email + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				'}';
	}
}
