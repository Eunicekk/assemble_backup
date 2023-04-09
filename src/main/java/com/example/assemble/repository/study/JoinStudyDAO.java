package com.example.assemble.repository.study;

import com.example.assemble.domain.study.JoinStudyVO;
import com.example.assemble.domain.study.StudyVO;
import com.example.assemble.domain.user.UserVO;
import com.example.assemble.mapper.study.JoinStudyMapper;
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

    public void addMember(JoinStudyVO joinStudyVO) {
        joinStudyMapper.insertMember(joinStudyVO);
    }

    public void remove(JoinStudyVO joinStudyVO) {
        joinStudyMapper.delete(joinStudyVO);
    }

    public void setJoin(Long joinStudyId) {
        joinStudyMapper.update(joinStudyId);
    }

    public void removeRequest(Long joinStudyId) {
        joinStudyMapper.deleteByJoinId(joinStudyId);
    }

    public JoinStudyVO getUser(JoinStudyVO joinStudyVO) {
        return joinStudyMapper.selectUser(joinStudyVO);
    }

    public List<StudyVO> getStudies(String userId) {
        return joinStudyMapper.selectAllByUser(userId);
    }

    public List<UserVO> getStudyUsers(Long studyId) {
        return joinStudyMapper.selectAllByStudy(studyId);
    }

    public List<UserVO> getJoinRequests(Long studyId) {
        return joinStudyMapper.selectAllJoinRequest(studyId);
    }
}
