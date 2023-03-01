package com.example.assemble.service.study;

import com.example.assemble.domain.study.JoinStudyVO;
import com.example.assemble.domain.study.StudyVO;
import com.example.assemble.domain.user.UserVO;
import com.example.assemble.repository.study.JoinStudyDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Qualifier("joinStudy") @Primary
public class JoinStudyServiceImpl implements JoinStudyService {
    private final JoinStudyDAO joinStudyDAO;

    @Override
    public void request(JoinStudyVO joinStudyVO) {
        joinStudyDAO.add(joinStudyVO);
    }

    @Override
    public void reject(Long joinStudyId) {
        joinStudyDAO.removeRequest(joinStudyId);
    }

    @Override
    public void join(Long joinStudyId) {
        joinStudyDAO.setJoin(joinStudyId);
    }

    @Override
    public List<UserVO> requestList(Long studyId) {
        return joinStudyDAO.getJoinRequests(studyId);
    }

    @Override
    public List<UserVO> memberList(Long studyId) {
        return joinStudyDAO.getStudyUsers(studyId);
    }

    @Override
    public List<StudyVO> studyList(String userId) {
        return joinStudyDAO.getStudies(userId);
    }

    @Override
    public void leaveStudy(JoinStudyVO joinStudyVO) {
        joinStudyDAO.remove(joinStudyVO);
    }
}
