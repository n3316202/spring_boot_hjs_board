package edu.kosmo.hjs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.kosmo.hjs.service.MemberService;
import edu.kosmo.hjs.vo.MemberVO;
import edu.kosmo.hjs.vo.ResponseVO;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@CrossOrigin
@RequestMapping("/member/*")
@RestController
public class RestMemberController {

	@Autowired
	private MemberService memberService;
	

	@PostMapping(path = "/register",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseVO> register(MemberVO memberVO) {
		log.info("register..");
		
		ResponseEntity<ResponseVO> entity = null;

		
		try {
				int rn = memberService.writeMember(memberVO) ;
				log.info("insert후 넘어온 숫자:::::" + rn);
			    entity = new ResponseEntity<ResponseVO>(new ResponseVO("SUCCESS",String.valueOf(rn)), HttpStatus.OK);
			
		} catch (Exception e) {
			e.printStackTrace();
			// 댓글 삭제가 실패하면 실패 상태메시지 저장
			entity = new ResponseEntity<ResponseVO>(new ResponseVO(e.toString(),String.valueOf(HttpStatus.BAD_REQUEST)), HttpStatus.BAD_REQUEST);
		}
		// 삭제 처리 HTTP 상태 메시지 리턴
		return entity;

	}

	
}
