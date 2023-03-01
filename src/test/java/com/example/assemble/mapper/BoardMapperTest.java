package com.example.assemble.mapper;

import com.example.assemble.domain.BoardVO;
import com.example.assemble.domain.NoticeVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class BoardMapperTest {
    @Autowired
    private BoardMapper boardMapper;

    @Test
    public void selectAllTest(){boardMapper.selectAll().stream().map(BoardVO::toString).forEach(log::info);}
}
