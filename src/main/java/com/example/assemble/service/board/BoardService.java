package com.example.assemble.service.board;

import com.example.assemble.domain.Board.BoardVO;

import java.util.List;

public interface BoardService {
    // 공지글 개수
    public Integer countBoard();
    // 게시글 목록
    public List<BoardVO> getList();
    // 게시글 추가
    public void add(BoardVO boardVO);
    // 게시글 삭제
    public void delete(Long boardId);
    // 게시글 조회
    public BoardVO getBoard(Long boardId);
    // 게시글 수정
    public void updateBoard(BoardVO boardVO);
}
