package com.example.assemble.repository;

import com.example.assemble.domain.BoardVO;
import com.example.assemble.domain.NoticeVO;
import com.example.assemble.mapper.BoardMapper;
import com.example.assemble.mapper.NoticeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardDAO {
    private final BoardMapper boardMapper;
    // 목록
    public List<BoardVO> boardAll(int page){return boardMapper.selectAll(page);}
    // 추가
    public void add(BoardVO boardVO){boardMapper.insert(boardVO);}
    // 삭제
    public void remove(Long boardId){boardMapper.delete(boardId);}
    // 조회
    public BoardVO findById(Long boardId){return boardMapper.select(boardId);}
    // 수정
    public void update(BoardVO boardVO){boardMapper.update(boardVO);}
}
