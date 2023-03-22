package com.example.assemble.repository.board;

import com.example.assemble.domain.Board.BoardVO;
import com.example.assemble.mapper.board.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardDAO {
    private final BoardMapper boardMapper;
    // 개수
    public Integer countBoard(){return boardMapper.countBoard();}
    // 목록
    public List<BoardVO> boardAll(){return boardMapper.selectAll();}
    // 추가
    public void add(BoardVO boardVO){boardMapper.insert(boardVO);}
    // 삭제
    public void remove(Long boardId){boardMapper.delete(boardId);}
    // 조회
    public BoardVO findById(Long boardId){return boardMapper.select(boardId);}
    // 수정
    public void update(BoardVO boardVO){boardMapper.update(boardVO);}
    // 조회수
    public void updateBoardView(Long boardId){boardMapper.updateView(boardId);}
}
