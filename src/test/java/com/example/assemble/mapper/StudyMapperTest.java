package com.example.assemble.mapper;

import com.example.assemble.domain.study.StudyVO;
import com.example.assemble.mapper.study.StudyMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class StudyMapperTest {
    @Autowired
    private StudyMapper studyMapper;

    @Test
    public void selectTest(){
        Long studyId = 3L;
        studyMapper.select(studyId);
    }

    @Test
    public void insertTest(){
        StudyVO studyVO = new StudyVO("토익3", false, "", "토익", false);
        studyMapper.insert(studyVO);
    }
}
