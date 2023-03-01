package com.example.assemble.service;

import com.example.assemble.domain.BoardVO;

import java.util.List;

public interface BoardService {
    // 게시글 목록
    public List<BoardVO> getList(int page);
    // 게시글 추가
    public void add(BoardVO boardVO);
    // 게시글 삭제
    public void delete(Long boardId);
    // 게시글 조회
    public BoardVO getBoard(Long boardId);
    // 게시글 수정
    public void updateBoard(BoardVO boardVO);
}
