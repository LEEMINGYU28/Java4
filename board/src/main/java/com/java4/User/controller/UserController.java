package com.java4.User.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java4.User.domain.User;
import com.java4.User.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/join")
	public String join(@RequestParam Map<String, String> data) {
		userService.add(new User(data.get("userId"), data.get("password"), data.get("name"), data.get("phone"),
				data.get("address"), data.get("email"), data.get("gitAddress")));

		return "redirect:/login";
	}

	@GetMapping("/login")
	public String loginPage() {
		return "/user/login";
	}

	@PostMapping("/logins")
	public String login(@RequestParam Map<String, String> data, HttpSession session, Model model) {
		User user = new User();
		user.setUserId(data.get("userId"));
		user.setPassword(data.get("password"));

		user = userService.logins(user);
		if (user != null) {
			session.setAttribute("userId", user.getUserId());
			session.setAttribute("userName", user.getName());
			System.out.println(user.getName());
			System.out.println("로그인 성공");
			return "redirect:/login";
		} else {
			model.addAttribute("error", "아이디 또는 비밀번호가 잘못되었습니다.");
			System.out.println("로그인 실패");
			return "redirect:/login";
		}
	}

	@PostMapping("/logout")
	public String userLogOutPost(@RequestParam Map<String, String> map, HttpSession session) {

		session.setAttribute("userId", null);
		session.setAttribute("userName", null);
		System.out.println("로그아웃 성공");
		return "redirect:/login";
	}

}
