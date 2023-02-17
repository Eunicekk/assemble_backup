package com.example.assemble.mapper;

import com.example.assemble.domain.JoinStudyVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class JoinStudyMapperTest {
    @Autowired
    private JoinStudyMapper joinStudyMapper;

    @Test
    public void insertTest(){
        JoinStudyVO joinStudyVO = new JoinStudyVO();
        joinStudyVO.setStudyId(3L);
        joinStudyVO.setUserId("bbb");

        joinStudyMapper.insert(joinStudyVO);
    }

    @Test
    public void selectAllByUserTest(){
        String userId = "bbb";
        joinStudyMapper.selectAllByUser(userId);
    }
    @Test
    public void selectAllByStudyTest(){
        Long studyId = 1L;
        joinStudyMapper.selectAllByStudy(studyId);
    }
}
