package com.example.assemble.mapper;

import com.example.assemble.domain.JoinStudyVO;
import com.example.assemble.domain.StudyVO;
import com.example.assemble.domain.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JoinStudyMapper {
    // 스터디 가입
    public void insert(JoinStudyVO joinStudyVO);

    // 스터디 탈퇴
    public void delete(JoinStudyVO joinStudyVO);

    //

    // 해당 유저의 스터디 목록 보기
    public List<StudyVO> selectAllByUser(String userId);

    // 그룹원 확인하기
    public List<UserVO> selectAllByStudy(Long studyId);
}
