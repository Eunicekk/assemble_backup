package com.example.assemble.mapper;

import com.example.assemble.mapper.scrap.ScrapMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ScrapMapperTest {
    @Autowired
    private ScrapMapper scrapMapper;

    @Test
    public void test() { scrapMapper.test("id"); }

}
