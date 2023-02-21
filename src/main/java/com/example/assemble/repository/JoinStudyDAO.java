package com.example.assemble.repository;

import com.example.assemble.domain.JoinStudyVO;
import com.example.assemble.domain.StudyVO;
import com.example.assemble.domain.UserVO;
import com.example.assemble.mapper.JoinStudyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class JoinStudyDAO {
    private final JoinStudyMapper joinStudyMapper;

    public void add(JoinStudyVO joinStudyVO) {
        joinStudyMapper.insert(joinStudyVO);
    }
    public void remove(JoinStudyVO joinStudyVO) {
        joinStudyMapper.delete(joinStudyVO);
    }


    public List<StudyVO> getStudies(String userId) {
        return joinStudyMapper.selectAllByUser(userId);
    }
    public List<UserVO> getStudyUsers(Long studyId) {
        return joinStudyMapper.selectAllByStudy(studyId);
    }
}
