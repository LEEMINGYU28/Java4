package com.java4s.jdbctest.board.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java4s.jdbctest.board.domain.Board;
import com.java4s.jdbctest.board.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	BoardService boardService;

	@GetMapping("/board")
	public String listPage() {
		return "boards/index";
	}

	@GetMapping("/board/thyme")
	public String listThymePage(Model model) {

		List<Board> list = boardService.getAll();
		model.addAttribute("list", list);
		model.addAttribute("test", "되나");
		model.addAttribute("tag", "<strong>되나요</strong>");
		return "boards/thyme/index";
	}

	@GetMapping("/board/add")
	public String addPage() {
		return "boards/add";
	}

	@ResponseBody
	@PostMapping("/board")
	public String list() {
		List<Board> list = boardService.getAll();
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < list.size(); ++i) {
			sb.append("{\"id\":" + list.get(i).getId() + ",");
			sb.append("\"user\":\"" + list.get(i).getUser() + "\",");
			sb.append("\"title\":\"" + list.get(i).getTitle() + "\",");
			sb.append("\"content\":\"" + list.get(i).getContent() + "\"}");
			if (i < list.size() - 1)
				sb.append(",");
		}
		sb.append("]");
		return sb.toString();
	}

	@PostMapping("/board/add")
	public String add(@RequestParam Map<String, String> data) {
		boardService.add(new Board(data.get("user"), data.get("title"), data.get("content")));

		return "redirect:/board";
	}

	@GetMapping("/board/item")
	public String itemPage() {
		return "boards/item";
	}

	@GetMapping("/board/edit")
	public String editPage() {
		return "boards/thyme/edit";
	}

	@PostMapping("/board/edit")
	public String edit(@PathVariable("id") int id, @RequestParam Map<String, String> data) {
		Board board = new Board(
				id,
				data.get("user"),
				data.get("title"),
				data.get("content"));
		boardService.updateBoard(board);
		return "redirect:/board";
	}

	@PostMapping("/board/item")
	@ResponseBody
	public String get(@RequestBody Map<String, String> data) {
		Board board = boardService.get(Integer.parseInt(data.get("id")));
		StringBuilder sb = new StringBuilder();

		sb.append("{\"id\":" + board.getId() + ",");
		sb.append("\"user\":\"" + board.getUser() + "\",");
		sb.append("\"title\":\"" + board.getTitle() + "\",");
		sb.append("\"content\":\"" + board.getContent() + "\"}");

		return sb.toString();
	}
}