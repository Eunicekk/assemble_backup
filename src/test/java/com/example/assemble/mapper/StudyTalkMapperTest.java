package com.example.assemble.mapper;

import com.example.assemble.domain.study.StudyTalkDTO;
import com.example.assemble.domain.study.StudyTalkVO;
import com.example.assemble.mapper.study.StudyTalkMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class StudyTalkMapperTest {
    @Autowired
    private StudyTalkMapper studyTalkMapper;

    @Test
    public void selectAllTest() {
        List<StudyTalkDTO> list;
        list = studyTalkMapper.selectAll(1L);
    }
    @Test
    public void insertTest(){
        StudyTalkVO studyTalkVO = new StudyTalkVO();
        studyTalkVO.setStudyId(1L);
        studyTalkVO.setUserId("aaa");
        studyTalkVO.setStudyTalkContent("!!");

        studyTalkMapper.insert(studyTalkVO);
    }

    @Test
    public void deleteTest(){
        studyTalkMapper.delete(1L);
    }
}
