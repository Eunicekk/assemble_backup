package com.example.assemble.service.study;

import com.example.assemble.domain.study.JoinStudyVO;
import com.example.assemble.domain.study.StudyVO;
import com.example.assemble.domain.user.UserVO;

import java.util.List;

public interface StudyService {
    // 스터디 상세 보기
    public StudyVO viewDetail(Long studyId);

    // 스터디 생성
    public void createStudy(StudyVO studyVO);

    // 해당 스터디 정보 수정
    public void updateStudy(StudyVO studyVO);

    // 해당 스터디 공지사항 수정
    public void updateStudyNotice(StudyVO studyVO);

    // 해당 스터디장 변경
    public void updateStudyLeader(StudyVO studyVO);

    // 스터디 삭제
    public void deleteStudy(Long studyId);
}
