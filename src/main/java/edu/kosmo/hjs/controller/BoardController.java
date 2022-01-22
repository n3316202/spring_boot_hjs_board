package edu.kosmo.hjs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.kosmo.hjs.service.BoardService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/jboard/*")
public class BoardController {

	@Autowired
	private BoardService boardService;


	@GetMapping("/list")
	public String view_list(Model model) {

		log.info("list()...");
		model.addAttribute("list", boardService.getList());
		return "/board/list";
	}
	
	@GetMapping("/write_view")
	public String write_view() {

		log.info("write_view()...");
		
		return "/board/write_view";
	}
	
}
