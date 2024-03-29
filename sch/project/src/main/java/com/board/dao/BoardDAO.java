package com.board.dao;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardDAO {

	// 게시물 목록
	public List<BoardVO> list() throws Exception;

	// 게시물 작성
	public void write(BoardVO vo) throws Exception;

	//게시물 조회
	public BoardVO view(int id) throws Exception;
	
	// 게시물 수정
	public void modify(BoardVO vo) throws Exception;

	// 게시물 삭제
	public void delete(int id) throws Exception;

	// 게시물 총 갯수 + 페이징
	public int count() throws Exception;

	// 게시물 목록 + 페이징 (게시물을 10개씩 출력하는 쿼리)
	public List<BoardVO> listPage(int displayPost, int postNum) throws Exception;
	
	// 게시물 목록 + 페이징 + 검색
	 public List<BoardVO> listPageSearch(
	   int displayPost, int postNum, String searchType, String keyword) throws Exception;
	
	// 게시물 총 갯수 + 검색 적용
	 public int searchCount(String searchType, String keyword) throws Exception;

}