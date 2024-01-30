package com.nhnacademy.edu.springframework.domain;

// user는 bean이 아니라서 여기에 어노테이션을 붙여도 적용이 안된다.
public class User {
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
	public String toString(){
		return "User { email : " + email + ", phoneNumber : " + phoneNumber + " }";
	}
}
