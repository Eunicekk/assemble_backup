package com.example.assemble.repository;

import com.example.assemble.domain.NoticeVO;
import com.example.assemble.mapper.NoticeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class NoticeDAO {
    private final NoticeMapper noticeMapper;
    // 개수
    public Integer countNotice(){return noticeMapper.countNotice();}
    // 목록
    public List<NoticeVO> noticeAll(){return noticeMapper.selectAll();}
    // 추가
    public void add(NoticeVO noticeVO){noticeMapper.insert(noticeVO);}
    // 삭제
    public void remove(Long noticeId){noticeMapper.delete(noticeId);}
    // 조회
    public NoticeVO findById(Long noticeId){ return noticeMapper.select(noticeId);}
    // 수정
    public void update(NoticeVO noticeVO){noticeMapper.update(noticeVO);}
}
