package com.example.assemble.mapper;

import com.example.assemble.domain.BoardVO;
import com.example.assemble.domain.NoticeVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    // 게시글 목록
    public List<BoardVO> selectAll();
    // 게시글 추가
    public void insert(BoardVO boardVO);
    // 게시글 삭제
    public void delete(Long boardId);
    // 게시글 조회
    public NoticeVO select(Long BoardId);
    // 게시글 수정
    public void update(BoardVO boardVO);
}
