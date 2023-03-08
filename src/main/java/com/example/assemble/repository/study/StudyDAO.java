package com.example.assemble.repository.study;

import com.example.assemble.domain.study.StudyVO;
import com.example.assemble.mapper.study.StudyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class StudyDAO {
    private final StudyMapper studyMapper;

    // 스터디 목록
    public List<StudyVO> getStudyAll() {
        return studyMapper.selectAll();
    }
    
    // 스터디 상세 보기
    public StudyVO getStudy(Long studyId) {
        return studyMapper.select(studyId);
    }
    
    // 스터디 생성
    public void add(StudyVO studyVO) {
        studyMapper.insert(studyVO);
    }
    
    // 스터디 수정
    public void setStudy(StudyVO studyVO) {
        studyMapper.update(studyVO);
    }
    
    // 스터디 공지사항 수정
    public void setStudyNotice(StudyVO studyVO) {
        studyMapper.updateNotice(studyVO);
    }
    
    // 스터디장 변경
    public void setStudyLeader(StudyVO studyVO) {
        studyMapper.updateLeader(studyVO);
    }
    
    // 스터디 삭제
    public void remove(Long studyId) {
        studyMapper.delete(studyId);
    }

    // 스터디 검색
    public List<StudyVO> search(StudyVO studyVO) {
        return studyMapper.search(studyVO);
    }
}
