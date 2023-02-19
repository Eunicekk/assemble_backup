package com.example.assemble.mapper;

import com.example.assemble.domain.StudyVO;
import com.example.assemble.domain.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudyMapper {


    // 스터디 상세보기
    public StudyVO select(Long studyId);



    // 스터디 추가
    public void insert(StudyVO studyVO);

    // 스터디 수정
    public void update(StudyVO studyVO);

    // 스터디 삭제
    public void delete(Long studyId);
}
