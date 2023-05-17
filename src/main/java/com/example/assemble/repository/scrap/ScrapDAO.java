package com.example.assemble.repository.scrap;

import com.example.assemble.domain.scrap.ScrapDTO;
import com.example.assemble.domain.scrap.ScrapVO;
import com.example.assemble.mapper.scrap.ScrapMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ScrapDAO {
    private final ScrapMapper scrapMapper;


    public List<ScrapDTO> scrappedBoard(String userId, Integer page){
        return scrapMapper.selectScrapped(userId, page);
    }

    public void setScrap(ScrapVO scrapVO){
        scrapMapper.insert(scrapVO);
    }

    public void deleteScrap(ScrapVO scrapVO) {
        scrapMapper.delete(scrapVO);
    }
    public void deleteByBoardId(Long boardId) {
        scrapMapper.deleteByBoardId(boardId);
    }
    public ScrapVO getScrapVO(ScrapVO scrapVO){
        return scrapMapper.select(scrapVO);
    }
}
