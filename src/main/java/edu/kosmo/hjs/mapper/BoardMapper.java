package edu.kosmo.hjs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.kosmo.hjs.vo.BoardVO;

@Mapper
public interface BoardMapper {
	public List<BoardVO> getList();
	public int boardCount();
}
