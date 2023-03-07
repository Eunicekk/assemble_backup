package com.example.assemble.service;

import com.example.assemble.domain.BoardVO;
import com.example.assemble.domain.NoticeVO;
import com.example.assemble.repository.BoardDAO;
import com.example.assemble.repository.NoticeDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Qualifier("board") @Primary
public class BoardServiceImpl implements BoardService{

    private final BoardDAO boardDAO;

    @Override
    public List<BoardVO> getList(int page) {
        return boardDAO.boardAll(page);
    }

    @Override
    public void add(BoardVO boardVO) {
        boardDAO.add(boardVO);
    }

    @Override
    public void delete(Long boardId) {
        boardDAO.remove(boardId);
    }

    @Override
    public BoardVO getBoard(Long boardId) {
        return boardDAO.findById(boardId);
    }

    @Override
    public void updateBoard(BoardVO boardVO){
        boardDAO.update(boardVO);
    }

}
