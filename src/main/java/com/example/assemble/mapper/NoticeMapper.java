package com.example.assemble.mapper;

import com.example.assemble.domain.NoticeVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeMapper {
    // 공지글 개수
    public Integer countNotice();
    // 공지글 목록
    public List<NoticeVO> selectAll();
    // 공지글 추가
    public void insert(NoticeVO noticeVO);
    // 공지글 삭제
    public void delete(Long noticeId);
    // 공지글 조회
    public NoticeVO select(Long noticeId);
    // 공지글 수정
    public void update(NoticeVO noticeVO);
}
