package com.example.assemble.repository;

import com.example.assemble.domain.StudyVO;
import com.example.assemble.mapper.StudyMapper;
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
    public void remove(Long studyId) {
        studyMapper.delete(studyId);
    }
}
