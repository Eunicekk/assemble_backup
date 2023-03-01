package com.example.assemble.service.study;

import com.example.assemble.domain.study.JoinStudyVO;
import com.example.assemble.domain.study.StudyVO;
import com.example.assemble.domain.user.UserVO;
import com.example.assemble.repository.study.JoinStudyDAO;
import com.example.assemble.repository.study.StudyDAO;
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

    @Override
    public StudyVO viewDetail(Long studyId) {
        return studyDAO.getStudy(studyId);
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
    public void updateStudyNotice(StudyVO studyVO) {
        studyDAO.setStudyNotice(studyVO);
    }

    @Override
    public void deleteStudy(Long studyId) {
        studyDAO.remove(studyId);
    }
}
