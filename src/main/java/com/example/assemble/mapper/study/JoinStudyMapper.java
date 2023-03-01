package com.example.assemble.mapper.study;

import com.example.assemble.domain.study.JoinStudyVO;
import com.example.assemble.domain.study.StudyVO;
import com.example.assemble.domain.user.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JoinStudyMapper {
    // 스터디 가입 요청 보내기
    public void insert(JoinStudyVO joinStudyVO);

    // 스터디 요청 거절
    public void deleteByJoinId(Long joinStudyId);

    // 스터디 요청 수락
    public void update(Long joinStudyId);

    // 스터디 탈퇴
    public void delete(JoinStudyVO joinStudyVO);
    
    // 해당 유저의 스터디 목록 보기
    public List<StudyVO> selectAllByUser(String userId);

    // 스터디원 목록
    public List<UserVO> selectAllByStudy(Long studyId);

    // 스터디 가입 요청 목록
    public List<UserVO> selectAllJoinRequest(Long studyId);
}
