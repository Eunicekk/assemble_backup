package com.example.assemble.repository.study;

import com.example.assemble.domain.study.StudyTalkDTO;
import com.example.assemble.domain.study.StudyTalkVO;
import com.example.assemble.mapper.study.StudyTalkMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class StudyTalkDAO {
    private final StudyTalkMapper studyTalkMapper;

    // 채팅 내역
    public List<StudyTalkDTO> getTalks(Long studyId) {
        return studyTalkMapper.selectAll(studyId);
    }

    // 채팅 입력
    public void add(StudyTalkVO studyTalkVO) {
        studyTalkMapper.insert(studyTalkVO);
    }

    // 채팅 삭제
    public void remove(Long studyTalkId) {
        studyTalkMapper.delete(studyTalkId);
    }
}
