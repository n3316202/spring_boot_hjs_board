package edu.kosmo.hjs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.kosmo.hjs.service.BoardService;
import edu.kosmo.hjs.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/board/*")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	/*
	 * @GetMapping("/board/list") public String list(Model model) {
	 * 
	 * log.info("list()..."); model.addAttribute("list", boardService.getList());
	 * return "list"; }
	 */

	@GetMapping("/list")
	public List<BoardVO> list(Model model) {
		log.info("/board/list");
		return boardService.getList();
	}
	
	@GetMapping("/list")
	public String view_list(Model model) {

		log.debug("list()...");
		log.info("list()...");
		model.addAttribute("list", boardService.getList());
		return "list";
	}
	

}
