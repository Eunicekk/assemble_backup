package com.example.assemble.service.board;

import com.example.assemble.domain.Board.CommentVO;

import java.util.List;

public interface CommentService {
    // 목록
    public List<CommentVO> getComment(Long boardId);
    // 추가
    public void add(CommentVO commentVO);
    // 삭제
    public void delete(Long commentId);
    // 수정
    public void update(CommentVO commentVO);
}
