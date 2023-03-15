package com.example.assemble.repository.board;

import com.example.assemble.domain.Board.BoardVO;
import com.example.assemble.domain.Board.CommentVO;
import com.example.assemble.mapper.board.CommentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CommentDAO {
    private final CommentMapper commentMapper;
    // 목록
    public List<CommentVO> commentAll(Long boardId){return commentMapper.selectComment(boardId);}
    // 추가
    public void add(CommentVO commentVO){commentMapper.insert(commentVO);}
    // 삭제
    public void remove(Long commentId){commentMapper.delete(commentId);}
    // 수정
    public void update(CommentVO commentVO){commentMapper.update(commentVO);}
}
