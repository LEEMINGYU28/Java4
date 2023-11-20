package com.java4.User.domain;

import java.util.Date;

import org.springframework.stereotype.Controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Controller
public class User {

	private int id;
	
	@NonNull
	private String userId;
	@NonNull
	private String password;
	@NonNull
	private String name;
	@NonNull
	private String phone;
	@NonNull
	private String address;
	@NonNull
	private String email;
	@NonNull
	private String gitAddress;
	
	private boolean gender;
	private Date createdAt;
	private Date birth;
	
	
	public User() {
		
	}
		
}
