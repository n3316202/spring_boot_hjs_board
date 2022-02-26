package edu.kosmo.hjs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import edu.kosmo.hjs.page.Criteria;
import edu.kosmo.hjs.vo.BoardVO;
import edu.kosmo.hjs.vo.MemberVO;

@Mapper
public interface MemberMapper {

	@Insert("INSERT INTO member (enabled, name, username, password) VALUES (#{enabled}, #{name}, #{username}, #{password})")
	public int insertMember(MemberVO memberVO );	
}
