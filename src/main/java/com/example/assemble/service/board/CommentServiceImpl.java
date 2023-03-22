package com.example.assemble.service.board;

import com.example.assemble.domain.Board.CommentVO;
import com.example.assemble.repository.board.CommentDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Qualifier("comment") @Primary
public class CommentServiceImpl implements CommentService{

    private final CommentDAO commentDAO;

    @Override
    public List<CommentVO> getComment(Long boardId){return commentDAO.commentAll(boardId);}

    @Override
    public void add(CommentVO commentVO){commentDAO.add(commentVO);}

    @Override
    public void delete(Long commentId){commentDAO.remove(commentId);}

    @Override
    public void update(CommentVO commentVO){commentDAO.update(commentVO);}


}
