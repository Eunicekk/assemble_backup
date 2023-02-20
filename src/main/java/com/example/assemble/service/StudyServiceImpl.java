package com.example.assemble.service;

import com.example.assemble.domain.JoinStudyVO;
import com.example.assemble.domain.StudyVO;
import com.example.assemble.domain.UserVO;
import com.example.assemble.repository.JoinStudyDAO;
import com.example.assemble.repository.StudyDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Qualifier("study") @Primary
public class StudyServiceImpl implements StudyService {
    private final StudyDAO studyDAO;
    private final JoinStudyDAO joinStudyDAO;

    @Override
    public StudyVO viewDetail(Long studyId) {
        return studyDAO.getStudy(studyId);
    }

    @Override
    public List<StudyVO> studyList(String userId) {
        return joinStudyDAO.getStudies(userId);
    }

    @Override
    public List<UserVO> memberList(Long studyId) {
        return joinStudyDAO.getStudyUsers(studyId);
    }

    @Override
    public void createStudy(StudyVO studyVO) {
        studyDAO.add(studyVO);
    }

    @Override
    public void updateStudy(StudyVO studyVO) {
        studyDAO.setStudy(studyVO);
    }

    @Override
    public void leaveStudy(JoinStudyVO joinStudyVO) {
        joinStudyDAO.remove(joinStudyVO);
    }
}
