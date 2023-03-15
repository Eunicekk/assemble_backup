package com.example.assemble.mapper.board;

import com.example.assemble.domain.Board.BoardVO;
import com.example.assemble.domain.Board.CommentVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    // 댓글 목록
    public List<CommentVO> selectComment(Long boardId);
    // 댓글 추가
    public void insert(CommentVO commentVO);
    // 댓글 삭제
    public void delete(Long commentId);
    // 댓글 수정
    public void update(CommentVO commentVO);
    // 댓글 개수
    // public int commentCount(Long boardId);
}
