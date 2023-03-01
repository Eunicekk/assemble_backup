package com.example.assemble.mapper.study;

import com.example.assemble.domain.study.StudyTalkDTO;
import com.example.assemble.domain.study.StudyTalkVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudyTalkMapper {
    // 채팅 내역
    public List<StudyTalkDTO> selectAll(Long studyId);
    
    // 채팅 입력
    public void insert(StudyTalkVO studyTalkVO);

    // 채팅 삭제
    public void delete(Long studyTalkId);
}
