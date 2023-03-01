package com.example.assemble.service.study;

import com.example.assemble.domain.study.JoinStudyVO;
import com.example.assemble.domain.study.StudyVO;
import com.example.assemble.domain.user.UserVO;

import java.util.List;

public interface JoinStudyService {
    // 스터디 참가 요청 보내기
    public void request(JoinStudyVO joinStudyVO);

    // 참가 요청 거절
    public void reject(Long joinStudyId);

    // 참가 요청 수락
    public void join(Long joinStudyId);

    // 참가 요청 목록
    public List<UserVO> requestList(Long studyId);

    // 해당 스터디의 멤버 목록
    public List<UserVO> memberList(Long studyId);

    // 해당 유저의 스터디 목록
    public List<StudyVO> studyList(String userId);

    // 스터디 탈퇴 or 추방
    public void leaveStudy(JoinStudyVO joinStudyVO);

}
