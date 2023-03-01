package com.example.assemble.mapper.study;

import com.example.assemble.domain.study.StudyVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudyMapper {


    // 스터디 상세보기
    public StudyVO select(Long studyId);

    // 스터디 추가
    public void insert(StudyVO studyVO);

    // 스터디 수정
    public void update(StudyVO studyVO);

    // 스터디 공지사항 수정
    public void updateNotice(StudyVO studyVO);

    // 스터디장 변경
    public void updateLeader(StudyVO studyVO);

    // 스터디 삭제
    public void delete(Long studyId);
}
