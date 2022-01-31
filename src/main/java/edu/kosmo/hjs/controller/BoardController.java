package edu.kosmo.hjs.controller;

import javax.servlet.http.HttpServletRequest;

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
	
	@GetMapping("/content_view")
	public String content_view(HttpServletRequest request, Model model) throws Exception{
		System.out.println("content_view()");

		String bid = request.getParameter("bid");		
		model.addAttribute("content_view", boardService.get(Integer.valueOf(bid)));
		
		return "/board/content_view";
	}
	
}
