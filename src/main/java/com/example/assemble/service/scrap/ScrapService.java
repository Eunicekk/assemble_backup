package com.example.assemble.service.scrap;

import com.example.assemble.domain.scrap.ScrapDTO;
import com.example.assemble.domain.scrap.ScrapVO;

import java.util.List;

public interface ScrapService {

    // 스크랩한 게시글 조회
    public List<ScrapDTO> getScrappedBoard(String userId, Integer page);

    public void addScrap(ScrapVO scrapVO);

    public void deleteScrap(ScrapVO scrapVO);

    public boolean checkScrap(ScrapVO scrapVO);
}