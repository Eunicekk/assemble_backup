package com.example.assemble.service.board;

import com.example.assemble.domain.Board.BoardVO;
import com.example.assemble.repository.board.BoardDAO;
import com.example.assemble.service.board.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Qualifier("board") @Primary
public class BoardServiceImpl implements BoardService {

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
        boardDAO.updateBoardView(boardId);
        return boardDAO.findById(boardId);
    }

    @Override
    public void updateBoard(BoardVO boardVO){
        boardDAO.update(boardVO);
    }

}
