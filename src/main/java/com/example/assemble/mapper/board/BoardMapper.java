package com.example.assemble.mapper.board;

import com.example.assemble.domain.Board.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    // 게시글 목록
    public List<BoardVO> selectAll(int page);
    // 게시글 추가
    public void insert(BoardVO boardVO);
    // 게시글 삭제
    public void delete(Long boardId);
    // 게시글 조회
    public BoardVO select(Long BoardId);
    // 게시글 수정
    public void update(BoardVO boardVO);
    // 게시글 조회 수 증가
    public void updateView(Long BoardId);
}
