package edu.kosmo.hjs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndView;

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
	
	@GetMapping("/{bid}")
	public BoardVO rest_content_view(BoardVO boardVO, ModelAndView mav) {

		log.info("rest_content_view");

		return boardService.get(boardVO.getBid());

	}
	
}
