package com.example.assemble.mapper.scrap;

import com.example.assemble.domain.scrap.ScrapDTO;
import com.example.assemble.domain.scrap.ScrapVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ScrapMapper {

    // 스크랩한 게시글 출력
    public List<ScrapDTO> selectScrapped(@Param("userId") String userId, @Param("page") Integer page);

    public List<ScrapDTO> test(@Param("userId")String userId);

    public void insert(ScrapVO scrapVO);

    public void delete(ScrapVO scrapVO);

    public void deleteByBoardId(Long boardId);

    public ScrapVO select(ScrapVO scrapVO);
}
