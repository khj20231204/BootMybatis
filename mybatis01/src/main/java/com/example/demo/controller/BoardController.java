package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Board;
import com.example.demo.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService service;
	
	@RequestMapping("/boardform")
	public String main() {
		return "boardform";
	}
	
	@RequestMapping("/boardInsert")
	public String boardInsert(@ModelAttribute Board board) {
		int result = service.insert(board);
		if(result == 1) System.out.println("글작성 성공");
		return "";
	}
}
