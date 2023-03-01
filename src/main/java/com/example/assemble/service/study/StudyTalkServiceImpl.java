package com.example.assemble.service.study;

import com.example.assemble.domain.study.StudyTalkDTO;
import com.example.assemble.domain.study.StudyTalkVO;
import com.example.assemble.repository.study.StudyTalkDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Qualifier("studyTalk") @Primary
public class StudyTalkServiceImpl implements StudyTalkService {
    private final StudyTalkDAO studyTalkDAO;

    @Override
    public List<StudyTalkDTO> viewTalkList(Long studyId) {
        return studyTalkDAO.getTalks(studyId);
    }

    @Override
    public void register(StudyTalkVO studyTalkVO) {
        studyTalkDAO.add(studyTalkVO);
    }

    @Override
    public void delete(Long studyTalkId) {
        studyTalkDAO.remove(studyTalkId);
    }
}
