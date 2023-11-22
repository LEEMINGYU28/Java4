package com.java4.board.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java4.User.dao.UserDAO;
import com.java4.User.domain.User;
import com.java4.User.service.UserService;
import com.java4.board.domain.Board;
import com.java4.board.service.BoardService;

import jakarta.servlet.http.HttpSession;

@Controller
public class BoardController {
	
		@Autowired
		BoardService boardService;
	
		@Autowired
		UserDAO userDao;
		@Autowired
		UserService userService;
		
		
		@GetMapping("/")
		public String boardMain(Model model) {
			model.addAttribute("title","게시판");
			model.addAttribute("path","/board/index");
			model.addAttribute("content","boardFragment");
			model.addAttribute("contentHead","boardFragmentHead");
			model.addAttribute("list",boardService.getAll());
		
			return "/basic/layout";
		}
		
		@PostMapping("/add")
		public String add(@RequestParam Map<String,String> map, HttpSession session) {
			System.out.println("요청");
			String userId = (String) session.getAttribute("userId");
			System.out.println(userId);
			if (userId == null) {

				return "redirect:/";
			}
			
			String title = map.get("title");
			String content = map.get("content");
			System.out.println(title);
			System.out.println(content);
			User user = userDao.get(userId);
			
			System.out.println("userId = " + userDao.get(userId));
			if (user == null) {
				System.out.println("정보가 없습니다.");
			}
			System.out.println("user = " + user);
			if (user != null) {

				Board board = new Board(user, title, content);
				System.out.println(board);
				boardService.add(board, board.getUserId());
				System.out.println(board.getUserId());
				}
			return "redirect:/";
		}

		
		@GetMapping("/notice")
		public String noticePage(Model model) {
			model.addAttribute("title","공지사항");
			model.addAttribute("path","/board/notice");
			model.addAttribute("content","noticeFragment");
			model.addAttribute("contentHead","noticeFragmentHead");
			return "/basic/layout";
		}
		

}
