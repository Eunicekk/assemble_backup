package com.example.assemble.mapper.user;

import com.example.assemble.domain.user.UserFileDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserFileMapper {
    // 프로필 이미지 추가
    public void insert(UserFileDTO userFileDTO);

    // 프로필 이미지 삭제
    public void delete (String userId);

    // 프로필 이미지 선택
    public UserFileDTO select(String userId);
}
