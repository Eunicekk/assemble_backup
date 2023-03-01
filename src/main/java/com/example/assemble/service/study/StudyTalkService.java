package com.example.assemble.service.study;

import com.example.assemble.domain.study.StudyTalkDTO;
import com.example.assemble.domain.study.StudyTalkVO;

import java.util.List;

public interface StudyTalkService {
    public List<StudyTalkDTO> viewTalkList(Long studyId);
    public void register(StudyTalkVO studyTalkVO);
    public void delete(Long studyTalkId);
}
