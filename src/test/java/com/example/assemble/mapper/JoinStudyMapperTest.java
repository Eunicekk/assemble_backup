package com.example.assemble.mapper;

import com.example.assemble.domain.study.JoinStudyVO;
import com.example.assemble.mapper.study.JoinStudyMapper;
import com.example.assemble.service.study.JoinStudyService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class JoinStudyMapperTest {
    @Autowired
    private JoinStudyMapper joinStudyMapper;
    @Autowired
    private JoinStudyService joinStudyService;

    @Test
    public void insertTest(){
        JoinStudyVO joinStudyVO = new JoinStudyVO();
        joinStudyVO.setStudyId(21L);
        joinStudyVO.setUserId("id");

        joinStudyService.request(joinStudyVO);
    }

    @Test
    public void selectAllByUserTest(){
        String userId = "id";
        joinStudyMapper.selectAllByUser(userId);
    }
    @Test
    public void selectAllByStudyTest(){
        Long studyId = 1L;
        joinStudyMapper.selectAllByStudy(studyId);
    }
}
