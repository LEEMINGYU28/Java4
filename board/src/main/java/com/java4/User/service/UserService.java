package com.java4.User.service;

import java.security.MessageDigest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.java4.User.dao.UserDAO;
import com.java4.User.domain.User;


@Service
public class UserService {
	
	@Autowired
	private UserDAO userDao;
	
	public void add(User user) {
		user.setPassword(cryptoPassword(user.getPassword()));
		userDao.add(user);
	}
	public User logins(User user) {
		try {
			User tempUser = userDao.get(user.getUserId());
			if (tempUser != null && tempUser.getPassword().equals(cryptoPassword(user.getPassword()))) {
				return tempUser;
			} else {
				return null;
			}
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}
	private String cryptoPassword(String password) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(password.getBytes());
			byte[] sha256Hash = md.digest();
			StringBuilder sb = new StringBuilder();
			for (byte b : sha256Hash) {
				sb.append(String.format("%02x", b));
			}
			return sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public User login(User user) {
		User tempUser = userDao.get(user.getUserId());
		if(tempUser != null && tempUser.getPassword().equals(cryptoPassword(user.getPassword()))) {	
			return tempUser;
		}
		return null;
	}
}
