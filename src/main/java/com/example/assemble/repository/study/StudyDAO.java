package com.example.assemble.repository.study;

import com.example.assemble.domain.study.StudyVO;
import com.example.assemble.mapper.study.StudyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class StudyDAO {
    private final StudyMapper studyMapper;

    public StudyVO getStudy(Long studyId) {
        return studyMapper.select(studyId);
    }
    public void add(StudyVO studyVO) {
        studyMapper.insert(studyVO);
    }
    public void setStudy(StudyVO studyVO) {
        studyMapper.update(studyVO);
    }
    public void setStudyNotice(StudyVO studyVO) {
        studyMapper.updateNotice(studyVO);
    }
    public void setStudyLeader(StudyVO studyVO) {
        studyMapper.updateLeader(studyVO);
    }
    public void remove(Long studyId) {
        studyMapper.delete(studyId);
    }
}
