package com.example.assemble.service.study;

import com.example.assemble.domain.study.JoinStudyVO;
import com.example.assemble.domain.study.StudyDTO;
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
    private final JoinStudyDAO joinStudyDAO;

    @Override
    public Integer countStudy(StudyDTO studyDTO) {
        return studyDAO.getStudyCount(studyDTO);
    }

    @Override
    public Integer countStudyByUserId(StudyDTO studyDTO) {
        return studyDAO.getStudyCountByUserId(studyDTO);
    }

    @Override
    public List<StudyVO> list(StudyDTO studyDTO) {
        return studyDAO.getStudyAll(studyDTO);
    }

    @Override
    public StudyVO viewDetail(Long studyId) {
        return studyDAO.getStudy(studyId);
    }

    @Override
    public void createStudy(StudyVO studyVO) {
        studyDAO.add(studyVO);
        JoinStudyVO joinStudyVO = new JoinStudyVO(studyVO.getStudyId(), studyVO.getStudyLeader());
        joinStudyDAO.addMember(joinStudyVO);
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
    public void updateStudyLeader(StudyVO studyVO) {
        studyDAO.setStudyLeader(studyVO);
    }

    @Override
    public void deleteStudy(Long studyId) {
        studyDAO.remove(studyId);
    }

    @Override
    public List<StudyVO> search(StudyVO studyVO) {
        return studyDAO.search(studyVO);
    }
}
