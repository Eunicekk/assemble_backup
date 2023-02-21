package com.example.assemble.service;

import com.example.assemble.domain.NoticeVO;

import java.util.List;

public interface NoticeService {
    // 공지글 목록
    public List<NoticeVO> getList();
    // 공지글 추가
    public void add(NoticeVO noticeVO);
    // 공지글 삭제
    public void delete(Long noticeId);
    // 공지글 조회
    public NoticeVO getNotice(Long noticeId);
    // 공지글 수정
    public void updateNotice(NoticeVO noticeVO);
}
