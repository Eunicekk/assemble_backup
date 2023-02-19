package com.example.assemble.service;

import com.example.assemble.domain.JoinStudyVO;
import com.example.assemble.domain.StudyVO;
import com.example.assemble.domain.UserVO;

import java.util.List;

public interface StudyService {
    // 스터디 상세 보기
    public StudyVO viewDetail(Long studyId);

    // 해당 유저의 스터디 목록
    public List<StudyVO> studyList(String userId);

    // 해당 스터디의 멤버 목록
    public List<UserVO> memberList(Long studyId);

    // 스터디 생성
    public void createStudy(StudyVO studyVO);

    // 해당 스터디 정보 수정
    public void updateStudy(StudyVO studyVO);

    // 그룹 탈퇴, 추방
    public void leaveStudy(JoinStudyVO joinStudyVO);
}
