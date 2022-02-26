package edu.kosmo.hjs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.kosmo.hjs.mapper.MemberMapper;
import edu.kosmo.hjs.page.Criteria;
import edu.kosmo.hjs.vo.BoardVO;
import edu.kosmo.hjs.vo.MemberVO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@AllArgsConstructor
@NoArgsConstructor
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper mapper;


	@Override
	public int writeMember(MemberVO member) {
		
		log.info("writeMember..........");
		return mapper.insertMember(member);
		
	}

}
