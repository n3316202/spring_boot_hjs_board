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
@RequestMapping("/rboard/*")
@RestController
public class RestBoardController {

	@Autowired
	private BoardService boardService;


	@GetMapping("/list")
	public List<BoardVO> list(Model model) {
		
		log.info("list()...");
		return boardService.getList();		
	}
	
}
