package com.java4.User.controller;

import java.sql.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java4.User.domain.User;
import com.java4.User.service.UserService;

import jakarta.servlet.http.HttpSession;
import oracle.jdbc.proxy.annotation.Post;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("regist")
	public String regist(Model model) {
		model.addAttribute("title","회원가입");
		model.addAttribute("path","/user/regist");
		model.addAttribute("content","registFragment");
		model.addAttribute("contentHead","registFragmentHead");
		return "basic/layout";
	}
	
	@PostMapping("regist")
	public String registPost(@RequestParam Map<String,String> map,Model model) {
		try {
			User tempUser = new User(
					map.get("userId"),
					map.get("password"),
					map.get("name"),
					map.get("phone"),
					map.get("email"));
			if(map.get("adress") != null) {
				tempUser.setAddress(map.get("adress"));
			}
			if (map.get("git-address") != "") {
				tempUser.setGitAddress(map.get("git-address"));
			}
			if(map.get("gender") != null) {
				tempUser.setGender(Integer.parseInt(map.get("gender")));
			}
			if(map.get("birth") != "") {
				tempUser.setBirth(Date.valueOf(map.get("birth")));
			}
			userService.add(tempUser);
			
			return  "redirect:/";
		}catch(Exception e) {
			e.printStackTrace();
			model.addAttribute("requestError","회원가입 실패");
			return  "redirect:/user/regist";
		}
	
	}
	
	
	
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.removeAttribute("userName");
		return "redirect:/";
		
	}
	
	@PostMapping("/join")
	public String join(@RequestParam Map<String, String> data) {
		userService.add(new User(
				data.get("userId"),
				data.get("password"),
				data.get("name"),
//				data.get("phone"),
				data.get("address"),
				data.get("email")));
//				data.get("gitAddress")));

		return "redirect:/login";
	}


	@PostMapping("/login")
	public String login(@RequestParam Map<String, String> map, HttpSession session, Model model) {
		User tempUser = new User();
		tempUser.setUserId(map.get("userId"));
		tempUser.setPassword(map.get("password"));
		tempUser = userService.login(tempUser);

		if (tempUser != null) {
			session.setAttribute("userName", tempUser.getName());
			session.setAttribute("userId", tempUser.getId());
		}
		return "redirect:/";
	}

	@PostMapping("/logout")
	public String userLogOutPost(@RequestParam Map<String, String> map, HttpSession session) {

		session.removeAttribute("userId");
		session.removeAttribute("userName");
		System.out.println("로그아웃 성공");
		return "redirect:/login";
	}

}
