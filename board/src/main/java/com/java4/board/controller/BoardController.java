package com.java4.board.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java4.board.domain.Board;
import com.java4.board.service.BoardService;

import jakarta.servlet.http.HttpSession;

@Controller
public class BoardController {
	
		@Autowired
		BoardService boardService;
		
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
		public String add(@RequestParam Map<String, String> data, HttpSession session) {
			if(session.getAttribute("userName") != null) {
				boardService.add(new Board(data.get("title"), data.get("content"), Integer.parseInt(session.getAttribute("userId").toString())));
			}
			
			return "redirect:/";
		}
		
		@GetMapping("/{id}")
		public String view(Model model,@PathVariable("id")Integer id) {
			System.out.println("요청");
			System.out.println(id);
			 try {
			        Board board = boardService.get(id);
			        System.out.println(board);
			        model.addAttribute("list",boardService.getAll());
			    } catch (Exception e) {
			        e.printStackTrace();
			    }return "/board/view";
		}
		
//		@PostMapping("/add")
//		public String add(@RequestParam Map<String,String> map, HttpSession session) {
//			//
//			String userId = (String) session.getAttribute("userId");
//			if (userId == null) {
//
//				return "redirect:/";
//			}
//			
//			String title = map.get("title");
//			String content = map.get("content");
//
//			User user = userDao.get(userId);
//			
//			System.out.println("userId = " + userDao.get(userId));
//			if (user == null) {
//				
//			}
//			if (user != null) {
//
//				Board board = new Board(user, title, content);
//	
//				boardService.add(board, board.getUserId());
//				}
//			return "redirect:/";
//		}

		
		@GetMapping("/notice")
		public String noticePage(Model model) {
			model.addAttribute("title","공지사항");
			model.addAttribute("path","/board/notice");
			model.addAttribute("content","noticeFragment");
			model.addAttribute("contentHead","noticeFragmentHead");
			return "/basic/layout";
		}
		

}
